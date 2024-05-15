package com.aic.base.commonUtils;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lt_pol_assrd_det")
public class lt_pol_assrd_det
{
	
	@Column(name = "PAD_TRAN_ID")
	@Id
	private long _PAD_TRAN_ID;
	public long getPAD_TRAN_ID()
	{
		return this._PAD_TRAN_ID;
	}
	public void setPAD_TRAN_ID(long value)
	{
		this._PAD_TRAN_ID = value;
	}
	
	@Column(name = "PAD_POL_TRAN_ID")
	private long _PAD_POL_TRAN_ID;
	public long getPAD_POL_TRAN_ID()
	{
		return this._PAD_POL_TRAN_ID;
	}
	public void setPAD_POL_TRAN_ID(long value)
	{
		this._PAD_POL_TRAN_ID = value;
	}
	
	@Column(name = "PAD_SERIAL_NO")
	private short _PAD_SERIAL_NO;
	public short getPAD_SERIAL_NO()
	{
		return this._PAD_SERIAL_NO;
	}
	public void setPAD_SERIAL_NO(short value)
	{
		this._PAD_SERIAL_NO = value;
	}
	
	@Column(name = "PAD_ASSR_CODE")
	private String _PAD_ASSR_CODE;
	public String getPAD_ASSR_CODE()
	{
		return this._PAD_ASSR_CODE;
	}
	public void setPAD_ASSR_CODE(String value)
	{
		this._PAD_ASSR_CODE = value;
	}
	
	@Column(name = "PAD_ASSURED_NAME")
	private String _PAD_ASSURED_NAME;
	public String getPAD_ASSURED_NAME()
	{
		return this._PAD_ASSURED_NAME;
	}
	public void setPAD_ASSURED_NAME(String value)
	{
		this._PAD_ASSURED_NAME = value;
	}
	
	@Column(name = "PAD_BIRTH_PLACE")
	private String _PAD_BIRTH_PLACE;
	public String getPAD_BIRTH_PLACE()
	{
		return this._PAD_BIRTH_PLACE;
	}
	public void setPAD_BIRTH_PLACE(String value)
	{
		this._PAD_BIRTH_PLACE = value;
	}
	
	@Column(name = "PAD_DOB")
	private java.sql.Date _PAD_DOB;
	public java.sql.Date getPAD_DOB()
	{
		return this._PAD_DOB;
	}
	public void setPAD_DOB(java.sql.Date value)
	{
		this._PAD_DOB = value;
	}
	
	@Column(name = "PAD_AGE")
	private short _PAD_AGE;
	public short getPAD_AGE()
	{
		return this._PAD_AGE;
	}
	public void setPAD_AGE(short value)
	{
		this._PAD_AGE = value;
	}
	
	@Column(name = "PAD_GENDER")
	private String _PAD_GENDER;
	public String getPAD_GENDER()
	{
		return this._PAD_GENDER;
	}
	public void setPAD_GENDER(String value)
	{
		this._PAD_GENDER = value;
	}
	
	@Column(name = "PAD_MAR_STATUS")
	private String _PAD_MAR_STATUS;
	public String getPAD_MAR_STATUS()
	{
		return this._PAD_MAR_STATUS;
	}
	public void setPAD_MAR_STATUS(String value)
	{
		this._PAD_MAR_STATUS = value;
	}
	
	@Column(name = "PAD_NATIONALITY")
	private String _PAD_NATIONALITY;
	public String getPAD_NATIONALITY()
	{
		return this._PAD_NATIONALITY;
	}
	public void setPAD_NATIONALITY(String value)
	{
		this._PAD_NATIONALITY = value;
	}
	
	@Column(name = "PAD_OCC_CODE")
	private String _PAD_OCC_CODE;
	public String getPAD_OCC_CODE()
	{
		return this._PAD_OCC_CODE;
	}
	public void setPAD_OCC_CODE(String value)
	{
		this._PAD_OCC_CODE = value;
	}
	
	@Column(name = "PAD_NATURE_OF_WORK")
	private String _PAD_NATURE_OF_WORK;
	public String getPAD_NATURE_OF_WORK()
	{
		return this._PAD_NATURE_OF_WORK;
	}
	public void setPAD_NATURE_OF_WORK(String value)
	{
		this._PAD_NATURE_OF_WORK = value;
	}
	
	@Column(name = "PAD_HEALTH_CODE")
	private String _PAD_HEALTH_CODE;
	public String getPAD_HEALTH_CODE()
	{
		return this._PAD_HEALTH_CODE;
	}
	public void setPAD_HEALTH_CODE(String value)
	{
		this._PAD_HEALTH_CODE = value;
	}
	
