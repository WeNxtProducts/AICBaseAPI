package com.aic.base.commonUtils;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AppAuditRepository extends JpaRepository<APP_AUDIT, Integer> {
	
	  @Query("SELECT a FROM APP_AUDIT a WHERE a._AAD_User_Id = ?1 AND a._AAD_Screen_Name = ?2")
	  List<APP_AUDIT> findBy_AAD_User_IdAnd_AAD_Screen_Name(String name, String type);

}
