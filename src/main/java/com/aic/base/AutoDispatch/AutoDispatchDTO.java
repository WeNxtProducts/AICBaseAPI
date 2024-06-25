package com.aic.base.AutoDispatch;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AutoDispatchDTO {
	
	private String eventId;
	
	@JsonProperty("docParams")
	private List<FormFieldsDTO> docParams;
	
	@JsonProperty("emailParams")
	private FormFieldsDTO emailParams;

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public List<FormFieldsDTO> getDocParams() {
		return docParams;
	}

	public void setDocParams(List<FormFieldsDTO> docParams) {
		this.docParams = docParams;
	}

	public FormFieldsDTO getEmailParams() {
		return emailParams;
	}

	public void setEmailParams(FormFieldsDTO emailParams) {
		this.emailParams = emailParams;
	}

}