	@Column(name = "PAD_REMARKS")
	private String _PAD_REMARKS;
	public String getPAD_REMARKS()
	{
		return this._PAD_REMARKS;
	}
	public void setPAD_REMARKS(String value)
	{
		this._PAD_REMARKS = value;
	}
	
	@Column(name = "PAD_INS_DT")
	private java.sql.Date _PAD_INS_DT;
	public java.sql.Date getPAD_INS_DT()
	{
		return this._PAD_INS_DT;
	}
	public void setPAD_INS_DT(java.sql.Date value)
	{
		this._PAD_INS_DT = value;
	}
	
	@Column(name = "PAD_INS_ID")
	private String _PAD_INS_ID;
	public String getPAD_INS_ID()
	{
		return this._PAD_INS_ID;
	}
	public void setPAD_INS_ID(String value)
	{
		this._PAD_INS_ID = value;
	}
	
	@Column(name = "PAD_MOD_DT")
	private java.sql.Date _PAD_MOD_DT;
	public java.sql.Date getPAD_MOD_DT()
	{
		return this._PAD_MOD_DT;
	}
	public void setPAD_MOD_DT(java.sql.Date value)
	{
		this._PAD_MOD_DT = value;
	}
	
	@Column(name = "PAD_MOD_UID")
	private String _PAD_MOD_UID;
	public String getPAD_MOD_UID()
	{
		return this._PAD_MOD_UID;
	}
	public void setPAD_MOD_UID(String value)
	{
		this._PAD_MOD_UID = value;
	}
	
	@Column(name = "PAD_FC_SUM_ASSURED")
	private BigDecimal _PAD_FC_SUM_ASSURED;
	public BigDecimal getPAD_FC_SUM_ASSURED()
	{
		return this._PAD_FC_SUM_ASSURED;
	}
	public void setPAD_FC_SUM_ASSURED(BigDecimal value)
	{
		this._PAD_FC_SUM_ASSURED = value;
	}
	
	@Column(name = "PAD_LC_SUM_ASSURED")
	private BigDecimal _PAD_LC_SUM_ASSURED;
	public BigDecimal getPAD_LC_SUM_ASSURED()
	{
		return this._PAD_LC_SUM_ASSURED;
	}
	public void setPAD_LC_SUM_ASSURED(BigDecimal value)
	{
		this._PAD_LC_SUM_ASSURED = value;
	}
	
	@Column(name = "PAD_HEALTH_RATE")
	private BigDecimal _PAD_HEALTH_RATE;
	public BigDecimal getPAD_HEALTH_RATE()
	{
		return this._PAD_HEALTH_RATE;
	}
	public void setPAD_HEALTH_RATE(BigDecimal value)
	{
		this._PAD_HEALTH_RATE = value;
	}
	
	@Column(name = "PAD_HEIGHT")
	private BigDecimal _PAD_HEIGHT;
	public BigDecimal getPAD_HEIGHT()
	{
		return this._PAD_HEIGHT;
	}
	public void setPAD_HEIGHT(BigDecimal value)
	{
		this._PAD_HEIGHT = value;
	}
	
	@Column(name = "PAD_WEIGHT")
	private BigDecimal _PAD_WEIGHT;
	public BigDecimal getPAD_WEIGHT()
	{
		return this._PAD_WEIGHT;
	}
	public void setPAD_WEIGHT(BigDecimal value)
	{
		this._PAD_WEIGHT = value;
	}
	
	@Column(name = "PAD_DISC_AGE")
	private short _PAD_DISC_AGE;
	public short getPAD_DISC_AGE()
	{
		return this._PAD_DISC_AGE;
	}
	public void setPAD_DISC_AGE(short value)
	{
		this._PAD_DISC_AGE = value;
	}
	
	@Column(name = "PAD_AGE_PROOF_FLAG")
	private String _PAD_AGE_PROOF_FLAG;
	public String getPAD_AGE_PROOF_FLAG()
	{
		return this._PAD_AGE_PROOF_FLAG;
	}
	public void setPAD_AGE_PROOF_FLAG(String value)
	{
		this._PAD_AGE_PROOF_FLAG = value;
	}
	
	@Column(name = "PAD_AGE_PROOF_OTHERS")
	private String _PAD_AGE_PROOF_OTHERS;
	public String getPAD_AGE_PROOF_OTHERS()
	{
		return this._PAD_AGE_PROOF_OTHERS;
	}
	public void setPAD_AGE_PROOF_OTHERS(String value)
	{
		this._PAD_AGE_PROOF_OTHERS = value;
	}
	
