package com.aic.base.logHistory;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ljm_logAudit")
public class LogAudit {

    @Id
    @Column(name = "ljm_logAudit_sysid", length = 50, nullable = false)
    private String sysId;

    @Column(name = "ljm_logAudit_user", length = 255, nullable = false)
    private String user;

    @Column(name = "ljm_logAudit_ip", length = 255)
    private String ip;

    @Column(name = "ljm_logAudit_host", length = 255)
    private String host;

    @Column(name = "ljm_logAudit_browser", length = 255)
    private String browser;

    @Column(name = "ljm_logAudit_dt")
    private Timestamp logDate;

    @Column(name = "ljm_logAudit_type", length = 50)
    private String type;

    // Getters and Setters

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public Timestamp getLogDate() {
        return logDate;
    }

    public void setLogDate(Timestamp logDate) {
        this.logDate = logDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
