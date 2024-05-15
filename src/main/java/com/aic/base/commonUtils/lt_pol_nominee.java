package com.aic.base.commonUtils;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lt_pol_nominee")
public class lt_pol_nominee
{
	
	@Column(name = "PN_TRAN_ID")
	@Id
	private long _PN_TRAN_ID;
	public long getPN_TRAN_ID()
	{
		return this._PN_TRAN_ID;
	}
	public void setPN_TRAN_ID(long value)
	{
		this._PN_TRAN_ID = value;
	}
	
	@Column(name = "PN_POL_TRAN_ID")
	private long _PN_POL_TRAN_ID;
	public long getPN_POL_TRAN_ID()
	{
		return this._PN_POL_TRAN_ID;
	}
	public void setPN_POL_TRAN_ID(long value)
	{
		this._PN_POL_TRAN_ID = value;
	}
	
	@Column(name = "PN_SR_NO")
	private int _PN_SR_NO;
	public int getPN_SR_NO()
	{
		return this._PN_SR_NO;
	}
	public void setPN_SR_NO(int value)
	{
		this._PN_SR_NO = value;
	}
	
	@Column(name = "PN_NOM_TYPE")
	private String _PN_NOM_TYPE;
	public String getPN_NOM_TYPE()
	{
		return this._PN_NOM_TYPE;
	}
	public void setPN_NOM_TYPE(String value)
	{
		this._PN_NOM_TYPE = value;
	}
	
	@Column(name = "PN_NOM_NAME")
	private String _PN_NOM_NAME;
	public String getPN_NOM_NAME()
	{
		return this._PN_NOM_NAME;
	}
	public void setPN_NOM_NAME(String value)
	{
		this._PN_NOM_NAME = value;
	}
	
	@Column(name = "PN_NOM_NAME_BL")
	private String _PN_NOM_NAME_BL;
	public String getPN_NOM_NAME_BL()
	{
		return this._PN_NOM_NAME_BL;
	}
	public void setPN_NOM_NAME_BL(String value)
	{
		this._PN_NOM_NAME_BL = value;
	}
	
	@Column(name = "PN_NOM_CUST_CODE")
	private String _PN_NOM_CUST_CODE;
	public String getPN_NOM_CUST_CODE()
	{
		return this._PN_NOM_CUST_CODE;
	}
	public void setPN_NOM_CUST_CODE(String value)
	{
		this._PN_NOM_CUST_CODE = value;
	}
	
	@Column(name = "PN_CATG_CODE")
	private String _PN_CATG_CODE;
	public String getPN_CATG_CODE()
	{
		return this._PN_CATG_CODE;
	}
	public void setPN_CATG_CODE(String value)
	{
		this._PN_CATG_CODE = value;
	}
	
	@Column(name = "PN_DOB")
	private java.sql.Date _PN_DOB;
	public java.sql.Date getPN_DOB()
	{
		return this._PN_DOB;
	}
	public void setPN_DOB(java.sql.Date value)
	{
		this._PN_DOB = value;
	}
	
	@Column(name = "PN_AGE")
	private short _PN_AGE;
	public short getPN_AGE()
	{
		return this._PN_AGE;
	}
	public void setPN_AGE(short value)
	{
		this._PN_AGE = value;
	}
	
	@Column(name = "PN_PERC")
	private BigDecimal _PN_PERC;
	public BigDecimal getPN_PERC()
	{
		return this._PN_PERC;
	}
	public void setPN_PERC(BigDecimal value)
	{
		this._PN_PERC = value;
	}
	
	@Column(name = "PN_RELATION")
	private String _PN_RELATION;
	public String getPN_RELATION()
	{
		return this._PN_RELATION;
	}
	public void setPN_RELATION(String value)
	{
		this._PN_RELATION = value;
	}
	
	@Column(name = "PN_ADDRESS_1")
	private String _PN_ADDRESS_1;
	public String getPN_ADDRESS_1()
	{
		return this._PN_ADDRESS_1;
	}
	public void setPN_ADDRESS_1(String value)
	{
		this._PN_ADDRESS_1 = value;
	}
	
	@Column(name = "PN_ADDRESS_2")
	private String _PN_ADDRESS_2;
	public String getPN_ADDRESS_2()
	{
		return this._PN_ADDRESS_2;
	}
	public void setPN_ADDRESS_2(String value)
	{
		this._PN_ADDRESS_2 = value;
	}
	
	@Column(name = "PN_ADDRESS_3")
	private String _PN_ADDRESS_3;
	public String getPN_ADDRESS_3()
	{
		return this._PN_ADDRESS_3;
	}
	public void setPN_ADDRESS_3(String value)
	{
		this._PN_ADDRESS_3 = value;
	}
	
	@Column(name = "PN_ADDRESS_4")
	private String _PN_ADDRESS_4;
	public String getPN_ADDRESS_4()
	{
		return this._PN_ADDRESS_4;
	}
	public void setPN_ADDRESS_4(String value)
	{
		this._PN_ADDRESS_4 = value;
	}
	
