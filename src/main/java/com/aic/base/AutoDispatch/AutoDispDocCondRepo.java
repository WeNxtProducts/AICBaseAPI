package com.aic.base.AutoDispatch;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoDispDocCondRepo extends JpaRepository<AutoDispDocCond, Integer> {
	
	@Query("SELECT e.ADDC_TEMP_NAME FROM AutoDispDocCond e WHERE ADDC_ADS_SYS_ID.ADS_SYS_ID = :tranId")
	List<String> getTemplateNames(@Param("tranId") Integer tranId);

	@Query("SELECT e FROM AutoDispDocCond e WHERE ADDC_ADS_SYS_ID.ADS_SYS_ID = :tranId")
	List<AutoDispDocCond> getExisitingTemplates(@Param("tranId") Integer tranId);

}
