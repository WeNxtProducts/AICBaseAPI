package com.aic.base.AutoDispatch;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "AUTO_DISP_DOC_COND")
public class AutoDispDocCond {

    @Id
  	@SequenceGenerator(name = "AutoDispatchDocCondSeq", sequenceName = "ADDC_SYS_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AutoDispatchDocCondSeq")
    @Column(name = "ADDC_SYS_ID")
    private Integer ADDC_SYS_ID;

    @ManyToOne
    @JoinColumn(name = "ADDC_ADS_SYS_ID")
    private AutoDispSetup ADDC_ADS_SYS_ID;

    @Column(name = "ADDC_COND_CODE")
    private String ADDC_COND_CODE;

    @Column(name = "ADDC_TEMP_NAME")
    private String ADDC_TEMP_NAME;

    @Column(name = "ADDC_DOC_COND")
    private String ADDC_DOC_COND;

    @Column(name = "ADDC_ACTIVE_YN")
    private String ADDC_ACTIVE_YN;

    @Column(name = "ADDC_INS_DT")
    private Date ADDC_INS_DT;

    @Column(name = "ADDC_INS_ID")
    private String ADDC_INS_ID;

    @Column(name = "ADDC_MOD_DT")
    private Date ADDC_MOD_DT;

    @Column(name = "ADDC_MOD_ID")
    private String ADDC_MOD_ID;

    public Integer getADDC_SYS_ID() {
        return ADDC_SYS_ID;
    }

    public void setADDC_SYS_ID(Integer ADDC_SYS_ID) {
        this.ADDC_SYS_ID = ADDC_SYS_ID;
    }

    public AutoDispSetup getADDC_ADS_SYS_ID() {
        return ADDC_ADS_SYS_ID;
    }

    public void setADDC_ADS_SYS_ID(AutoDispSetup ADDC_ADS_SYS_ID) {
        this.ADDC_ADS_SYS_ID = ADDC_ADS_SYS_ID;
    }

    public String getADDC_COND_CODE() {
        return ADDC_COND_CODE;
    }

    public void setADDC_COND_CODE(String ADDC_COND_CODE) {
        this.ADDC_COND_CODE = ADDC_COND_CODE;
    }

    public String getADDC_TEMP_NAME() {
        return ADDC_TEMP_NAME;
    }

    public void setADDC_TEMP_NAME(String ADDC_TEMP_NAME) {
        this.ADDC_TEMP_NAME = ADDC_TEMP_NAME;
    }

    public String getADDC_DOC_COND() {
        return ADDC_DOC_COND;
    }

    public void setADDC_DOC_COND(String ADDC_DOC_COND) {
        this.ADDC_DOC_COND = ADDC_DOC_COND;
    }

    public String getADDC_ACTIVE_YN() {
        return ADDC_ACTIVE_YN;
    }

    public void setADDC_ACTIVE_YN(String ADDC_ACTIVE_YN) {
        this.ADDC_ACTIVE_YN = ADDC_ACTIVE_YN;
    }

    public Date getADDC_INS_DT() {
        return ADDC_INS_DT;
    }

    public void setADDC_INS_DT(Date ADDC_INS_DT) {
        this.ADDC_INS_DT = ADDC_INS_DT;
    }

    public String getADDC_INS_ID() {
        return ADDC_INS_ID;
    }

    public void setADDC_INS_ID(String ADDC_INS_ID) {
        this.ADDC_INS_ID = ADDC_INS_ID;
    }

    public Date getADDC_MOD_DT() {
        return ADDC_MOD_DT;
    }

    public void setADDC_MOD_DT(Date ADDC_MOD_DT) {
        this.ADDC_MOD_DT = ADDC_MOD_DT;
    }

    public String getADDC_MOD_ID() {
        return ADDC_MOD_ID;
    }

    public void setADDC_MOD_ID(String ADDC_MOD_ID) {
        this.ADDC_MOD_ID = ADDC_MOD_ID;
    }
}
