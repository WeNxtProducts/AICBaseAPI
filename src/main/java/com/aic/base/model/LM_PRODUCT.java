package com.aic.base.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LM_PRODUCT", schema = "LIFE_DEV")
public class LM_PRODUCT {

    @Id
    @Column(name = "PROD_CODE", nullable = false, length = 12)
    private String PROD_CODE;

    @Column(name = "PROD_DESC", length = 240)
    private String PROD_DESC;

    @Column(name = "PROD_SHORT_DESC", length = 60)
    private String PROD_SHORT_DESC;

    @Column(name = "PROD_LONG_DESC", length = 2000)
    private String PROD_LONG_DESC;

    @Column(name = "PROD_BL_DESC", length = 240)
    private String PROD_BL_DESC;

    @Column(name = "PROD_BL_SHORT_DESC", length = 60)
    private String PROD_BL_SHORT_DESC;

    @Column(name = "PROD_BL_LONG_DESC", length = 2000)
    private String PROD_BL_LONG_DESC;

    @Column(name = "PROD_RATING_BASIS", length = 1)
    private String PROD_RATING_BASIS;

    @Column(name = "PROD_EFF_FM_DT")
    private Date PROD_EFF_FM_DT;

    @Column(name = "PROD_EFF_TO_DT")
    private Date PROD_EFF_TO_DT;

    @Column(name = "PROD_INS_DT", nullable = false)
    private Date PROD_INS_DT;

    @Column(name = "PROD_INS_ID", nullable = false, length = 10)
    private String PROD_INS_ID;

    @Column(name = "PROD_MOD_DT")
    private Date PROD_MOD_DT;

    @Column(name = "PROD_MOD_ID", length = 10)
    private String PROD_MOD_ID;

    @Column(name = "PROD_MAX_AGE", precision = 2, scale = 0)
    private BigDecimal PROD_MAX_AGE;

    @Column(name = "PROD_COMM_CODE", length = 12)
    private String PROD_COMM_CODE;

    @Column(name = "PROD_MASTER_POLICY_REQD_YN", length = 1)
    private String PROD_MASTER_POLICY_REQD_YN;

    @Column(name = "PROD_LC_FCL", precision = 14, scale = 3)
    private BigDecimal PROD_LC_FCL;

    @Column(name = "PROD_AGE_CALC_MTHD", length = 12)
    private String PROD_AGE_CALC_MTHD;

    @Column(name = "PROD_BASIC_COVER_REQ_YN", length = 1)
    private String PROD_BASIC_COVER_REQ_YN;

    @Column(name = "PROD_COMM_CALC_MTHD", length = 12)
    private String PROD_COMM_CALC_MTHD;

    @Column(name = "PROD_POL_COMM_CODE", length = 12)
    private String PROD_POL_COMM_CODE;

    @Column(name = "PROD_PRODUCTION_BASIS_YN", length = 1)
    private String PROD_PRODUCTION_BASIS_YN;

    @Column(name = "PROD_MIN_CLM_INTM_DAYS", precision = 3, scale = 0)
    private BigDecimal PROD_MIN_CLM_INTM_DAYS;

    @Column(name = "PROD_PERIOD_START_BASIS", length = 1)
    private String PROD_PERIOD_START_BASIS;

    @Column(name = "PROD_COMM_CALC_BASIS", length = 1)
    private String PROD_COMM_CALC_BASIS;

    @Column(name = "PROD_MUD_APPL_YN", length = 1)
    private String PROD_MUD_APPL_YN;

    @Column(name = "PROD_CREDIT_YN", length = 1)
    private String PROD_CREDIT_YN;

    @Column(name = "PROD_DEFERMENT_PERIOD", precision = 6, scale = 0)
    private BigDecimal PROD_DEFERMENT_PERIOD;

    @Column(name = "PROD_DISCOUNT_RATE", precision = 9, scale = 5)
    private BigDecimal PROD_DISCOUNT_RATE;

    @Column(name = "PROD_DISCOUNT_RATE_PER", precision = 10, scale = 0)
    private BigDecimal PROD_DISCOUNT_RATE_PER;

    @Column(name = "PROD_WAKALAH_FEE", precision = 9, scale = 5)
    private BigDecimal PROD_WAKALAH_FEE;

    @Column(name = "PROD_WAKALAH_FEE_PER", precision = 10, scale = 0)
    private BigDecimal PROD_WAKALAH_FEE_PER;

