package com.aic.base.logging;

import jakarta.servlet.http.HttpServletRequest;

public interface LoggerFunctionService {

	void logToEmailHistoryLogs(EmailLogsDTO logs, HttpServletRequest request);

}
