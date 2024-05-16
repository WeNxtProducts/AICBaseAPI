package com.aic.base.users;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.http.HttpHost;
import org.elasticsearch.action.DocWriteResponse.Result;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.jasypt.encryption.StringEncryptor;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserMasterServiceImpl implements UserMasterService {

	@Autowired
	private UserMasterRepository userrepo;

	@Autowired
	private StringEncryptor encryptor;

	@Value("${get.user.list}")
	private String getallList;

	@Value("${get.user.byId}")
	private String getUserById;

	@Value("${delete.user.byId}")
	private String deleteUserById;

	@Value("${create.new.user}")
	private String createUser;

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

	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "D3Vt3aM#92";

	public String createUser(LM_MENU_USERS lM_MENU_USER) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();
		Optional<LM_MENU_USERS> optionalUser = userrepo.findById(lM_MENU_USER.getUserId());

		if (optionalUser.isPresent()) {

			LM_MENU_USERS existingUser = optionalUser.get();

			userrepo.save(existingUser);
			return "User information updated successfully";
		} else {
			lM_MENU_USER.setUser_passwd(encryptor.encrypt(lM_MENU_USER.getUser_passwd()));
			LM_MENU_USERS user = userrepo.save(lM_MENU_USER);

			response.put("Status", "SUCCESS");
			response.put("Message", createUser);
			data.put("Id", user.getUserId());
			response.put("Data", data);
			return response.toString();
		}
	}

	public String getAllUserlist() {
		String query = "SELECT user_passwd, user_id, user_desc, user_group_id, user_bl_desc, user_start_menu_id, user_ask_passwd_flag, user_change_passwd_flag, user_disable_flag, user_default_printer, user_rep_userid_passwd, user_tel_no, user_tel_extn, user_fax_no, user_login_count, user_ext_yn, user_vps, user_copies, user_prn_code, user_pf_code, user_override_yn, user_ins_Dt, user_ins_id, user_mod_Dt, user_mod_id, user_comp_code, user_administrator_yn, user_email_id, user_mobile_no, user_bl_disp_yn_num, user_vps_flag, user_res_tel_no, user_remarks, user_expiry_day_count, user_passwd_expiry_yn, user_expiry_dt, user_warning_days, user_first_login_yn, user_frz_flag, user_initial, user_designation, user_desig_desc, user_logon_option, user_status, user_eff_to_dt, user_ter_reason, user_credit_card_upd_yn, user_valid_upto, user_pass_exp_date, user_fstlog_flag, user_locked_yn, user_no_of_failed_logins, user_lock_reason, user_email, user_port_code, user_client_id, user_client_code, user_dft_company_code, user_pwd_remind_num, user_pwd_wrong_allow_num, user_pwd_wrong_limit_yn, user_security_code, user_inst_code, user_ds_group_id, user_pwd_reuse_count, user_dflt_lang_code, user_signature FROM lm_menu_users";
		JSONObject response = new JSONObject();

		ResultSet headerResultSet;
		try {
			headerResultSet = executeQuery(query);

			// Creating the header JSONObject
			JSONObject header = new JSONObject();
			if (headerResultSet.next()) {
				header.put("user_desc", "Demo user");
				header.put("user_id", "ID");
				header.put("user_passwd", "PASSWORD");
				header.put("user_pwd_remind_num", "PNUM");
				header.put("user_ins_id", "USERID");
				header.put("user_ins_Dt", "INS_DATE");
				header.put("user_pwd_wrong_limit_yn", "YEAR");
				header.put("user_group_id", "GROUP_ID");

			}

			List<LM_MENU_USERS> exceptions = userrepo.findAll();

			response.put("Status", "SUCCESS");
			response.put("Message", getallList);
			response.put("Heading", header);
			response.put("Data", exceptions);

			return response.toString();
		} catch (SQLException e) {
			response.put("Status", "FAILURE");
			response.put("Message", e.getMessage());
			e.printStackTrace();

			return response.toString();
		}
	}

	private ResultSet executeQuery(String query) throws SQLException {
		try {
			// Load the MySQL JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// Establish a connection
		Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

		// Create a statement
		Statement statement = connection.createStatement();

		// Execute the query and return the result set
		return statement.executeQuery(query);
	}

	public String deleteUserById(String userId) {
		JSONObject response = new JSONObject();
		try {
			Optional<LM_MENU_USERS> optionalEntity = userrepo.findById(userId);

			if (optionalEntity.isPresent()) {
				userrepo.deleteById(userId);

				response.put("Status", "SUCCESS");
				response.put("Message", "User with ID " + userId + " deleted successfully");
				return response.toString();

			} else {
				response.put("Status", "ERROR");
				response.put("Message", "User with ID " + userId + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting user with ID " + userId + ": " + e.getMessage());
			return response.toString();
		}
	}

	public String getUserById(String userId) {
		LM_MENU_USERS lmCustClass = userrepo.findById(userId)
				.orElseThrow(() -> new RuntimeException("LM CLASS not found"));

		JSONObject response = new JSONObject(lmCustClass);

		response.put("Status", "SUCCESS");
		response.put("Message", "Record with ID " + userId + " retrived successfully");
		return response.toString();

	}

	@Override

//	public String createLmUser(RequestDataDto requestData) {
//		JSONObject response = new JSONObject();
//		JSONObject data = new JSONObject();
//
////		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
//		
//		String dateString = "2024-05-03";
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//		LocalTime defautTime = LocalTime.of(0, 0, 0);
//		LocalDate localDate = LocalDate.parse(dateString, formatter);
//		LocalDateTime dateTime = LocalDateTime.of(localDate, defautTime);
//		String formattedDateTime = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
//		

//		try {
//			Map<String, String> formFields = requestData.getFrontForm().getFormFields();
//			String userInitial = formFields.get("user_initial");
//			String userRemarks = formFields.get("user_remarks");
//			String userId = formFields.get("user_id");
//			Double userWarningDays = null;
//			if(formFields.get("user_warning_days").isEmpty() == false && formFields.get("user_warning_days") != null) {
//			userWarningDays = Double.parseDouble(formFields.get("user_warning_days"));
//			}
//			String userLogonOption = formFields.get("user_logon_option");
//			Short userLoginCount = null;
//			if(formFields.get("user_login_count").isEmpty() == false && formFields.get("user_login_count") != null) {
//			userLoginCount = Short.parseShort(formFields.get("user_login_count"));
//			}
//			Integer userExpiryDayCount = null;
//			if(formFields.get("user_expiry_day_count").isEmpty() == false && formFields.get("user_expiry_day_count") != null) {
//			userExpiryDayCount = Integer.parseInt(formFields.get("user_expiry_day_count"));
//			}
//			String userLockedYN = formFields.get("user_locked_yn");
//			Double userPwdReuseCount = null;
//			if(formFields.get("user_pwd_reuse_count").isEmpty() == false && formFields.get("user_pwd_reuse_count") != null) {
//			userPwdReuseCount = Double.parseDouble(formFields.get("user_pwd_reuse_count"));
//			}
////			LocalDateTime userExpiryDt = LocalDateTime.parse(formFields.get("user_expiry_dt"), formattedDateTime);
//			String userEmailId = formFields.get("user_email_id");
//			String userMobileNo = formFields.get("user_mobile_no");
//			String userTelNo = formFields.get("user_tel_no");
//			String userPasswd = formFields.get("user_passwd");
//			String userPasswdExpiryYN = formFields.get("user_passwd_expiry_yn");
//			String userAdministratorYN = formFields.get("user_administrator_yn");
//			String userOverrideYN = formFields.get("user_override_yn");
//			Short userCopies = null;
//			if(formFields.get("user_copies").isEmpty() == false && formFields.get("user_copies") != null) {
//			userCopies = Short.parseShort(formFields.get("user_copies"));
//			}
//
//			String userDsGroupId = formFields.get("user_ds_group_id");
//
//			LM_MENU_USERS newUser = new LM_MENU_USERS();
//			if (userInitial.isEmpty() == false && userInitial != null) {
//				newUser.setUser_initial(userInitial);
//			}
//			if (userRemarks.isEmpty() == false && userInitial != null) {
//				newUser.setUser_remarks(userRemarks);
//			}
//			if (userId.isEmpty() == false && userInitial != null) {
//				newUser.setUserId(userId);
//			}
//			if (String.valueOf(userWarningDays).isEmpty() == false && userInitial != null) {
//				newUser.setUser_warning_days(userWarningDays);
//			}
//			if (userLogonOption.isEmpty() == false && userLogonOption != null) {
//				newUser.setUser_logon_option(userLogonOption);
//			}
//			if (String.valueOf(userLoginCount).isEmpty() == false && String.valueOf(userLoginCount) != null) {
//				newUser.setUser_login_count(userLoginCount);
//			}
//			if (String.valueOf(userExpiryDayCount).isEmpty() == false && String.valueOf(userExpiryDayCount) != null) {
//				newUser.setUser_expiry_day_count(userExpiryDayCount);
//			}
//			if (userLockedYN.isEmpty() == false && userLockedYN != null) {
//				newUser.setUser_locked_yn(userLockedYN);
//			}
//			if (String.valueOf(userPwdReuseCount).isEmpty() == false && String.valueOf(userPwdReuseCount) != null) {
//				newUser.setUser_pwd_reuse_count(userPwdReuseCount);
//			}
////			newUser.setUser_expiry_dt(userExpiryDt);
//			if (userEmailId.isEmpty() == false && userEmailId != null) {
//				newUser.setUserEmailId(userEmailId);
//			}
//			if (userMobileNo.isEmpty() == false && userMobileNo != null) {
//				newUser.setUser_mobile_no(userMobileNo);
//			}
//			if (userTelNo.isEmpty() == false && userTelNo != null) {
//				newUser.setUser_tel_no(userTelNo);
//			}
//			if (userPasswd.isEmpty() == false && userPasswd != null) {
//				newUser.setUser_passwd(encryptor.encrypt(userPasswd));
//			}
//			if (userPasswdExpiryYN.isEmpty() == false && userPasswdExpiryYN != null) {
//				newUser.setUser_passwd_expiry_yn(userPasswdExpiryYN);
//			}
//			if (userAdministratorYN.isEmpty() == false && userAdministratorYN != null) {
//				newUser.setUser_administrator_yn(userAdministratorYN);
//			}
//			if (userOverrideYN.isEmpty() == false && userOverrideYN != null) {
//				newUser.setUser_override_yn(userOverrideYN);
//			}
//			if (String.valueOf(userCopies).isEmpty() == false && String.valueOf(userCopies) != null) {
//				newUser.setUser_copies(userCopies);
//			}
//			if (userDsGroupId.isEmpty() == false && userDsGroupId != null) {
//				newUser.setUser_ds_group_id(userDsGroupId);
//			}
//			LocalDateTime currentDate = LocalDateTime.now();
////			newUser.setUser_ins_Dt(currentDate);
//
//			Optional<LM_MENU_USERS> optionalUser = userrepo.findById(newUser.getUserId());
//
//			if (optionalUser.isPresent()) {
//				LM_MENU_USERS existingUser = optionalUser.get();
//
//				// Keep the existing user_ins_Dt value
//				if (existingUser.getUser_ins_Dt() != null) {
//					newUser.setUser_ins_Dt(existingUser.getUser_ins_Dt());
//				}
//
//				if (newUser.getUser_passwd() != null && !newUser.getUser_passwd().isEmpty()) {
//					newUser.setUser_passwd(encryptor.encrypt(userPasswd));
//				}
//
//				newUser.setUser_ins_id(existingUser.getUserId());
//				newUser.setUser_mod_Dt(currentDate);
//				userrepo.save(newUser);
//				response.put("Status", "SUCCESS");
//				response.put("Message", "User information updated successfully");
//				data.put("Id", existingUser.getUserId());
//			} else {
////				 LM_MENU_USERS User = optionalUser.get();
//				// Set user_ins_Dt only when user is created
////				newUser.setUser_ins_Dt(currentDate);
////				newUser.setUser_mod_id(newUser.getUserId());
//				LM_MENU_USERS savedUser = userrepo.save(newUser);
//
//				response.put("Status", "SUCCESS");
//				response.put("Message", "User created successfully");
//				data.put("Id", savedUser.getUserId());
//			}
//
//			response.put("Data", data);
//		} catch (Exception e) {
//			e.printStackTrace();
//			response.put("Status", "FAILURE");
//			response.put("Message", "An error occurred: " + e.getMessage());
//		}
//
//		return response.toString();
//	}

	public String createLmUser(RequestDataDto requestData) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			Map<String, String> formFields = requestData.getFrontForm().getFormFields();
			Optional<LM_MENU_USERS> optionalUser = userrepo.findById(formFields.get("user_id"));
			if (optionalUser.isPresent() == false) {
				LM_MENU_USERS user = new LM_MENU_USERS();
				for (Map.Entry<String, String> entry : formFields.entrySet()) {
					String key = entry.getKey();
					String value = entry.getValue();

					Class classs = user.getClass();
					Field field = null;
					if (key.equals("user_id")) {
						user.setUserId(value);
					}
					if (key.equals("user_email_id")) {
						user.setUserEmailId(value);
						
					}

					try {
						field = classs.getDeclaredField(key);
					} catch (Exception e) {

					}
					if (field != null) {
						Class fieldType = field.getType();
						Object convertedValue = convertStringToObject(value, fieldType);
						String setterMethodName = "set" + key.substring(0, 1).toUpperCase()
								+ key.substring(1, key.length());

						if (value.isEmpty() == false && value != null) {
							Method setter = classs.getMethod(setterMethodName, fieldType);
							if (key.equals("user_passwd")) {
								String encryptedPassword = encryptor.encrypt(value);
								convertedValue = encryptedPassword;
							}
							setter.invoke(user, convertedValue);
						}
					}
				}
				try {

					LM_MENU_USERS savedUser = userrepo.save(user);
					response.put(statusCode, successCode);
					response.put(messageCode, "User created successfully");
					data.put("Id", savedUser.getUserId());
					response.put(dataCode, data);
					
			        RestClientBuilder builder = RestClient.builder(
			                new HttpHost("192.168.1.150", 9200, "http"));
			        RestHighLevelClient client = new RestHighLevelClient(builder);

			        IndexRequest req = new IndexRequest("users").id(savedUser.getUserId()).source(formFields);
			        
			        IndexResponse res = client.index(req, RequestOptions.DEFAULT);
			        
			        if (res.getResult() == Result.CREATED) {
			        
			        	} else {
			        	  // Handle indexing failure
			        	}

			        	client.close();
				} catch (Exception e) {
					e.printStackTrace();
					response.put(statusCode, errorCode);
					response.put(messageCode, "An error occurred: " + e.getMessage());
				}
			} else {

				LM_MENU_USERS existingUser = optionalUser.get();
				Map<String, Object> updateMap = new HashMap<String, Object>();

				for (Map.Entry<String, String> entry : formFields.entrySet()) {
					String key = entry.getKey();
					String value = entry.getValue();

					Class classs = existingUser.getClass();
					Field field = null;

					if (key.equals("user_email_id")) {
						existingUser.setUserEmailId(value);
					}
					try {
						field = classs.getDeclaredField(key);
					} catch (Exception e) {

					}
					if (field != null) {
						Class fieldType = field.getType();
						Object convertedValue = convertStringToObject(value, fieldType);
						String setterMethodName = "set" + key.substring(0, 1).toUpperCase()
								+ key.substring(1, key.length());

						if (value.isEmpty() == false && value != null) {
							Method setter = classs.getMethod(setterMethodName, fieldType);
							updateMap.put(field.getName(), value);
							setter.invoke(existingUser, convertedValue);

						}
					}
				}
				try {
					userrepo.save(existingUser);
					response.put(statusCode, successCode);
					response.put(messageCode, "User information updated successfully");
					data.put("Id", existingUser.getUserId());
					response.put(dataCode, data);
					
					String indexName = "users";
					String documentId = existingUser.getUserId().toString();
					
			        RestClientBuilder builder = RestClient.builder(
			                new HttpHost("192.168.1.150", 9200, "http"));
			        RestHighLevelClient client = new RestHighLevelClient(builder);

					UpdateRequest updateRequest = new UpdateRequest(indexName, documentId);
					updateRequest.doc(updateMap);
					
					 UpdateResponse updateResponse = client.update(updateRequest, RequestOptions.DEFAULT);

					    if (updateResponse.getResult() == Result.UPDATED) {
					      
					    } else if (updateResponse.getResult() == Result.NOOP) {
					        
					    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response.toString();
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
		} else {
			return value;
		}
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

}
