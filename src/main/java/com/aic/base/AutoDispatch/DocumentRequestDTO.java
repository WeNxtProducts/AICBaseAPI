package com.aic.base.AutoDispatch;

import java.util.Map;

public class DocumentRequestDTO {
	
	private String docTemplateName;
	
	private Map<String, Object> docParams;

	public String getDocTemplateName() {
		return docTemplateName;
	}

	public void setDocTemplateName(String docTemplateName) {
		this.docTemplateName = docTemplateName;
	}

	public Map<String, Object> getDocParams() {
		return docParams;
	}

	public void setDocParams(Map<String, Object> docParams) {
		this.docParams = docParams;
	}

}
