package com.aic.base.login;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.jasypt.encryption.StringEncryptor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.aic.base.commonUtils.LOVDTO;
import com.aic.base.commonUtils.ProcedureInput;
import com.aic.base.logHistory.LjmLogActUser;
import com.aic.base.logHistory.LogActUserRepository;
import com.aic.base.logHistory.LoginAppenderServiceImpl;
import com.aic.base.security.AuthRequest;
import com.aic.base.security.JwtService;
import com.aic.base.users.LM_MENU_USERS;
import com.aic.base.users.UserMasterRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.transaction.Transactional;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private KieContainer kieContainer;

	@Autowired
	private LoginRepository repo;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtService jwtService;

	@Autowired
	private UserMasterRepository userrepo;

	@Autowired
	private StringEncryptor encryptor;

	@Autowired
	private JavaMailSender javaMailSender;

	@Value("${get.company.message}")
	private String getCompanyMessage;

	@Value("${get.language.message}")
	private String getLanguageMessage;

	@Value("${get.branch.message}")
	private String getBranchMessage;

	@Value("${get.department.message}")
	private String getDepartmentMessage;

	@Value("${user.login.message}")
	private String loginMessage;

	@Value("${reset.password.token}")
	private String newToken;

	@Value("${reset.password.mail}")
	private String resetPasswordMail;

	@Value("${reset.password.message}")
	private String resetPassword;

	@Value("${spring.project.baseUrl}")
	private String getBaseURL;

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

	@Autowired
	private JdbcTemplate template;

	@Autowired
	LmMenuUserCompDivnReposistory lmmenuuserCompdivrepo;

	@Autowired
	private LoginAppenderServiceImpl loginservice;

	@Autowired
	private LogActUserRepository actrepo;

	@Autowired
	private InvalidatedTokenRepository invalidatedTokenRepository;

	@Override
	public String getCompany(LoginDropDownRequestModel user) {

		JSONObject response = new JSONObject();
		RestTemplate restTemplate = new RestTemplate();
		String url = getBaseURL + "common/getparamlov?queryId=10&muc_user_id=" + user.getUserId();
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			String serviceResponse = responseEntity.getBody();
		} else {
			throw new UsernameNotFoundException("JUST CHECK");
		}
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject = new JSONObject(responseEntity.getBody().toString());
		} catch (JSONException e) {
			e.printStackTrace();
		}
		JSONObject dataObject = jsonObject.getJSONObject("Data");
		JSONArray jsonArray = (JSONArray) dataObject.getJSONArray("get company");
		List<LOVDTO> list = new ArrayList<>();
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject obj = jsonArray.getJSONObject(i);
			LOVDTO model = new LOVDTO(obj.get("label"), obj.get("value")); // Assuming model structure
			list.add(model);
		}

		user.setCompanyCodes(list);
		KieSession kieSession = kieContainer.newKieSession();

		try {
			kieSession.insert(user);
			kieSession.fireAllRules();
		} finally {
			kieSession.dispose();
		}

		if (user.getErrorMessage() == null) {
			response.put(statusCode, successCode);
			response.put(messageCode, getCompanyMessage);
			response.put(dataCode, list);
			return response.toString();
		} else {
			List<Map<String, String>> errorList = new ArrayList<>();
			Map<String, String> errorMap = new LinkedHashMap<String, String>();
			response.put(statusCode, errorCode);
			response.put(messageCode, "Validation Error");
			errorMap.put("Field", user.getErrorField());
			errorMap.put(messageCode, user.getErrorMessage());
			errorList.add(errorMap);
			response.put("Error", errorList);
			return response.toString();
		}
	}

	@Override
	public String getBranch(LoginDropDownRequestModel user) {
		JSONObject response = new JSONObject();

		RestTemplate restTemplate = new RestTemplate();
		String url = getBaseURL + "common/getparamlov?queryId=11&MUCD_COMP_CODE=" + user.getCompanyCode()
				+ "&muc_user_id=" + user.getUserId();
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			String serviceResponse = responseEntity.getBody();
		} else {
			throw new UsernameNotFoundException("JUST CHECK");
		}
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject = new JSONObject(responseEntity.getBody().toString());
		} catch (JSONException e) {
			e.printStackTrace();
		}
		JSONObject dataObject = jsonObject.getJSONObject("Data");
		JSONArray jsonArray = (JSONArray) dataObject.getJSONArray("get branch");
		List<LOVDTO> list = new ArrayList<>();
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject obj = jsonArray.getJSONObject(i);
			LOVDTO model = new LOVDTO(obj.get("label"), obj.get("value")); // Assuming model structure
			list.add(model);
		}
		response.put(statusCode, successCode);
		response.put(messageCode, getBranchMessage);
		response.put(dataCode, list);
		return response.toString();
	}

	@Override
	public String getDept(LoginDropDownRequestModel user) {
		JSONObject response = new JSONObject();

//		List<KeyValueModel> list = loginDao.getDept(user.getUserId(), user.getCompanyCode(), user.getBranchCode());
		RestTemplate restTemplate = new RestTemplate();
		String url = getBaseURL + "common/getparamlov?queryId=12&MUCD_COMP_CODE=" + user.getCompanyCode()
				+ "&muc_user_id=" + user.getUserId() + "&mucd_divn_code=" + user.getBranchCode();
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			String serviceResponse = responseEntity.getBody();
		} else {
			throw new UsernameNotFoundException("JUST CHECK");
		}
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject = new JSONObject(responseEntity.getBody().toString());
		} catch (JSONException e) {
			e.printStackTrace();
		}
		JSONObject dataObject = jsonObject.getJSONObject("Data");
		JSONArray jsonArray = (JSONArray) dataObject.getJSONArray("get department");
		List<LOVDTO> list = new ArrayList<>();
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject obj = jsonArray.getJSONObject(i);
			LOVDTO model = new LOVDTO(obj.get("label"), obj.get("value")); // Assuming model structure
			list.add(model);
		}
		response.put(statusCode, successCode);
		response.put(messageCode, getDepartmentMessage);
		response.put(dataCode, list);
		return response.toString();
	}

	public String login(LoginRequestModel login) {
		JSONObject response = new JSONObject();
		Map<String, Object> data = new HashMap<>();

		AuthRequest auth = new AuthRequest();
		auth.setUsername(login.getUserName());
		auth.setPassword(login.getPassword());
		auth.setDivision(login.getDivisionCode());
		auth.setDepartment(login.getDepartmentCode());
		auth.setCompany(login.getCompanyCode());
		auth.setLangCode(login.getLangCode());
		auth.setBaseCurrency("INR");
		String token = "";

		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();

		Optional<LjmLogActUser> existingLogin = actrepo.findByLogActUserAndLogActStatus(login.getUserName(), "ACTIVE");

		if (existingLogin.isPresent()) {
			response.put(statusCode, warningCode);
			response.put(messageCode, "To continue, should we expire your current session and create a new one?");
			return response.toString();
		}

		Authentication authenticationToken = new UsernamePasswordAuthenticationToken(login.getUserName(),
				login.getPassword());
		Authentication authentication = authenticationManager.authenticate(authenticationToken);

		if (authentication.isAuthenticated()) {
			token = jwtService.generateToken(auth);

			Optional<LM_MENU_USERS> menuUser = userrepo.findByUserId(login.getUserName());
			if (!menuUser.isPresent()) {
				response.put(statusCode, errorCode);
				response.put(messageCode, "User not found in menu");
				return response.toString();
			}

			boolean isFlagSet = checkFlagInMenuTable(authentication); // Check flag in lm_menu table
			if (isFlagSet) {
				data.put("Token", token);
				data.put("URL", "/resetpassword");
				response.put(statusCode, "REDIRECT");
				response.put(messageCode, "Please direct to reset password page");
				response.put(dataCode, data);
				return response.toString();
			} else {
				if (token != null || ("EXPIRED".equalsIgnoreCase(existingLogin.get().getLogActStatus())
						|| "".equalsIgnoreCase(existingLogin.get().getLogActStatus()))) {
					data.put("Token", token);
					data.put("group", menuUser.get().getUser_group_id());
					data.put("MenuList", null); // Update this if MenuList is available
					response.put(statusCode, successCode);
					response.put(messageCode, "User Logged In Successfully");
					response.put(dataCode, data);

					String ipAddress = request.getRemoteAddr();
					String userAgent = request.getHeader("User-Agent");
					String browserName = getBrowserName(userAgent);

					// Save new login details
					LjmLogActUser newLogin = new LjmLogActUser();
					newLogin.setLogActUser(login.getUserName());
					newLogin.setLogActIp(ipAddress);
					newLogin.setLogActHost(request.getRemoteHost());
					newLogin.setLogActBrowser(browserName);
					newLogin.setLangCode("ENG");
					newLogin.setCompanyCode(auth.getCompany());
					newLogin.setDivisionCode(auth.getDivision());
					newLogin.setDepartmentCode(auth.getDepartment());
					newLogin.setBasecurrency("INR");
					newLogin.setLogActToken(token);
					newLogin.setLogActStatus("ACTIVE");
					newLogin.setLogActLoginTime(new Timestamp(System.currentTimeMillis()));
					newLogin.setLogActCrdt(new Timestamp(System.currentTimeMillis()));

					actrepo.save(newLogin);

					loginservice.loginToLJMLogs1("User logged in successfully", request, token);

					// Include procedure invocation details if needed
					Map<String, String> inputMap = new HashMap<>();
					inputMap.put("P_USER", auth.getUsername());
					inputMap.put("P_COMP_CODE", auth.getCompany());
					inputMap.put("P_DEPT_CODE", auth.getDepartment());
					inputMap.put("P_DIV_CODE", auth.getDivision());
					inputMap.put("P_BASE_CURR", auth.getBaseCurrency());
					inputMap.put("P_LANG_CODE", "ENG");
					inputMap.put("P_FOR_LANG_CODE", null);
					inputMap.put("P_PROG_NAME", null);
					inputMap.put("P_NOOF_DEC", null);

					ProcedureInput input = new ProcedureInput();
					input.setInParams(inputMap);

					String url = "http://localhost:8098/common/invokeProcedure?procedureName=P_SET_PARA_VALUES&packageName=WNPKG_VARS";
					HttpHeaders headers = new HttpHeaders();
					RestTemplate restTemplate = new RestTemplate();
					headers.setContentType(MediaType.APPLICATION_JSON);
					headers.set("Authorization", "Bearer " + token);
					HttpEntity<ProcedureInput> requestEntity = new HttpEntity<>(input, headers);
					ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity,
							String.class);

					return response.toString();
				} else {
					response.put(statusCode, errorCode);
					response.put(messageCode, "Token generation failed");
					return response.toString();
				}
			}
		} else {
			response.put(statusCode, errorCode);
			response.put(messageCode, "Authentication failed");
			return response.toString();
		}

	}
	

	private void invalidatePreviousSession(LjmLogActUser oldLogin) {
	    String beforeToken = oldLogin.getLogActToken();
	    invalidatedTokenRepository.save(new InvalidatedToken(beforeToken, null));
//	    oldLogin.setLogActStatus("EXPIRED");
	    oldLogin.setLogActMddt(new Timestamp(System.currentTimeMillis()));
	    actrepo.save(oldLogin);
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

	private boolean checkFlagInMenuTable(Authentication authentication) {
		if (authentication != null && authentication.isAuthenticated()) {
			String username = authentication.getName();

			LM_MENU_USERS menuUser = userrepo.findByUserIdAndUserFirstLoginyn(username, true);

			return menuUser != null;
		}
		return false;
	}

	@Override
	public String getLang() {
		JSONObject response = new JSONObject();
//		List<KeyValueModel> languages = loginDao.getLang();
		RestTemplate restTemplate = new RestTemplate();
		String url = getBaseURL + "common/getparamlov?queryId=13";
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			String serviceResponse = responseEntity.getBody();
		} else {
			throw new UsernameNotFoundException("JUST CHECK");
		}
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject = new JSONObject(responseEntity.getBody().toString());
		} catch (JSONException e) {
			e.printStackTrace();
		}
		JSONArray jsonArray = (JSONArray) jsonObject.getJSONArray("Data");
