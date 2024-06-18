package com.aic.base.AutoDispatch;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "AUTO_DISP_SETUP")
public class AutoDispSetup {

    @Id
  	@SequenceGenerator(name = "AutoDispatchSeq", sequenceName = "ADS_SYS_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AutoDispatchSeq")
    @JsonProperty("ADS_SYS_ID")
    @Column(name = "ADS_SYS_ID")
    private Integer ADS_SYS_ID;

    @JsonProperty("ADS_EVENT_ID")
    @Column(name = "ADS_EVENT_ID")
    private String ADS_EVENT_ID;

    @JsonProperty("ADS_MODULE_ID")
    @Column(name = "ADS_MODULE_ID")
    private String ADS_MODULE_ID;

    @JsonProperty("ADS_TYPE")
    @Column(name = "ADS_TYPE")
    private String ADS_TYPE;

    @JsonProperty("ADS_DESC")
    @Column(name = "ADS_DESC")
    private String ADS_DESC;

    @JsonProperty("ADS_ACTIVE_YN")
    @Column(name = "ADS_ACTIVE_YN")
    private String ADS_ACTIVE_YN;

    @JsonProperty("ADS_EMAIL_TEMP_ID")
    @Column(name = "ADS_EMAIL_TEMP_ID")
    private String ADS_EMAIL_TEMP_ID;

    @JsonProperty("ADS_DOC_YN")
    @Column(name = "ADS_DOC_YN")
    private String ADS_DOC_YN;

    @JsonProperty("ADS_SMS_YN")
    @Column(name = "ADS_SMS_YN")
    private String ADS_SMS_YN;

    @JsonProperty("ADS_WA_YN")
    @Column(name = "ADS_WA_YN")
    private String ADS_WA_YN;

    @Column(name = "ADS_INS_DT")
    private Date ADS_INS_DT;

    @Column(name = "ADS_INS_ID")
    private String ADS_INS_ID;

    @Column(name = "ADS_MOD_DT")
    private Date ADS_MOD_DT;

    @Column(name = "ADS_MOD_ID")
    private String ADS_MOD_ID;

    // Getters and Setters
    public Integer getADS_SYS_ID() {
        return ADS_SYS_ID;
    }

    public void setADS_SYS_ID(Integer ADS_SYS_ID) {
        this.ADS_SYS_ID = ADS_SYS_ID;
    }

    public String getADS_EVENT_ID() {
        return ADS_EVENT_ID;
    }

    public void setADS_EVENT_ID(String ADS_EVENT_ID) {
        this.ADS_EVENT_ID = ADS_EVENT_ID;
    }

    public String getADS_MODULE_ID() {
        return ADS_MODULE_ID;
    }

    public void setADS_MODULE_ID(String ADS_MODULE_ID) {
        this.ADS_MODULE_ID = ADS_MODULE_ID;
    }

    public String getADS_TYPE() {
        return ADS_TYPE;
    }

    public void setADS_TYPE(String ADS_TYPE) {
        this.ADS_TYPE = ADS_TYPE;
    }

    public String getADS_DESC() {
        return ADS_DESC;
    }

    public void setADS_DESC(String ADS_DESC) {
        this.ADS_DESC = ADS_DESC;
    }

    public String getADS_ACTIVE_YN() {
        return ADS_ACTIVE_YN;
    }

    public void setADS_ACTIVE_YN(String ADS_ACTIVE_YN) {
        this.ADS_ACTIVE_YN = ADS_ACTIVE_YN;
    }

    public String getADS_EMAIL_TEMP_ID() {
        return ADS_EMAIL_TEMP_ID;
    }

    public void setADS_EMAIL_TEMP_ID(String ADS_EMAIL_TEMP_ID) {
        this.ADS_EMAIL_TEMP_ID = ADS_EMAIL_TEMP_ID;
    }

    public String getADS_DOC_YN() {
        return ADS_DOC_YN;
    }

    public void setADS_DOC_YN(String ADS_DOC_YN) {
        this.ADS_DOC_YN = ADS_DOC_YN;
    }

    public String getADS_SMS_YN() {
        return ADS_SMS_YN;
    }

    public void setADS_SMS_YN(String ADS_SMS_YN) {
        this.ADS_SMS_YN = ADS_SMS_YN;
    }

    public String getADS_WA_YN() {
        return ADS_WA_YN;
    }

    public void setADS_WA_YN(String ADS_WA_YN) {
        this.ADS_WA_YN = ADS_WA_YN;
    }

    public Date getADS_INS_DT() {
        return ADS_INS_DT;
    }

    public void setADS_INS_DT(Date ADS_INS_DT) {
        this.ADS_INS_DT = ADS_INS_DT;
    }

    public String getADS_INS_ID() {
        return ADS_INS_ID;
    }

    public void setADS_INS_ID(String ADS_INS_ID) {
        this.ADS_INS_ID = ADS_INS_ID;
    }

    public Date getADS_MOD_DT() {
        return ADS_MOD_DT;
    }

    public void setADS_MOD_DT(Date ADS_MOD_DT) {
        this.ADS_MOD_DT = ADS_MOD_DT;
    }

    public String getADS_MOD_ID() {
        return ADS_MOD_ID;
    }

    public void setADS_MOD_ID(String ADS_MOD_ID) {
        this.ADS_MOD_ID = ADS_MOD_ID;
    }
}
