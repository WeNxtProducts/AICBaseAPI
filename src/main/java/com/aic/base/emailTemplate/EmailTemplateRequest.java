package com.aic.base.emailTemplate;

import com.aic.base.model.FormFieldsDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EmailTemplateRequest {
	
	@JsonProperty("frontForm")
	private FormFieldsDTO frontForm;

	public FormFieldsDTO getFrontForm() {
		return frontForm;
	}

	public void setFrontForm(FormFieldsDTO frontForm) {
		this.frontForm = frontForm;
	}

}
