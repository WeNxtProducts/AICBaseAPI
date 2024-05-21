package com.aic.base.commonUtils;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/encryption")
public class EncryptionController {

	@Autowired
	private EncryptionService encryptionService;

	@PostMapping(value = "/encrypt", consumes = "application/json", produces = "application/json")
	public String encrypt(@RequestBody String request) {

		JSONObject input = new JSONObject(request);
		String encryptedValue = encryptionService.encryptstr(input.getString("userPass"));
		JSONObject response = new JSONObject();
		response.put("Data", encryptedValue);
		return response.toString();
	}

	@PostMapping(value = "/decrypt", consumes = "application/json", produces = "application/json")
	public String decrypt(@RequestBody String request) {
		JSONObject input = new JSONObject(request);
		String encryptedValue = encryptionService.decryptstr(input.getString("Youpass"));
		JSONObject response = new JSONObject();
		response.put("Data", encryptedValue);
		return response.toString();

	}
}