    @Column(name = "PROD_COOLOFF_DAYS", precision = 3, scale = 0)
    private BigDecimal PROD_COOLOFF_DAYS;

    @Column(name = "PROD_PLAN_YN", length = 1)
    private String PROD_PLAN_YN;

    @Column(name = "PROD_FCL_TYPE", length = 1)
    private String PROD_FCL_TYPE;

    @Column(name = "PROD_EMP_CERT_YN", length = 1)
    private String PROD_EMP_CERT_YN;

    @Column(name = "PROD_CBC_YN", length = 1)
    private String PROD_CBC_YN;

    @Column(name = "PROD_SAL_ENTER_YN", length = 1)
    private String PROD_SAL_ENTER_YN;

    @Column(name = "PROD_RENEWAL_APPL_YN", length = 1)
    private String PROD_RENEWAL_APPL_YN;

    @Column(name = "PROD_POL_NO_GEN_TYP", length = 8)
    private String PROD_POL_NO_GEN_TYP;

    @Column(name = "PROD_COMM_RND_TYPE", length = 1)
    private String PROD_COMM_RND_TYPE;

    @Column(name = "PROD_COMM_RND_DEC", precision = 3, scale = 0)
    private BigDecimal PROD_COMM_RND_DEC;

    @Column(name = "PROD_PREM_RND_TYPE", length = 1)
    private String PROD_PREM_RND_TYPE;

    @Column(name = "PROD_PREM_RND_DEC", precision = 3, scale = 0)
    private BigDecimal PROD_PREM_RND_DEC;

    @Column(name = "PROD_AUTO_UW", length = 1)
    private String PROD_AUTO_UW;

    @Column(name = "PROD_MAT_PYMT_YN", length = 1)
    private String PROD_MAT_PYMT_YN;

    @Column(name = "PROD_MAT_TYPE", length = 12)
    private String PROD_MAT_TYPE;

    @Column(name = "PROD_SURR_TYPE", length = 12)
    private String PROD_SURR_TYPE;

    @Column(name = "PROD_SURR_FACTOR", length = 12)
    private String PROD_SURR_FACTOR;

    @Column(name = "PROD_MIN_MEM", precision = 10, scale = 0)
    private BigDecimal PROD_MIN_MEM;

    @Column(name = "PROD_SURR_LC_MINVAL")
    private BigDecimal PROD_SURR_LC_MINVAL;

    @Column(name = "PROD_AUTO_REN_PERIOD", precision = 3, scale = 0)
    private BigDecimal PROD_AUTO_REN_PERIOD;

    @Column(name = "PROD_COINS_YN", length = 1)
    private String PROD_COINS_YN;

    @Column(name = "PROD_SAL_MULTIPLE", precision = 3, scale = 0)
    private BigDecimal PROD_SAL_MULTIPLE;

    @Column(name = "PROD_AGE_CALC_FLAG", length = 2)
    private String PROD_AGE_CALC_FLAG;

    @Column(name = "PROD_IBNR_REQ_YN", length = 2)
    private String PROD_IBNR_REQ_YN;

    @Column(name = "PROD_DIRECT_APPRV_YN", length = 1)
    private String PROD_DIRECT_APPRV_YN;

    @Column(name = "PROD_MAT_AGE", precision = 3, scale = 0)
    private BigDecimal PROD_MAT_AGE;

    @Column(name = "PROD_MAX_TERM", precision = 3, scale = 0)
    private BigDecimal PROD_MAX_TERM;

    @Column(name = "PROD_TYPE", length = 12)
    private String PROD_TYPE;

    @Column(name = "PROD_POL_SHD_FEE", length = 1)
    private String PROD_POL_SHD_FEE;

    @Column(name = "PROD_POL_SHD_PAG", precision = 12, scale = 0)
    private BigDecimal PROD_POL_SHD_PAG;

    @Column(name = "PROD_POL_SHD_RATE", precision = 12, scale = 4)
    private BigDecimal PROD_POL_SHD_RATE;

    @Column(name = "PROD_ROUND_VALUE")
    private BigDecimal PROD_ROUND_VALUE;

    @Column(name = "PROD_ROUND_OPTION", length = 3)
    private String PROD_ROUND_OPTION;

    @Column(name = "PROD_MATU_DT", length = 1)
    private String PROD_MATU_DT;

