package com.aic.base.users;

public interface UserMasterService {
	
	public String createUser(LM_MENU_USERS lm_menu_user);
	
	public String getAllUserlist();
	
	public String deleteUserById(String userId);
	
	public String getUserById(String userId);
	
	public String createLmUser(RequestDataDto requestData);

}
