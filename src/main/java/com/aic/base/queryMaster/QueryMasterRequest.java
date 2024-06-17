package com.aic.base.queryMaster;

import com.aic.base.model.FormFieldsDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

public class QueryMasterRequest {
	
	@JsonProperty("frontForm")
	private FormFieldsDTO frontForm;
	
	@JsonProperty("Query_Parameters")
	private FormFieldsDTO queryParams;

	public FormFieldsDTO getFrontForm() {
		return frontForm;
	}

	public void setFrontForm(FormFieldsDTO frontForm) {
		this.frontForm = frontForm;
	}

	public FormFieldsDTO getQueryParams() {
		return queryParams;
	}

	public void setQueryParams(FormFieldsDTO queryParams) {
		this.queryParams = queryParams;
	}

}
