package com.aic.base.commonUtils;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lt_pol_charge")
public class lt_pol_charge
{
	
	@Column(name = "POC_TRAN_ID")
	@Id
	private long _POC_TRAN_ID;
	public long getPOC_TRAN_ID()
	{
		return this._POC_TRAN_ID;
	}
	public void setPOC_TRAN_ID(long value)
	{
		this._POC_TRAN_ID = value;
	}
	
	@Column(name = "POC_POL_TRAN_ID")
	private long _POC_POL_TRAN_ID;
	public long getPOC_POL_TRAN_ID()
	{
		return this._POC_POL_TRAN_ID;
	}
	public void setPOC_POL_TRAN_ID(long value)
	{
		this._POC_POL_TRAN_ID = value;
	}
	
	@Column(name = "POC_CHRG_CODE")
	private String _POC_CHRG_CODE;
	public String getPOC_CHRG_CODE()
	{
		return this._POC_CHRG_CODE;
	}
	public void setPOC_CHRG_CODE(String value)
	{
		this._POC_CHRG_CODE = value;
	}
	
	@Column(name = "POC_LC_VALUE")
	private BigDecimal _POC_LC_VALUE;
	public BigDecimal getPOC_LC_VALUE()
	{
		return this._POC_LC_VALUE;
	}
	public void setPOC_LC_VALUE(BigDecimal value)
	{
		this._POC_LC_VALUE = value;
	}
	
	@Column(name = "POC_FC_VALUE")
	private BigDecimal _POC_FC_VALUE;
	public BigDecimal getPOC_FC_VALUE()
	{
		return this._POC_FC_VALUE;
	}
	public void setPOC_FC_VALUE(BigDecimal value)
	{
		this._POC_FC_VALUE = value;
	}
	
	@Column(name = "POC_DEL_FLAG")
	private String _POC_DEL_FLAG;
	public String getPOC_DEL_FLAG()
	{
		return this._POC_DEL_FLAG;
	}
	public void setPOC_DEL_FLAG(String value)
	{
		this._POC_DEL_FLAG = value;
	}
	
	@Column(name = "POC_INS_DT")
	private java.sql.Date _POC_INS_DT;
	public java.sql.Date getPOC_INS_DT()
	{
		return this._POC_INS_DT;
	}
	public void setPOC_INS_DT(java.sql.Date value)
	{
		this._POC_INS_DT = value;
	}
	
	@Column(name = "POC_INS_ID")
	private String _POC_INS_ID;
	public String getPOC_INS_ID()
	{
		return this._POC_INS_ID;
	}
	public void setPOC_INS_ID(String value)
	{
		this._POC_INS_ID = value;
	}
	
	@Column(name = "POC_MOD_DT")
	private java.sql.Date _POC_MOD_DT;
	public java.sql.Date getPOC_MOD_DT()
	{
		return this._POC_MOD_DT;
	}
	public void setPOC_MOD_DT(java.sql.Date value)
	{
		this._POC_MOD_DT = value;
	}
	
	@Column(name = "POC_MOD_ID")
	private String _POC_MOD_ID;
	public String getPOC_MOD_ID()
	{
		return this._POC_MOD_ID;
	}
	public void setPOC_MOD_ID(String value)
	{
		this._POC_MOD_ID = value;
	}
	
	@Column(name = "POC_RATE")
	private BigDecimal _POC_RATE;
	public BigDecimal getPOC_RATE()
	{
		return this._POC_RATE;
	}
	public void setPOC_RATE(BigDecimal value)
	{
		this._POC_RATE = value;
	}
	
	@Column(name = "POC_RATE_PER")
	private long _POC_RATE_PER;
	public long getPOC_RATE_PER()
	{
		return this._POC_RATE_PER;
	}
	public void setPOC_RATE_PER(long value)
	{
		this._POC_RATE_PER = value;
	}
	
	@Column(name = "POC_APPLIED_ON")
	private String _POC_APPLIED_ON;
	public String getPOC_APPLIED_ON()
	{
		return this._POC_APPLIED_ON;
	}
	public void setPOC_APPLIED_ON(String value)
	{
		this._POC_APPLIED_ON = value;
	}
	
	@Column(name = "POC_CUST_SHARE_PERC")
	private BigDecimal _POC_CUST_SHARE_PERC;
	public BigDecimal getPOC_CUST_SHARE_PERC()
	{
		return this._POC_CUST_SHARE_PERC;
	}
	public void setPOC_CUST_SHARE_PERC(BigDecimal value)
	{
		this._POC_CUST_SHARE_PERC = value;
	}
	
	@Column(name = "POC_APPLY_PERIOD")
	private String _POC_APPLY_PERIOD;
	public String getPOC_APPLY_PERIOD()
	{
		return this._POC_APPLY_PERIOD;
	}
	public void setPOC_APPLY_PERIOD(String value)
	{
		this._POC_APPLY_PERIOD = value;
	}
	
	@Column(name = "POC_TYPE")
	private String _POC_TYPE;
	public String getPOC_TYPE()
	{
		return this._POC_TYPE;
	}
	public void setPOC_TYPE(String value)
	{
		this._POC_TYPE = value;
	}
	
	@Column(name = "POC_END_NO_IDX")
	private double _POC_END_NO_IDX;
	public double getPOC_END_NO_IDX()
	{
		return this._POC_END_NO_IDX;
	}
	public void setPOC_END_NO_IDX(double value)
	{
		this._POC_END_NO_IDX = value;
	}
	
	@Column(name = "POC_ACC_GEN_YN")
	private String _POC_ACC_GEN_YN;
	public String getPOC_ACC_GEN_YN()
	{
		return this._POC_ACC_GEN_YN;
	}
	public void setPOC_ACC_GEN_YN(String value)
	{
		this._POC_ACC_GEN_YN = value;
	}
	
	@Column(name = "POC_CHARGE_MAX_LMT")
	private BigDecimal _POC_CHARGE_MAX_LMT;
	public BigDecimal getPOC_CHARGE_MAX_LMT()
	{
		return this._POC_CHARGE_MAX_LMT;
	}
	public void setPOC_CHARGE_MAX_LMT(BigDecimal value)
	{
		this._POC_CHARGE_MAX_LMT = value;
	}

}