    @Column(name = "PROD_MAT_AMT_TYPE", length = 5)
    private String PROD_MAT_AMT_TYPE;

    @Column(name = "PROD_MAT_RATE", precision = 8, scale = 5)
    private BigDecimal PROD_MAT_RATE;

    @Column(name = "PROD_MAT_RATE_PER", precision = 10, scale = 0)
    private BigDecimal PROD_MAT_RATE_PER;

    @Column(name = "PROD_SA_INST_PYMT_TYPE", length = 1)
    private String PROD_SA_INST_PYMT_TYPE;

    @Column(name = "PROD_CASHBACK_YN", length = 1)
    private String PROD_CASHBACK_YN;

    @Column(name = "PROD_MODULE_ID", length = 2)
    private String PROD_MODULE_ID;

	public String getPROD_CODE() {
		return PROD_CODE;
	}

	public void setPROD_CODE(String pROD_CODE) {
		PROD_CODE = pROD_CODE;
	}

	public String getPROD_DESC() {
		return PROD_DESC;
	}

	public void setPROD_DESC(String pROD_DESC) {
		PROD_DESC = pROD_DESC;
	}

	public String getPROD_SHORT_DESC() {
		return PROD_SHORT_DESC;
	}

	public void setPROD_SHORT_DESC(String pROD_SHORT_DESC) {
		PROD_SHORT_DESC = pROD_SHORT_DESC;
	}

	public String getPROD_LONG_DESC() {
		return PROD_LONG_DESC;
	}

	public void setPROD_LONG_DESC(String pROD_LONG_DESC) {
		PROD_LONG_DESC = pROD_LONG_DESC;
	}

	public String getPROD_BL_DESC() {
		return PROD_BL_DESC;
	}

	public void setPROD_BL_DESC(String pROD_BL_DESC) {
		PROD_BL_DESC = pROD_BL_DESC;
	}

	public String getPROD_BL_SHORT_DESC() {
		return PROD_BL_SHORT_DESC;
	}

	public void setPROD_BL_SHORT_DESC(String pROD_BL_SHORT_DESC) {
		PROD_BL_SHORT_DESC = pROD_BL_SHORT_DESC;
	}

	public String getPROD_BL_LONG_DESC() {
		return PROD_BL_LONG_DESC;
	}

	public void setPROD_BL_LONG_DESC(String pROD_BL_LONG_DESC) {
		PROD_BL_LONG_DESC = pROD_BL_LONG_DESC;
	}

	public String getPROD_RATING_BASIS() {
		return PROD_RATING_BASIS;
	}

	public void setPROD_RATING_BASIS(String pROD_RATING_BASIS) {
		PROD_RATING_BASIS = pROD_RATING_BASIS;
	}

	public Date getPROD_EFF_FM_DT() {
		return PROD_EFF_FM_DT;
	}

	public void setPROD_EFF_FM_DT(Date pROD_EFF_FM_DT) {
		PROD_EFF_FM_DT = pROD_EFF_FM_DT;
	}

	public Date getPROD_EFF_TO_DT() {
		return PROD_EFF_TO_DT;
	}

	public void setPROD_EFF_TO_DT(Date pROD_EFF_TO_DT) {
		PROD_EFF_TO_DT = pROD_EFF_TO_DT;
	}

	public Date getPROD_INS_DT() {
		return PROD_INS_DT;
	}

	public void setPROD_INS_DT(Date pROD_INS_DT) {
		PROD_INS_DT = pROD_INS_DT;
	}

	public String getPROD_INS_ID() {
		return PROD_INS_ID;
	}

	public void setPROD_INS_ID(String pROD_INS_ID) {
		PROD_INS_ID = pROD_INS_ID;
	}

	public Date getPROD_MOD_DT() {
		return PROD_MOD_DT;
	}

	public void setPROD_MOD_DT(Date pROD_MOD_DT) {
		PROD_MOD_DT = pROD_MOD_DT;
	}

	public String getPROD_MOD_ID() {
		return PROD_MOD_ID;
	}

	public void setPROD_MOD_ID(String pROD_MOD_ID) {
		PROD_MOD_ID = pROD_MOD_ID;
	}

	public BigDecimal getPROD_MAX_AGE() {
		return PROD_MAX_AGE;
	}

	public void setPROD_MAX_AGE(BigDecimal pROD_MAX_AGE) {
		PROD_MAX_AGE = pROD_MAX_AGE;
	}

