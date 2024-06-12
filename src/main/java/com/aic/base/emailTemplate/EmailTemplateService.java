package com.aic.base.emailTemplate;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface EmailTemplateService {
	
	public String createNewTemplate(EmailTemplateRequest emailTemplateModel)  throws Exception;
	
	public String updateTemplate(EmailTemplateRequest emailTemplateModel, Integer templateId);
	
	public String deleteTemplate(Integer templateId);
	
	public String getTemplate(Integer templateId);

	public String createTemplateParam(LjmEmailParamDTO emailTemplateModel);

	public String updateTemplateParam(LjmEmailParamDTO emailTemplateModel);

	public String deleteTemplateParam(Integer templateId);

	public String getTemplateParam(Integer templateId);

	public String sendMail(Integer templateId, EmailRequestModel object);

}
