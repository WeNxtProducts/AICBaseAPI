package com.aic.base.commonUtils;

import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncryptionService {
	@Autowired
	private StringEncryptor encryptorBean;

	public String encryptstr(String value) {
		return encryptorBean.encrypt(value);
	}

	public String decryptstr(String value) {
		return encryptorBean.decrypt(value);
	}

}