	public String getPROD_COMM_CODE() {
		return PROD_COMM_CODE;
	}

	public void setPROD_COMM_CODE(String pROD_COMM_CODE) {
		PROD_COMM_CODE = pROD_COMM_CODE;
	}

	public String getPROD_MASTER_POLICY_REQD_YN() {
		return PROD_MASTER_POLICY_REQD_YN;
	}

	public void setPROD_MASTER_POLICY_REQD_YN(String pROD_MASTER_POLICY_REQD_YN) {
		PROD_MASTER_POLICY_REQD_YN = pROD_MASTER_POLICY_REQD_YN;
	}

	public BigDecimal getPROD_LC_FCL() {
		return PROD_LC_FCL;
	}

	public void setPROD_LC_FCL(BigDecimal pROD_LC_FCL) {
		PROD_LC_FCL = pROD_LC_FCL;
	}

	public String getPROD_AGE_CALC_MTHD() {
		return PROD_AGE_CALC_MTHD;
	}

	public void setPROD_AGE_CALC_MTHD(String pROD_AGE_CALC_MTHD) {
		PROD_AGE_CALC_MTHD = pROD_AGE_CALC_MTHD;
	}

	public String getPROD_BASIC_COVER_REQ_YN() {
		return PROD_BASIC_COVER_REQ_YN;
	}

	public void setPROD_BASIC_COVER_REQ_YN(String pROD_BASIC_COVER_REQ_YN) {
		PROD_BASIC_COVER_REQ_YN = pROD_BASIC_COVER_REQ_YN;
	}

	public String getPROD_COMM_CALC_MTHD() {
		return PROD_COMM_CALC_MTHD;
	}

	public void setPROD_COMM_CALC_MTHD(String pROD_COMM_CALC_MTHD) {
		PROD_COMM_CALC_MTHD = pROD_COMM_CALC_MTHD;
	}

	public String getPROD_POL_COMM_CODE() {
		return PROD_POL_COMM_CODE;
	}

	public void setPROD_POL_COMM_CODE(String pROD_POL_COMM_CODE) {
		PROD_POL_COMM_CODE = pROD_POL_COMM_CODE;
	}

	public String getPROD_PRODUCTION_BASIS_YN() {
		return PROD_PRODUCTION_BASIS_YN;
	}

	public void setPROD_PRODUCTION_BASIS_YN(String pROD_PRODUCTION_BASIS_YN) {
		PROD_PRODUCTION_BASIS_YN = pROD_PRODUCTION_BASIS_YN;
	}

	public BigDecimal getPROD_MIN_CLM_INTM_DAYS() {
		return PROD_MIN_CLM_INTM_DAYS;
	}

	public void setPROD_MIN_CLM_INTM_DAYS(BigDecimal pROD_MIN_CLM_INTM_DAYS) {
		PROD_MIN_CLM_INTM_DAYS = pROD_MIN_CLM_INTM_DAYS;
	}

	public String getPROD_PERIOD_START_BASIS() {
		return PROD_PERIOD_START_BASIS;
	}

	public void setPROD_PERIOD_START_BASIS(String pROD_PERIOD_START_BASIS) {
		PROD_PERIOD_START_BASIS = pROD_PERIOD_START_BASIS;
	}

	public String getPROD_COMM_CALC_BASIS() {
		return PROD_COMM_CALC_BASIS;
	}

	public void setPROD_COMM_CALC_BASIS(String pROD_COMM_CALC_BASIS) {
		PROD_COMM_CALC_BASIS = pROD_COMM_CALC_BASIS;
	}

	public String getPROD_MUD_APPL_YN() {
		return PROD_MUD_APPL_YN;
	}

	public void setPROD_MUD_APPL_YN(String pROD_MUD_APPL_YN) {
		PROD_MUD_APPL_YN = pROD_MUD_APPL_YN;
	}

	public String getPROD_CREDIT_YN() {
		return PROD_CREDIT_YN;
	}

	public void setPROD_CREDIT_YN(String pROD_CREDIT_YN) {
		PROD_CREDIT_YN = pROD_CREDIT_YN;
	}

	public BigDecimal getPROD_DEFERMENT_PERIOD() {
		return PROD_DEFERMENT_PERIOD;
	}

