package com.aic.base.emailTemplate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailTemplateRepo extends JpaRepository<LJM_EMAIL_TEMPLATE, Integer> {

	@Query("SELECT e from LJM_EMAIL_TEMPLATE e WHERE e.ET_SYS_ID = :templateId")
	LJM_EMAIL_TEMPLATE getById(Integer templateId);

}