	@Column(name = "PAD_UNIQ_ID1")
	private String _PAD_UNIQ_ID1;
	public String getPAD_UNIQ_ID1()
	{
		return this._PAD_UNIQ_ID1;
	}
	public void setPAD_UNIQ_ID1(String value)
	{
		this._PAD_UNIQ_ID1 = value;
	}
	
	@Column(name = "PAD_UNIQ_ID2")
	private String _PAD_UNIQ_ID2;
	public String getPAD_UNIQ_ID2()
	{
		return this._PAD_UNIQ_ID2;
	}
	public void setPAD_UNIQ_ID2(String value)
	{
		this._PAD_UNIQ_ID2 = value;
	}
	
	@Column(name = "PAD_OCC_CLASS")
	private String _PAD_OCC_CLASS;
	public String getPAD_OCC_CLASS()
	{
		return this._PAD_OCC_CLASS;
	}
	public void setPAD_OCC_CLASS(String value)
	{
		this._PAD_OCC_CLASS = value;
	}
	
	@Column(name = "PAD_BMI")
	private BigDecimal _PAD_BMI;
	public BigDecimal getPAD_BMI()
	{
		return this._PAD_BMI;
	}
	public void setPAD_BMI(BigDecimal value)
	{
		this._PAD_BMI = value;
	}
	
	@Column(name = "PAD_RACE")
	private String _PAD_RACE;
	public String getPAD_RACE()
	{
		return this._PAD_RACE;
	}
	public void setPAD_RACE(String value)
	{
		this._PAD_RACE = value;
	}
	
	@Column(name = "PAD_LC_THRESHOLD_LMT")
	private BigDecimal _PAD_LC_THRESHOLD_LMT;
	public BigDecimal getPAD_LC_THRESHOLD_LMT()
	{
		return this._PAD_LC_THRESHOLD_LMT;
	}
	public void setPAD_LC_THRESHOLD_LMT(BigDecimal value)
	{
		this._PAD_LC_THRESHOLD_LMT = value;
	}
	
	@Column(name = "PAD_ORG_LC_THRESHOLD_LMT")
	private BigDecimal _PAD_ORG_LC_THRESHOLD_LMT;
	public BigDecimal getPAD_ORG_LC_THRESHOLD_LMT()
	{
		return this._PAD_ORG_LC_THRESHOLD_LMT;
	}
	public void setPAD_ORG_LC_THRESHOLD_LMT(BigDecimal value)
	{
		this._PAD_ORG_LC_THRESHOLD_LMT = value;
	}
	
	@Column(name = "PAD_RELIGION_CODE")
	private String _PAD_RELIGION_CODE;
	public String getPAD_RELIGION_CODE()
	{
		return this._PAD_RELIGION_CODE;
	}
	public void setPAD_RELIGION_CODE(String value)
	{
		this._PAD_RELIGION_CODE = value;
	}
	
	@Column(name = "PAD_TYPE")
	private String _PAD_TYPE;
	public String getPAD_TYPE()
	{
		return this._PAD_TYPE;
	}
	public void setPAD_TYPE(String value)
	{
		this._PAD_TYPE = value;
	}
	
	@Column(name = "PAD_HEIGHT_UNIT")
	private String _PAD_HEIGHT_UNIT;
	public String getPAD_HEIGHT_UNIT()
	{
		return this._PAD_HEIGHT_UNIT;
	}
	public void setPAD_HEIGHT_UNIT(String value)
	{
		this._PAD_HEIGHT_UNIT = value;
	}
	
	@Column(name = "PAD_WEIGHT_UNIT")
	private String _PAD_WEIGHT_UNIT;
	public String getPAD_WEIGHT_UNIT()
	{
		return this._PAD_WEIGHT_UNIT;
	}
	public void setPAD_WEIGHT_UNIT(String value)
	{
		this._PAD_WEIGHT_UNIT = value;
	}
	
	@Column(name = "PAD_FC_SALARY")
	private BigDecimal _PAD_FC_SALARY;
	public BigDecimal getPAD_FC_SALARY()
	{
		return this._PAD_FC_SALARY;
	}
	public void setPAD_FC_SALARY(BigDecimal value)
	{
		this._PAD_FC_SALARY = value;
	}
	
	@Column(name = "PAD_LC_SALARY")
	private BigDecimal _PAD_LC_SALARY;
	public BigDecimal getPAD_LC_SALARY()
	{
		return this._PAD_LC_SALARY;
	}
	public void setPAD_LC_SALARY(BigDecimal value)
	{
		this._PAD_LC_SALARY = value;
	}
	
