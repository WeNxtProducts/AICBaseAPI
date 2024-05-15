package com.aic.base.commonUtils;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "APP_EXCEPTIONS")
public class APP_EXCEPTIONS {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sno")
	private Long sno;

	private String screenName;

	private String serviceName;

	@Column(name = "userID")
	private String userID;

	@Column(name = "transactionNumber")
	private String transactionNumber;

	@Column(name = "fileOrModuleName")
	private String fileOrModuleName;

	@Column(name = "exceptionMessage")
	private String exceptionMessage;

	@Column(name = "date_time")
	private String dateTime;

	@Column(name = "hostInfo")
	private String hostInfo;

	public Long getSno() {
		return sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

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

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getHostInfo() {
		return hostInfo;
	}

	public void setHostInfo(String hostInfo) {
		this.hostInfo = hostInfo;
	}

}