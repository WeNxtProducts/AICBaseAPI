package com.aic.base.logHistory;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LJM_LOG_ACT_USER")
public class LjmLogActUser {

    @Id
    @Column(name = "LJM_LOGACT_USER")
    private String logActUser;

    @Column(name = "LJM_LOGACT_IP")
    private String logActIp;

    @Column(name = "LJM_LOGACT_HOST")
    private String logActHost;

    @Column(name = "LJM_LOGACT_BROWSER")
    private String logActBrowser;

    @Column(name = "LJM_LOGACT_TOKEN")
    private String logActToken;

    @Column(name = "LJM_LOGACT_STATUS")
    private String logActStatus;

    @Column(name = "LJM_LOGACT_LOGIN_TIME")
    private Timestamp logActLoginTime;

    @Column(name = "LJM_LOGACT_CRDT")
    private Timestamp logActCrdt;

    @Column(name = "LJM_LOGACT_MDDT")
    private Timestamp logActMddt;

    @Column(name = "LJM_LOGACT_PARAM1")
    private String logActParam1;

    @Column(name = "LJM_LOGACT_PARAM2")
    private String logActParam2;

    @Column(name = "LJM_LOGACT_PARAM3")
    private String logActParam3;
    
    @Column(name = "LJM_BASE_CURRENCY")
    private String basecurrency;
    
    @Column(name = "LJM_LANG_CODE")
    private String langCode;
    
    @Column(name = "LJM_COMPANY_CODE")
    private String companyCode;
    
    
    @Column(name = "LJM_DIVISION_CODE")
    private String divisionCode;

    @Column(name = "LJM_DEPARTMENT_CODE")
    private String departmentCode;

	public String getLogActUser() {
		return logActUser;
	}


	public void setLogActUser(String logActUser) {
		this.logActUser = logActUser;
	}


	public String getLogActIp() {
		return logActIp;
	}


	public void setLogActIp(String logActIp) {
		this.logActIp = logActIp;
	}


	public String getLogActHost() {
		return logActHost;
	}


	public void setLogActHost(String logActHost) {
		this.logActHost = logActHost;
	}


	public String getLogActBrowser() {
		return logActBrowser;
	}


	public void setLogActBrowser(String logActBrowser) {
		this.logActBrowser = logActBrowser;
	}


	public String getLogActToken() {
		return logActToken;
	}


	public void setLogActToken(String logActToken) {
		this.logActToken = logActToken;
	}


	public String getLogActStatus() {
		return logActStatus;
	}


	public void setLogActStatus(String logActStatus) {
		this.logActStatus = logActStatus;
	}


	public Timestamp getLogActLoginTime() {
		return logActLoginTime;
	}


	public void setLogActLoginTime(Timestamp logActLoginTime) {
		this.logActLoginTime = logActLoginTime;
	}


	public Timestamp getLogActCrdt() {
		return logActCrdt;
	}


	public void setLogActCrdt(Timestamp logActCrdt) {
		this.logActCrdt = logActCrdt;
	}


	public Timestamp getLogActMddt() {
		return logActMddt;
	}


	public void setLogActMddt(Timestamp logActMddt) {
		this.logActMddt = logActMddt;
	}


	public String getLogActParam1() {
		return logActParam1;
	}


	public void setLogActParam1(String logActParam1) {
		this.logActParam1 = logActParam1;
	}


	public String getLogActParam2() {
		return logActParam2;
	}


	public void setLogActParam2(String logActParam2) {
		this.logActParam2 = logActParam2;
	}


	public String getLogActParam3() {
		return logActParam3;
	}


	public void setLogActParam3(String logActParam3) {
		this.logActParam3 = logActParam3;
	}


	public String getBasecurrency() {
		return basecurrency;
	}


	public void setBasecurrency(String basecurrency) {
		this.basecurrency = basecurrency;
	}


	public String getLangCode() {
		return langCode;
	}


	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}


	public String getCompanyCode() {
		return companyCode;
	}


	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}


	public String getDivisionCode() {
		return divisionCode;
	}


	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}


	public String getDepartmentCode() {
		return departmentCode;
	}


	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

    
    
}