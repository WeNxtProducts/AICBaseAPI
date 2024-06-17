package com.aic.base.queryMaster;

import jakarta.servlet.http.HttpServletRequest;

public interface QueryMasterServcie {

	String createQuery(QueryMasterRequest queryMasterRequest);

	String updateQueryDetails(QueryMasterRequest queryMasterRequest, Integer queryId);

	String deleteQueryDetails(Integer queryId);

	String getQueryDetails(HttpServletRequest request, String screenCode, String screenName, Integer tranId);

	String createQueryParam(QueryMasterRequest queryMasterRequest, Integer queryId);

	String updateQueryParam(QueryMasterRequest queryMasterRequest, Integer queryParamId);

	String deleteQueryParam(Integer queryId);

	String getQueryParam(HttpServletRequest request, String screenCode, String screenName, Integer tranId);

}
