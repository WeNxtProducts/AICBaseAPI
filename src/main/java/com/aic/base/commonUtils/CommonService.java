package com.aic.base.commonUtils;

import org.json.JSONObject;

import jakarta.servlet.http.HttpServletRequest;

public interface CommonService {
	
	public String insertAudit(APP_AUDIT auditModel);
	
	public String getAuditByUserAndScreen(APP_AUDIT auditModel);
	
	public String insertException(ExceptionDTO exceptionDTO);
	
	public String getAllExceptions();
	
	public String getMenuList(String groupId, HttpServletRequest request);
	
	public String getQueryLOV(HttpServletRequest request);
	
	public String getQueryParamLOV(HttpServletRequest request);
	
	public String getListingData(HttpServletRequest request);
	
	public String getMrvListing(HttpServletRequest request);
	
	public void asyncMethod(AsyncDTO inputRequest, HttpServletRequest request);
	
	public void syncMethod(AsyncDTO inputRequest, HttpServletRequest request);
	
	public void saveFieldDefJson(HttpServletRequest request);
	
	public String serviceToJson(HttpServletRequest request);

//	public String editFields(HttpServletRequest request, JSONObject object);

	public String lovToJson(HttpServletRequest request);

	public String quotationEdit(HttpServletRequest request) throws SecurityException, IllegalArgumentException, IllegalAccessException;

	public String userMasterEdit(HttpServletRequest request) throws IllegalArgumentException, IllegalAccessException;

	public String customerMasterEdit(HttpServletRequest request) throws IllegalArgumentException, IllegalAccessException;

	String newEditTabs(HttpServletRequest request, JSONObject object);

	public String userSearch(HttpServletRequest request);

	public String claimsEdit(HttpServletRequest request);

	public String claimEstimateEdit(String screenCode, String screenName, Integer tranId, HttpServletRequest request);
	
	public String elasticSearch(String document, HttpServletRequest request);

	public String claimBeneficiaryEdit(String screenCode, String screenName, Integer tranId, HttpServletRequest request);

	public String claimChargesEdit(HttpServletRequest request);

	public String claimCheckListEdit(HttpServletRequest request);
	
	public void testLog();

	public String invokeProcedure(String packageName, String procedureName, ProcedureInput procedureInput, HttpServletRequest request);

	public void invokeAsyncProcedure(String packageName, String procedureName, ProcedureInput procedureInput, HttpServletRequest request);

	public String docPrintListEdit(HttpServletRequest request);

	public String docParamListEdit(HttpServletRequest request);

	public String reportBuilderEdit(HttpServletRequest request);
	
	Object convertStringToObject(String value, Class<?> fieldType);
	
	Object dateConverter(String value);
	
	Object dateTimeConverter(String value);

	public String getMapQuery(Integer queryId, QueryParametersDTO queryParams);

}
