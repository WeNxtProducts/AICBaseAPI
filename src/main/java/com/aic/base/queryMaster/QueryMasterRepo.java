package com.aic.base.queryMaster;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aic.base.commonUtils.QUERY_MASTER;

@Repository
public interface QueryMasterRepo extends JpaRepository<QUERY_MASTER, Integer>{
	
	@Query("SELECT e from QUERY_MASTER e WHERE e.QM_SYS_ID = :templateId")
	QUERY_MASTER getById(Integer templateId);

}
