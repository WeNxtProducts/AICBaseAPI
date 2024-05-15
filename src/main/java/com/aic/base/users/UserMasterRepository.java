package com.aic.base.users;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMasterRepository extends JpaRepository<LM_MENU_USERS, String> {

	Optional<LM_MENU_USERS> findByUserId(String username); 
	
	LM_MENU_USERS findByUserEmailId(String email);
	
	LM_MENU_USERS findByUserResettoken(String token);
	
	 LM_MENU_USERS findByUserFirstLoginyn(boolean userFirstLoginyn);
	 
	 LM_MENU_USERS findByUserIdAndUserFirstLoginyn(String username, boolean userFirstLoginyn);

}
