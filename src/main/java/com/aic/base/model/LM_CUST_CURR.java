package com.aic.base.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LM_CUST_CURR")
public class LM_CUST_CURR
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CCUR_ID")
	@JsonProperty("ID")
	private Integer _CCUR_ID;
	public Integer getCCUR_ID()
	{
		return this._CCUR_ID;
	}
	public void setCCUR_ID(Integer value)
	{
		this._CCUR_ID = value;
	}

	@Column(name = "CCUR_CUST_CODE")
	@JsonProperty("customerCode")
	private String _CCUR_CUST_CODE;
	public String getCCUR_CUST_CODE()
	{
		return this._CCUR_CUST_CODE;
	}
	public void setCCUR_CUST_CODE(String value)
	{
		this._CCUR_CUST_CODE = value;
	}

	@Column(name = "CCUR_CURR_CODE")
	@JsonProperty("CCUR_CURR_CODE")
	private String _CCUR_CURR_CODE;
	public String getCCUR_CURR_CODE()
	{
		return this._CCUR_CURR_CODE;
	}
	public void setCCUR_CURR_CODE(String value)
	{
		this._CCUR_CURR_CODE = value;
	}

	@Column(name = "CCUR_FRZ_FLAG")
	private String _CCUR_FRZ_FLAG;
	public String getCCUR_FRZ_FLAG()
	{
		return this._CCUR_FRZ_FLAG;
	}
	public void setCCUR_FRZ_FLAG(String value)
	{
		this._CCUR_FRZ_FLAG = value;
	}

	@Column(name = "CCUR_INS_DT")
	private java.sql.Date _CCUR_INS_DT;
	public java.sql.Date getCCUR_INS_DT()
	{
		return this._CCUR_INS_DT;
	}
	public void setCCUR_INS_DT(java.sql.Date value)
	{
		this._CCUR_INS_DT = value;
	}

	@Column(name = "CCUR_INS_ID")
	private String _CCUR_INS_ID;
	public String getCCUR_INS_ID()
	{
		return this._CCUR_INS_ID;
	}
	public void setCCUR_INS_ID(String value)
	{
		this._CCUR_INS_ID = value;
	}

	@Column(name = "CCUR_MOD_DT")
	private java.sql.Date _CCUR_MOD_DT;
	public java.sql.Date getCCUR_MOD_DT()
	{
		return this._CCUR_MOD_DT;
	}
	public void setCCUR_MOD_DT(java.sql.Date value)
	{
		this._CCUR_MOD_DT = value;
	}

	@Column(name = "CCUR_MOD_UID")
	private String _CCUR_MOD_UID;
	public String getCCUR_MOD_UID()
	{
		return this._CCUR_MOD_UID;
	}
	public void setCCUR_MOD_UID(String value)
	{
		this._CCUR_MOD_UID = value;
	}

}
