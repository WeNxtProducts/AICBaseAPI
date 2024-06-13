package com.aic.base.logging;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.jdbc.JDBCAppender;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class LoggerFunction implements LoggerFunctionService{

	static Logger rootLogger = Logger.getRootLogger();
	static Logger ljmLogger = Logger.getLogger("com.aic.base.logging.LoggerFunction");

	@Override
	public void logToEmailHistoryLogs(EmailLogsDTO logs, HttpServletRequest request) {
		PropertyConfigurator.configure("src/main/resources/log4j.properties");
		JDBCAppender ljmLogsAppender = (JDBCAppender) Logger.getLogger("com.aic.base.logging.LoggerFunction")
				.getAppender("EMAIL_HISTORY");
		if (ljmLogsAppender == null) {
			ljmLogger.addAppender(rootLogger.getAppender("EMAIL_HISTORY"));
		}
		String ipAddress = request.getRemoteAddr();
		String username = getUsernameFromSecurityContext();
		String hostname = request.getRemoteHost();
		MDC.put("EMHI_TO", logs.getTo());
		MDC.put("EMHI_TEMPLATE_NAME", logs.getTemplateName());

		String escapedContent = logs.getTemplateBody().replaceAll("'", "''");
		MDC.put("EMHI_TEMPLATE_BODY", escapedContent);
		MDC.put("EMHI_GEN_DATE", logs.getGenDate());
		MDC.put("EMHI_HOST_NAME", hostname);
		MDC.put("EMHI_IP_ADDR", ipAddress.toString());
		ljmLogger.info("Email History Log");
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

}
