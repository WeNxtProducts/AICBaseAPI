package com.aic.base.queryMaster;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.aic.base.commonUtils.CommonService;
import com.aic.base.commonUtils.QUERY_MASTER;
import com.aic.base.commonUtils.QUERY_PARAM_MASTER;
import com.aic.base.emailTemplate.LJM_EMAIL_PARAM;
import com.aic.base.emailTemplate.LJM_EMAIL_TEMPLATE;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class QueryMasterServiceImpl implements QueryMasterServcie {
	
	@Autowired
	private QueryMasterRepo queryMasterRepo;
	
	@Autowired
	private QueryParamMasterRepo queryParamMasterRepo;
	
	@Autowired
	private CommonService commonServiceImpl;
	
	@Value("${spring.success.code}")
	private String successCode;

	@Value("${spring.error.code}")
	private String errorCode;

	@Value("${spring.warning.code}")
	private String warningCode;

	@Value("${spring.message.code}")
	private String messageCode;

	@Value("${spring.status.code}")
	private String statusCode;

	@Value("${spring.data.code}")
	private String dataCode;

	@Override
	public String createQuery(QueryMasterRequest queryMasterRequest) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			QUERY_MASTER queryDetails = new QUERY_MASTER();

			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", queryMasterRequest.getFrontForm().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				setQueryMasterFields(queryDetails, entry.getValue());
			}

			try {
				QUERY_MASTER savedDetails = queryMasterRepo.save(queryDetails);
				response.put(statusCode, successCode);
				response.put(messageCode, "Query Details Saved Successfully");
				data.put("Id", savedDetails.getQM_SYS_ID());
				response.put("data", data);
			} catch (Exception e) {
				response.put("statusCode", errorCode);
				response.put("message", "An error occurred: " + e.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.put("statusCode", errorCode);
			response.put("message", "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}

	private void setQueryMasterFields(QUERY_MASTER queryDetails, Map<String, String> value) throws Exception{
		for (Map.Entry<String, String> entry : value.entrySet()) {
			setQueryMasterField(queryDetails, entry.getKey(), entry.getValue());
		}
	}

	private void setQueryMasterField(QUERY_MASTER queryDetails, String key, String value) throws Exception{
		try {
			Field field = QUERY_MASTER.class.getDeclaredField(key);
			Class<?> fieldType = field.getType();
			Object convertedValue = convertStringToObject(value, fieldType);
			String setterMethodName = "set" + key;
			System.out.println(setterMethodName);
			if (value != null && !value.isEmpty()) {
				Method setter = QUERY_MASTER.class.getMethod(setterMethodName, fieldType);
				setter.invoke(queryDetails, convertedValue);
			}
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}

	private Object convertStringToObject(String value, Class<?> fieldType) {
		if (fieldType.equals(Integer.class) && value.isEmpty() == false && value != null) {
			return Integer.parseInt(value);
		} else if (fieldType.equals(Double.class) && value.isEmpty() == false && value != null) {
			return Double.parseDouble(value);
		} else if (fieldType.equals(Short.class) && value.isEmpty() == false && value != null) {
			return Short.parseShort(value);
		} else if (fieldType.equals(LocalDateTime.class) && value.isEmpty() == false && value != null) {
			return dateTimeConverter(value);
		} else if (fieldType.equals(Date.class) && value.isEmpty() == false && value != null) {
			return dateConverter(value);
		} else {
			return value;
		}
	}

	private Object dateConverter(String value) {
		String dateStr = value;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return date;
	}

	private Object dateTimeConverter(String value) {
		String dateString = value;
		if (value.length() > 10) {
			dateString = value.substring(0, 10);
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalTime defaultTime = LocalTime.of(0, 0, 0);
		LocalDate localDate = LocalDate.parse(dateString, formatter);
		LocalDateTime dateTime = LocalDateTime.of(localDate, defaultTime);
		String formattedDateTime = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

		DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime parsedDateTime = LocalDateTime.parse(formattedDateTime, formatters);
		return parsedDateTime;
	}

	@Override
	public String updateQueryDetails(QueryMasterRequest queryMasterRequest, Integer queryId) {
		JSONObject response = new JSONObject();

		try {
			Optional<QUERY_MASTER> optionalUser = queryMasterRepo.findById(queryId);
			QUERY_MASTER queryDetails = optionalUser.get();
			if (queryDetails != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", queryMasterRequest.getFrontForm().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					setQueryMasterFields(queryDetails, entry.getValue());
				}

				try {
					QUERY_MASTER savedClaimDetails = queryMasterRepo.save(queryDetails);
					response.put(statusCode, successCode);
					response.put(messageCode, "Query Details Updated Successfully");
				} catch (Exception e) {
					response.put("statusCode", errorCode);
					response.put("message", "An error occurred: " + e.getMessage());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.put("statusCode", errorCode);
			response.put("message", "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}

	@Override
	public String deleteQueryDetails(Integer queryId) {
		JSONObject response = new JSONObject();
		try {
			QUERY_MASTER queryDetails = queryMasterRepo.getById(queryId);
			if (queryDetails != null) {
				queryMasterRepo.deleteById(queryId);

				response.put(statusCode, successCode);
				response.put(messageCode, "Query Details Deleted Successfully");
			} else {
				response.put(statusCode, errorCode);
				response.put(messageCode, "No Such Template Exists");
			}
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}
		return response.toString();
	}

	@Override
	public String getQueryDetails(HttpServletRequest request, String screenCode, String screenName, Integer tranId) {
		JSONObject response = new JSONObject();
		String result = null;
		try {
			QUERY_MASTER queryDetails = queryMasterRepo.getById(tranId);
			if (queryDetails != null) {
				response.put(statusCode, successCode);
				response.put(messageCode, "Query Details Fetched Successfully");
				 ObjectMapper mapper = new ObjectMapper();
				  Map<String, Object> templateData = mapper.convertValue(queryDetails, Map.class);
				  System.out.println(templateData);  
				  JSONObject getObject = new JSONObject(templateData);
				  
				  result = commonServiceImpl.newEditTabs(request, getObject);
				  
				response.put(dataCode, templateData);
			} else {
				response.put(statusCode, errorCode);
				response.put(messageCode, "No Such Template Exists");
			}
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String createQueryParam(QueryMasterRequest queryMasterRequest, Integer queryId) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			QUERY_PARAM_MASTER queryParam = new QUERY_PARAM_MASTER();

			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", queryMasterRequest.getQueryParams().getFormFields());
			fieldMaps.get("frontForm").put("QPM_QM_SYS_ID", queryId.toString());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				setQueryParamFields(queryParam, entry.getValue());
			}

			try {
				QUERY_PARAM_MASTER savedQueryParam = queryParamMasterRepo.save(queryParam);
				response.put(statusCode, successCode);
				response.put(messageCode, "Query Param Details Saved Successfully");
				data.put("Id", savedQueryParam.getQPM_SYS_ID());
				response.put("data", data);
			} catch (Exception e) {
				response.put("statusCode", errorCode);
				response.put("message", "An error occurred: " + e.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.put("statusCode", errorCode);
			response.put("message", "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}

	private void setQueryParamFields(QUERY_PARAM_MASTER queryParam, Map<String, String> value) throws Exception{
		for (Map.Entry<String, String> entry : value.entrySet()) {
			setQueryParamField(queryParam, entry.getKey(), entry.getValue());
		}
	}

	private void setQueryParamField(QUERY_PARAM_MASTER queryParam, String key, String value) throws Exception{
		System.out.println(key);
		try {
			Field field = QUERY_PARAM_MASTER.class.getDeclaredField(key);
			Class<?> fieldType = field.getType();
			Object convertedValue = null;
			if(fieldType == QUERY_MASTER.class) {
				convertedValue = getForeignObject(value);
			}else {
			convertedValue = convertStringToObject(value, fieldType);
			}
			String setterMethodName = "set" + key;
			if (value != null && !value.isEmpty()) {
				Method setter = QUERY_PARAM_MASTER.class.getMethod(setterMethodName, fieldType);
				setter.invoke(queryParam, convertedValue);
			}
		} catch (NoSuchFieldException e) {
//			e.printStackTrace();
		}
	}

	private Object getForeignObject(String value) {
		QUERY_MASTER template = queryMasterRepo.getById(Integer.parseInt(value));
		return template;
	}

	@Override
	public String updateQueryParam(QueryMasterRequest queryMasterRequest, Integer queryParamId) {
		JSONObject response = new JSONObject();

		try {
//			Integer templateParamId = tempParamId;
			Optional<QUERY_PARAM_MASTER> optionalUser = queryParamMasterRepo.findById(queryParamId);
			QUERY_PARAM_MASTER queryParam = optionalUser.get();
			if (queryParam != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", queryMasterRequest.getQueryParams().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					setQueryParamFields(queryParam, entry.getValue());
				}

				try {
					QUERY_PARAM_MASTER savedParamDetails = queryParamMasterRepo.save(queryParam);
					response.put(statusCode, successCode);
					response.put(messageCode, "Query Param Updated Successfully");
				} catch (Exception e) {
					response.put("statusCode", errorCode);
					response.put("message", "An error occurred: " + e.getMessage());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.put("statusCode", errorCode);
			response.put("message", "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}

	@Override
	public String deleteQueryParam(Integer queryId) {
		JSONObject response = new JSONObject();
		try {
			QUERY_PARAM_MASTER existingTemplate = queryParamMasterRepo.getById(queryId);
			if (existingTemplate != null) {
				queryParamMasterRepo.deleteById(queryId);

				response.put(statusCode, successCode);
				response.put(messageCode, "Query Param Details Deleted Successfully");
			} else {
				response.put(statusCode, errorCode);
				response.put(messageCode, "No Such Query Param Exists");
			}
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}
		return response.toString();
	}

	@Override
	public String getQueryParam(HttpServletRequest request, String screenCode, String screenName, Integer tranId) {
		JSONObject response = new JSONObject();
		String result = null;
		try {
			QUERY_PARAM_MASTER existingTemplate = queryParamMasterRepo.getById(tranId);
			if (existingTemplate != null) {
				response.put(statusCode, successCode);
				response.put(messageCode, "Query Param Details Fetched Successfully");
				 ObjectMapper mapper = new ObjectMapper();
				  Map<String, Object> templateData = mapper.convertValue(existingTemplate, Map.class);
//				  
//				  if(existingTemplate.getQPM_PARAM_TYPE().equals("Q")) {
//					  QUERY_MASTER query = commonDao.getQueryLov(Integer.parseInt(existingTemplate.getEP_VALUE()));
//					  templateData.put("EP_QUERY", query.getQM_QUERY());
//				  }
				  
				  JSONObject getObject = new JSONObject(templateData);
				  
				  result = commonServiceImpl.newEditTabs(request, getObject);
				  
				response.put(dataCode, templateData);
			} else {
				response.put(statusCode, errorCode);
				response.put(messageCode, "No Such Query Param Exists");
			}
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
			e.printStackTrace();
		}
		return result;
	}
	
	

}
