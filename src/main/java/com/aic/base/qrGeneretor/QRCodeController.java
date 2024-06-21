package com.aic.base.qrGeneretor;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qr-code")
public class QRCodeController {
	@Autowired
	private QRCodeService qrservice;

	@PostMapping("/generate")
	public ResponseEntity<String> generateQRCode(@RequestBody QRCodeRequestDto qrCodeRequest) throws IOException {
		return qrservice.generateQRCode(qrCodeRequest);
	}

}
