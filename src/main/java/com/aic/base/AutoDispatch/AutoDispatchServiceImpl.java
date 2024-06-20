package com.aic.base.AutoDispatch;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.aic.base.commonUtils.CommonService;
import com.aic.base.emailTemplate.LJM_EMAIL_TEMPLATE;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class AutoDispatchServiceImpl implements AutoDispatchService {
	
	@Autowired
	private AutoDispSetupRepo autoDispSetupRepo;
	
	@Autowired
	private CommonService commonService;
	
	@Autowired
	private AutoDispDocCondRepo autoDispDocCondRepo;
	
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
	public String createAutoDispatchDetails(AutoDispatchRequest autoDispRequest) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			AutoDispSetup autoDispatch = new AutoDispSetup();

			Map<String, Map<String, Object>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", autoDispRequest.getFrontForm().getFormFields());
			for (Map.Entry<String, Map<String, Object>> entry : fieldMaps.entrySet()) {
				setAutoDispSetupFields(autoDispatch, entry.getValue());
			}

			try {
				AutoDispSetup savedAutoDispDetails = autoDispSetupRepo.save(autoDispatch);
				saveAutoDispDoc(savedAutoDispDetails.getADS_SYS_ID(), autoDispRequest.getFrontForm().getFormFields().get("ADDC_TEMP_NAME"));
				response.put(statusCode, successCode);
				response.put(messageCode, "Auto Dispatch Details created successfully");
				data.put("Id", savedAutoDispDetails.getADS_SYS_ID());
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

	private void setAutoDispSetupFields(AutoDispSetup autoDispatch, Map<String, Object> map)throws Exception {
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			setAutoDispSetupField(autoDispatch, entry.getKey(), entry.getValue());
		}
	}

	private void setAutoDispSetupField(AutoDispSetup autoDispatch, String key, Object object)throws Exception {
		try {
			Field field = AutoDispSetup.class.getDeclaredField(key);
			Class<?> fieldType = field.getType();
			Object convertedValue = commonService.convertStringToObject(object.toString(), fieldType);
			String setterMethodName = "set" + key;
			if (object != null && !object.toString().isEmpty()) {
				Method setter = AutoDispSetup.class.getMethod(setterMethodName, fieldType);
				setter.invoke(autoDispatch, convertedValue);
			}
		} catch (NoSuchFieldException e) {
//			e.printStackTrace();
		}
	}

	private void saveAutoDispDoc(Integer foreignKey, Object object) {
		 List<String> templateNameList = (List<String>) object;
		 for(String templateName : templateNameList) {
			 AutoDispDocCond autodispDocCond = new AutoDispDocCond();
			 autodispDocCond.setADDC_ACTIVE_YN("Y");
			 autodispDocCond.setADDC_ADS_SYS_ID(autoDispSetupRepo.getById(foreignKey));
			 autodispDocCond.setADDC_TEMP_NAME(templateName);
			 
			 try {
			 autoDispDocCondRepo.save(autodispDocCond);
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
		 }
	}

	@Override
	public String getAutoDispDetails(HttpServletRequest request, String screenCode, String screenName, Integer tranId) {
		JSONObject response = new JSONObject();
		String result = null;
		try {
			AutoDispSetup existingADDetails = autoDispSetupRepo.getById(tranId);
			if (existingADDetails != null) {
				response.put(statusCode, successCode);
				response.put(messageCode, "Auto Dispatch Details Fetched Successfully");
				 ObjectMapper mapper = new ObjectMapper();
				  Map<String, Object> templateData = mapper.convertValue(existingADDetails, Map.class);
				  
				  List<String> templateNames = autoDispDocCondRepo.getTemplateNames(tranId);
				  
				  templateData.put("ADDC_TEMP_NAME", templateNames);
				  
				  JSONObject getObject = new JSONObject(templateData);
				  
				  result = commonService.newEditTabs(request, getObject);
				  
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
	public String updateAutoDispDetails(AutoDispatchRequest autoDispRequest, Integer tranId) {
		JSONObject response = new JSONObject();

		try {
			Optional<AutoDispSetup> optionalUser = autoDispSetupRepo.findById(tranId);
			AutoDispSetup claim = optionalUser.get();
			if (claim != null) {
				Map<String, Map<String, Object>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", autoDispRequest.getFrontForm().getFormFields());
				updateAutoDispDocCond(tranId, autoDispRequest.getFrontForm().getFormFields().get("ADDC_TEMP_NAME"));
				for (Map.Entry<String, Map<String, Object>> entry : fieldMaps.entrySet()) {
					setAutoDispSetupFields(claim, entry.getValue());
				}

				try {
					AutoDispSetup savedAutoDispDetails = autoDispSetupRepo.save(claim);
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

	private void updateAutoDispDocCond(Integer tranId, Object object) {
		 List<String> templateNameList = (List<String>) object;
		 List<AutoDispDocCond> existingTemplateList = autoDispDocCondRepo.getExisitingTemplates(tranId);
		 List<String> existingTemplateNameList = existingTemplateList.stream().map(AutoDispDocCond::getADDC_TEMP_NAME).collect(Collectors.toList());
		 List<String> newTemplateNameList = new ArrayList<>();
		 
		 for(AutoDispDocCond existingTemplate : existingTemplateList) {
			 if(!templateNameList.contains(existingTemplate.getADDC_TEMP_NAME())) {
				 autoDispDocCondRepo.deleteById(existingTemplate.getADDC_SYS_ID());
			 }
		 }
		 
		 for(String newTemplateName : templateNameList) {
			 if(!existingTemplateNameList.contains(newTemplateName)) {
				 newTemplateNameList.add(newTemplateName);
			 }
		 }
		 
		 saveAutoDispDoc(tranId, newTemplateNameList);
		
	}

	@Override
	public String deleteAutoDispDetails(Integer tranId) {
		JSONObject response = new JSONObject();
		try {
			AutoDispSetup existingAD = autoDispSetupRepo.getById(tranId);
			 List<AutoDispDocCond> existingTemplateList = autoDispDocCondRepo.getExisitingTemplates(tranId);
			 if(existingTemplateList.size() > 0 && existingAD != null) {
				 response.put(statusCode, errorCode);
				 response.put(messageCode, "Cannot Delete When Documents are Mapped for Auto Dispatch");
			} else if (existingAD != null) {
				System.out.println("IN");
				autoDispSetupRepo.deleteById(tranId);

				response.put(statusCode, successCode);
				response.put(messageCode, "Auto Dispatch Details Deleted Successfully");
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

}
