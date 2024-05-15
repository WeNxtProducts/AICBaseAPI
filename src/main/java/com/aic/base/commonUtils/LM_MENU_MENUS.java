package com.aic.base.commonUtils;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LM_MENU_MENUS")
public class LM_MENU_MENUS
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MENU_SYS_ID")
	private int _MENU_SYS_ID;
	public int getMENU_SYS_ID()
	{
		return this._MENU_SYS_ID;
	}
	public void setMENU_SYS_ID(int value)
	{
		this._MENU_SYS_ID = value;
	}

	@Column(name = "MENU_ID")
	private String _MENU_ID;
	public String getMENU_ID()
	{
		return this._MENU_ID;
	}
	public void setMENU_ID(String value)
	{
		this._MENU_ID = value;
	}

	@Column(name = "MENU_SCR_NAME")
	private String _MENU_SCR_NAME;
	public String getMENU_SCR_NAME()
	{
		return this._MENU_SCR_NAME;
	}
	public void setMENU_SCR_NAME(String value)
	{
		this._MENU_SCR_NAME = value;
	}

	@Column(name = "MENU_SCR_NAME_BL")
	private String _MENU_SCR_NAME_BL;
	public String getMENU_SCR_NAME_BL()
	{
		return this._MENU_SCR_NAME_BL;
	}
	public void setMENU_SCR_NAME_BL(String value)
	{
		this._MENU_SCR_NAME_BL = value;
	}

	@Column(name = "MENU_OPTION")
	private String _MENU_OPTION;
	public String getMENU_OPTION()
	{
		return this._MENU_OPTION;
	}
	public void setMENU_OPTION(String value)
	{
		this._MENU_OPTION = value;
	}

	@Column(name = "MENU_OPTION_DESC")
	private String _MENU_OPTION_DESC;
	public String getMENU_OPTION_DESC()
	{
		return this._MENU_OPTION_DESC;
	}
	public void setMENU_OPTION_DESC(String value)
	{
		this._MENU_OPTION_DESC = value;
	}

	@Column(name = "MENU_OPTION_DESC_BL")
	private String _MENU_OPTION_DESC_BL;
	public String getMENU_OPTION_DESC_BL()
	{
		return this._MENU_OPTION_DESC_BL;
	}
	public void setMENU_OPTION_DESC_BL(String value)
	{
		this._MENU_OPTION_DESC_BL = value;
	}

	@Column(name = "MENU_HELP_TEXT1")
	private String _MENU_HELP_TEXT1;
	public String getMENU_HELP_TEXT1()
	{
		return this._MENU_HELP_TEXT1;
	}
	public void setMENU_HELP_TEXT1(String value)
	{
		this._MENU_HELP_TEXT1 = value;
	}

	@Column(name = "MENU_HELP_TEXT1_BL")
	private String _MENU_HELP_TEXT1_BL;
	public String getMENU_HELP_TEXT1_BL()
	{
		return this._MENU_HELP_TEXT1_BL;
	}
	public void setMENU_HELP_TEXT1_BL(String value)
	{
		this._MENU_HELP_TEXT1_BL = value;
	}

	@Column(name = "MENU_HELP_TEXT2")
	private String _MENU_HELP_TEXT2;
	public String getMENU_HELP_TEXT2()
	{
		return this._MENU_HELP_TEXT2;
	}
	public void setMENU_HELP_TEXT2(String value)
	{
		this._MENU_HELP_TEXT2 = value;
	}

	@Column(name = "MENU_HELP_TEXT2_BL")
	private String _MENU_HELP_TEXT2_BL;
	public String getMENU_HELP_TEXT2_BL()
	{
		return this._MENU_HELP_TEXT2_BL;
	}
	public void setMENU_HELP_TEXT2_BL(String value)
	{
		this._MENU_HELP_TEXT2_BL = value;
	}

	@Column(name = "MENU_PARENT_ID")
	private String _MENU_PARENT_ID;
	public String getMENU_PARENT_ID()
	{
		return this._MENU_PARENT_ID;
	}
	public void setMENU_PARENT_ID(String value)
	{
		this._MENU_PARENT_ID = value;
	}

	@Column(name = "MENU_ACTION_TYPE")
	private String _MENU_ACTION_TYPE;
	public String getMENU_ACTION_TYPE()
	{
		return this._MENU_ACTION_TYPE;
	}
	public void setMENU_ACTION_TYPE(String value)
	{
		this._MENU_ACTION_TYPE = value;
	}

	@Column(name = "MENU_ACTION")
	private byte[] _MENU_ACTION;
	public byte[] getMENU_ACTION()
	{
		return this._MENU_ACTION;
	}
	public void setMENU_ACTION(byte[] value)
	{
		this._MENU_ACTION = value;
	}

	@Column(name = "MENU_MODE")
	private String _MENU_MODE;
	public String getMENU_MODE()
	{
		return this._MENU_MODE;
	}
	public void setMENU_MODE(String value)
	{
		this._MENU_MODE = value;
	}

	@Column(name = "MENU_PASS_FLAG")
	private String _MENU_PASS_FLAG;
	public String getMENU_PASS_FLAG()
	{
		return this._MENU_PASS_FLAG;
	}
	public void setMENU_PASS_FLAG(String value)
	{
		this._MENU_PASS_FLAG = value;
	}

	@Column(name = "MENU_DISP_SEQ_NO")
	private double _MENU_DISP_SEQ_NO;
	public double getMENU_DISP_SEQ_NO()
	{
		return this._MENU_DISP_SEQ_NO;
	}
	public void setMENU_DISP_SEQ_NO(double value)
	{
		this._MENU_DISP_SEQ_NO = value;
	}

	@Column(name = "MENU_SEQ_NO")
	private String _MENU_SEQ_NO;
	public String getMENU_SEQ_NO()
	{
		return this._MENU_SEQ_NO;
	}
	public void setMENU_SEQ_NO(String value)
	{
		this._MENU_SEQ_NO = value;
	}

	@Column(name = "MENU_CAPTION_SOURCE")
	private String _MENU_CAPTION_SOURCE;
	public String getMENU_CAPTION_SOURCE()
	{
		return this._MENU_CAPTION_SOURCE;
	}
	public void setMENU_CAPTION_SOURCE(String value)
	{
		this._MENU_CAPTION_SOURCE = value;
	}

	@Column(name = "MENU_PARAMETER_1")
	private String _MENU_PARAMETER_1;
	public String getMENU_PARAMETER_1()
	{
		return this._MENU_PARAMETER_1;
	}
	public void setMENU_PARAMETER_1(String value)
	{
		this._MENU_PARAMETER_1 = value;
	}

	@Column(name = "MENU_PARAMETER_2")
	private String _MENU_PARAMETER_2;
	public String getMENU_PARAMETER_2()
	{
		return this._MENU_PARAMETER_2;
	}
	public void setMENU_PARAMETER_2(String value)
	{
		this._MENU_PARAMETER_2 = value;
	}

	@Column(name = "MENU_PARAMETER_3")
	private String _MENU_PARAMETER_3;
	public String getMENU_PARAMETER_3()
	{
		return this._MENU_PARAMETER_3;
	}
	public void setMENU_PARAMETER_3(String value)
	{
		this._MENU_PARAMETER_3 = value;
	}

	@Column(name = "MENU_PARAMETER_4")
	private String _MENU_PARAMETER_4;
	public String getMENU_PARAMETER_4()
	{
		return this._MENU_PARAMETER_4;
	}
	public void setMENU_PARAMETER_4(String value)
	{
		this._MENU_PARAMETER_4 = value;
	}

	@Column(name = "MENU_PARAMETER_5")
	private String _MENU_PARAMETER_5;
	public String getMENU_PARAMETER_5()
	{
		return this._MENU_PARAMETER_5;
	}
	public void setMENU_PARAMETER_5(String value)
	{
		this._MENU_PARAMETER_5 = value;
	}

	@Column(name = "MENU_PARAMETER_6")
	private String _MENU_PARAMETER_6;
	public String getMENU_PARAMETER_6()
	{
		return this._MENU_PARAMETER_6;
	}
	public void setMENU_PARAMETER_6(String value)
	{
		this._MENU_PARAMETER_6 = value;
	}

	@Column(name = "MENU_PARAMETER_7")
	private String _MENU_PARAMETER_7;
	public String getMENU_PARAMETER_7()
	{
		return this._MENU_PARAMETER_7;
	}
	public void setMENU_PARAMETER_7(String value)
	{
		this._MENU_PARAMETER_7 = value;
	}

	@Column(name = "MENU_PARAMETER_8")
	private String _MENU_PARAMETER_8;
	public String getMENU_PARAMETER_8()
	{
		return this._MENU_PARAMETER_8;
	}
	public void setMENU_PARAMETER_8(String value)
	{
		this._MENU_PARAMETER_8 = value;
	}

	@Column(name = "MENU_PARAMETER_9")
	private String _MENU_PARAMETER_9;
	public String getMENU_PARAMETER_9()
	{
		return this._MENU_PARAMETER_9;
	}
	public void setMENU_PARAMETER_9(String value)
	{
		this._MENU_PARAMETER_9 = value;
	}

	@Column(name = "MENU_PARAMETER_10")
	private String _MENU_PARAMETER_10;
	public String getMENU_PARAMETER_10()
	{
		return this._MENU_PARAMETER_10;
	}
	public void setMENU_PARAMETER_10(String value)
	{
		this._MENU_PARAMETER_10 = value;
	}

	@Column(name = "MENU_PARAMETER_11")
	private String _MENU_PARAMETER_11;
	public String getMENU_PARAMETER_11()
	{
		return this._MENU_PARAMETER_11;
	}
	public void setMENU_PARAMETER_11(String value)
	{
		this._MENU_PARAMETER_11 = value;
	}

	@Column(name = "MENU_PARAMETER_12")
	private String _MENU_PARAMETER_12;
	public String getMENU_PARAMETER_12()
	{
		return this._MENU_PARAMETER_12;
	}
	public void setMENU_PARAMETER_12(String value)
	{
		this._MENU_PARAMETER_12 = value;
	}

	@Column(name = "MENU_PARAMETER_13")
	private String _MENU_PARAMETER_13;
	public String getMENU_PARAMETER_13()
	{
		return this._MENU_PARAMETER_13;
	}
	public void setMENU_PARAMETER_13(String value)
	{
		this._MENU_PARAMETER_13 = value;
	}

	@Column(name = "MENU_PARAMETER_14")
	private String _MENU_PARAMETER_14;
	public String getMENU_PARAMETER_14()
	{
		return this._MENU_PARAMETER_14;
	}
	public void setMENU_PARAMETER_14(String value)
	{
		this._MENU_PARAMETER_14 = value;
	}

	@Column(name = "MENU_PARAMETER_15")
	private String _MENU_PARAMETER_15;
	public String getMENU_PARAMETER_15()
	{
		return this._MENU_PARAMETER_15;
	}
	public void setMENU_PARAMETER_15(String value)
	{
		this._MENU_PARAMETER_15 = value;
	}

	@Column(name = "MENU_PARAMETER_16")
	private String _MENU_PARAMETER_16;
	public String getMENU_PARAMETER_16()
	{
		return this._MENU_PARAMETER_16;
	}
	public void setMENU_PARAMETER_16(String value)
	{
		this._MENU_PARAMETER_16 = value;
	}

	@Column(name = "MENU_PARAMETER_17")
	private String _MENU_PARAMETER_17;
	public String getMENU_PARAMETER_17()
	{
		return this._MENU_PARAMETER_17;
	}
	public void setMENU_PARAMETER_17(String value)
	{
		this._MENU_PARAMETER_17 = value;
	}

	@Column(name = "MENU_PARAMETER_18")
	private String _MENU_PARAMETER_18;
	public String getMENU_PARAMETER_18()
	{
		return this._MENU_PARAMETER_18;
	}
	public void setMENU_PARAMETER_18(String value)
	{
		this._MENU_PARAMETER_18 = value;
	}

	@Column(name = "MENU_PARAMETER_19")
	private String _MENU_PARAMETER_19;
	public String getMENU_PARAMETER_19()
	{
		return this._MENU_PARAMETER_19;
	}
	public void setMENU_PARAMETER_19(String value)
	{
		this._MENU_PARAMETER_19 = value;
	}

	@Column(name = "MENU_PARAMETER_20")
	private String _MENU_PARAMETER_20;
	public String getMENU_PARAMETER_20()
	{
		return this._MENU_PARAMETER_20;
	}
	public void setMENU_PARAMETER_20(String value)
	{
		this._MENU_PARAMETER_20 = value;
	}

	@Column(name = "MENU_CR_DT")
	private java.sql.Date _MENU_CR_DT;
	public java.sql.Date getMENU_CR_DT()
	{
		return this._MENU_CR_DT;
	}
	public void setMENU_CR_DT(java.sql.Date value)
	{
		this._MENU_CR_DT = value;
	}

	@Column(name = "MENU_CR_UID")
	private String _MENU_CR_UID;
	public String getMENU_CR_UID()
	{
		return this._MENU_CR_UID;
	}
	public void setMENU_CR_UID(String value)
	{
		this._MENU_CR_UID = value;
	}

	@Column(name = "MENU_UPD_UID")
	private String _MENU_UPD_UID;
	public String getMENU_UPD_UID()
	{
		return this._MENU_UPD_UID;
	}
	public void setMENU_UPD_UID(String value)
	{
		this._MENU_UPD_UID = value;
	}

	@Column(name = "MENU_UPD_DT")
	private java.sql.Date _MENU_UPD_DT;
	public java.sql.Date getMENU_UPD_DT()
	{
		return this._MENU_UPD_DT;
	}
	public void setMENU_UPD_DT(java.sql.Date value)
	{
		this._MENU_UPD_DT = value;
	}

	@Column(name = "MENU_MODULE_ID")
	private String _MENU_MODULE_ID;
	public String getMENU_MODULE_ID()
	{
		return this._MENU_MODULE_ID;
	}
	public void setMENU_MODULE_ID(String value)
	{
		this._MENU_MODULE_ID = value;
	}

	@Column(name = "MENU_ICON_PATH")
	private String _MENU_ICON_PATH;
	public String getMENU_ICON_PATH()
	{
		return this._MENU_ICON_PATH;
	}
	public void setMENU_ICON_PATH(String value)
	{
		this._MENU_ICON_PATH = value;
	}

	@Column(name = "MENU_CLIENT_CODE")
	private String _MENU_CLIENT_CODE;
	public String getMENU_CLIENT_CODE()
	{
		return this._MENU_CLIENT_CODE;
	}
	public void setMENU_CLIENT_CODE(String value)
	{
		this._MENU_CLIENT_CODE = value;
	}

	@Column(name = "MENU_SECURITY_CODE")
	private String _MENU_SECURITY_CODE;
	public String getMENU_SECURITY_CODE()
	{
		return this._MENU_SECURITY_CODE;
	}
	public void setMENU_SECURITY_CODE(String value)
	{
		this._MENU_SECURITY_CODE = value;
	}

	@Column(name = "MENU_INST_CODE")
	private String _MENU_INST_CODE;
	public String getMENU_INST_CODE()
	{
		return this._MENU_INST_CODE;
	}
	public void setMENU_INST_CODE(String value)
	{
		this._MENU_INST_CODE = value;
	}

	@Column(name = "MENU_URL")
	private byte[] _MENU_URL;
	public byte[] getMENU_URL()
	{
		return this._MENU_URL;
	}
	public void setMENU_URL(byte[] value)
	{
		this._MENU_URL = value;
	}

	@Column(name = "MENU_COMP_CODE")
	private String _MENU_COMP_CODE;
	public String getMENU_COMP_CODE()
	{
		return this._MENU_COMP_CODE;
	}
	public void setMENU_COMP_CODE(String value)
	{
		this._MENU_COMP_CODE = value;
	}

}
