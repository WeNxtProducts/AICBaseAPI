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

}