	@Column(name = "PAD_SMOKE_YN")
	private String _PAD_SMOKE_YN;
	public String getPAD_SMOKE_YN()
	{
		return this._PAD_SMOKE_YN;
	}
	public void setPAD_SMOKE_YN(String value)
	{
		this._PAD_SMOKE_YN = value;
	}
	
	@Column(name = "PAD_NO_OF_CIGAR")
	private int _PAD_NO_OF_CIGAR;
	public int getPAD_NO_OF_CIGAR()
	{
		return this._PAD_NO_OF_CIGAR;
	}
	public void setPAD_NO_OF_CIGAR(int value)
	{
		this._PAD_NO_OF_CIGAR = value;
	}
	
	@Column(name = "PAD_RELATION_CODE")
	private String _PAD_RELATION_CODE;
	public String getPAD_RELATION_CODE()
	{
		return this._PAD_RELATION_CODE;
	}
	public void setPAD_RELATION_CODE(String value)
	{
		this._PAD_RELATION_CODE = value;
	}
	
	@Column(name = "PAD_POL_OWNER_YN")
	private String _PAD_POL_OWNER_YN;
	public String getPAD_POL_OWNER_YN()
	{
		return this._PAD_POL_OWNER_YN;
	}
	public void setPAD_POL_OWNER_YN(String value)
	{
		this._PAD_POL_OWNER_YN = value;
	}
	
	@Column(name = "PAD_ALCHOHALIC_YN")
	private String _PAD_ALCHOHALIC_YN;
	public String getPAD_ALCHOHALIC_YN()
	{
		return this._PAD_ALCHOHALIC_YN;
	}
	public void setPAD_ALCHOHALIC_YN(String value)
	{
		this._PAD_ALCHOHALIC_YN = value;
	}
	
	@Column(name = "PAD_ALCOHOL_QUAN")
	private BigDecimal _PAD_ALCOHOL_QUAN;
	public BigDecimal getPAD_ALCOHOL_QUAN()
	{
		return this._PAD_ALCOHOL_QUAN;
	}
	public void setPAD_ALCOHOL_QUAN(BigDecimal value)
	{
		this._PAD_ALCOHOL_QUAN = value;
	}
	
	@Column(name = "PAD_AGE_ADMITTED")
	private String _PAD_AGE_ADMITTED;
	public String getPAD_AGE_ADMITTED()
	{
		return this._PAD_AGE_ADMITTED;
	}
	public void setPAD_AGE_ADMITTED(String value)
	{
		this._PAD_AGE_ADMITTED = value;
	}
	
	@Column(name = "PAD_BPL")
	private double _PAD_BPL;
	public double getPAD_BPL()
	{
		return this._PAD_BPL;
	}
	public void setPAD_BPL(double value)
	{
		this._PAD_BPL = value;
	}
	
	@Column(name = "PAD_BPH")
	private double _PAD_BPH;
	public double getPAD_BPH()
	{
		return this._PAD_BPH;
	}
	public void setPAD_BPH(double value)
	{
		this._PAD_BPH = value;
	}
	
	@Column(name = "PAD_HIV_TEST_YN")
	private String _PAD_HIV_TEST_YN;
	public String getPAD_HIV_TEST_YN()
	{
		return this._PAD_HIV_TEST_YN;
	}
	public void setPAD_HIV_TEST_YN(String value)
	{
		this._PAD_HIV_TEST_YN = value;
	}
	
	@Column(name = "PAD_PREGNENT_YN")
	private String _PAD_PREGNENT_YN;
	public String getPAD_PREGNENT_YN()
	{
		return this._PAD_PREGNENT_YN;
	}
	public void setPAD_PREGNENT_YN(String value)
	{
		this._PAD_PREGNENT_YN = value;
	}
	
	@Column(name = "PAD_FAMILY_YN")
	private String _PAD_FAMILY_YN;
	public String getPAD_FAMILY_YN()
	{
		return this._PAD_FAMILY_YN;
	}
	public void setPAD_FAMILY_YN(String value)
	{
		this._PAD_FAMILY_YN = value;
	}
	
	@Column(name = "PAD_OCC_YN")
	private String _PAD_OCC_YN;
	public String getPAD_OCC_YN()
	{
		return this._PAD_OCC_YN;
	}
	public void setPAD_OCC_YN(String value)
	{
		this._PAD_OCC_YN = value;
	}

}
