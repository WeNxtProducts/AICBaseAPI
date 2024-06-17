package com.aic.base.queryMaster;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aic.base.commonUtils.QUERY_MASTER;
import com.aic.base.commonUtils.QUERY_PARAM_MASTER;

@Repository
public interface QueryParamMasterRepo extends JpaRepository<QUERY_PARAM_MASTER, Integer> {
	
	@Query("SELECT e from QUERY_PARAM_MASTER e WHERE e.QPM_SYS_ID = :templateId")
	QUERY_PARAM_MASTER getById(Integer templateId);

}
