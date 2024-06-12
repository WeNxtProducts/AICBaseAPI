package com.aic.base.emailTemplate;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Lob;

public class LjmEmailTemplateDTO {

    @JsonProperty("ET_SYS_ID")
    private Integer ET_SYS_ID;

    @JsonProperty("ET_TEMP_NAME")
    private String ET_TEMP_NAME;

    @JsonProperty("ET_TEMP_DESC")
    private String ET_TEMP_DESC;

    @JsonProperty("ET_ACTIVE_YN")
    private String ET_ACTIVE_YN;

    @Lob
    @JsonProperty("ET_MSG_BODY")
    private String ET_MSG_BODY;

    private String ET_INS_ID;

    private Date ET_INS_DT;

    private String ET_MOD_ID;

    private Date ET_MOD_DT;

    public Integer getET_SYS_ID() {
        return ET_SYS_ID;
    }

    public void setET_SYS_ID(Integer ET_SYS_ID) {
        this.ET_SYS_ID = ET_SYS_ID;
    }

    public String getET_TEMP_NAME() {
        return ET_TEMP_NAME;
    }

    public void setET_TEMP_NAME(String ET_TEMP_NAME) {
        this.ET_TEMP_NAME = ET_TEMP_NAME;
    }

    public String getET_TEMP_DESC() {
        return ET_TEMP_DESC;
    }

    public void setET_TEMP_DESC(String ET_TEMP_DESC) {
        this.ET_TEMP_DESC = ET_TEMP_DESC;
    }

    public String getET_ACTIVE_YN() {
        return ET_ACTIVE_YN;
    }

    public void setET_ACTIVE_YN(String ET_ACTIVE_YN) {
        this.ET_ACTIVE_YN = ET_ACTIVE_YN;
    }

    public String getET_MSG_BODY() {
        return ET_MSG_BODY;
    }

    public void setET_MSG_BODY(String ET_MSG_BODY) {
        this.ET_MSG_BODY = ET_MSG_BODY;
    }

    public String getET_INS_ID() {
        return ET_INS_ID;
    }

    public void setET_INS_ID(String ET_INS_ID) {
        this.ET_INS_ID = ET_INS_ID;
    }

    public Date getET_INS_DT() {
        return ET_INS_DT;
    }

    public void setET_INS_DT(Date ET_INS_DT) {
        this.ET_INS_DT = ET_INS_DT;
    }

    public String getET_MOD_ID() {
        return ET_MOD_ID;
    }

    public void setET_MOD_ID(String ET_MOD_ID) {
        this.ET_MOD_ID = ET_MOD_ID;
    }

    public Date getET_MOD_DT() {
        return ET_MOD_DT;
    }

    public void setET_MOD_DT(Date ET_MOD_DT) {
        this.ET_MOD_DT = ET_MOD_DT;
    }
}
