package com.aic.base.login;

public class KeyValueModel {
	
	private String label;
	
	private String value;

	public KeyValueModel(Object object, Object object2) {
		this.label = (String) object;
		this.value = (String) object2;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
