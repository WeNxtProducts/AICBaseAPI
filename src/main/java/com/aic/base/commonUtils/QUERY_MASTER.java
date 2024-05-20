package com.aic.base.commonUtils;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LJM_QUERY_MASTER")
public class QUERY_MASTER
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QM_SYS_ID")
	private int _QM_SYS_ID;
	public int getQM_SYS_ID()
	{
		return this._QM_SYS_ID;
	}
	public void setQM_SYS_ID(int value)
	{
		this._QM_SYS_ID = value;
	}

	@Column(name = "QM_PROG_CODE")
	private String _QM_PROG_CODE;
	public String getQM_PROG_CODE()
	{
		return this._QM_PROG_CODE;
	}
	public void setQM_PROG_CODE(String value)
	{
		this._QM_PROG_CODE = value;
	}

	@Column(name = "QM_SCREEN_NAME")
	private String _QM_SCREEN_NAME;
	public String getQM_SCREEN_NAME()
	{
		return this._QM_SCREEN_NAME;
	}
	public void setQM_SCREEN_NAME(String value)
	{
		this._QM_SCREEN_NAME = value;
	}

	@Column(name = "QM_QUERY_TYPE")
	private String _QM_QUERY_TYPE;
	public String getQM_QUERY_TYPE()
	{
		return this._QM_QUERY_TYPE;
	}
	public void setQM_QUERY_TYPE(String value)
	{
		this._QM_QUERY_TYPE = value;
	}

	@Column(name = "QM_QUERY_NAME")
	private String _QM_QUERY_NAME;
	public String getQM_QUERY_NAME()
	{
		return this._QM_QUERY_NAME;
	}
	public void setQM_QUERY_NAME(String value)
	{
		this._QM_QUERY_NAME = value;
	}

	@Column(name = "QM_QUERY_DESC")
	private String _QM_QUERY_DESC;
	public String getQM_QUERY_DESC()
	{
		return this._QM_QUERY_DESC;
	}
	public void setQM_QUERY_DESC(String value)
	{
		this._QM_QUERY_DESC = value;
	}

	@Column(name = "QM_QUERY")
	private String _QM_QUERY;
	public String getQM_QUERY()
	{
		return this._QM_QUERY;
	}
	public void setQM_QUERY(String value)
	{
		this._QM_QUERY = value;
	}

	@Column(name = "QM_CR_DT")
	private java.sql.Timestamp _QM_CR_DT;
	public java.sql.Timestamp getQM_CR_DT()
	{
		return this._QM_CR_DT;
	}
	public void setQM_CR_DT(java.sql.Timestamp value)
	{
		this._QM_CR_DT = value;
	}

	@Column(name = "QM_CR_UID")
	private int _QM_CR_UID;
	public int getQM_CR_UID()
	{
		return this._QM_CR_UID;
	}
	public void setQM_CR_UID(int value)
	{
		this._QM_CR_UID = value;
	}

	@Column(name = "QM_UPD_DT")
	private java.sql.Timestamp _QM_UPD_DT;
	public java.sql.Timestamp getQM_UPD_DT()
	{
		return this._QM_UPD_DT;
	}
	public void setQM_UPD_DT(java.sql.Timestamp value)
	{
		this._QM_UPD_DT = value;
	}

	@Column(name = "QM_UPD_DTM")
	private String _QM_UPD_DTM;
	public String getQM_UPD_DTM()
	{
		return this._QM_UPD_DTM;
	}
	public void setQM_UPD_DTM(String value)
	{
		this._QM_UPD_DTM = value;
	}

}

