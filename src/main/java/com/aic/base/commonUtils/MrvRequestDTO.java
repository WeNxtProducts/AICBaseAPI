package com.aic.base.commonUtils;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MrvRequestDTO {

	@JsonProperty("queryId")
	private Integer queryId;

	@JsonProperty("tranId")
	private Integer tranId;

	@JsonProperty("emptranId")
	private String emptranId;

	public Integer getQueryId() {
		return queryId;
	}

	public void setQueryId(Integer queryId) {
		this.queryId = queryId;
	}

	public Integer getTranId() {
		return tranId;
	}

	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}

	public String getEmptranId() {
		return emptranId;
	}

	public void setEmptranId(String emptranId) {
		this.emptranId = emptranId;
	}

}
