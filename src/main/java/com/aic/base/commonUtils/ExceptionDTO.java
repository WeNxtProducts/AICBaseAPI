package com.aic.base.commonUtils;

import jakarta.annotation.Nullable;

public class ExceptionDTO {
	private String screenName;
	private String serviceName;
	private String userID;
	private String fileOrModuleName;
	@Nullable
	private String transactionNumber;
	private String exceptionMessage;

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public String getFileOrModuleName() {
		return fileOrModuleName;
	}

	public void setFileOrModuleName(String fileOrModuleName) {
		this.fileOrModuleName = fileOrModuleName;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}
}

