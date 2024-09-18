package com.aic.base.model;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "LM_USER_APPR_SETUP_DET")
public class LM_USER_APPR_SETUP_DET {

    @Id
    @SequenceGenerator(name = "ApprSetupTranIdSeq", sequenceName = "ASD_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ApprSetupTranIdSeq")
    @Column(name = "ASD_TRAN_ID")
    private Long ASD_TRAN_ID;

    @Column(name = "ASD_USER_ID")
    private String ASD_USER_ID;

    @Column(name = "ASD_CODE")
    private String ASD_CODE;

    @Column(name = "ASD_NUM_VALUE")
    private Double ASD_NUM_VALUE;

    @Column(name = "ASD_CHAR_VALUE")
    private String ASD_CHAR_VALUE;

    @Column(name = "ASD_FLAG")
    private String ASD_FLAG;

    @Column(name = "ASD_MODULE_ID")
    private String ASD_MODULE_ID;

    @Column(name = "ASD_INS_DT", nullable = false)
    private Date ASD_INS_DT;

    @Column(name = "ASD_INS_ID", nullable = false)
    private String ASD_INS_ID;

    @Column(name = "ASD_MOD_DT")
    private Date ASD_MOD_DT;

    @Column(name = "ASD_MOD_ID")
    private String ASD_MOD_ID;

    @Column(name = "ASD_FM_PROD_CODE")
    private String ASD_FM_PROD_CODE;

    @Column(name = "ASD_TO_PROD_CODE")
    private String ASD_TO_PROD_CODE;

    // Getters and Setters

    public Long getASD_TRAN_ID() {
        return ASD_TRAN_ID;
    }

    public void setASD_TRAN_ID(Long ASD_TRAN_ID) {
        this.ASD_TRAN_ID = ASD_TRAN_ID;
    }

    public String getASD_USER_ID() {
        return ASD_USER_ID;
    }

    public void setASD_USER_ID(String ASD_USER_ID) {
        this.ASD_USER_ID = ASD_USER_ID;
    }

    public String getASD_CODE() {
        return ASD_CODE;
    }

    public void setASD_CODE(String ASD_CODE) {
        this.ASD_CODE = ASD_CODE;
    }

    public Double getASD_NUM_VALUE() {
        return ASD_NUM_VALUE;
    }

    public void setASD_NUM_VALUE(Double ASD_NUM_VALUE) {
        this.ASD_NUM_VALUE = ASD_NUM_VALUE;
    }

    public String getASD_CHAR_VALUE() {
        return ASD_CHAR_VALUE;
    }

    public void setASD_CHAR_VALUE(String ASD_CHAR_VALUE) {
        this.ASD_CHAR_VALUE = ASD_CHAR_VALUE;
    }

    public String getASD_FLAG() {
        return ASD_FLAG;
    }

    public void setASD_FLAG(String ASD_FLAG) {
        this.ASD_FLAG = ASD_FLAG;
    }

    public String getASD_MODULE_ID() {
        return ASD_MODULE_ID;
    }

    public void setASD_MODULE_ID(String ASD_MODULE_ID) {
        this.ASD_MODULE_ID = ASD_MODULE_ID;
    }

    public Date getASD_INS_DT() {
        return ASD_INS_DT;
    }

    public void setASD_INS_DT(Date ASD_INS_DT) {
        this.ASD_INS_DT = ASD_INS_DT;
    }

    public String getASD_INS_ID() {
        return ASD_INS_ID;
    }

    public void setASD_INS_ID(String ASD_INS_ID) {
        this.ASD_INS_ID = ASD_INS_ID;
    }

    public Date getASD_MOD_DT() {
        return ASD_MOD_DT;
    }

    public void setASD_MOD_DT(Date ASD_MOD_DT) {
        this.ASD_MOD_DT = ASD_MOD_DT;
    }

    public String getASD_MOD_ID() {
        return ASD_MOD_ID;
    }

    public void setASD_MOD_ID(String ASD_MOD_ID) {
        this.ASD_MOD_ID = ASD_MOD_ID;
    }

    public String getASD_FM_PROD_CODE() {
        return ASD_FM_PROD_CODE;
    }

    public void setASD_FM_PROD_CODE(String ASD_FM_PROD_CODE) {
        this.ASD_FM_PROD_CODE = ASD_FM_PROD_CODE;
    }

    public String getASD_TO_PROD_CODE() {
        return ASD_TO_PROD_CODE;
    }

    public void setASD_TO_PROD_CODE(String ASD_TO_PROD_CODE) {
        this.ASD_TO_PROD_CODE = ASD_TO_PROD_CODE;
    }
}
