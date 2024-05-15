package com.aic.base.commonUtils;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "app_audit")
public class APP_AUDIT {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AAD_Id")
	@JsonProperty("_AAD_Id")
	private int _AAD_Id;

	public int getAAD_Id() {
		return this._AAD_Id;
	}

	public void setAAD_Id(int value) {
		this._AAD_Id = value;
	}

	@Column(name = "AAD_User_Id")
	@JsonProperty("_AAD_User_Id")
	private String _AAD_User_Id;

	public String getAAD_User_Id() {
		return this._AAD_User_Id;
	}

	public void setAAD_User_Id(String value) {
		this._AAD_User_Id = value;
	}

	@Column(name = "AAD_Screen_Name")
	@JsonProperty("_AAD_Screen_Name")
	private String _AAD_Screen_Name;

	public String getAAD_Screen_Name() {
		return this._AAD_Screen_Name;
	}

	public void setAAD_Screen_Name(String value) {
		this._AAD_Screen_Name = value;
	}

	@Column(name = "AAD_Service_Name")
	@JsonProperty("_AAD_Service_Name")
	private String _AAD_Service_Name;

	public String getAAD_Service_Name() {
		return this._AAD_Service_Name;
	}

	public void setAAD_Service_Name(String value) {
		this._AAD_Service_Name = value;
	}

	@Column(name = "AAD_Trans_No")
	@JsonProperty("_AAD_Trans_No")
	private String _AAD_Trans_No;

	public String getAAD_Trans_No() {
		return this._AAD_Trans_No;
	}

	public void setAAD_Trans_No(String value) {
		this._AAD_Trans_No = value;
	}

	@Column(name = "AAD_Service_Type")
	@JsonProperty("_AAD_Service_Type")
	private String _AAD_Service_Type;

	public String getAAD_Service_Type() {
		return this._AAD_Service_Type;
	}

	public void setAAD_Service_Type(String value) {
		this._AAD_Service_Type = value;
	}

	@Column(name = "AAD_Cr_Date")
	@JsonProperty("_AAD_Cr_Date")
	private LocalDateTime _AAD_Cr_Date;

	public LocalDateTime getAAD_Cr_Date() {
		return this._AAD_Cr_Date;
	}

	public void setAAD_Cr_Date(LocalDateTime value) {
		this._AAD_Cr_Date = value;
	}

	@Column(name = "AAD_Host_Info")
	@JsonProperty("_AAD_Host_Info")
	private String _AAD_Host_Info;

	public String getAAD_Host_Info() {
		return this._AAD_Host_Info;
	}

	public void setAAD_Host_Info(String value) {
		this._AAD_Host_Info = value;
	}
	
	@Column(name = "RAC_VERSION")
	@JsonProperty("_RAC_VERSION")
	private int _RAC_VERSION;
	public int getRAC_VERSION()
	{
		return this._RAC_VERSION;
	}
	public void setRAC_VERSION(int value)
	{
		this._RAC_VERSION = value;
	}
}

