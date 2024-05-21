package com.aic.base.custMaster;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aic.base.commonUtils.LM_CUSTOMER;

@Repository

public interface CustomerRepository extends JpaRepository<LM_CUSTOMER, String> {

	Optional<LM_CUSTOMER> findByCustCode(String custCode);
}