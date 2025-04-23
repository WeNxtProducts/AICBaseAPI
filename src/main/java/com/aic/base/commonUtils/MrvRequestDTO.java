package com.aic.base.commonUtils;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MrvRequestDTO {

	@JsonProperty("queryId")
	private Integer queryId;

	@JsonProperty("tranId")
	private Object tranId;

	@JsonProperty("emptranId")
	private String emptranId;
	
	@JsonProperty("offset")
	private Integer offset;
	
	@JsonProperty("limit")
	private Integer limit;

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

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

}
