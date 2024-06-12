package com.aic.base.emailTemplate;

import com.aic.base.model.FormFieldsDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EmailTemplateRequest {
	
	@JsonProperty("frontForm")
	private FormFieldsDTO frontForm;
	
	@JsonProperty("Email_Parameters")
	private FormFieldsDTO emailParams;

	public FormFieldsDTO getFrontForm() {
		return frontForm;
	}

	public void setFrontForm(FormFieldsDTO frontForm) {
		this.frontForm = frontForm;
	}

	public FormFieldsDTO getEmailParams() {
		return emailParams;
	}

	public void setEmailParams(FormFieldsDTO emailParams) {
		this.emailParams = emailParams;
	}

}
