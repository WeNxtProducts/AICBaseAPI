package com.aic.base.commonUtils;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.aic.base.model.LM_USER_APPR_SETUP_DET;

@Repository
public interface UserApprSetupRepository extends JpaRepository<LM_USER_APPR_SETUP_DET, Integer>{

	@Query("SELECT e FROM LM_USER_APPR_SETUP_DET e WHERE e.ASD_USER_ID = :userId AND e.ASD_MODULE_ID = :moduleId")
	List<LM_USER_APPR_SETUP_DET> getSetup(@Param("userId") String userId, @Param("moduleId") String moduleId);

}