//		JSONArray jsonArray = (JSONArray) dataObject.getJSONArray("get language");
		List<LOVDTO> list = new ArrayList<>();
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject obj = jsonArray.getJSONObject(i);
			LOVDTO model = new LOVDTO(obj.get("label"), obj.get("value"));
			list.add(model);
		}
		List<JSONObject> data = new ArrayList<>();
		JSONObject languageResponse = new JSONObject();

		response.put(statusCode, successCode);
		response.put(messageCode, getLanguageMessage);

		for (LOVDTO language : list) {
			if (language.getValue().equals("English")) {
				languageResponse = new JSONObject();
				languageResponse.put("label", language.getLabel());
				languageResponse.put("value", language.getValue());
				languageResponse.put("IsDefault", "True");
				data.add(languageResponse);
			} else {
				languageResponse = new JSONObject();
				languageResponse.put("label", language.getLabel());
				languageResponse.put("value", language.getValue());
				languageResponse.put("IsDefault", "False");
				data.add(languageResponse);
			}
		}
		response.put(dataCode, data);
		return response.toString();
	}

	@Override
	public String resetProfilePassword(String password, String newPassword, String confirmPassword) {
		JSONObject response = new JSONObject();

		if (!newPassword.equals(confirmPassword)) {
			return "New password and confirm password do not match!";
		}

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String jwtuser = authentication.getName();

		Optional<LM_MENU_USERS> userOptional = userrepo.findByUserId(jwtuser);

		if (userOptional.isPresent()) {
			LM_MENU_USERS user = userOptional.get();

			String hashedPassword = user.getUser_passwd();

			String decryptedPassword = encryptor.decrypt(hashedPassword);
			if (password.equals(decryptedPassword)) {
				user.setUser_passwd(encryptor.encrypt(newPassword));
				user.setUserFirstLoginyn(false);
				userrepo.save(user);
				response.put("Status", "SUCCESS");
				response.put("status_msg", "Password reset successful");

				return response.toString();
			} else {
				response.put("Status", "FAILURE");
				response.put("status_msg", "Invalid password!");
				return response.toString();
			}
		} else {
			response.put("Status", "FAILURE");
			response.put("status_msg", "User not found!");
			return response.toString();
		}
	}

	@Override
	public ResponseEntity<String> processForgotPassword(String email) {
		JSONObject response = new JSONObject();
		try {
			LM_MENU_USERS user = userrepo.findByUserEmailId(email);
			if (user == null) {
				response.put("Status", "FAILURE");
				response.put("status_msg", "User not found");

				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response.toString());
			}

			String token = UUID.randomUUID().toString();
			user.setUserResettoken(token);
			userrepo.save(user);
			response.put("Status", "SUCCESS");
			response.put("status_msg", "Reset password email sent successfully");

			sendResetPasswordEmail(user.getUserEmailId(), token);

			return ResponseEntity.ok(response.toString());
		} catch (Exception e) {
			response.put("Status", "FAILURE");
			response.put("status_msg", "Failed to reset password: " + e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response.toString());
		}
	}

	private void sendResetPasswordEmail(String email, String token) {
		String resetPasswordLink = "http://localhost:8080/reset-password?token=" + token;

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(email);
		message.setSubject("Password Reset Request");
		message.setText("To reset your password, please click on the following link: " + resetPasswordLink);

		javaMailSender.send(message);
	}

	@Override
	public ResponseEntity<String> resetPassword(String token, String newPassword, String confirmPassword)
			throws InvalidTokenException {
		JSONObject response = new JSONObject();
		try {
			LM_MENU_USERS user = userrepo.findByUserResettoken(token);
			if (user != null) {
				user.setUser_passwd(encryptor.encrypt(newPassword));
				user.setUserResettoken(null);

				userrepo.save(user);

				String newToken = UUID.randomUUID().toString();

				response.put("Status", "SUCCESS");
				response.put("status_msg", "password reset sucessfully");
				return ResponseEntity.ok(response.toString());
			} else {
				response.put("Status", "FAILURE");
				response.put("status_msg", "Invalid token");
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response.toString());
			}
		} catch (Exception e) {
			response.put("Status", "FAILURE");
			response.put("status_msg", "Failed to reset password: " + e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response.toString());
		}
	}

	@Override
	public String password(String username, String password, String userId) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		JSONObject response = new JSONObject();
		Map<String, Object> data = new HashMap<>();

		if (authentication != null && authentication.isAuthenticated()) {
			String jwtUser = authentication.getName();

			if ("ADMIN".equals(username) && "ADMIN".equals(jwtUser)) {
				List<LM_MENU_USERS> userList = userrepo.findAll();

				Optional<LM_MENU_USERS> userOptional = userList.stream().filter(user -> userId.equals(user.getUserId()))
						.findFirst();

				if (userOptional.isPresent()) {
					LM_MENU_USERS user = userOptional.get();
					String encryptedPassword = user.getUser_passwd();
					String decryptedPassword = encryptor.decrypt(encryptedPassword);

					if (password.equals("Test@123")) {
						data.put("UserID", user.getUserId());
						data.put("Password", decryptedPassword);
						response.put("Status", "SUCCESS");
						response.put("status_msg", "Password retrieved successfully");
						response.put("Data", data);
					} else {
						response.put("Status", "FAILURE");
						response.put("status_msg", "Invalid admin password");
					}
				} else {
					response.put("Status", "FAILURE");
					response.put("status_msg", "User not found");
				}
			} else {
				response.put("Status", "FAILURE");
				response.put("status_msg", "Invalid user");
			}
		} else {
			response.put("Status", "FAILURE");
			response.put("status_msg", "User not authenticated");
		}

		return response.toString();
	}

	@Override
	public String getAllcompanyListByuser(LoginDropDownRequestModel user) {

		JSONObject response = new JSONObject();
		RestTemplate restTemplate = new RestTemplate();
		String url = getBaseURL + "common/getparamlov?queryId=19&muc_user_id=" + user.getUserId();
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			String serviceResponse = responseEntity.getBody();
		} else {
			throw new UsernameNotFoundException("JUST CHECK");
		}
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject = new JSONObject(responseEntity.getBody().toString());
		} catch (JSONException e) {
			e.printStackTrace();
		}
		JSONObject dataObject = jsonObject.getJSONObject("Data");
		JSONArray jsonArray = (JSONArray) dataObject.getJSONArray("getCompany");
		List<LOVDTO> list = new ArrayList<>();
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject obj = jsonArray.getJSONObject(i);
			LOVDTO model = new LOVDTO(obj.get("label"), obj.get("value")); // Assuming model structure
			list.add(model);
		}

		user.setCompanyCodes(list);
		KieSession kieSession = kieContainer.newKieSession();

		try {
			kieSession.insert(user);
			kieSession.fireAllRules();
		} finally {
			kieSession.dispose();
		}

		if (user.getErrorMessage() == null) {
			response.put(statusCode, successCode);
			response.put(messageCode, getCompanyMessage);
			response.put(dataCode, list);
			return response.toString();
		} else {
			List<Map<String, String>> errorList = new ArrayList<>();
			Map<String, String> errorMap = new LinkedHashMap<String, String>();
			response.put(statusCode, errorCode);
			response.put(messageCode, "Validation Error");
			errorMap.put("Field", user.getErrorField());
			errorMap.put(messageCode, user.getErrorMessage());
			errorList.add(errorMap);
			response.put("Error", errorList);
			return response.toString();
		}

	}

	@Override
	public String getAllDeptListByUser(LoginDropDownRequestModel user) {
		JSONObject response = new JSONObject();
		RestTemplate restTemplate = new RestTemplate();
		String baseURL = getBaseURL + "common/getparamlov?queryId=";

		try {
			String url = baseURL + "19";

			ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
			if (responseEntity.getStatusCode() == HttpStatus.OK) {
				String serviceResponse = responseEntity.getBody();
				JSONArray jsonArray = null;
				try {
					jsonArray = new JSONObject(serviceResponse).getJSONArray("Data");
				} catch (JSONException e) {
					throw new UsernameNotFoundException("Data not found in the response");
				}
				List<LOVDTO> countryList = parseLOVDTOList(jsonArray);
				user.setCompanyListCodes(countryList);
			} else {
				throw new UsernameNotFoundException("Error fetching country list");
			}

			if (user.getCompanyCode() != null) {
				url = baseURL + "20&divn_comp_code=" + user.getCompanyCode();
				responseEntity = restTemplate.getForEntity(url, String.class);
				if (responseEntity.getStatusCode() == HttpStatus.OK) {
					String serviceResponse = responseEntity.getBody();
					JSONArray jsonArray = null;
					try {
						jsonArray = new JSONObject(serviceResponse).getJSONArray("Data");
					} catch (JSONException e) {
						throw new UsernameNotFoundException("Data not found in the response");
					}
					List<LOVDTO> branchList = parseLOVDTOList(jsonArray);
					user.setBranchListCodes(branchList);
				} else {
					throw new UsernameNotFoundException("Error fetching branch list");
				}
			} else {
				throw new UsernameNotFoundException("Company code is required");
			}

			if (user.getBranchCode() != null) {
				url = baseURL + "28" + "&dept_divn_code=" + user.getBranchCode();
				responseEntity = restTemplate.getForEntity(url, String.class);
				if (responseEntity.getStatusCode() == HttpStatus.OK) {
					String serviceResponse = responseEntity.getBody();
					JSONArray jsonArray = null;
					try {
						jsonArray = new JSONObject(serviceResponse).getJSONArray("Data");
					} catch (JSONException e) {
						throw new UsernameNotFoundException("Data not found in the response");
					}
					List<LOVDTO> departmentList = parseLOVDTOList(jsonArray);
					user.setDeptListCodes(departmentList);
				} else {
					throw new UsernameNotFoundException("Error fetching department list");
				}
			} else {
				throw new UsernameNotFoundException("Branch code is required");
			}

			response.put(statusCode, successCode);
			response.put(messageCode, "getCompanyMessage");
			response.put("companyList", user.getCompanyListCodes());
			response.put("branchList", user.getBranchListCodes());
			response.put("departmentList", user.getDeptListCodes());

		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, "Error occurred");
			response.put("error", e.getMessage());
		}

		return response.toString();
	}

	private List<LOVDTO> parseLOVDTOList(JSONArray jsonArray) {
		List<LOVDTO> list = new ArrayList<>();
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject obj = jsonArray.getJSONObject(i);
			LOVDTO model = new LOVDTO(obj.getString("label"), obj.getString("value")); // Assuming model structure
			list.add(model);
		}
		return list;
	}

	@Override
	public String getAllDeptSubmit(DeptSubmitRequest deptrequest) {
		JSONObject response = new JSONObject();

		try {
			String userId = deptrequest.getUserId();
			String companyCode = deptrequest.getCompanyCode();
			String divisionCode = deptrequest.getBranchCode();
			String departmentCode = deptrequest.getDepartmentCode();

			LM_MENU_USER_COMP existingComp = null;
			if (deptrequest.getCompId() != null) {
				existingComp = repo.findById(deptrequest.getCompId()).orElse(null);
			}
			String divnUserId = null;
			String divnCompCode = null;

			if (existingComp != null) {
				divnCompCode = existingComp.getmuc_comp_code();
				divnUserId = existingComp.getMuc_user_id().getUserId();
				Optional<LM_MENU_USERS> user = userrepo.findById(userId);
				if (user.get() != null) {

					existingComp.setMuc_user_id(user.get());
				}
				existingComp.setmuc_comp_code(companyCode);
				repo.save(existingComp);
				response.put(statusCode, successCode);
				response.put(messageCode, "LM menu company updated successfully");
			} else {
				LM_MENU_USER_COMP newComp = new LM_MENU_USER_COMP();
				Optional<LM_MENU_USERS> user = userrepo.findById(userId);
				if (user.get() != null) {
					newComp.setMuc_user_id(user.get());
				}
				newComp.setmuc_comp_code(companyCode);
				repo.save(newComp);
				response.put(statusCode, successCode);
				response.put(messageCode, "LM menu company created successfully");
			}

			LM_MENU_USER_COMP_DIVN existingCompDivn = lmmenuuserCompdivrepo.findByuserIdAndCompCode(divnUserId,
					divnCompCode);
			if (existingCompDivn != null) {
				Optional<LM_MENU_USERS> user = userrepo.findById(userId);
				if (user.get() != null) {
					existingCompDivn.setMucd_user_id(user.get());
				}
				existingCompDivn.setMucd_comp_code(companyCode);

				existingCompDivn.setMucd_divn_code(divisionCode);
				existingCompDivn.setMucd_dept_code(departmentCode);
				lmmenuuserCompdivrepo.save(existingCompDivn);
				response.put(statusCode, successCode);
				response.put(messageCode, "LM menu company divn updated successfully");
			} else {
				LM_MENU_USER_COMP_DIVN newCompDivn = new LM_MENU_USER_COMP_DIVN();
				Optional<LM_MENU_USERS> user = userrepo.findById(userId);
				if (user.get() != null) {
					newCompDivn.setMucd_user_id(user.get());
				}
				newCompDivn.setMucd_comp_code(companyCode);
				newCompDivn.setMucd_divn_code(divisionCode);
				newCompDivn.setMucd_dept_code(departmentCode);
				lmmenuuserCompdivrepo.save(newCompDivn);
				response.put(statusCode, successCode);
				response.put(messageCode, "LM menu company divn created successfully");
			}
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, "Error occurred: " + e.getMessage());
		}

		return response.toString();
	}

	@Transactional

	public String getAllDeptDelete(DeptSubmitRequest user) {
		JSONObject response = new JSONObject();

		try {
			String userId = user.getUserId();
			String companyCode = user.getCompanyCode();
			String divisionCode = user.getBranchCode();
			String departmentCode = user.getDepartmentCode();

			LM_MENU_USER_COMP existingComp = null;
			if (user.getCompId() != null) {
				existingComp = repo.findById(user.getCompId()).orElse(null);
			}
			LM_MENU_USER_COMP_DIVN existingCompDivn = lmmenuuserCompdivrepo.findByuserIdAndCompCode(userId,
					companyCode);

			if (existingComp == null || existingCompDivn == null) {
				response.put(statusCode, errorCode);
				response.put(messageCode, "Records not found for deletion");
				return response.toString();
			}

			repo.deleteByUserIdAndCompCode(userId, companyCode);

			lmmenuuserCompdivrepo.deleteByUserIdAndCompCodeAndDivnCodeAndDeptCode(userId, companyCode, divisionCode,
					departmentCode);

			response.put(statusCode, successCode);
			response.put(messageCode, "LM menu company and division deleted successfully");
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, "Error occurred: " + e.getMessage());
			e.printStackTrace();
		}

		return response.toString();
	}

	public String expireSession(String userName) {
		JSONObject response = new JSONObject();

		try {
			// Check for existing active tokens
			Optional<LjmLogActUser> existingLogin = actrepo.findByLogActUserAndLogActStatus(userName, "ACTIVE");

			if (existingLogin.isPresent()) {
				
				String beforeToken= existingLogin.get().getLogActToken();
			
				

				invalidatedTokenRepository.save(new InvalidatedToken(beforeToken, null));

				// Expire the old session
				LjmLogActUser oldLogin = existingLogin.get();
				 invalidateTokens(oldLogin.getLogActToken());
				oldLogin.setLogActStatus("EXPIRED");
				oldLogin.setLogActMddt(new Timestamp(System.currentTimeMillis())); // Update modification date

				actrepo.save(oldLogin);

				response.put(statusCode, successCode);
				response.put(messageCode, "Session expired successfully.");
			} else {
				response.put(statusCode, errorCode);
				response.put(messageCode, "No active session found for the user.");
			}
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}

	private void invalidateTokens(String logActToken) {
		// TODO Auto-generated method stub
		
	}

	public ResponseEntity<?> logout(HttpServletRequest request) {
		String token = jwtService.extractTokenFromHeader(request);
		JSONObject response = new JSONObject();

		if (token != null) {

			invalidatedTokenRepository.save(new InvalidatedToken(token, null));

			String userName = jwtService.extractUsername(token);
			expireSession(userName);
			response.put(statusCode, successCode);
			response.put(messageCode, "Logout successful");
			return ResponseEntity.ok().body(response.toString());
		} else {

			response.put(statusCode, errorCode);
			response.put(messageCode, "No token provided");
			return ResponseEntity.badRequest().body(response.toString());
		}
	}

}