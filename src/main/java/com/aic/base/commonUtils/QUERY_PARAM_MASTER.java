package com.aic.base.commonUtils;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "QUERY_PARAM_MASTER")
public class QUERY_PARAM_MASTER
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QPM_SYS_ID")
	private int _QPM_SYS_ID;
	public int getQPM_SYS_ID()
	{
		return this._QPM_SYS_ID;
	}
	public void setQPM_SYS_ID(int value)
	{
		this._QPM_SYS_ID = value;
	}

	@Column(name = "QPM_QM_SYS_ID")
	private int _QPM_QM_SYS_ID;
	public int getQPM_QM_SYS_ID()
	{
		return this._QPM_QM_SYS_ID;
	}
	public void setQPM_QM_SYS_ID(int value)
	{
		this._QPM_QM_SYS_ID = value;
	}

	@Column(name = "QPM_PARAM_TYPE")
	private String _QPM_PARAM_TYPE;
	public String getQPM_PARAM_TYPE()
	{
		return this._QPM_PARAM_TYPE;
	}
	public void setQPM_PARAM_TYPE(String value)
	{
		this._QPM_PARAM_TYPE = value;
	}

	@Column(name = "QPM_PARAM_NAME")
	private String _QPM_PARAM_NAME;
	public String getQPM_PARAM_NAME()
	{
		return this._QPM_PARAM_NAME;
	}
	public void setQPM_PARAM_NAME(String value)
	{
		this._QPM_PARAM_NAME = value;
	}

	@Column(name = "QPM_PARAM_VALUE")
	private String _QPM_PARAM_VALUE;
	public String getQPM_PARAM_VALUE()
	{
		return this._QPM_PARAM_VALUE;
	}
	public void setQPM_PARAM_VALUE(String value)
	{
		this._QPM_PARAM_VALUE = value;
	}

	@Column(name = "QPM_CR_DT")
	private java.sql.Timestamp _QPM_CR_DT;
	public java.sql.Timestamp getQPM_CR_DT()
	{
		return this._QPM_CR_DT;
	}
	public void setQPM_CR_DT(java.sql.Timestamp value)
	{
		this._QPM_CR_DT = value;
	}

	@Column(name = "QPM_CR_UID")
	private String _QPM_CR_UID;
	public String getQPM_CR_UID()
	{
		return this._QPM_CR_UID;
	}
	public void setQPM_CR_UID(String value)
	{
		this._QPM_CR_UID = value;
	}

	@Column(name = "QPM_UPD_DTM")
	private java.sql.Timestamp _QPM_UPD_DTM;
	public java.sql.Timestamp getQPM_UPD_DTM()
	{
		return this._QPM_UPD_DTM;
	}
	public void setQPM_UPD_DTM(java.sql.Timestamp value)
	{
		this._QPM_UPD_DTM = value;
	}

}

