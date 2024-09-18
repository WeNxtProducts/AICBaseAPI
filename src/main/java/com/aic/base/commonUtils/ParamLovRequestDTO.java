package com.aic.base.commonUtils;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParamLovRequestDTO {
	
	@JsonProperty("queryId")
	private Integer queryId;

	@JsonProperty("searchTerm")
	private String searchTerm;

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

}
