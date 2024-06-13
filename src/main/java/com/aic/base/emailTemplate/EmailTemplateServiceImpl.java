package com.aic.base.emailTemplate;


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
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.Set;

import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.aic.base.commonUtils.CommonDao;
import com.aic.base.commonUtils.CommonService;
import com.aic.base.commonUtils.QUERY_MASTER;
import com.aic.base.commonUtils.QUERY_PARAM_MASTER;
import com.aic.base.logging.EmailLogsDTO;
import com.aic.base.logging.LoggerFunctionService;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.activation.DataHandler;
import jakarta.mail.Message;
import jakarta.mail.Multipart;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;
import jakarta.mail.util.ByteArrayDataSource;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class EmailTemplateServiceImpl implements EmailTemplateService {
	
	@Autowired
	private EmailTemplateRepo emailTemplateRepo;
	
	@Autowired
	private EmailTemplateParamRepo emailTemplateParamRepo;
	
	@Autowired
	private CommonService commonServiceImpl;
	
	@Autowired
	private CommonDao commonDao;
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Autowired
	private LoggerFunctionService loggingService;
	
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
	
	static final String username = "dinesh.b@wenxttech.com";
	static final String appPassword = "bwrlxbcytzgcbvjb";

	@Override
	public String createNewTemplate(EmailTemplateRequest emailTemplateDto) {
		System.out.println("IN");
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			LJM_EMAIL_TEMPLATE template = new LJM_EMAIL_TEMPLATE();

			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", emailTemplateDto.getFrontForm().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				setTemplateFields(template, entry.getValue());
			}

			try {
				LJM_EMAIL_TEMPLATE savedTemplate = emailTemplateRepo.save(template);
				response.put(statusCode, successCode);
				response.put(messageCode, "User created successfully");
				data.put("Id", savedTemplate.getET_SYS_ID());
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

	private void setTemplateFields(LJM_EMAIL_TEMPLATE template, Map<String, String> value) throws Exception {
		for (Map.Entry<String, String> entry : value.entrySet()) {
			setTemplateField(template, entry.getKey(), entry.getValue());
		}
	}

	private void setTemplateField(LJM_EMAIL_TEMPLATE template, String key, String value) throws Exception {
		try {
			Field field = LJM_EMAIL_TEMPLATE.class.getDeclaredField(key);
			Class<?> fieldType = field.getType();
			Object convertedValue = convertStringToObject(value, fieldType);
			String setterMethodName = "set" + key;
			if (value != null && !value.isEmpty()) {
				Method setter = LJM_EMAIL_TEMPLATE.class.getMethod(setterMethodName, fieldType);
				setter.invoke(template, convertedValue);
			}
		} catch (NoSuchFieldException e) {
//			e.printStackTrace();
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
			// TODO Auto-generated catch block
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
	public String updateTemplate(EmailTemplateRequest emailTemplateModel, Integer templateId) {
		JSONObject response = new JSONObject();

		try {
			Integer claimCoverId = templateId;
			Optional<LJM_EMAIL_TEMPLATE> optionalUser = emailTemplateRepo.findById(claimCoverId);
			LJM_EMAIL_TEMPLATE claim = optionalUser.get();
			if (claim != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", emailTemplateModel.getFrontForm().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					setTemplateFields(claim, entry.getValue());
				}

				try {
					LJM_EMAIL_TEMPLATE savedClaimDetails = emailTemplateRepo.save(claim);
					response.put(statusCode, successCode);
					response.put(messageCode, "Claim Details Updated Successfully");
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
	public String deleteTemplate(Integer templateId) {
		JSONObject response = new JSONObject();
		try {
			LJM_EMAIL_TEMPLATE existingTemplate = emailTemplateRepo.getById(templateId);
			if (existingTemplate != null) {
				emailTemplateRepo.deleteById(templateId);

				response.put(statusCode, successCode);
				response.put(messageCode, "Email Template Details Deleted Successfully");
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
	public String getTemplate(HttpServletRequest request, String screenCode, String screenName, Integer templateId) {
		JSONObject response = new JSONObject();
		String result = null;
		try {
			LJM_EMAIL_TEMPLATE existingTemplate = emailTemplateRepo.getById(templateId);
			if (existingTemplate != null) {
				response.put(statusCode, successCode);
				response.put(messageCode, "Email Template Details Fetched Successfully");
				 ObjectMapper mapper = new ObjectMapper();
				  Map<String, Object> templateData = mapper.convertValue(existingTemplate, Map.class);
				  
				  
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
	public String createTemplateParam(EmailTemplateRequest emailTemplateParams, Integer templateId) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			LJM_EMAIL_PARAM templateParam = new LJM_EMAIL_PARAM();

			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", emailTemplateParams.getEmailParams().getFormFields());
			fieldMaps.get("frontForm").put("EP_ET_SYS_ID", templateId.toString());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				setTemplateParamFields(templateParam, entry.getValue());
			}

			try {
				LJM_EMAIL_PARAM savedTemplate = emailTemplateParamRepo.save(templateParam);
				response.put(statusCode, successCode);
				response.put(messageCode, "Email Template Param Created Successfully");
				data.put("Id", savedTemplate.getEP_SYS_ID());
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

	private void setTemplateParamFields(LJM_EMAIL_PARAM templateParam, Map<String, String> value) throws Exception{
		for (Map.Entry<String, String> entry : value.entrySet()) {
			setTemplateParamField(templateParam, entry.getKey(), entry.getValue());
		}
	}

	private void setTemplateParamField(LJM_EMAIL_PARAM templateParam, String key, String value) throws Exception{
		try {
			Field field = LJM_EMAIL_PARAM.class.getDeclaredField(key);
			Class<?> fieldType = field.getType();
			Object convertedValue = null;
			if(fieldType == LJM_EMAIL_TEMPLATE.class) {
				convertedValue = getForeignObject(value);
			}else {
			convertedValue = convertStringToObject(value, fieldType);
			}
			String setterMethodName = "set" + key;
			if (value != null && !value.isEmpty()) {
				Method setter = LJM_EMAIL_PARAM.class.getMethod(setterMethodName, fieldType);
				setter.invoke(templateParam, convertedValue);
			}
		} catch (NoSuchFieldException e) {
//			e.printStackTrace();
		}
	}

	private LJM_EMAIL_TEMPLATE getForeignObject(String value) {
		LJM_EMAIL_TEMPLATE template = emailTemplateRepo.getById(Integer.parseInt(value));
		return template;
	}

	@Override
	public String updateTemplateParam(EmailTemplateRequest emailTemplateParams, Integer tempParamId) {
		JSONObject response = new JSONObject();

		try {
			Integer templateParamId = tempParamId;
			Optional<LJM_EMAIL_PARAM> optionalUser = emailTemplateParamRepo.findById(templateParamId);
			LJM_EMAIL_PARAM templateParam = optionalUser.get();
			if (templateParam != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", emailTemplateParams.getEmailParams().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					setTemplateParamFields(templateParam, entry.getValue());
				}

				try {
					LJM_EMAIL_PARAM savedParamDetails = emailTemplateParamRepo.save(templateParam);
					response.put(statusCode, successCode);
					response.put(messageCode, "Email Template Param Updated Successfully");
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
	public String deleteTemplateParam(Integer templateId) {
		JSONObject response = new JSONObject();
		try {
			LJM_EMAIL_PARAM existingTemplate = emailTemplateParamRepo.getById(templateId);
			if (existingTemplate != null) {
				emailTemplateParamRepo.deleteById(templateId);

				response.put(statusCode, successCode);
				response.put(messageCode, "Email Template Details Deleted Successfully");
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
	public String getTemplateParam(HttpServletRequest request, String screenCode, String screenName, Integer templateId) {
		JSONObject response = new JSONObject();
		String result = null;
		try {
			LJM_EMAIL_PARAM existingTemplate = emailTemplateParamRepo.getById(templateId);
			if (existingTemplate != null) {
				response.put(statusCode, successCode);
				response.put(messageCode, "Email Template Details Fetched Successfully");
				 ObjectMapper mapper = new ObjectMapper();
				  Map<String, Object> templateData = mapper.convertValue(existingTemplate, Map.class);
				  
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
	public String sendMail(Integer templateId, EmailRequestModel inputObject, HttpServletRequest request) {
		
		Map<String, MultipartFile> multiPartList = new HashMap<>();

		JSONObject response = new JSONObject();
		try {
			String to = "dineshbalamurugan85@gmail.com";
			String from = "dinesh.b@wenxttech.com";
			String host = "smtp.office365.com";

			Properties properties = System.getProperties();
			properties.put("mail.smtp.auth", "true");
			properties.put("mail.smtp.port", "587");
			properties.setProperty("mail.smtp.host", host);
			properties.setProperty("mail.smtp.starttls.enable", "true");

			Session session = Session.getInstance(properties, new jakarta.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, appPassword);
				}
			});

			LJM_EMAIL_TEMPLATE emailTemplate = emailTemplateRepo.getById(templateId);
			List<LJM_EMAIL_PARAM> emailTemplateParams = emailTemplateParamRepo.getParams(templateId);
			Map<String, Object> paramMap = new HashMap<>(inputObject.getContent());
			StringBuilder toIds = new StringBuilder();
			StringBuilder ccIds = new StringBuilder();
			StringBuilder bccIds = new StringBuilder();
			for (LJM_EMAIL_PARAM param : emailTemplateParams) {
				if (param.getEP_TYPE().equals("S")) {
					if (param.getEP_PARAM_NAME().equals("to")) {
						toIds.append(param.getEP_VALUE() + ",");
					} else if (param.getEP_PARAM_NAME().equals("cc")) {
						ccIds.append(param.getEP_VALUE() + ",");
					} else if (param.getEP_PARAM_NAME().equals("bcc")) {
						bccIds.append(param.getEP_VALUE() + ",");
					} else {
						paramMap.put(param.getEP_PARAM_NAME(), param.getEP_VALUE());
					}
				} else if (param.getEP_TYPE().equals("Q")) {
					List<QUERY_PARAM_MASTER> queryParams = commonDao.getQueryParams(Integer.parseInt(param.getEP_VALUE()));
					Map<String, Object> emailTemplateQueryParams = processEmailTemplateParams(queryParams, inputObject.getContent());
					if (param.getEP_PARAM_NAME().equals("to")) {
						QUERY_MASTER queryMaster = commonDao.getQueryLov(Integer.parseInt(param.getEP_VALUE()));
						String query = queryMaster.getQM_QUERY();
						SqlRowSet result = commonDao.executeQuery(query, emailTemplateQueryParams);

						while (result.next()) {
							paramMap.put(param.getEP_PARAM_NAME(), result.getObject(1));
						}
					} else if (param.getEP_PARAM_NAME().equals("cc")) {
						QUERY_MASTER queryMaster = commonDao.getQueryLov(Integer.parseInt(param.getEP_VALUE()));
						String query = queryMaster.getQM_QUERY();
						SqlRowSet result = commonDao.executeQuery(query, emailTemplateQueryParams);

						while (result.next()) {
							paramMap.put(param.getEP_PARAM_NAME(), result.getObject(1));
						}
					} else if (param.getEP_PARAM_NAME().equals("bcc")) {
						QUERY_MASTER queryMaster = commonDao.getQueryLov(Integer.parseInt(param.getEP_VALUE()));
						String query = queryMaster.getQM_QUERY();
						SqlRowSet result = commonDao.executeQuery(query, emailTemplateQueryParams);

						while (result.next()) {
							paramMap.put(param.getEP_PARAM_NAME(), result.getObject(1));
						}
					} else {
						QUERY_MASTER queryMaster = commonDao.getQueryLov(Integer.parseInt(param.getEP_VALUE()));
						String query = queryMaster.getQM_QUERY();
						SqlRowSet result = commonDao.executeQuery(query, emailTemplateQueryParams);
						while (result.next()) {
							System.out.println(result.getObject(1));
							paramMap.put(param.getEP_PARAM_NAME(), result.getObject(1));
						}
					}
				} else if (param.getEP_TYPE().equals("P")) {
					if (param.getEP_PARAM_NAME().equals("to")) {
						toIds.append(inputObject.getContent().get(param.getEP_PARAM_NAME()) + ",");
					} else if (param.getEP_PARAM_NAME().equals("cc")) {
						ccIds.append(inputObject.getContent().get(param.getEP_PARAM_NAME()) + ",");
					} else if (param.getEP_PARAM_NAME().equals("bcc")) {
						bccIds.append(inputObject.getContent().get(param.getEP_PARAM_NAME()) + ",");
					} else {
						paramMap.put(param.getEP_PARAM_NAME(), inputObject.getContent().get(param.getEP_PARAM_NAME()));
					}
				}
			}

			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			if (inputObject.getToIds() != null || inputObject.getToIds().size() < 0) {
				for (String ids : inputObject.getToIds()) {
					toIds.append(ids + ",");
				}
			}

			if (inputObject.getCcIds() != null || inputObject.getCcIds().size() < 1) {
				for (String ccId : inputObject.getCcIds()) {
					ccIds.append(ccId + ",");
				}
			}
			if (inputObject.getBccIds() != null || inputObject.getBccIds().size() < 1) {
				for (String bccId : inputObject.getBccIds()) {
					bccIds.append(bccId + ",");
				}
			}
			if (inputObject.getSubject() != null || !inputObject.getSubject().isEmpty()) {
				paramMap.put("subject", inputObject.getSubject());
			}
			
			StringBuilder attachments = new StringBuilder();
			if (inputObject.getAttachments() != null && inputObject.getAttachments().size() > 0) {
				Set<String> keys = inputObject.getAttachments().keySet();
				for (String key : keys) {
					attachments.append(key + ",");
					BASE64DecodedMultipartFile conv = new BASE64DecodedMultipartFile(
							(byte[]) inputObject.getAttachments().get(key).getBytes());
					multiPartList.put(key, conv);
				}
			}
			
			Set<String> fileName = multiPartList.keySet();
			

			toIds.deleteCharAt(toIds.length() - 1);
			ccIds.deleteCharAt(ccIds.length() - 1);
			bccIds.deleteCharAt(bccIds.length() - 1);

			InternetAddress[] recipients = InternetAddress.parse(toIds.toString());
			InternetAddress[] toRecipients = InternetAddress.parse(ccIds.toString());
			InternetAddress[] bccRecipients = InternetAddress.parse(bccIds.toString());
			message.addRecipients(Message.RecipientType.TO, recipients);
			message.addRecipients(Message.RecipientType.CC, toRecipients);
			message.addRecipients(Message.RecipientType.BCC, bccRecipients);

			Document document = Jsoup.parse(emailTemplate.getET_MSG_BODY());

			String formattedString = document.outerHtml();

			for (Map.Entry<String, Object> entry : paramMap.entrySet()) {
				formattedString = formattedString.replace("$" + entry.getKey(), entry.getValue().toString());
			}

			message.setSubject(paramMap.get("subject").toString());
			message.setText(formattedString);

			MimeBodyPart mimeBodyPart = new MimeBodyPart();
			mimeBodyPart.setContent(formattedString, "text/html");

			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(mimeBodyPart);
			
			for (String filename : fileName) {
			    MimeBodyPart attachmentPart = new MimeBodyPart();
			    attachmentPart.setDataHandler(new DataHandler(new ByteArrayDataSource(multiPartList.get(filename).getBytes(), multiPartList.get(filename).getContentType())));
			    attachmentPart.setFileName(filename);
			    multipart.addBodyPart(attachmentPart);
			}
			
			attachments.deleteCharAt(attachments.toString().length()-1);

			message.setContent(multipart);

			Transport.send(message);
			
			 Document doc = Jsoup.parse(formattedString);
		     String con = doc.text();
		     
			
			EmailLogsDTO logs = new EmailLogsDTO();
			logs.setTo(toIds.toString());
			logs.setTemplateName(emailTemplate.getET_TEMP_NAME());
			logs.setTemplateBody(con);
			logs.setGenDate(LocalDateTime.now());
			
			loggingService.logToEmailHistoryLogs(logs, request);
			response.put(statusCode, successCode);
			response.put(messageCode, "Mail Sent Successfully");
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
			e.printStackTrace();
		}

		return response.toString();
	}

	private Map<String, Object> processEmailTemplateParams(List<QUERY_PARAM_MASTER> queryParams, Map<String, Object> map) {
		Map<String, Object> emailTemplateQueryParams = new HashMap<>();
		for(QUERY_PARAM_MASTER param : queryParams) {
			if(map.get(param.getQPM_PARAM_NAME()) != null) {
			emailTemplateQueryParams.put(param.getQPM_PARAM_NAME(), map.get(param.getQPM_PARAM_NAME()));
			}
		}
		return emailTemplateQueryParams;
	}

}
