package com.aic.base.emailTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/emailTemplate")
public class EmailTemplateController {
	
	@Autowired
	private EmailTemplateService emailTemplateService;
	
	@PostMapping("/createTemplate")
	public String createTemplate(@RequestBody EmailTemplateRequest emailTemplateModel) {
		try {
		return emailTemplateService.createNewTemplate(emailTemplateModel);
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	@PostMapping("/updateTemplate/{templateId}")
	public String updateTemplate(@RequestBody EmailTemplateRequest emailTemplateModel, @PathVariable Integer templateId) {
		return emailTemplateService.updateTemplate(emailTemplateModel, templateId);
	}
	
	@DeleteMapping("/deleteTemplate")
	public String deleteTemplate(@RequestParam Integer templateId) {
		return emailTemplateService.deleteTemplate(templateId);
	}
	
	@GetMapping("/getTemplate")
	public String getTemplate(HttpServletRequest request, @RequestParam String screenCode, @RequestParam String screenName, @RequestParam Integer tranId) {
		return emailTemplateService.getTemplate(request, screenCode, screenName, tranId);
	}
	
	@PostMapping("/createTemplateParam")
	public String createTemplateParam(@RequestBody LjmEmailParamDTO emailTemplateModel) {
		return emailTemplateService.createTemplateParam(emailTemplateModel);
	}
	
	@PostMapping("/updateTemplateParam")
	public String updateTemplateParam(@RequestBody LjmEmailParamDTO emailTemplateModel) {
		return emailTemplateService.updateTemplateParam(emailTemplateModel);
	}
	
	@DeleteMapping("/deleteTemplateParam")
	public String deleteTemplateParam(@RequestParam Integer templateId) {
		return emailTemplateService.deleteTemplateParam(templateId);
	}
	
	@GetMapping("/getTemplateParam")
	public String getTemplateParam(@RequestParam Integer templateId) {
		return emailTemplateService.getTemplateParam(templateId);
	}
	
	@PostMapping("/testMail")
	public String sendMail(@RequestParam Integer templateId, @RequestBody EmailRequestModel object) {
		return emailTemplateService.sendMail(templateId, object);
	}

}