	@Column(name = "PN_ADDRESS_5")
	private String _PN_ADDRESS_5;
	public String getPN_ADDRESS_5()
	{
		return this._PN_ADDRESS_5;
	}
	public void setPN_ADDRESS_5(String value)
	{
		this._PN_ADDRESS_5 = value;
	}
	
	@Column(name = "PN_ADDRESS_1_BL")
	private String _PN_ADDRESS_1_BL;
	public String getPN_ADDRESS_1_BL()
	{
		return this._PN_ADDRESS_1_BL;
	}
	public void setPN_ADDRESS_1_BL(String value)
	{
		this._PN_ADDRESS_1_BL = value;
	}
	
	@Column(name = "PN_ADDRESS_2_BL")
	private String _PN_ADDRESS_2_BL;
	public String getPN_ADDRESS_2_BL()
	{
		return this._PN_ADDRESS_2_BL;
	}
	public void setPN_ADDRESS_2_BL(String value)
	{
		this._PN_ADDRESS_2_BL = value;
	}
	
	@Column(name = "PN_ADDRESS_3_BL")
	private String _PN_ADDRESS_3_BL;
	public String getPN_ADDRESS_3_BL()
	{
		return this._PN_ADDRESS_3_BL;
	}
	public void setPN_ADDRESS_3_BL(String value)
	{
		this._PN_ADDRESS_3_BL = value;
	}
	
	@Column(name = "PN_ADDRESS_4_BL")
	private String _PN_ADDRESS_4_BL;
	public String getPN_ADDRESS_4_BL()
	{
		return this._PN_ADDRESS_4_BL;
	}
	public void setPN_ADDRESS_4_BL(String value)
	{
		this._PN_ADDRESS_4_BL = value;
	}
	
	@Column(name = "PN_ADDRESS_5_BL")
	private String _PN_ADDRESS_5_BL;
	public String getPN_ADDRESS_5_BL()
	{
		return this._PN_ADDRESS_5_BL;
	}
	public void setPN_ADDRESS_5_BL(String value)
	{
		this._PN_ADDRESS_5_BL = value;
	}
	
	@Column(name = "PN_REMARKS")
	private String _PN_REMARKS;
	public String getPN_REMARKS()
	{
		return this._PN_REMARKS;
	}
	public void setPN_REMARKS(String value)
	{
		this._PN_REMARKS = value;
	}
	
	@Column(name = "PN_REMARKS_BL")
	private String _PN_REMARKS_BL;
	public String getPN_REMARKS_BL()
	{
		return this._PN_REMARKS_BL;
	}
	public void setPN_REMARKS_BL(String value)
	{
		this._PN_REMARKS_BL = value;
	}
	
	@Column(name = "PN_INS_ID")
	private String _PN_INS_ID;
	public String getPN_INS_ID()
	{
		return this._PN_INS_ID;
	}
	public void setPN_INS_ID(String value)
	{
		this._PN_INS_ID = value;
	}
	
	@Column(name = "PN_INS_DT")
	private java.sql.Date _PN_INS_DT;
	public java.sql.Date getPN_INS_DT()
	{
		return this._PN_INS_DT;
	}
	public void setPN_INS_DT(java.sql.Date value)
	{
		this._PN_INS_DT = value;
	}
	
	@Column(name = "PN_MOD_ID")
	private String _PN_MOD_ID;
	public String getPN_MOD_ID()
	{
		return this._PN_MOD_ID;
	}
	public void setPN_MOD_ID(String value)
	{
		this._PN_MOD_ID = value;
	}
	
	@Column(name = "PN_MOD_DT")
	private java.sql.Date _PN_MOD_DT;
	public java.sql.Date getPN_MOD_DT()
	{
		return this._PN_MOD_DT;
	}
	public void setPN_MOD_DT(java.sql.Date value)
	{
		this._PN_MOD_DT = value;
	}
	
	@Column(name = "PN_GUARDIAN_NAME")
	private String _PN_GUARDIAN_NAME;
	public String getPN_GUARDIAN_NAME()
	{
		return this._PN_GUARDIAN_NAME;
	}
	public void setPN_GUARDIAN_NAME(String value)
	{
		this._PN_GUARDIAN_NAME = value;
	}
	
	@Column(name = "PN_DEL_FLAG")
	private String _PN_DEL_FLAG;
	public String getPN_DEL_FLAG()
	{
		return this._PN_DEL_FLAG;
	}
	public void setPN_DEL_FLAG(String value)
	{
		this._PN_DEL_FLAG = value;
	}
	
	@Column(name = "PN_REF_ID1")
	private String _PN_REF_ID1;
	public String getPN_REF_ID1()
	{
		return this._PN_REF_ID1;
	}
	public void setPN_REF_ID1(String value)
	{
		this._PN_REF_ID1 = value;
	}
	
