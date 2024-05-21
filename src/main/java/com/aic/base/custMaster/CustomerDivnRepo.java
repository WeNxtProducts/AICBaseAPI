package com.aic.base.custMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aic.base.model.lm_cust_divn;

@Repository
public interface CustomerDivnRepo extends JpaRepository<lm_cust_divn, Integer> {
	
	lm_cust_divn getById(Integer id);
	
	void deleteById(Integer id);

}
