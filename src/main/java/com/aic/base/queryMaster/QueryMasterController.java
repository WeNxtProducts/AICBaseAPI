package com.aic.base.queryMaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aic.base.emailTemplate.EmailTemplateRequest;

import jakarta.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/queryMaster")
public class QueryMasterController {
	
	@Autowired
	private QueryMasterServcie queryMasterService;
	
	@PostMapping("/createQuery")
	public String createQuery(@RequestBody QueryMasterRequest queryMasterRequest) {
		try {
		return queryMasterService.createQuery(queryMasterRequest);
		}catch(Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
	
	@PostMapping("/updateQuery/{queryId}")
	public String updateTemplate(@RequestBody QueryMasterRequest queryMasterRequest, @PathVariable Integer queryId) {
		return queryMasterService.updateQueryDetails(queryMasterRequest, queryId);
	}
	
	@PostMapping("/deleteQuery/{queryId}")
	public String deleteTemplate(@PathVariable Integer queryId) {
		return queryMasterService.deleteQueryDetails(queryId);
	}
	
	@GetMapping("/getQueryDetails")
	public String getQueryDetails(HttpServletRequest request, @RequestParam String screenCode, @RequestParam String screenName, @RequestParam Integer tranId) {
		return queryMasterService.getQueryDetails(request, screenCode, screenName, tranId);
	}
	
	@PostMapping("/createQueryParam/{queryId}")
	public String createQueryParam(@RequestBody QueryMasterRequest queryMasterRequest, @PathVariable Integer queryId) {
		try {
		return queryMasterService.createQueryParam(queryMasterRequest, queryId);
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	@PostMapping("/updateQueryParam/{queryParamId}")
	public String updateQueryParam(@RequestBody QueryMasterRequest queryMasterRequest, @PathVariable Integer queryParamId) {
		return queryMasterService.updateQueryParam(queryMasterRequest, queryParamId);
	}
	
	@PostMapping("/deleteQueryParam/{queryId}")
	public String deleteQueryParam(@PathVariable Integer queryId) {
		return queryMasterService.deleteQueryParam(queryId);
	}
	
	@GetMapping("/getQueryParam")
	public String getQueryParam(HttpServletRequest request, @RequestParam String screenCode, @RequestParam String screenName, @RequestParam Integer tranId) {
		return queryMasterService.getQueryParam(request, screenCode, screenName, tranId);
	}


}