	public void setPROD_DEFERMENT_PERIOD(BigDecimal pROD_DEFERMENT_PERIOD) {
		PROD_DEFERMENT_PERIOD = pROD_DEFERMENT_PERIOD;
	}

	public BigDecimal getPROD_DISCOUNT_RATE() {
		return PROD_DISCOUNT_RATE;
	}

	public void setPROD_DISCOUNT_RATE(BigDecimal pROD_DISCOUNT_RATE) {
		PROD_DISCOUNT_RATE = pROD_DISCOUNT_RATE;
	}

	public BigDecimal getPROD_DISCOUNT_RATE_PER() {
		return PROD_DISCOUNT_RATE_PER;
	}

	public void setPROD_DISCOUNT_RATE_PER(BigDecimal pROD_DISCOUNT_RATE_PER) {
		PROD_DISCOUNT_RATE_PER = pROD_DISCOUNT_RATE_PER;
	}

	public BigDecimal getPROD_WAKALAH_FEE() {
		return PROD_WAKALAH_FEE;
	}

	public void setPROD_WAKALAH_FEE(BigDecimal pROD_WAKALAH_FEE) {
		PROD_WAKALAH_FEE = pROD_WAKALAH_FEE;
	}

	public BigDecimal getPROD_WAKALAH_FEE_PER() {
		return PROD_WAKALAH_FEE_PER;
	}

	public void setPROD_WAKALAH_FEE_PER(BigDecimal pROD_WAKALAH_FEE_PER) {
		PROD_WAKALAH_FEE_PER = pROD_WAKALAH_FEE_PER;
	}

	public BigDecimal getPROD_COOLOFF_DAYS() {
		return PROD_COOLOFF_DAYS;
	}

	public void setPROD_COOLOFF_DAYS(BigDecimal pROD_COOLOFF_DAYS) {
		PROD_COOLOFF_DAYS = pROD_COOLOFF_DAYS;
	}

	public String getPROD_PLAN_YN() {
		return PROD_PLAN_YN;
	}

	public void setPROD_PLAN_YN(String pROD_PLAN_YN) {
		PROD_PLAN_YN = pROD_PLAN_YN;
	}

	public String getPROD_FCL_TYPE() {
		return PROD_FCL_TYPE;
	}

	public void setPROD_FCL_TYPE(String pROD_FCL_TYPE) {
		PROD_FCL_TYPE = pROD_FCL_TYPE;
	}

	public String getPROD_EMP_CERT_YN() {
		return PROD_EMP_CERT_YN;
	}

	public void setPROD_EMP_CERT_YN(String pROD_EMP_CERT_YN) {
		PROD_EMP_CERT_YN = pROD_EMP_CERT_YN;
	}

	public String getPROD_CBC_YN() {
		return PROD_CBC_YN;
	}

	public void setPROD_CBC_YN(String pROD_CBC_YN) {
		PROD_CBC_YN = pROD_CBC_YN;
	}

	public String getPROD_SAL_ENTER_YN() {
		return PROD_SAL_ENTER_YN;
	}

	public void setPROD_SAL_ENTER_YN(String pROD_SAL_ENTER_YN) {
		PROD_SAL_ENTER_YN = pROD_SAL_ENTER_YN;
	}

	public String getPROD_RENEWAL_APPL_YN() {
		return PROD_RENEWAL_APPL_YN;
	}

	public void setPROD_RENEWAL_APPL_YN(String pROD_RENEWAL_APPL_YN) {
		PROD_RENEWAL_APPL_YN = pROD_RENEWAL_APPL_YN;
	}

	public String getPROD_POL_NO_GEN_TYP() {
		return PROD_POL_NO_GEN_TYP;
	}

	public void setPROD_POL_NO_GEN_TYP(String pROD_POL_NO_GEN_TYP) {
		PROD_POL_NO_GEN_TYP = pROD_POL_NO_GEN_TYP;
	}

	public String getPROD_COMM_RND_TYPE() {
		return PROD_COMM_RND_TYPE;
	}

	public void setPROD_COMM_RND_TYPE(String pROD_COMM_RND_TYPE) {
		PROD_COMM_RND_TYPE = pROD_COMM_RND_TYPE;
	}

	public BigDecimal getPROD_COMM_RND_DEC() {
		return PROD_COMM_RND_DEC;
	}

	public void setPROD_COMM_RND_DEC(BigDecimal pROD_COMM_RND_DEC) {
		PROD_COMM_RND_DEC = pROD_COMM_RND_DEC;
	}

