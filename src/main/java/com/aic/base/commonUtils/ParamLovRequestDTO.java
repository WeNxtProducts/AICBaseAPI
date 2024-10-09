package com.aic.base.commonUtils;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParamLovRequestDTO {
	
	@JsonProperty("queryId")
	private Integer queryId;

	@JsonProperty("searchTerm")
	private String searchTerm;
	
	@JsonProperty("COMP_CODE")
	private String COMP_CODE;
	
	@JsonProperty("userInput")
	private String userInput;

	public Integer getQueryId() {
		return queryId;
	}

	public void setQueryId(Integer queryId) {
		this.queryId = queryId;
	}

	public String getSearchTerm() {
		return searchTerm;
	}

	public void setSearchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
	}

	public String getCOMP_CODE() {
		return COMP_CODE;
	}

	public void setCOMP_CODE(String cOMP_CODE) {
		COMP_CODE = cOMP_CODE;
	}

	public String getUserInput() {
		return userInput;
	}

	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}

}
