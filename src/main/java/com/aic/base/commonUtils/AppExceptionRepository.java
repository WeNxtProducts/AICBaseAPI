package com.aic.base.commonUtils;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppExceptionRepository extends JpaRepository<APP_EXCEPTIONS, Long> {
	 
	void save(ExceptionDTO exceptionEntity);
    
}

