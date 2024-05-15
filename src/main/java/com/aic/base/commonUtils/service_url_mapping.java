package com.aic.base.commonUtils;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "service_url_mapping")
public class service_url_mapping
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "serv_sysId")
	private int _serv_sysId;
	public int getserv_sysId()
	{
		return this._serv_sysId;
	}
	public void setserv_sysId(int value)
	{
		this._serv_sysId = value;
	}

	@Column(name = "serv_prog_code")
	private String _serv_prog_code;
	public String getserv_prog_code()
	{
		return this._serv_prog_code;
	}
	public void setserv_prog_code(String value)
	{
		this._serv_prog_code = value;
	}

	@Column(name = "serv_screen_name")
	private String _serv_screen_name;
	public String getserv_screen_name()
	{
		return this._serv_screen_name;
	}
	public void setserv_screen_name(String value)
	{
		this._serv_screen_name = value;
	}

	@Column(name = "serv_service_name")
	private String _serv_service_name;
	public String getserv_service_name()
	{
		return this._serv_service_name;
	}
	public void setserv_service_name(String value)
	{
		this._serv_service_name = value;
	}

	@Column(name = "serv_type")
	private String _serv_type;
	public String getserv_type()
	{
		return this._serv_type;
	}
	public void setserv_type(String value)
	{
		this._serv_type = value;
	}

	@Column(name = "serv_method")
	private String _serv_method;
	public String getserv_method()
	{
		return this._serv_method;
	}
	public void setserv_method(String value)
	{
		this._serv_method = value;
	}

	@Column(name = "serv_description")
	private String _serv_description;
	public String getserv_description()
	{
		return this._serv_description;
	}
	public void setserv_description(String value)
	{
		this._serv_description = value;
	}

	@Column(name = "serv_url")
	private String _serv_url;
	public String getserv_url()
	{
		return this._serv_url;
	}
	public void setserv_url(String value)
	{
		this._serv_url = value;
	}

	@Column(name = "serv_log_YN")
	private String _serv_log_YN;
	public String getserv_log_YN()
	{
		return this._serv_log_YN;
	}
	public void setserv_log_YN(String value)
	{
		this._serv_log_YN = value;
	}

	@Column(name = "serv_ins_dt")
	private java.sql.Timestamp _serv_ins_dt;
	public java.sql.Timestamp getserv_ins_dt()
	{
		return this._serv_ins_dt;
	}
	public void setserv_ins_dt(java.sql.Timestamp value)
	{
		this._serv_ins_dt = value;
	}

	@Column(name = "serv_ins_id")
	private String _serv_ins_id;
	public String getserv_ins_id()
	{
		return this._serv_ins_id;
	}
	public void setserv_ins_id(String value)
	{
		this._serv_ins_id = value;
	}

	@Column(name = "serv_mod_dt")
	private java.sql.Timestamp _serv_mod_dt;
	public java.sql.Timestamp getserv_mod_dt()
	{
		return this._serv_mod_dt;
	}
	public void setserv_mod_dt(java.sql.Timestamp value)
	{
		this._serv_mod_dt = value;
	}

	@Column(name = "serv_mod_id")
	private String _serv_mod_id;
	public String getserv_mod_id()
	{
		return this._serv_mod_id;
	}
	public void setserv_mod_id(String value)
	{
		this._serv_mod_id = value;
	}

	@Column(name = "serv_request")
	private String _serv_request;
	public String getserv_request()
	{
		return this._serv_request;
	}
	public void setserv_request(String value)
	{
		this._serv_request = value;
	}

	@Column(name = "serv_response")
	private String _serv_response;
	public String getserv_response()
	{
		return this._serv_response;
	}
	public void setserv_response(String value)
	{
		this._serv_response = value;
	}
	
}
