package com.aic.base.logHistory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogActUserRepository extends JpaRepository<LjmLogActUser, String> {
	Optional<LjmLogActUser> findByLogActUserAndLogActStatus(String logActUser, String logActStatus);
	}