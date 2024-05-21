package com.aic.base.custMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aic.base.model.LM_CUST_CURR;

@Repository
public interface CustomerCurrencyRepo extends JpaRepository<LM_CUST_CURR, Integer> {
	
	void deleteById(Integer id);

}
