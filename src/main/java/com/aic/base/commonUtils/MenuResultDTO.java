package com.aic.base.commonUtils;

import java.util.List;

import org.json.JSONObject;

public class MenuResultDTO {

	private String menuId;

	private String menuScreenName;

	private String menuOptionDesc;

	private String menuAction;

	private String menuActionType;

	private String menuParentId;

	private String menuDispSeqNo;

	private String menuURL;

	private List<?> childrens;

	private String listingQueryId;

	private String menuIconPath;

	private Integer ds_type;

	private String ds_code;

	private String POL_CLASS_CODE;

	private String repId;

	private String repName;

	private String repMenuFlag;

	private String repParentId;
	
	private String repAdds1;

	
	public String getRepAdds1() {
		return repAdds1;
	}

	public void setRepAdds1(String repAdds1) {
		this.repAdds1 = repAdds1;
	}

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getMenuScreenName() {
		return menuScreenName;
	}

	public void setMenuScreenName(String menuScreenName) {
		this.menuScreenName = menuScreenName;
	}

	public String getMenuOptionDesc() {
		return menuOptionDesc;
	}

	public void setMenuOptionDesc(String menuOptionDesc) {
		this.menuOptionDesc = menuOptionDesc;
	}

	public String getMenuAction() {
		return menuAction;
	}

	public void setMenuAction(String menuAction) {
		this.menuAction = menuAction;
	}

	public String getMenuActionType() {
		return menuActionType;
	}

	public void setMenuActionType(String menuActionType) {
		this.menuActionType = menuActionType;
	}

	public String getMenuParentId() {
		return menuParentId;
	}

	public void setMenuParentId(String menuParentId) {
		this.menuParentId = menuParentId;
	}

	public String getMenuDispSeqNo() {
		return menuDispSeqNo;
	}

	public void setMenuDispSeqNo(String menuDispSeqNo) {
		this.menuDispSeqNo = menuDispSeqNo;
	}

	public String getMenuURL() {
		return menuURL;
	}

	public void setMenuURL(String menuURL) {
		this.menuURL = menuURL;
	}

	public List<?> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<?> childrens) {
		this.childrens = childrens;
	}

	public String getListingQueryId() {
		return listingQueryId;
	}

	public void setListingQueryId(String listingQueryId) {
		this.listingQueryId = listingQueryId;
	}

	public String getMenuIconPath() {
		return menuIconPath;
	}

	public void setMenuIconPath(String menuIconPath) {
		this.menuIconPath = menuIconPath;
	}

	public Integer getDs_type() {
		return ds_type;
	}

	public void setDs_type(Integer ds_type) {
		this.ds_type = ds_type;
	}

	public String getDs_code() {
		return ds_code;
	}

	public void setDs_code(String ds_code) {
		this.ds_code = ds_code;
	}

	public String getPOL_CLASS_CODE() {
		return POL_CLASS_CODE;
	}

	public void setPOL_CLASS_CODE(String pOL_CLASS_CODE) {
		POL_CLASS_CODE = pOL_CLASS_CODE;
	}

	public String getRepId() {
		return repId;
	}

	public void setRepId(String repId) {
		this.repId = repId;
	}

	public String getRepName() {
		return repName;
	}

	public void setRepName(String repName) {
		this.repName = repName;
	}

	public String getRepMenuFlag() {
		return repMenuFlag;
	}

	public void setRepMenuFlag(String repMenuFlag) {
		this.repMenuFlag = repMenuFlag;
	}

	public String getRepParentId() {
		return repParentId;
	}

	public void setRepParentId(String repParentId) {
		this.repParentId = repParentId;
	}

}