	public String getPROD_PREM_RND_TYPE() {
		return PROD_PREM_RND_TYPE;
	}

	public void setPROD_PREM_RND_TYPE(String pROD_PREM_RND_TYPE) {
		PROD_PREM_RND_TYPE = pROD_PREM_RND_TYPE;
	}

	public BigDecimal getPROD_PREM_RND_DEC() {
		return PROD_PREM_RND_DEC;
	}

	public void setPROD_PREM_RND_DEC(BigDecimal pROD_PREM_RND_DEC) {
		PROD_PREM_RND_DEC = pROD_PREM_RND_DEC;
	}

	public String getPROD_AUTO_UW() {
		return PROD_AUTO_UW;
	}

	public void setPROD_AUTO_UW(String pROD_AUTO_UW) {
		PROD_AUTO_UW = pROD_AUTO_UW;
	}

	public String getPROD_MAT_PYMT_YN() {
		return PROD_MAT_PYMT_YN;
	}

	public void setPROD_MAT_PYMT_YN(String pROD_MAT_PYMT_YN) {
		PROD_MAT_PYMT_YN = pROD_MAT_PYMT_YN;
	}

	public String getPROD_MAT_TYPE() {
		return PROD_MAT_TYPE;
	}

	public void setPROD_MAT_TYPE(String pROD_MAT_TYPE) {
		PROD_MAT_TYPE = pROD_MAT_TYPE;
	}

	public String getPROD_SURR_TYPE() {
		return PROD_SURR_TYPE;
	}

	public void setPROD_SURR_TYPE(String pROD_SURR_TYPE) {
		PROD_SURR_TYPE = pROD_SURR_TYPE;
	}

	public String getPROD_SURR_FACTOR() {
		return PROD_SURR_FACTOR;
	}

	public void setPROD_SURR_FACTOR(String pROD_SURR_FACTOR) {
		PROD_SURR_FACTOR = pROD_SURR_FACTOR;
	}

	public BigDecimal getPROD_MIN_MEM() {
		return PROD_MIN_MEM;
	}

	public void setPROD_MIN_MEM(BigDecimal pROD_MIN_MEM) {
		PROD_MIN_MEM = pROD_MIN_MEM;
	}

	public BigDecimal getPROD_SURR_LC_MINVAL() {
		return PROD_SURR_LC_MINVAL;
	}

	public void setPROD_SURR_LC_MINVAL(BigDecimal pROD_SURR_LC_MINVAL) {
		PROD_SURR_LC_MINVAL = pROD_SURR_LC_MINVAL;
	}

	public BigDecimal getPROD_AUTO_REN_PERIOD() {
		return PROD_AUTO_REN_PERIOD;
	}

	public void setPROD_AUTO_REN_PERIOD(BigDecimal pROD_AUTO_REN_PERIOD) {
		PROD_AUTO_REN_PERIOD = pROD_AUTO_REN_PERIOD;
	}

	public String getPROD_COINS_YN() {
		return PROD_COINS_YN;
	}

	public void setPROD_COINS_YN(String pROD_COINS_YN) {
		PROD_COINS_YN = pROD_COINS_YN;
	}

	public BigDecimal getPROD_SAL_MULTIPLE() {
		return PROD_SAL_MULTIPLE;
	}

	public void setPROD_SAL_MULTIPLE(BigDecimal pROD_SAL_MULTIPLE) {
		PROD_SAL_MULTIPLE = pROD_SAL_MULTIPLE;
	}

	public String getPROD_AGE_CALC_FLAG() {
		return PROD_AGE_CALC_FLAG;
	}

	public void setPROD_AGE_CALC_FLAG(String pROD_AGE_CALC_FLAG) {
		PROD_AGE_CALC_FLAG = pROD_AGE_CALC_FLAG;
	}

	public String getPROD_IBNR_REQ_YN() {
		return PROD_IBNR_REQ_YN;
	}

	public void setPROD_IBNR_REQ_YN(String pROD_IBNR_REQ_YN) {
		PROD_IBNR_REQ_YN = pROD_IBNR_REQ_YN;
	}

	public String getPROD_DIRECT_APPRV_YN() {
		return PROD_DIRECT_APPRV_YN;
	}

