package com.aic.base.commonUtils;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RulesJsonRequest {
	
	@JsonProperty("userId")
	private String userId;
	
	private String moduleId;
	
	private String prodCode;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

}
