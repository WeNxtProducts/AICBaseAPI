package com.aic.base.model;

import com.aic.base.custMaster.CustRequestData.FrontForm;

public class CustomerRequestDto {

	private FrontForm frontForm;
	private FrontForm permanent_address;

	private FrontForm current_address;
//	private String[] mrvListingId;

	public FrontForm getFrontForm() {
		return frontForm;
	}

	public void setFrontForm(FrontForm frontForm) {
		this.frontForm = frontForm;
	}

	public FrontForm getPermanent_address() {
		return permanent_address;
	}

	public void setPermanent_address(FrontForm permanent_address) {
		this.permanent_address = permanent_address;
	}

	public FrontForm getCurrent_address() {
		return current_address;
	}

	public void setCurrent_address(FrontForm current_address) {
		this.current_address = current_address;
	}
//	public String[] getMrvListingId() {
//		return mrvListingId;
//	}
//	public void setMrvListingId(String[] mrvListingId) {
//		this.mrvListingId = mrvListingId;
//	}

}
