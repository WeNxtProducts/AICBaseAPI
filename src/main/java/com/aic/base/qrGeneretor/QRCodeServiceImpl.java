package com.aic.base.qrGeneretor;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Random;
import javax.imageio.ImageIO;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.spire.barcode.BarCodeGenerator;
import com.spire.barcode.BarCodeType;
import com.spire.barcode.BarcodeSettings;
import com.spire.barcode.QRCodeECL;


@Service
public class QRCodeServiceImpl implements QRCodeService {

	@Value("${spring.message.code}")
	private String messageCode;

	@Value("${spring.status.code}")
	private String statusCode;

	@Value("${spring.data.code}")
	private String dataCode;

	@Value("${spring.data.filepath}")
	private String locationCode;
	
	@Value("${spring.success.code}")
	private String successCode;

	@Value("${spring.error.code}")
	private String errorCode;

	@Value("${spring.warning.code}")
	private String warningCode;
	
	private static final String BASE_PATH = "D:/QRGenerator/";

	@Override
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

        
        String uniqueId = generateFourDigitId();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
        String timestamp = dateFormat.format(new Date()); 
        String fileName = uniqueId + "Wenxt"+ timestamp + ".png"; 

        
        String filePath = BASE_PATH + fileName;
        File outputFile = new File(filePath);
        ImageIO.write(bufferedImage, "png", outputFile);

       
        JSONObject response = new JSONObject();
        
        JSONObject data = new JSONObject();
        response.put(statusCode, successCode);
        response.put(messageCode, "QR code generated successfully");
        data.put(locationCode, filePath);
        response.put(dataCode, data);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        return ResponseEntity.ok()
                .headers(headers)
                .body(response.toString());
    }

    private String generateFourDigitId() {
        Random random = new Random();
        int id = random.nextInt(10000); 
        return String.format("%02d", id); 
    }
}

