package com.aic.base.login;

import java.util.List;

import com.aic.base.commonUtils.LOVDTO;


public class LoginDropDownRequestModel {
	
	private String userId;
	
	private String companyCode;
	
	private String branchCode;
	
	private List<LOVDTO> companyCodes;
	
	private String errorMessage;
	
	private String errorField;
	
	private List<LOVDTO> companyListCodes;
	
	private List<LOVDTO> branchListCodes;
	
	private List<LOVDTO> deptListCodes;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public List<LOVDTO> getCompanyCodes() {
		return companyCodes;
	}

	public void setCompanyCodes(List<LOVDTO> companyCodes) {
		this.companyCodes = companyCodes;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorField() {
		return errorField;
	}

	public void setErrorField(String errorField) {
		this.errorField = errorField;
	}

	public List<LOVDTO> getCompanyListCodes() {
		return companyListCodes;
	}

	public void setCompanyListCodes(List<LOVDTO> companyListCodes) {
		this.companyListCodes = companyListCodes;
	}

	public List<LOVDTO> getBranchListCodes() {
		return branchListCodes;
	}

	public void setBranchListCodes(List<LOVDTO> branchListCodes) {
		this.branchListCodes = branchListCodes;
	}

	public List<LOVDTO> getDeptListCodes() {
		return deptListCodes;
	}

	public void setDeptListCodes(List<LOVDTO> deptListCodes) {
		this.deptListCodes = deptListCodes;
	}

	
	
}

