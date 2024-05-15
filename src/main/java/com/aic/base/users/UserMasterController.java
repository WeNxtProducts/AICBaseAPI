package com.aic.base.users;

import java.sql.SQLException;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usermaster")
@CrossOrigin(origins = "http://localhost:8098")
public class UserMasterController {
	
	@Autowired
	private UserMasterService master;
	
	@PostMapping("/create") 
	public String createUser(@RequestBody LM_MENU_USERS LM_MENU_USER ) { 
		return master.createUser(LM_MENU_USER); 
	} 
	
	
	 @GetMapping("/userMasterLiist")
	    public String getAllUserlist() throws JSONException, SQLException {
	        return master.getAllUserlist();
	    }
	 
	 @DeleteMapping("/delete/{userId}")
	    public String deleteUser(@PathVariable String userId) {
		 return master.deleteUserById(userId);
	    }

	 @GetMapping("get/{userId}")
	    public String getUserById(@PathVariable String userId) {
	        return master.getUserById(userId);
	        		
	    }
	 
	 @PostMapping("/createUser")
     public String createLmUser(@RequestBody RequestDataDto requestData) {
         return master.createLmUser(requestData);
     }
}

