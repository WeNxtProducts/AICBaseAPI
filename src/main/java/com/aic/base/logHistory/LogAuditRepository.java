package com.aic.base.logHistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogAuditRepository extends JpaRepository<LogAudit, String> {
}