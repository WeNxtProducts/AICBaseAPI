package com.aic.base.qrGeneretor;

import java.io.IOException;

import org.springframework.http.ResponseEntity;

public interface QRCodeService {

	ResponseEntity<String> generateQRCode(QRCodeRequestDto qrCodeRequest) throws IOException;

}
