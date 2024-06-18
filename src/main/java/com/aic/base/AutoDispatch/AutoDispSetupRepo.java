package com.aic.base.AutoDispatch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoDispSetupRepo extends JpaRepository<AutoDispSetup, Integer> {

	@Query("SELECT e FROM AutoDispSetup e WHERE ADS_EVENT_ID = :eventId")
	AutoDispSetup getByEventId(@Param("eventId") String eventId);
	
	@Query("SELECT e FROM AutoDispSetup e WHERE ADS_SYS_ID = :tranId")
	AutoDispSetup getById(@Param("tranId") Integer tranId);

}
