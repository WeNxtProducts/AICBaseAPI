package com.aic.base.emailTemplate;

import java.util.List;
import java.util.Map;

public class EmailRequestModel {
	
	private List<String> toIds;
	
	private List<String> ccIds;
	
	private List<String> bccIds;
	
	private String subject;
	
	private Map<String, Object> content;

	public List<String> getToIds() {
		return toIds;
	}

	public void setToIds(List<String> toIds) {
		this.toIds = toIds;
	}

	public List<String> getCcIds() {
		return ccIds;
	}

	public void setCcIds(List<String> ccIds) {
		this.ccIds = ccIds;
	}

	public List<String> getBccIds() {
		return bccIds;
	}

	public void setBccIds(List<String> bccIds) {
		this.bccIds = bccIds;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Map<String, Object> getContent() {
		return content;
	}

	public void setContent(Map<String, Object> content) {
		this.content = content;
	}

}
