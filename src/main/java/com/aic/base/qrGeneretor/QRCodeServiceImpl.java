package com.aic.base.qrGeneretor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.spire.barcode.BarCodeGenerator;
import com.spire.barcode.BarCodeType;
import com.spire.barcode.BarcodeSettings;
import com.spire.barcode.QRCodeECL;

import jakarta.annotation.PostConstruct;

import org.json.JSONObject;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Service
public class QRCodeServiceImpl implements QRCodeService {
	
	@Value("${spring.success.code}")
	private String successCode;

	@Value("${spring.error.code}")
	private String errorCode;

	@Value("${spring.warning.code}")
	private String warningCode;

	@Value("${spring.message.code}")
	private String messageCode;

	@Value("${spring.status.code}")
	private String statusCode;

	@Value("${spring.data.code}")
	private String dataCode;

	@Value("${spring.data.filepath}")
	private String locationCode;

	private static final String BASE_PATH = "D:/QRGenerator/";
	private static final String SEQUENCE_NAME = "QR_CODE_SEQ";
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public QRCodeServiceImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@PostConstruct
	public void initialize() {
		createSequenceIfNotExists();
	}

	private void createSequenceIfNotExists() {
		String checkSequenceQuery = "SELECT COUNT(*) FROM user_sequences WHERE sequence_name = ?";
		Integer count = jdbcTemplate.queryForObject(checkSequenceQuery, new Object[] { SEQUENCE_NAME.toUpperCase() },
				Integer.class);

		if (count == null || count == 0) {
			String createSequenceQuery = "CREATE SEQUENCE " + SEQUENCE_NAME + " START WITH 1 INCREMENT BY 01";
			jdbcTemplate.execute(createSequenceQuery);
		}
	}

	public ResponseEntity<String> generateQRCode(QRCodeRequestDto qrCodeRequest) throws IOException {
		BarcodeSettings settings = new BarcodeSettings();
		settings.setType(BarCodeType.QR_Code);

		StringBuilder dataString = new StringBuilder();
		for (Map.Entry<String, String> entry : qrCodeRequest.getData().entrySet()) {
			dataString.append(entry.getKey()).append(": ").append(entry.getValue()).append(", ");
		}

		if (dataString.length() > 0) {
			dataString.setLength(dataString.length() - 2);
		}

		settings.setData(dataString.toString());
		settings.setX(2);
		settings.setQRCodeECL(QRCodeECL.M);
		settings.setTopText(qrCodeRequest.getTopText());
		settings.setBottomText(qrCodeRequest.getBottomText());
		settings.setShowText(false);
		settings.setShowTopText(true);
		settings.setShowBottomText(true);
		settings.hasBorder(false);

		BarCodeGenerator barCodeGenerator = new BarCodeGenerator(settings);
		BufferedImage bufferedImage = barCodeGenerator.generateImage();

		// Generate unique ID using the sequence
		long uniqueId = jdbcTemplate.queryForObject("SELECT " + SEQUENCE_NAME + ".NEXTVAL FROM DUAL", Long.class);

	
		String fileName = "WENXT" +"0"+ uniqueId+ ".png"; // Construct file name

		// Define the path where the image will be saved
		String filePath = BASE_PATH + fileName;
		File outputFile = new File(filePath);
		ImageIO.write(bufferedImage, "png", outputFile);

		// Create JSON response
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();
		
		response.put(statusCode, successCode);
		response.put(messageCode, "QR code generated successfully");
		data.put(locationCode, filePath);
		response.put(dataCode, data);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		return ResponseEntity.ok().headers(headers).body(response.toString());
	}
}
