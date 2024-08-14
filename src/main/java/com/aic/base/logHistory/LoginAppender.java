package com.aic.base.logHistory;

import jakarta.servlet.http.HttpServletRequest;

public interface LoginAppender {

	public void loginToLJMLogs1(String message, HttpServletRequest request, String name);

}