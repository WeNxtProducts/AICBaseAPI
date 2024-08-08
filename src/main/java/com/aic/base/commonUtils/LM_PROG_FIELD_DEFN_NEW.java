package com.aic.base.commonUtils;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "LM_PROG_FIELD_DEFN")
public class LM_PROG_FIELD_DEFN_NEW
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PFD_SYS_ID")
	private int _PFD_SYS_ID;
	public int getPFD_SYS_ID()
	{
		return this._PFD_SYS_ID;
	}
	public void setPFD_SYS_ID(int value)
	{
		this._PFD_SYS_ID = value;
	}

	@Column(name = "PFD_PROG_CODE")
	private String _PFD_PROG_CODE;
	public String getPFD_PROG_CODE()
	{
		return this._PFD_PROG_CODE;
	}
	public void setPFD_PROG_CODE(String value)
	{
		this._PFD_PROG_CODE = value;
	}

	@Column(name = "PFD_SCREEN_NAME")
	private String _PFD_SCREEN_NAME;
	public String getPFD_SCREEN_NAME()
	{
		return this._PFD_SCREEN_NAME;
	}
	public void setPFD_SCREEN_NAME(String value)
	{
		this._PFD_SCREEN_NAME = value;
	}

	@Column(name = "PFD_TABLE_NAME")
	private String _PFD_TABLE_NAME;
	public String getPFD_TABLE_NAME()
	{
		return this._PFD_TABLE_NAME;
	}
	public void setPFD_TABLE_NAME(String value)
	{
		this._PFD_TABLE_NAME = value;
	}

	@Column(name = "PFD_COLUMN_NAME")
	private String _PFD_COLUMN_NAME;
	public String getPFD_COLUMN_NAME()
	{
		return this._PFD_COLUMN_NAME;
	}
	public void setPFD_COLUMN_NAME(String value)
	{
		this._PFD_COLUMN_NAME = value;
	}

	@Column(name = "PFD_DATA_TYPE")
	private String _PFD_DATA_TYPE;
	public String getPFD_DATA_TYPE()
	{
		return this._PFD_DATA_TYPE;
	}
	public void setPFD_DATA_TYPE(String value)
	{
		this._PFD_DATA_TYPE = value;
	}

	@Column(name = "PFD_DFLT_VALUE_YN")
	private String _PFD_DFLT_VALUE_YN;
	public String getPFD_DFLT_VALUE_YN()
	{
		return this._PFD_DFLT_VALUE_YN;
	}
	public void setPFD_DFLT_VALUE_YN(String value)
	{
		this._PFD_DFLT_VALUE_YN = value;
	}

	@Column(name = "PFD_FLD_NAME")
	private String _PFD_FLD_NAME;
	public String getPFD_FLD_NAME()
	{
		return this._PFD_FLD_NAME;
	}
	public void setPFD_FLD_NAME(String value)
	{
		this._PFD_FLD_NAME = value;
	}

	@Column(name = "PFD_FLD_VALUE")
	private Object _PFD_FLD_VALUE;
	public Object getPFD_FLD_VALUE()
	{
		return this._PFD_FLD_VALUE!= null ? this._PFD_FLD_VALUE : "";
	}
	public void setPFD_FLD_VALUE(Object value)
	{
		this._PFD_FLD_VALUE = value;
	}

	@Column(name = "PFD_HINT")
	private String _PFD_HINT;
	public String getPFD_HINT()
	{
		return this._PFD_HINT;
	}
	public void setPFD_HINT(String value)
	{
		this._PFD_HINT = value;
	}

	@Column(name = "PFD_RADIO_GRP_NAME")
	private String _PFD_RADIO_GRP_NAME;
	public String getPFD_RADIO_GRP_NAME()
	{
		return this._PFD_RADIO_GRP_NAME;
	}
	public void setPFD_RADIO_GRP_NAME(String value)
	{
		this._PFD_RADIO_GRP_NAME = value;
	}

	@Column(name = "PFD_FORM_ITEM_TYPE1")
	private String _PFD_FORM_ITEM_TYPE1;
	public String getPFD_FORM_ITEM_TYPE1()
	{
		return this._PFD_FORM_ITEM_TYPE1;
	}
	public void setPFD_FORM_ITEM_TYPE1(String value)
	{
		this._PFD_FORM_ITEM_TYPE1 = value;
	}

	@Column(name = "PFD_FORM_ITEM_TYPE2")
	private String _PFD_FORM_ITEM_TYPE2;
	public String getPFD_FORM_ITEM_TYPE2()
	{
		return this._PFD_FORM_ITEM_TYPE2;
	}
	public void setPFD_FORM_ITEM_TYPE2(String value)
	{
		this._PFD_FORM_ITEM_TYPE2 = value;
	}


	@Column(name = "PFD_CLASS_NAME")
	private String _PFD_CLASS_NAME;
	public String getPFD_CLASS_NAME()
	{
		return this._PFD_CLASS_NAME;
	}
	public void setPFD_CLASS_NAME(String value)
	{
		this._PFD_CLASS_NAME = value;
	}

	@Column(name = "PFD_MANDATORY_YN", columnDefinition = "TINYINT")
	private boolean _PFD_MANDATORY_YN;
	public boolean getPFD_MANDATORY_YN()
	{
		return this._PFD_MANDATORY_YN;
	}
	public void setPFD_MANDATORY_YN(boolean value)
	{
		this._PFD_MANDATORY_YN = value;
	}

	@Column(name = "PFD_MINMAX_YN", columnDefinition = "TINYINT")
	private boolean _PFD_MINMAX_YN;
	public boolean getPFD_MINMAX_YN()
	{
		return this._PFD_MINMAX_YN;
	}
	public void setPFD_MINMAX_YN(boolean value)
	{
		this._PFD_MINMAX_YN = value;
	}

	@Column(name = "PFD_SEQ_NO")
	private Integer _PFD_SEQ_NO;
	public Integer getPFD_SEQ_NO()
	{
		return this._PFD_SEQ_NO;
	}
	public void setPFD_SEQ_NO(Integer value)
	{
		this._PFD_SEQ_NO = value;
	}

	@Column(name = "PFD_FLD_LEN")
	private String _PFD_FLD_LEN;
	public String getPFD_FLD_LEN()
	{
		return this._PFD_FLD_LEN;
	}
	public void setPFD_FLD_LEN(String value)
	{
		this._PFD_FLD_LEN = value;
	}

	@Column(name = "PFD_FONT_SIZE")
	private String _PFD_FONT_SIZE;
	public String getPFD_FONT_SIZE()
	{
		return this._PFD_FONT_SIZE;
	}
	public void setPFD_FONT_SIZE(String value)
	{
		this._PFD_FONT_SIZE = value;
	}

	@Column(name = "PFD_HIDE_YN")
	private boolean _PFD_HIDE_YN;
	public boolean getPFD_HIDE_YN()
	{
		return this._PFD_HIDE_YN;
	}
	public void setPFD_HIDE_YN(boolean value)
	{
		this._PFD_HIDE_YN = value;
	}

	@Column(name = "PFD_EDIT_YN", columnDefinition = "TINYINT")
	private boolean _PFD_EDIT_YN;
	public boolean getPFD_EDIT_YN()
	{
		return this._PFD_EDIT_YN;
	}
	public void setPFD_EDIT_YN(boolean value)
	{
		this._PFD_EDIT_YN = value;
	}

	@Column(name = "PFD_VALIDATION_YN", columnDefinition = "TINYINT")
	private boolean _PFD_VALIDATION_YN;
	public boolean getPFD_VALIDATION_YN()
	{
		return this._PFD_VALIDATION_YN;
	}
	public void setPFD_VALIDATION_YN(boolean value)
	{
		this._PFD_VALIDATION_YN = value;
	}

	@Column(name = "PFD_VALIDATION_ID")
	private String _PFD_VALIDATION_ID;
	public String getPFD_VALIDATION_ID()
	{
		return this._PFD_VALIDATION_ID;
	}
	public void setPFD_VALIDATION_ID(String value)
	{
		this._PFD_VALIDATION_ID = value;
	}
	
	@Column(name = "PFD_PARAM_1")
	private String _PFD_PARAM_1;
	public String getPFD_PARAM_1()
	{
		return this._PFD_PARAM_1;
	}
	public void setPFD_PARAM_1(String value)
	{
		this._PFD_PARAM_1 = value;
	}
	
	@Column(name = "PFD_PARAM_2")
	private String _PFD_PARAM_2;
	public String getPFD_PARAM_2()
	{
		return this._PFD_PARAM_2;
	}
	public void setPFD_PARAM_2(String value)
	{
		this._PFD_PARAM_2 = value;
	}
	
	@Column(name = "PFD_PARAM_3")
	private String _PFD_PARAM_3;
	public String getPFD_PARAM_3()
	{
		return this._PFD_PARAM_3;
	}
	public void setPFD_PARAM_3(String value)
	{
		this._PFD_PARAM_3 = value;
	}
	
	@Column(name = "PFD_PARAM_4")
	private String _PFD_PARAM_4;
	public String getPFD_PARAM_4()
	{
		return this._PFD_PARAM_4;
	}
	public void setPFD_PARAM_4(String value)
	{
		this._PFD_PARAM_4 = value;
	}
	
	@Column(name = "PFD_PARAM_5")
	private String _PFD_PARAM_5;
	public String getPFD_PARAM_5()
	{
		return this._PFD_PARAM_5;
	}
	public void setPFD_PARAM_5(String value)
	{
		this._PFD_PARAM_5 = value;
	}
	
	@Transient
	private List<LOVDTO> options;
	public List<LOVDTO> getOptions() {
		return options;
	}
	public void setOptions(List<LOVDTO> options) {
		this.options = options;
	}

}
