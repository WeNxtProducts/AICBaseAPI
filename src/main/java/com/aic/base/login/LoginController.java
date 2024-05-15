package com.aic.base.login;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aic.base.security.JwtService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/auth")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@Autowired
	private InvalidatedTokenRepository invalidatedTokenRepository;

	@Autowired
	private JwtService jwtService;

	@PostMapping("/login")
	public String login(@RequestBody LoginRequestModel login) {
		return loginService.login(login);
	}

	@PostMapping("/getCompList")
	public String getCompany(@RequestBody LoginDropDownRequestModel user) {
		return loginService.getCompany(user);
	}

	@PostMapping("/getBranchList")
	public String getBranch(@RequestBody LoginDropDownRequestModel user) {
		return loginService.getBranch(user);
	}

	@PostMapping("/getDept")
	public String getDept(@RequestBody LoginDropDownRequestModel user) {
		return loginService.getDept(user);
	}

	@PostMapping("/getLang")
	public String getLang() {
		return loginService.getLang();
	}

	@PostMapping("/profile-reset")
	public String resetProfilePassword(@RequestParam String password, @RequestParam String newPassword,
			@RequestParam String confirmPassword) {
		return loginService.resetProfilePassword(password, newPassword, confirmPassword);
	}

	@PostMapping("/forgot-password")
	public ResponseEntity<String> resetPassword(@RequestParam String email) {
		return loginService.processForgotPassword(email);
	}

	@PostMapping("/resetpassword")
	public ResponseEntity<String> resetPassword(@RequestParam String token, @RequestParam String newPassword,
			@RequestParam String confirmPassword) throws InvalidTokenException {
		return loginService.resetPassword(token, newPassword, confirmPassword);
	}

	@PostMapping("/logout")
	public ResponseEntity<?> logout(HttpServletRequest request) {

		String token = jwtService.extractTokenFromHeader(request);
		JSONObject response = new JSONObject();

		if (token != null) {
			invalidatedTokenRepository.save(new InvalidatedToken(token, null));
			// Construct JSON response for success
			response.put("Status", "SUCCESS");
			response.put("status_msg", "Logout successful");
			return ResponseEntity.ok().body(response.toString());
		} else {
			// Construct JSON response for failure (token not provided)
			response.put("Status", "FAILURE");
			response.put("status_msg", "No token provided");
			return ResponseEntity.badRequest().body(response.toString());
		}
	}

	@GetMapping("/password_view")
	public String password(@RequestParam String username, @RequestParam String password, String userId) {
		return loginService.password(username, password, userId);
	}

	@PostMapping("/getCompyByuser")
	public String getAllcompanyListByuser(@RequestBody LoginDropDownRequestModel user) {
		return loginService.getAllcompanyListByuser(user);
	}

	@PostMapping("/companyList")
	public String getAllDeptListByUser(@RequestBody LoginDropDownRequestModel user) {
		return loginService.getAllDeptListByUser(user);
	}

	@PostMapping("/deptsubmit")
	public String getAllDeptSubmit(@RequestBody DeptSubmitRequest deptrequest) {
		return loginService.getAllDeptSubmit(deptrequest);
	}

	@PostMapping("/deptdelete")
	public String deleteDeptSubmit(@RequestBody DeptSubmitRequest request) {
		return loginService.getAllDeptDelete(request);
	}
}
