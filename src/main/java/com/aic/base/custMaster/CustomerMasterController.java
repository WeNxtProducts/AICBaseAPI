package com.aic.base.custMaster;

import java.sql.SQLException;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aic.base.model.CustomerRequestDto;
import com.aic.base.model.LM_CUST_CURR;
import com.aic.base.model.lm_cust_divn;

@RestController
@RequestMapping("/customer")
public class CustomerMasterController {

	@Autowired
	private CustomerMasterService custom;

	@PostMapping("/create")
	public String createCustomer(@RequestBody CustomerRequestDto requestData) {
		return custom.createCustomer(requestData);
	}

	@GetMapping("/customerList")
	public String getAllCustomlist() throws JSONException, SQLException {
		return custom.getAllCustomlist();
	}

	@GetMapping("getcustomer/{custCode}")
	public String getCustomerUserById(@PathVariable String custCode) {
		return custom.getCustomerUserById(custCode);

	}

	@DeleteMapping("/deletes/{custCode}")
	public String deleteUser(@PathVariable String custCode) {
		return custom.deleteUserById(custCode);
	}

	@PostMapping("/addBranch")
	public String addBranch(@RequestBody lm_cust_divn customerDivn) {
		return custom.addBranch(customerDivn);
	}

	@PostMapping("/updateBranch")
	public String updateBranch(@RequestBody lm_cust_divn customerDivn) {
		return custom.updateBranch(customerDivn);
	}

	@PostMapping("/addCurrency")
	public String addCurrency(@RequestBody LM_CUST_CURR customerCurrency) {
		return custom.addCurrency(customerCurrency);
	}

	@PostMapping("/updateCurrency")
	public String updateCurrency(@RequestBody LM_CUST_CURR customerCurrency) {
		return custom.updateCurrency(customerCurrency);
	}

	@PostMapping("/deleteBranch")
	public String deleteBranch(@RequestParam Integer ID) {
		return custom.deleteBranch(ID);
	}

	@PostMapping("/deleteCurrency")
	public String deleteCurrency(@RequestParam Integer ID) {
		return custom.deleteCurrency(ID);
	}

}