	public void setPROD_DIRECT_APPRV_YN(String pROD_DIRECT_APPRV_YN) {
		PROD_DIRECT_APPRV_YN = pROD_DIRECT_APPRV_YN;
	}

	public BigDecimal getPROD_MAT_AGE() {
		return PROD_MAT_AGE;
	}

	public void setPROD_MAT_AGE(BigDecimal pROD_MAT_AGE) {
		PROD_MAT_AGE = pROD_MAT_AGE;
	}

	public BigDecimal getPROD_MAX_TERM() {
		return PROD_MAX_TERM;
	}

	public void setPROD_MAX_TERM(BigDecimal pROD_MAX_TERM) {
		PROD_MAX_TERM = pROD_MAX_TERM;
	}

	public String getPROD_TYPE() {
		return PROD_TYPE;
	}

	public void setPROD_TYPE(String pROD_TYPE) {
		PROD_TYPE = pROD_TYPE;
	}

	public String getPROD_POL_SHD_FEE() {
		return PROD_POL_SHD_FEE;
	}

	public void setPROD_POL_SHD_FEE(String pROD_POL_SHD_FEE) {
		PROD_POL_SHD_FEE = pROD_POL_SHD_FEE;
	}

	public BigDecimal getPROD_POL_SHD_PAG() {
		return PROD_POL_SHD_PAG;
	}

	public void setPROD_POL_SHD_PAG(BigDecimal pROD_POL_SHD_PAG) {
		PROD_POL_SHD_PAG = pROD_POL_SHD_PAG;
	}

	public BigDecimal getPROD_POL_SHD_RATE() {
		return PROD_POL_SHD_RATE;
	}

	public void setPROD_POL_SHD_RATE(BigDecimal pROD_POL_SHD_RATE) {
		PROD_POL_SHD_RATE = pROD_POL_SHD_RATE;
	}

	public BigDecimal getPROD_ROUND_VALUE() {
		return PROD_ROUND_VALUE;
	}

	public void setPROD_ROUND_VALUE(BigDecimal pROD_ROUND_VALUE) {
		PROD_ROUND_VALUE = pROD_ROUND_VALUE;
	}

	public String getPROD_ROUND_OPTION() {
		return PROD_ROUND_OPTION;
	}

	public void setPROD_ROUND_OPTION(String pROD_ROUND_OPTION) {
		PROD_ROUND_OPTION = pROD_ROUND_OPTION;
	}

	public String getPROD_MATU_DT() {
		return PROD_MATU_DT;
	}

	public void setPROD_MATU_DT(String pROD_MATU_DT) {
		PROD_MATU_DT = pROD_MATU_DT;
	}

	public String getPROD_MAT_AMT_TYPE() {
		return PROD_MAT_AMT_TYPE;
	}

	public void setPROD_MAT_AMT_TYPE(String pROD_MAT_AMT_TYPE) {
		PROD_MAT_AMT_TYPE = pROD_MAT_AMT_TYPE;
	}

	public BigDecimal getPROD_MAT_RATE() {
		return PROD_MAT_RATE;
	}

	public void setPROD_MAT_RATE(BigDecimal pROD_MAT_RATE) {
		PROD_MAT_RATE = pROD_MAT_RATE;
	}

	public BigDecimal getPROD_MAT_RATE_PER() {
		return PROD_MAT_RATE_PER;
	}

	public void setPROD_MAT_RATE_PER(BigDecimal pROD_MAT_RATE_PER) {
		PROD_MAT_RATE_PER = pROD_MAT_RATE_PER;
	}

	public String getPROD_SA_INST_PYMT_TYPE() {
		return PROD_SA_INST_PYMT_TYPE;
	}

	public void setPROD_SA_INST_PYMT_TYPE(String pROD_SA_INST_PYMT_TYPE) {
		PROD_SA_INST_PYMT_TYPE = pROD_SA_INST_PYMT_TYPE;
	}

	public String getPROD_CASHBACK_YN() {
		return PROD_CASHBACK_YN;
	}

	public void setPROD_CASHBACK_YN(String pROD_CASHBACK_YN) {
		PROD_CASHBACK_YN = pROD_CASHBACK_YN;
	}

	public String getPROD_MODULE_ID() {
		return PROD_MODULE_ID;
	}

	public void setPROD_MODULE_ID(String pROD_MODULE_ID) {
		PROD_MODULE_ID = pROD_MODULE_ID;
	}

}