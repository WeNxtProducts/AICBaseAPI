package com.aic.base.security;

import java.util.Optional;

import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.aic.base.users.LM_MENU_USERS;
import com.aic.base.users.UserMasterRepository;

@Service
@Primary
public class UserInfoService implements UserDetailsService {

	@Autowired
	private UserMasterRepository userrrepo;

	@Autowired
	private StringEncryptor encryptor;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<LM_MENU_USERS> userDetail = userrrepo.findByUserId(username);

		// Converting userDetail to UserDetails
		return userDetail.map(UserInfoDetails::new)
				.orElseThrow(() -> new UsernameNotFoundException("User not found " + username));
	}
//
//	public String addUser(UserInfo userInfo) { 
//		userInfo.setPassword(encryptor.encrypt(userInfo.getPassword())); 
//		repository.save(userInfo); 
//		return "User Added Successfully"; 
//	} 

}
