package com.aic.base.commonUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.http.HttpHost;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.aic.base.users.LM_MENU_USERS;
import com.aic.base.users.UserIndex;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.UserAgent;
import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class CommonServiceImpl implements CommonService {

	@Autowired
	private AppAuditRepository auditRepo;

	@Autowired
	private AppExceptionRepository exceptionRepo;

	@Autowired
	private CommonDao commonDao;

	@Value("${insert.audit.log}")
	private String saveAuditMessage;

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

	@Value("${spring.project.basePath}")
	private String basePath;

	@Value("${spring.crud.url}")
	private String baseCrudPath;

	@Value("${spring.project.baseUrl}")
	private String getBaseURL;

	@Value("${get.audit.log}")
	private String getAuditMessage;

	@Value("${get.audit.empty}")
	private String getEmptyAuditMessage;

	@Value("${insert.exception.details}")
	private String insertExceptionMessage;

	@Value("${get.exception.details}")
	private String getExceptionMessage;

	@Value("${get.exception.empty}")
	private String getExceptionEmptyMessage;

	@Value("${spring.lov.worngid}")
	private String getLovWrongId;

	@Value("${get.user.byId}")
	private String getUserById;

	@Value("${spring.service.to.json}")
	private String serviceToJSON;

	@Value("${spring.lov.to.json}")
	private String LOVtoJSON;

	@Override
	public String insertAudit(APP_AUDIT auditModel) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();
		try {
			InetAddress localHost = InetAddress.getLocalHost();
			String hostName = localHost.getHostName();
			String ipAddress = localHost.getHostAddress();

			String userAgentString = "User-Agent";

			UserAgent userAgent = UserAgent.parseUserAgentString(userAgentString);

			Browser browser = userAgent.getBrowser();

			String browserName = browser.getName();

			auditModel.setAAD_Host_Info(hostName + ", " + ipAddress + ", " + browserName);
			auditModel.setAAD_Cr_Date(LocalDateTime.now());
		} catch (Exception e) {
			e.printStackTrace();
		}
		APP_AUDIT savedModel = auditRepo.save(auditModel);
		response.put(statusCode, successCode);
		response.put(messageCode, saveAuditMessage);
		data.put("Id", savedModel.getAAD_Id());
		response.put(dataCode, data);

		return response.toString();
	}

	@Override
	public String getAuditByUserAndScreen(APP_AUDIT auditModel) {
		JSONObject response = new JSONObject();
		List<APP_AUDIT> list = auditRepo.findBy_AAD_User_IdAnd_AAD_Screen_Name(auditModel.getAAD_User_Id(),
				auditModel.getAAD_Screen_Name());
		if (list.size() > 0) {
			response.put(statusCode, successCode);
			response.put(messageCode, getAuditMessage);
			response.put(dataCode, list);
		} else {
			response.put(statusCode, successCode);
			response.put(messageCode, getEmptyAuditMessage);
		}

		return response.toString();
	}

	public String insertException(ExceptionDTO exceptionDTO) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();
		try {
			APP_EXCEPTIONS exceptionEntity = new APP_EXCEPTIONS();
			exceptionEntity.setScreenName(exceptionDTO.getScreenName());
			exceptionEntity.setServiceName(exceptionDTO.getServiceName());
			exceptionEntity.setUserID(exceptionDTO.getUserID());
			exceptionEntity.setTransactionNumber(exceptionDTO.getTransactionNumber());
			exceptionEntity.setFileOrModuleName(exceptionDTO.getFileOrModuleName());
			exceptionEntity.setExceptionMessage(exceptionDTO.getExceptionMessage());

			LocalDateTime currentDateTime = LocalDateTime.now();
			exceptionEntity.setDateTime(currentDateTime.toString());

			String hostInfo = "";
			try {
				InetAddress localhost = InetAddress.getLocalHost();
				String hostname = localhost.getHostName();
				String ipAddress = localhost.getHostAddress();

				String userAgentString = "User-Agent";

				UserAgent userAgent = UserAgent.parseUserAgentString(userAgentString);

				Browser browser = userAgent.getBrowser();

				String browserName = browser.getName();

				hostInfo = hostname + "," + ipAddress + "," + browserName;
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}

			exceptionEntity.setHostInfo(hostInfo);

			APP_EXCEPTIONS app = exceptionRepo.save(exceptionEntity);

			response.put(statusCode, successCode);
			response.put(messageCode, insertExceptionMessage);
			data.put("Id", app.getSno());
			response.put(dataCode, data);

			return response.toString();
		} catch (Exception e) {
			response.put(statusCode, warningCode);
			response.put(messageCode, e.getMessage());
			return response.toString();
		}
	}

	public String getAllExceptions() {
		JSONObject response = new JSONObject();
		List<APP_EXCEPTIONS> resultList = exceptionRepo.findAll();
		if (resultList.size() > 0) {
			response.put(statusCode, successCode);
			response.put(messageCode, getExceptionMessage);
			response.put(dataCode, resultList);
			return response.toString();
		}
		response.put(statusCode, errorCode);
		response.put(messageCode, getExceptionEmptyMessage);
		return response.toString();
	}

	@Override
	public String getMenuList(String groupId, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		QUERY_MASTER query = commonDao.getQueryLov(14);
		List<MenuResultDTO> list = (List<MenuResultDTO>) commonDao.getMenuList(groupId, query.getQM_QUERY());
		List<MenuResultDTO> finalResult = new ArrayList<>();
		List<MenuResultDTO> child = new ArrayList<>();
		QUERY_MASTER childQuery = commonDao.getQueryLov(15);
		if (list.size() >= 1) {
			response.put(statusCode, successCode);
			response.put(messageCode, "Menu List Fetched Successfully");
			for (MenuResultDTO data : list) {
				if (data.getMenuParentId().equals("*")) {
					child = (List<MenuResultDTO>) commonDao.getChildMenuList(data.getMenuId(), groupId,
							childQuery.getQM_QUERY());
					if (child.size() >= 1) {
						data.setChildrens(child);
						finalResult.add(data);
					} else {
						finalResult.add(data);
					}
				}
			}
			response.put("Data", finalResult);
		}
		return response.toString();
	}

	@Override
	public String getQueryLOV(HttpServletRequest request) {
		Map<String, Object> params = processParamLOV(null, request);
		/*
		 * Getting query Id From the query string in a variable and removing it from
		 * params map
		 */
		int queryId = Integer.parseInt(((String) params.get("queryId")));
		params.remove("queryId");
		JSONObject response = new JSONObject();
		QUERY_MASTER query = commonDao.getQueryLov(queryId);
		if (query != null) {
			if (query.getQM_QUERY_TYPE().equals("lov")) {
				List<LOVDTO> queryResult = commonDao.executeLOVQuery(query.getQM_QUERY(), new HashMap());
				response.put(statusCode, successCode);
				response.put(dataCode, queryResult);
			} else if (query.getQM_QUERY_TYPE().equals("paramlov")) {
				/*
				 * getting parameters for the query if it is of type paramlov and processing it
				 * to a map
				 */
				List<QUERY_PARAM_MASTER> queryParams = commonDao.getQueryParams(query.getQM_SYS_ID());
				Map<String, Object> paramsMap = processParamLOV(queryParams, request);
				paramsMap.remove("queryId");
				List<LOVDTO> queryResult = commonDao.executeLOVQuery(query.getQM_QUERY(), paramsMap);
				response.put(statusCode, successCode);
				response.put(dataCode, queryResult);
			}
		} else {
			response.put(statusCode, errorCode);
			response.put(messageCode, getLovWrongId);
		}
		return response.toString();
	}

	private Map<String, Object> processParamLOV(List<QUERY_PARAM_MASTER> queryParams, HttpServletRequest request) {
		Map<String, Object> parameters = new HashMap<>();
		Map<String, Object> parameteres = new HashMap<>();
		if (queryParams != null) {
			for (QUERY_PARAM_MASTER params : queryParams) {
				if (params.getQPM_PARAM_TYPE().equals("S")) {
					parameters.put(params.getQPM_PARAM_NAME(), params.getQPM_PARAM_VALUE());
				} else if (params.getQPM_PARAM_TYPE().equals("P")) {
					String queryString = request.getQueryString();
					if (queryString != null) {
						int i=0;
						for (String keyValue : queryString.split("&")) {
							String[] parts = keyValue.split("=");
							if (parts.length == 2 && !parts[0].equals("queryId")) {
								parameters.put(queryParams.get(i).getQPM_PARAM_NAME(), parts[1]);
								i++;
							}
						}
//						int i = 0;
//						for (String keyValue : queryString.split("&")) {
//							String[] parts = keyValue.split("=");
//							if (parts.length == 2 && !parts[0].equals("queryId")) {
//								parameteres.put(queryParams.get(i).getQPM_PARAM_NAME(), parameters.get(queryParams.get(i).getQPM_PARAM_NAME()));
//								i++;
//							}
//						}
					}
					return parameters;
				}
			}
		} else {
			String queryString = request.getQueryString();
			if (queryString != null) {
				for (String keyValue : queryString.split("&")) {
					String[] parts = keyValue.split("=");
					if (parts.length == 2) {
						parameters.put(parts[0], parts[1]);
					}
				}
			}
			return parameters;
		}
		return parameters;
	}

	@Override
	public String getQueryParamLOV(HttpServletRequest request) {
		Map<String, Object> params = processParamLOV(null, request);
		int queryId = Integer.parseInt(((String) params.get("queryId")));
		params.remove("queryId");
		JSONObject response = new JSONObject();
		QUERY_MASTER query = commonDao.getQueryLov(queryId);
		if (query != null) {
			if (query.getQM_QUERY_TYPE().equals("lov")) {
				List<LOVDTO> queryResult = commonDao.executeLOVQuery(query.getQM_QUERY(), new HashMap());
				response.put(statusCode, successCode);
				response.put(dataCode, queryResult);
			} else if (query.getQM_QUERY_TYPE().equals("paramlov")) {
				List<QUERY_PARAM_MASTER> queryParams = commonDao.getQueryParams(query.getQM_SYS_ID());
				Map<String, Object> paramsMap = processParamLOV(queryParams, request);
				paramsMap.remove("queryId");
				List<LOVDTO> queryResult = commonDao.executeLOVQuery(query.getQM_QUERY(), paramsMap);
				response.put(statusCode, successCode);
				response.put(dataCode, queryResult);
			}
		} else {
			response.put(statusCode, errorCode);
			response.put(messageCode, getLovWrongId);
		}
		return response.toString();
	}

	@Override
	public String getListingData(HttpServletRequest request) {
		JSONObject response = new JSONObject();
		Map<String, Object> params = processParamLOV(null, request);
		int queryId = Integer.parseInt(((String) params.get("queryId")));
		params.remove("queryId");
		Integer limit = Integer.parseInt(((String) params.get("limit")));
		Integer offset = Integer.parseInt(((String) params.get("offset")));
		params.remove("limit");
		params.remove("offset");
		QUERY_MASTER query = commonDao.getQueryLov(queryId);
		if (query != null) {
			List<Map<String, Object>> queryResult = commonDao.getListingData(query.getQM_QUERY(), offset, limit);
			Map<String, Object> firstRow = queryResult.get(0);
			Set<String> columnNames = firstRow.keySet();
			LinkedHashMap<String, String> heading = new LinkedHashMap<String, String>();
			String headString = (String) firstRow.get("Head");

			String[] headingNames = headString.split(",");

			for (String headingName : headingNames) {
				heading.put(headingName.trim(), headingName.trim());
			}
			queryResult.get(0).remove("Head");
			ObjectMapper objectMapper = new ObjectMapper();
			String jsonString = "";
			try {
				jsonString = objectMapper.writeValueAsString(heading);
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
			JSONObject headingJson = new JSONObject(jsonString);
			response.put("Heading", jsonString);
			response.put("count", queryResult.get(0).get("count"));
			response.put(statusCode, successCode);
			response.put(dataCode, queryResult);
		} else {
			response.put(statusCode, errorCode);
			response.put(messageCode, getLovWrongId);
		}
		return response.toString();
	}

	@Override
	@Async
	public void asyncMethod(AsyncDTO object, HttpServletRequest request) {

		service_url_mapping urlData = commonDao.getUrlData(object);

		RestTemplate restTemplate = new RestTemplate();
		String url = getBaseURL + urlData.getserv_url();
		String jsonString = object.getObject();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> requestEntity = new HttpEntity<>(jsonString, headers);
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			String response = responseEntity.getBody();
		} else {
			throw new UsernameNotFoundException("JUST CHECK");
		}
	}

	@Override
	public void syncMethod(AsyncDTO inputRequest, HttpServletRequest request) {
		service_url_mapping urlData = commonDao.getUrlData(inputRequest);

		RestTemplate restTemplate = new RestTemplate();
		String url = getBaseURL + urlData.getserv_url();
		String jsonString = inputRequest.getObject();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> requestEntity = new HttpEntity<>(jsonString, headers);
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);

		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			String response = responseEntity.getBody();
		} else {
			throw new UsernameNotFoundException("JUST CHECK");
		}
	}

	@Override
	public String getMrvListing(HttpServletRequest request) {
		JSONObject response = new JSONObject();
		Map<String, Object> parames = processParamLOV(null, request);
		int queryId = Integer.parseInt(((String) parames.get("queryId")));
		parames.remove("queryId");
		QUERY_MASTER query = commonDao.getQueryLov(queryId);
		List<QUERY_PARAM_MASTER> queryParams = commonDao.getQueryParams(query.getQM_SYS_ID());
		Map<String, Object> parameters = new HashMap<>();

		Map<String, Object> parameterss = processParamLOV(null, request);
		for (QUERY_PARAM_MASTER params : queryParams) {
			if (params.getQPM_PARAM_TYPE().equals("S")) {
				parameters.put(params.getQPM_PARAM_NAME(), params.getQPM_PARAM_VALUE());
			} else if (params.getQPM_PARAM_TYPE().equals("P")) {
				if (parameterss.get(params.getQPM_PARAM_NAME()) != null) {
					parameters.put(params.getQPM_PARAM_NAME(), parameterss.get(params.getQPM_PARAM_NAME()));
				} else {
					parameters.put(params.getQPM_PARAM_NAME(), null);
				}
			}
		}
		List<Map<String, Object>> queryResult = commonDao.getMrvListing(query.getQM_QUERY(), parames);
		Map<String, Object> firstRow = queryResult.get(0);
		Set<String> columnNames = firstRow.keySet();
		LinkedHashMap<String, String> heading = new LinkedHashMap<String, String>();
		String headString = (String) firstRow.get("Head");

		String[] headingNames = headString.split(",");

		for (String headingName : headingNames) {
			heading.put(headingName.trim(), headingName.trim());
		}
		queryResult.get(0).remove("Head");
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonString = "";
		try {
			jsonString = objectMapper.writeValueAsString(heading);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		JSONObject headingJson = new JSONObject(jsonString);
		response.put("Heading", jsonString);
		response.put(statusCode, successCode);
		response.put(dataCode, queryResult);

		return response.toString();
	}

	@Override
	public void saveFieldDefJson(HttpServletRequest request) {
		String filePath = "D:\\newFile.txt";

		File file = new File(filePath);
		file.getParentFile().mkdirs();

		try {
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			RestTemplate restTemplate = new RestTemplate();
			String url = "http://localhost:8098/common/getfield?screenCode=USERMASTER&screenName=USERCREATE&mucd_user_id=ADMIN";
			ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
			if (responseEntity.getStatusCode() == HttpStatus.OK) {
				String serviceResponse = responseEntity.getBody();
				bufferedWriter.write(serviceResponse);
			} else {
				throw new UsernameNotFoundException("JUST CHECK");
			}

			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String serviceToJson(HttpServletRequest request) {
		AsyncDTO input = new AsyncDTO();
		JSONObject response = new JSONObject();

		Map<String, Object> params = processParamLOV(null, request);
		input.setScreenCode((String) params.get("screenCode"));
		input.setScreenName((String) params.get("screenName"));
		input.setServiceName((String) params.get("serviceName"));

		service_url_mapping object = commonDao.getUrlData(input);
		String filePath = object.getserv_response() + object.getserv_screen_name() + "_" + object.getserv_type()
				+ ".json";

		File file = new File(filePath);
		file.getParentFile().mkdirs();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();

		try {
			PrintWriter writer = new PrintWriter(file);
			writer.print("");
			writer.close();
			FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			RestTemplate restTemplate = new RestTemplate();
			JSONObject jsonObject = new JSONObject();
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("Authorization", "Bearer " + token);
			HttpEntity<String> requestEntity = new HttpEntity<>(jsonObject.toString(), headers);
			String url = getBaseURL + object.getserv_url() + "?" + "screenCode=" + params.get("screenCode")
					+ "&screenName=" + params.get("screenName");
			ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
			if (responseEntity.getStatusCode() == HttpStatus.OK) {
				String serviceResponse = responseEntity.getBody();
				bufferedWriter.write(serviceResponse);
				response.put(statusCode, successCode);
				response.put(messageCode, serviceToJSON);
				bufferedWriter.close();
				return response.toString();
			} else {
				response.put(statusCode, errorCode);
				return response.toString();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response.toString();
	}

	@Override
	public String lovToJson(HttpServletRequest request) {
		JSONObject response = new JSONObject();
		Map<String, Object> params = processParamLOV(null, request);
		Map<String, List<LOVDTO>> resultMap = new HashMap<>();

		String file_path = basePath + params.get("screenName") + "_getLOVList.json";
		QUERY_MASTER query = commonDao.getQueryLov(18);
		if (query != null) {
			List<LovToJsonDTO> result = commonDao.lovToJson(query.getQM_QUERY(), params.get("screenCode").toString(),
					params.get("screenName").toString());
			for (LovToJsonDTO item : result) {
				resultMap.put(item.getColumnName(), commonDao.executeLOVQuery(item.getQuery(), null));
			}
			try {
				File file = new File(file_path);
				file.getParentFile().mkdirs();
				FileWriter fileWriter = new FileWriter(file);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				response.put(statusCode, successCode);
				response.put(messageCode, LOVtoJSON);
				response.put("Result", resultMap);
				bufferedWriter.write(response.get("Result").toString());
				bufferedWriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			response.remove("Result");
			return response.toString();
		} else {
			response.put(statusCode, errorCode);
			return response.toString();
		}

	}

	@Override
	public String quotationEdit(HttpServletRequest request)
			throws SecurityException, IllegalArgumentException, IllegalAccessException {

		Map<String, Object> parametermap = processParamLOV(null, request);
		JSONObject inputObject = new JSONObject();
		lt_policy object = commonDao.getQuotationFields(parametermap.get("screenCode").toString(),
				parametermap.get("screenName").toString(), parametermap.get("tranId"));
		for (int i = 0; i < object.getClass().getDeclaredFields().length; i++) {
			Field field = object.getClass().getDeclaredFields()[i];
			field.setAccessible(true);
			String columnName = null;
			if (field.isAnnotationPresent(Column.class)) {
				Annotation annotation = field.getAnnotation(Column.class);
				Column column = (Column) annotation;
				Object value = field.get(object);
				columnName = column.name();
				inputObject.put(columnName, value);
			}
		}

		return newEditTabs(request, inputObject);
	}

	@Override
	public String userMasterEdit(HttpServletRequest request) throws IllegalArgumentException, IllegalAccessException {

		Map<String, Object> parametermap = processParamLOV(null, request);
		JSONObject inputObject = new JSONObject();
		LM_MENU_USERS object = commonDao.getUserFields(parametermap.get("screenCode").toString(),
				parametermap.get("screenName").toString(), parametermap.get("tranId"));
		for (int i = 0; i < object.getClass().getDeclaredFields().length; i++) {
			Field field = object.getClass().getDeclaredFields()[i];
			field.setAccessible(true);
			String columnName = null;
			if (field.isAnnotationPresent(Column.class)) {
				Annotation annotation = field.getAnnotation(Column.class);
				Column column = (Column) annotation;
				Object value = field.get(object);
				columnName = column.name();
				inputObject.put(columnName, value);
			}
		}
		return newEditTabs(request, inputObject);
	}

	@Override
	public String customerMasterEdit(HttpServletRequest request)
			throws IllegalArgumentException, IllegalAccessException {

		Map<String, Object> parametermap = processParamLOV(null, request);
		JSONObject inputObject = new JSONObject();
		LM_CUSTOMER object = commonDao.getCustomerFields(parametermap.get("screenCode").toString(),
				parametermap.get("screenName").toString(), parametermap.get("tranId"));
		for (int i = 0; i < object.getClass().getDeclaredFields().length; i++) {
			Field field = object.getClass().getDeclaredFields()[i];
			field.setAccessible(true);
			String columnName = null;
			if (field.isAnnotationPresent(Column.class)) {
				Annotation annotation = field.getAnnotation(Column.class);
				Column column = (Column) annotation;
				Object value = field.get(object);
				columnName = column.name();
				inputObject.put(columnName, value);
			}
		}
		return newEditTabs(request, inputObject);
	}

	@Override
	public String newEditTabs(HttpServletRequest request, JSONObject object) {
		JSONObject response = new JSONObject();
		JSONObject headerInfo = new JSONObject();
		JSONObject staticDetailsFormFields = new JSONObject();
		JSONObject frontFormFields = new JSONObject();
		JSONObject accordions = new JSONObject();
		JSONObject accordionTabs = new JSONObject();
		Character isEditFlag = 'N';
		boolean JSONempty = object.isEmpty();
		Map<String, Object> parametermap = processParamLOV(null, request);

		QUERY_MASTER exeQuery = commonDao.getQueryLov(16);
		JSONObject accordionResponse = new JSONObject();

		List<LM_PROG_FIELD_DEFN_NEW> listOfFields = commonDao.getFieldList(parametermap.get("screenCode").toString(),
				parametermap.get("screenName").toString(), exeQuery.getQM_QUERY());
		if (JSONempty == true) {
			Map<String, Object> headerFieldsMap = listOfFields.stream()
					.filter(item -> item.getPFD_FORM_ITEM_TYPE1().equals("HeaderInfo"))
					.collect(Collectors.toMap(LM_PROG_FIELD_DEFN_NEW::getPFD_COLUMN_NAME, Function.identity()));
			headerInfo.put("formFields", headerFieldsMap);
			response.put("headerInfo", headerInfo);

			Map<String, Object> staticFieldsMap = listOfFields.stream()
					.filter(item -> item.getPFD_FORM_ITEM_TYPE1().equals("StaticDetails"))
					.collect(Collectors.toMap(LM_PROG_FIELD_DEFN_NEW::getPFD_COLUMN_NAME, Function.identity()));

			staticDetailsFormFields.put("formFields", staticFieldsMap);
			response.put("staticDetails", staticDetailsFormFields);

			Map<String, Object> frontFormMap = listOfFields.stream().peek(i -> {
				if (i.getPFD_FORM_ITEM_TYPE1().equals("FrontForm")) {
					frontFormFields.put("Label", i.getPFD_FLD_NAME());
				}
			}).filter(item -> item.getPFD_FORM_ITEM_TYPE1().equals("FrontFormField"))
					.collect(Collectors.toMap(LM_PROG_FIELD_DEFN_NEW::getPFD_COLUMN_NAME, Function.identity()));
			frontFormFields.put("formFields", frontFormMap);
			response.put("frontForm", frontFormFields);
		} else {
			Map<String, Object> headerFieldsMap = listOfFields.stream().peek(item -> {
				if (object.has(item.getPFD_COLUMN_NAME()) && item.getPFD_FORM_ITEM_TYPE1().equals("HeaderInfo")) {
					item.setPFD_FLD_VALUE(object.get(item.getPFD_COLUMN_NAME()));
				}
			}).filter(item -> item.getPFD_FORM_ITEM_TYPE1().equals("HeaderInfo"))
					.collect(Collectors.toMap(LM_PROG_FIELD_DEFN_NEW::getPFD_COLUMN_NAME, Function.identity()));
			headerInfo.put("formFields", headerFieldsMap);
			response.put("headerInfo", headerInfo);

			Map<String, Object> staticFieldsMap = listOfFields.stream().peek(item -> {
				if (object.has(item.getPFD_COLUMN_NAME()) && item.getPFD_FORM_ITEM_TYPE1().equals("StaticDetails")) {
					item.setPFD_FLD_VALUE(object.get(item.getPFD_COLUMN_NAME()));
				}
			}).filter(item -> item.getPFD_FORM_ITEM_TYPE1().equals("StaticDetails"))
					.collect(Collectors.toMap(LM_PROG_FIELD_DEFN_NEW::getPFD_COLUMN_NAME, Function.identity()));

			staticDetailsFormFields.put("formFields", staticFieldsMap);
			response.put("static_Details", staticDetailsFormFields);

			Map<String, Object> frontFormMap = listOfFields.stream().peek(i -> {
				if (object.has(i.getPFD_COLUMN_NAME())) {
					i.setPFD_FLD_VALUE(object.get(i.getPFD_COLUMN_NAME()));
				}
				if (i.getPFD_FORM_ITEM_TYPE1().equals("FrontForm")) {
					frontFormFields.put("Label", i.getPFD_FLD_NAME());
				}
			}).filter(item -> item.getPFD_FORM_ITEM_TYPE1().equals("FrontFormField"))
					.collect(Collectors.toMap(LM_PROG_FIELD_DEFN_NEW::getPFD_COLUMN_NAME, Function.identity()));
			frontFormFields.put("formFields", frontFormMap);
			response.put("frontForm", frontFormFields);
		}

		List<LM_PROG_FIELD_DEFN_NEW> listOfAccTabFields = listOfFields.stream()
				.filter(item -> item.getPFD_FORM_ITEM_TYPE1().equals("AccordionHeader")
						|| item.getPFD_FORM_ITEM_TYPE1().equals("AccordionTab"))
				.collect(Collectors.toList());
		for (int i = 0; i < listOfAccTabFields.size(); i++) {
			int k = i;
			if (JSONempty == true) {
				if (listOfAccTabFields.get(i).getPFD_FORM_ITEM_TYPE1().equals("AccordionHeader")) {
					accordions = new JSONObject();
					Map<String, Object> accordionFieldsMap = listOfFields.stream()
							.filter(item -> item.getPFD_FORM_ITEM_TYPE2() != null
									&& item.getPFD_FORM_ITEM_TYPE2().equals(listOfAccTabFields.get(k).getPFD_FLD_NAME())
									&& !item.getPFD_FORM_ITEM_TYPE1().equals("AccordionTab"))
							.collect(Collectors.toMap(LM_PROG_FIELD_DEFN_NEW::getPFD_COLUMN_NAME, Function.identity()));
					accordions.put("Label", listOfAccTabFields.get(i).getPFD_FLD_NAME());
					accordions.put("formFields", accordionFieldsMap);
					response.put(listOfAccTabFields.get(i).getPFD_FLD_NAME(), accordions);
				} else if (listOfAccTabFields.get(i).getPFD_FORM_ITEM_TYPE1().equals("AccordionTab")) {
					accordionTabs = new JSONObject();
					Map<String, Object> accordionTabsMap = listOfFields.stream()
							.filter(item -> item.getPFD_FORM_ITEM_TYPE2() != null
									&& item.getPFD_FORM_ITEM_TYPE2().equals(listOfAccTabFields.get(k).getPFD_FLD_NAME())
									&& !item.getPFD_FORM_ITEM_TYPE1().equals("AccordionTab"))
							.collect(Collectors.toMap(LM_PROG_FIELD_DEFN_NEW::getPFD_COLUMN_NAME, Function.identity()));
					accordionTabs.put("Label", listOfAccTabFields.get(i).getPFD_FLD_NAME());
					accordionTabs.put("formFields", accordionTabsMap);
					response.put(listOfAccTabFields.get(i).getPFD_FLD_NAME(), accordionTabs);
				}
			} else {
				if (listOfAccTabFields.get(i).getPFD_FORM_ITEM_TYPE1().equals("AccordionHeader")) {
					accordions = new JSONObject();
					List<LM_PROG_FIELD_DEFN_NEW> accordionFieldsMap = listOfFields.stream()
							.filter(item -> item.getPFD_FORM_ITEM_TYPE2() != null
									&& item.getPFD_FORM_ITEM_TYPE2().equals(listOfAccTabFields.get(k).getPFD_FLD_NAME())
									&& !item.getPFD_FORM_ITEM_TYPE1().equals("AccordionTab"))
							.collect(Collectors.toList());
					Map<String, Object> accordFieldsMap = accordionFieldsMap.stream().peek(item -> {
						if (object.has(item.getPFD_COLUMN_NAME())) {
							item.setPFD_FLD_VALUE(object.get(item.getPFD_COLUMN_NAME()));

						}
					}).collect(Collectors.toMap(LM_PROG_FIELD_DEFN_NEW::getPFD_COLUMN_NAME, Function.identity()));
					accordions.put("Label", listOfAccTabFields.get(i).getPFD_FLD_NAME());
					accordions.put("formFields", accordFieldsMap);
					response.put(listOfAccTabFields.get(i).getPFD_FLD_NAME(), accordions);
				} else if (listOfAccTabFields.get(i).getPFD_FORM_ITEM_TYPE1().equals("AccordionTab")) {
					accordionTabs = new JSONObject();
					List<LM_PROG_FIELD_DEFN_NEW> accordionTabsMap = listOfFields.stream()
							.filter(item -> item.getPFD_FORM_ITEM_TYPE2() != null
									&& item.getPFD_FORM_ITEM_TYPE2().equals(listOfAccTabFields.get(k).getPFD_FLD_NAME())
									&& !item.getPFD_FORM_ITEM_TYPE1().equals("AccordionTab"))
							.collect(Collectors.toList());
					Map<String, Object> accordTabsMap = accordionTabsMap.stream().peek(item -> {
						if (object.has(item.getPFD_COLUMN_NAME())) {
							item.setPFD_FLD_VALUE(object.get(item.getPFD_COLUMN_NAME()));
						}
					}).collect(Collectors.toMap(LM_PROG_FIELD_DEFN_NEW::getPFD_COLUMN_NAME, Function.identity()));
					accordionTabs.put("Label", listOfAccTabFields.get(i).getPFD_FLD_NAME());
					accordionTabs.put("formFields", accordTabsMap);
					response.put(listOfAccTabFields.get(i).getPFD_FLD_NAME(), accordionTabs);
				}
			}
		}

		List<MRVKeyValue> mrvFetch = commonDao.getMrvFetchList(parametermap.get("screenName"));
		response.put("mrvListingId", mrvFetch);
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);

		return response.toString();
	}

	@Override
	public String userSearch(HttpServletRequest request) {
		
		String documentName = "users";
		
		return elasticSearch(documentName, request);
		
	}

	@Override
	public String claimsEdit(HttpServletRequest request) {
		JSONObject response = new JSONObject();
		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		Map<String, Object> params = processParamLOV(null, request);
		String url = baseCrudPath + "/ltclaim/getltclaimByid?claim_TRAN_id=" + params.get("tranId");
		HttpHeaders headers = new HttpHeaders();
		RestTemplate restTemplate = new RestTemplate();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Bearer " + token);
		HttpEntity<String> requestEntity = new HttpEntity<>(headers);
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
		JSONObject object = new JSONObject(responseEntity.getBody());
		return newEditTabs(request, object);
	}

	@Override
	public String claimEstimateEdit(HttpServletRequest request) {
		JSONObject response = new JSONObject();
		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		Map<String, Object> params = processParamLOV(null, request);
		String url = baseCrudPath + "claimest/getclaimestByid?ce_TRAN_id=" + params.get("tranId");
		HttpHeaders headers = new HttpHeaders();
		RestTemplate restTemplate = new RestTemplate();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Bearer " + token);
		HttpEntity<String> requestEntity = new HttpEntity<>(headers);
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
		JSONObject object = new JSONObject(responseEntity.getBody());

		JSONObject obj = new JSONObject(newEditTabs(request, object));
		response.put(statusCode, successCode);
		response.put(messageCode, "Claim estimate Details Fetched Successfully");
		response.put(dataCode, obj);
		return response.toString();
	}

	@Override
	public String elasticSearch(String document, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		Map<String, Object> params = processParamLOV(null, request);
		RestClientBuilder builder = RestClient.builder(new HttpHost("192.168.1.150", 9200, "http"));
		RestHighLevelClient client = new RestHighLevelClient(builder);
		ObjectMapper mapper = new ObjectMapper();

		SearchRequest req = new SearchRequest(document);
		SearchSourceBuilder builders = new SearchSourceBuilder();
		builders.query(
				QueryBuilders.boolQuery().should(QueryBuilders.multiMatchQuery(params.get("searchText")).field("*"))
						.should(QueryBuilders.queryStringQuery("*" + params.get("searchText") + "*")));
		builders.size(Integer.parseInt(params.get("limit").toString()));
		builders.from(Integer.parseInt(params.get("offset").toString()));
		req.source(builders);
		QUERY_MASTER query = commonDao.getQueryLov(4);
		List<Map<String, Object>> queryResult = commonDao.getListingData(query.getQM_QUERY(),
				Integer.parseInt(params.get("limit").toString()), Integer.parseInt(params.get("offset").toString()));
		List<Map<String, Object>> finalResult = new ArrayList<>();
		Map<String, Object> finalMap = new HashMap<>();
		LinkedHashMap<String, String> heading = new LinkedHashMap<String, String>();
		String jsonString = "";
		try {
			SearchResponse searchResponse = client.search(req, RequestOptions.DEFAULT);
			SearchHit[] searchHits = searchResponse.getHits().getHits();
			UserIndex user = new UserIndex();
			Class classs = user.getClass();
			Map<String, Object> firstRow = queryResult.get(0);
			Set<String> columnNames = firstRow.keySet();
			String headString = (String) firstRow.get("Head");

			String[] headingNames = headString.split(",");
			for (String headingName : headingNames) {
				heading.put(headingName.trim(), headingName.trim());
			}
			jsonString = mapper.writeValueAsString(heading);
			for (SearchHit hit : searchHits) {
				finalMap = new HashMap<>();
				user = new UserIndex();
				mapper.registerModule(new JavaTimeModule());
				String documentId = hit.getId();
				String sourceAsString = hit.getSourceAsString();
				user = mapper.readValue(sourceAsString, UserIndex.class);
				for (String headings : headingNames) {
					String setterMethodName = "get" + headings.substring(0, 1).toUpperCase().trim()
							+ headings.substring(1, headings.length());
					Method setter = classs.getMethod(setterMethodName);
					Object value = setter.invoke(user);
					finalMap.put(headings.trim(), value);
				}
				finalResult.add(finalMap);
			}
			response.put("Count", searchHits.length);
			response.put("Heading", jsonString);
			response.put(statusCode, successCode);
			response.put(dataCode, finalResult);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response.toString();
	}

	@Override
	public String claimBeneficiaryEdit(HttpServletRequest request) {
		JSONObject response = new JSONObject();
		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		Map<String, Object> params = processParamLOV(null, request);
		String url = baseCrudPath + "claimBfcry/getltclaimBfcryByid?cben_pben_TRAN_id=" + params.get("tranId");
		HttpHeaders headers = new HttpHeaders();
		RestTemplate restTemplate = new RestTemplate();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Bearer " + token);
		HttpEntity<String> requestEntity = new HttpEntity<>(headers);
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
		JSONObject object = new JSONObject(responseEntity.getBody());

		JSONObject obj = new JSONObject(newEditTabs(request, object));
		response.put(statusCode, successCode);
		response.put(messageCode, "Claim Beneficiary Details Fetched Successfully");
		response.put(dataCode, obj);
		return response.toString();
	}

	@Override
	public String claimChargesEdit(HttpServletRequest request) {
		JSONObject response = new JSONObject();
		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		Map<String, Object> params = processParamLOV(null, request);
		String url = baseCrudPath + "claimchrgs/getclaimchrgsByid?cc_TRAN_id=" + params.get("tranId");
		HttpHeaders headers = new HttpHeaders();
		RestTemplate restTemplate = new RestTemplate();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Bearer " + token);
		HttpEntity<String> requestEntity = new HttpEntity<>(headers);
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
		JSONObject object = new JSONObject(responseEntity.getBody());

		JSONObject obj = new JSONObject(newEditTabs(request, object));
		response.put(statusCode, successCode);
		response.put(messageCode, "Claim Charges Details Fetched Successfully");
		response.put(dataCode, obj);
		return response.toString();
	}

}
