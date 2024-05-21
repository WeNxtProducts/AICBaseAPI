package com.aic.base.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lm_cust_divn")
public class lm_cust_divn
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CDIV_ID")
	@JsonProperty("ID")
	private Integer _CDIV_ID;
	public Integer getCDIV_ID()
	{
		return this._CDIV_ID;
	}
	public void setCDIV_ID(Integer value)
	{
		this._CDIV_ID = value;
	}

	@Column(name = "CDIV_CUST_CODE")
	@JsonProperty("customerCode")
	private String _CDIV_CUST_CODE;
	public String getCDIV_CUST_CODE()
	{
		return this._CDIV_CUST_CODE;
	}
	public void setCDIV_CUST_CODE(String value)
	{
		this._CDIV_CUST_CODE = value;
	}

	@Column(name = "CDIV_DIVN_CODE")
	@JsonProperty("CDIV_DIVN_CODE")
	private String _CDIV_DIVN_CODE;
	public String getCDIV_DIVN_CODE()
	{
		return this._CDIV_DIVN_CODE;
	}
	public void setCDIV_DIVN_CODE(String value)
	{
		this._CDIV_DIVN_CODE = value;
	}

	@Column(name = "CDIV_FRZ_FLAG")
	private String _CDIV_FRZ_FLAG;
	public String getCDIV_FRZ_FLAG()
	{
		return this._CDIV_FRZ_FLAG;
	}
	public void setCDIV_FRZ_FLAG(String value)
	{
		this._CDIV_FRZ_FLAG = value;
	}

	@Column(name = "CDIV_CR_DT")
	private java.sql.Date _CDIV_CR_DT;
	public java.sql.Date getCDIV_CR_DT()
	{
		return this._CDIV_CR_DT;
	}
	public void setCDIV_CR_DT(java.sql.Date value)
	{
		this._CDIV_CR_DT = value;
	}

	@Column(name = "CDIV_CR_UID")
	private String _CDIV_CR_UID;
	public String getCDIV_CR_UID()
	{
		return this._CDIV_CR_UID;
	}
	public void setCDIV_CR_UID(String value)
	{
		this._CDIV_CR_UID = value;
	}

	@Column(name = "CDIV_UPD_DT")
	private java.sql.Date _CDIV_UPD_DT;
	public java.sql.Date getCDIV_UPD_DT()
	{
		return this._CDIV_UPD_DT;
	}
	public void setCDIV_UPD_DT(java.sql.Date value)
	{
		this._CDIV_UPD_DT = value;
	}

	@Column(name = "CDIV_UPD_UID")
	private String _CDIV_UPD_UID;
	public String getCDIV_UPD_UID()
	{
		return this._CDIV_UPD_UID;
	}
	public void setCDIV_UPD_UID(String value)
	{
		this._CDIV_UPD_UID = value;
	}

}
