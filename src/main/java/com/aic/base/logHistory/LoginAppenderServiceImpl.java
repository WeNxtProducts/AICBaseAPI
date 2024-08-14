package com.aic.base.logHistory;

import java.util.UUID;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.jdbc.JDBCAppender;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class LoginAppenderServiceImpl implements LoginAppender {

	public void loginToLJMLogs1(String message, HttpServletRequest request, String name) {
		Logger rootLogger = Logger.getRootLogger();
		Logger ljmLogger = Logger.getLogger("com.aic.base.logHistory.LoginAppenderServiceImpl");

		PropertyConfigurator.configure("src/main/resources/application.properties");
		JDBCAppender ljmLogsAppender = (JDBCAppender) Logger
				.getLogger("com.aic.base.logHistory.LogsAppenderServiceImpl").getAppender("ljm_logAudit");
		if (ljmLogsAppender == null) {
			ljmLogger.addAppender(rootLogger.getAppender("ljm_logAudit"));
		}



		String ipAddress = request.getRemoteAddr();
		String username = getUsernameFromSecurityContext();
		String userAgent = request.getHeader("User-Agent");
		String browserName = getBrowserName(userAgent);
		String ljm_logAudit_type = "LOGIN";
		


		String sysid = UUID.randomUUID().toString();
	    MDC.put("ljm_logAudit_sysid", sysid);

		String hostname = request.getRemoteHost();
		MDC.put("ljm_logAudit_user", username);
		MDC.put("ljm_logAudit_type", ljm_logAudit_type);

		MDC.put("ljm_logAudit_host", hostname);
		MDC.put("ljm_logAudit_ip", ipAddress);
		MDC.put("ljm_logAudit_browser", browserName);
		ljmLogger.info(message);
		MDC.clear();
	}

	private String getUsernameFromSecurityContext() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		} else {
			return principal.toString();
		}
	}



	private String getBrowserName(String userAgent) {
		if (userAgent == null) {
			return "Unknown null";
		}

		// Simple parsing logic
		if (userAgent.contains("MSIE") || userAgent.contains("Trident")) {
			return "Internet Explorer";
		} else if (userAgent.contains("Firefox")) {
			return "Mozilla Firefox";
		} else if (userAgent.contains("Chrome")) {
			return "Google Chrome";
		} else if (userAgent.contains("Safari")) {
			return "Apple Safari";
		} else if (userAgent.contains("Opera") || userAgent.contains("OPR")) {
			return "Opera";
		} else {
			return "Unknown Browser /API client";
		}
	}

}
