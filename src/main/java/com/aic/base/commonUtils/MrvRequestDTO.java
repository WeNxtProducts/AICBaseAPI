package com.aic.base.commonUtils;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MrvRequestDTO {

	@JsonProperty("queryId")
	private Integer queryId;

	@JsonProperty("tranId")
	private Object tranId;

	@JsonProperty("emptranId")
	private String emptranId;

	public Integer getQueryId() {
		return queryId;
	}

	public void setQueryId(Integer queryId) {
		this.queryId = queryId;
	}

	public Object getTranId() {
		return tranId;
	}

	public void setTranId(Object tranId) {
		this.tranId = tranId;
	}

	public String getEmptranId() {
		return emptranId;
	}

	public void setEmptranId(String emptranId) {
		this.emptranId = emptranId;
	}

}
