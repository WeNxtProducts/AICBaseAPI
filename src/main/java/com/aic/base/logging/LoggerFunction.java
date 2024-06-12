package com.aic.base.logging;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.jdbc.JDBCAppender;

import jakarta.servlet.http.HttpServletRequest;

public class LoggerFunction {

	static Logger rootLogger = Logger.getRootLogger();
	static Logger ljmLogger = Logger.getLogger("com.aic.base.logging.LoggerFunction");

	public void logToLJMLogs(String message, HttpServletRequest request, String logName) {
		PropertyConfigurator.configure("src/main/resources/log4j.properties");
		JDBCAppender ljmLogsAppender = (JDBCAppender) Logger.getLogger("com.aic.base.logging.LoggerFunction")
				.getAppender("MYSQL_DB");
		if (ljmLogsAppender == null) {
			ljmLogger.addAppender(rootLogger.getAppender("MYSQL_DB"));
		}

		MDC.put("LOGS_USER_ID", 1);
		MDC.put("LOGS_LOGGER_CLASS", logName);
		ljmLogger.info(message);
		MDC.clear();

	}

}
