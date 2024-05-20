package com.aic.base.commonUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/encryption")
public class EncryptionController {

	
	@Autowired
    private EncryptionService encryptionService;

    @PostMapping("/encrypt")
    public String encrypt(@RequestBody EncryptionRequest request) {
        return encryptionService.encryptstr(request.getValue());
    }

    @PostMapping("/decrypt")
    public String decrypt(@RequestBody EncryptionRequest request) {
        return encryptionService.decryptstr(request.getValue());
    }

}