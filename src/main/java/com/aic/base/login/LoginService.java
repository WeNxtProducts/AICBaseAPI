package com.aic.base.login;

import org.springframework.http.ResponseEntity;

public interface LoginService {

	public String getCompany(LoginDropDownRequestModel user);

	public String getBranch(LoginDropDownRequestModel user);

	public String getDept(LoginDropDownRequestModel user);

	public String login(LoginRequestModel login);

	public String getLang();

	public ResponseEntity<String> processForgotPassword(String email);

	public ResponseEntity<String> resetPassword(String token, String newPassword, String confirmPassword)
			throws InvalidTokenException;

	public String resetProfilePassword(String password, String newPassword, String confirmPassword);

	public String password(String username, String password, String userId);

	public String getAllcompanyListByuser(LoginDropDownRequestModel user);

	public String getAllDeptListByUser(LoginDropDownRequestModel user);

	public String getAllDeptSubmit(DeptSubmitRequest deptrequest);

	public String getAllDeptDelete(DeptSubmitRequest request);

}