	@Column(name = "PN_REF_ID2")
	private String _PN_REF_ID2;
	public String getPN_REF_ID2()
	{
		return this._PN_REF_ID2;
	}
	public void setPN_REF_ID2(String value)
	{
		this._PN_REF_ID2 = value;
	}
	
	@Column(name = "PN_MICR_CODE")
	private long _PN_MICR_CODE;
	public long getPN_MICR_CODE()
	{
		return this._PN_MICR_CODE;
	}
	public void setPN_MICR_CODE(long value)
	{
		this._PN_MICR_CODE = value;
	}
	
	@Column(name = "PN_ACNT_NO")
	private BigDecimal _PN_ACNT_NO;
	public BigDecimal getPN_ACNT_NO()
	{
		return this._PN_ACNT_NO;
	}
	public void setPN_ACNT_NO(BigDecimal value)
	{
		this._PN_ACNT_NO = value;
	}
	
	@Column(name = "PN_CITY_CODE")
	private String _PN_CITY_CODE;
	public String getPN_CITY_CODE()
	{
		return this._PN_CITY_CODE;
	}
	public void setPN_CITY_CODE(String value)
	{
		this._PN_CITY_CODE = value;
	}
	
	@Column(name = "PN_BANK_CODE")
	private String _PN_BANK_CODE;
	public String getPN_BANK_CODE()
	{
		return this._PN_BANK_CODE;
	}
	public void setPN_BANK_CODE(String value)
	{
		this._PN_BANK_CODE = value;
	}
	
	@Column(name = "PN_DIVISION")
	private String _PN_DIVISION;
	public String getPN_DIVISION()
	{
		return this._PN_DIVISION;
	}
	public void setPN_DIVISION(String value)
	{
		this._PN_DIVISION = value;
	}
	
	@Column(name = "PN_EFF_FM_DT")
	private java.sql.Date _PN_EFF_FM_DT;
	public java.sql.Date getPN_EFF_FM_DT()
	{
		return this._PN_EFF_FM_DT;
	}
	public void setPN_EFF_FM_DT(java.sql.Date value)
	{
		this._PN_EFF_FM_DT = value;
	}
	
	@Column(name = "PN_EFF_TO_DT")
	private java.sql.Date _PN_EFF_TO_DT;
	public java.sql.Date getPN_EFF_TO_DT()
	{
		return this._PN_EFF_TO_DT;
	}
	public void setPN_EFF_TO_DT(java.sql.Date value)
	{
		this._PN_EFF_TO_DT = value;
	}
	
	@Column(name = "PN_GUAR_RELATION")
	private String _PN_GUAR_RELATION;
	public String getPN_GUAR_RELATION()
	{
		return this._PN_GUAR_RELATION;
	}
	public void setPN_GUAR_RELATION(String value)
	{
		this._PN_GUAR_RELATION = value;
	}
	
	@Column(name = "PN_EMAIL")
	private String _PN_EMAIL;
	public String getPN_EMAIL()
	{
		return this._PN_EMAIL;
	}
	public void setPN_EMAIL(String value)
	{
		this._PN_EMAIL = value;
	}
	
	@Column(name = "PN_REC_TYPE")
	private double _PN_REC_TYPE;
	public double getPN_REC_TYPE()
	{
		return this._PN_REC_TYPE;
	}
	public void setPN_REC_TYPE(double value)
	{
		this._PN_REC_TYPE = value;
	}
	
	@Column(name = "PN_GUAR_UNIQ_ID")
	private String _PN_GUAR_UNIQ_ID;
	public String getPN_GUAR_UNIQ_ID()
	{
		return this._PN_GUAR_UNIQ_ID;
	}
	public void setPN_GUAR_UNIQ_ID(String value)
	{
		this._PN_GUAR_UNIQ_ID = value;
	}
	
	@Column(name = "PN_GUAR_ID_TYPE")
	private String _PN_GUAR_ID_TYPE;
	public String getPN_GUAR_ID_TYPE()
	{
		return this._PN_GUAR_ID_TYPE;
	}
	public void setPN_GUAR_ID_TYPE(String value)
	{
		this._PN_GUAR_ID_TYPE = value;
	}
	
	@Column(name = "PN_NOM_ID_TYPE")
	private String _PN_NOM_ID_TYPE;
	public String getPN_NOM_ID_TYPE()
	{
		return this._PN_NOM_ID_TYPE;
	}
	public void setPN_NOM_ID_TYPE(String value)
	{
		this._PN_NOM_ID_TYPE = value;
	}
	
	@Column(name = "PN_MOBILE_NO")
	private BigDecimal _PN_MOBILE_NO;
	public BigDecimal getPN_MOBILE_NO()
	{
		return this._PN_MOBILE_NO;
	}
	public void setPN_MOBILE_NO(BigDecimal value)
	{
		this._PN_MOBILE_NO = value;
	}

}
