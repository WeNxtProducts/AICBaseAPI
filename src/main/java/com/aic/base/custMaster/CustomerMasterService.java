package com.aic.base.custMaster;
import java.sql.SQLException;

import org.json.JSONException;

import com.aic.base.model.CustomerRequestDto;
import com.aic.base.model.LM_CUST_CURR;
import com.aic.base.model.lm_cust_divn;

public interface CustomerMasterService {

	String getAllCustomlist() throws JSONException, SQLException;

	String getCustomerUserById(String custcode);

	String deleteUserById(String custcode);

	String createCustomer(CustomerRequestDto requestData);

	String addBranch(lm_cust_divn customerDivn);

	String updateBranch(lm_cust_divn customerDivn);

	String addCurrency(LM_CUST_CURR customerCurrency);

	String updateCurrency(LM_CUST_CURR customerCurrency);

	String deleteBranch(Integer iD);

	String deleteCurrency(Integer iD);

}