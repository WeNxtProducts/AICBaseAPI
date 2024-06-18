package com.aic.base.AutoDispatch;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FormFieldsDTO {
	
	@JsonProperty("formFields")
	private Map<String, Object> formFields;
	private String label;

	// Getters and setters
	public Map<String, Object> getFormFields() {
		return formFields;
	}

	public void setFormFields(Map<String, Object> formFields) {
		this.formFields = formFields;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
