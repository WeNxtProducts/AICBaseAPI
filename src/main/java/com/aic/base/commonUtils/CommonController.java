package com.aic.base.commonUtils;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/common")
public class CommonController {
	
	@Autowired
	private CommonService service;
	
	@PostMapping("/insertAudit")
	public String insertAudit(@RequestBody APP_AUDIT auditModel) {
		return service.insertAudit(auditModel);
	}
	
	@PostMapping("/getAuditByUserAndScreen")
	public String getAuditByUserAndScreen(@RequestBody APP_AUDIT auditModel) {
		return service.getAuditByUserAndScreen(auditModel);
	}
 
    @PostMapping("/insertException")
    public ResponseEntity<String> insertException(@RequestBody ExceptionDTO exceptionDTO) {
        String result = service.insertException(exceptionDTO);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    
    @GetMapping("/getExceptionList")
    public String getAllExceptions() {
        return service.getAllExceptions();
    }
	
	@GetMapping("/getMenuList")
	public String getMenuList(@RequestParam String groupId, HttpServletRequest request) {
		return service.getMenuList(groupId, request);
	}
	
	@GetMapping("/getlov")
	public String getQueryLov(HttpServletRequest request) {
		return service.getQueryLOV(request);
	}
	
	@GetMapping("/getparamlov")
	public String getQueryParamLov(HttpServletRequest request) {
		return service.getQueryParamLOV(request);
	}
	
	@GetMapping("/getlistingdata")
	public String getListingData(HttpServletRequest request) {
		return service.getListingData(request);
	}
	
	@PostMapping("/getMrvListing")
	public String getMrvListing(HttpServletRequest request) {
		return service.getMrvListing(request);
	}
	
//	@GetMapping("/getfield")
//	public String getFieldList(HttpServletRequest request) {
//		try {
//			return service.getFieldList(request);
//		} catch (IllegalArgumentException | IllegalAccessException e) {
//			return e.getMessage();
//		}
//	}
	
	@PostMapping("/runasyncservice")
	public void runAsyncService(@RequestBody AsyncDTO object, HttpServletRequest request) {
		service.asyncMethod(object, request);
	}
	
	@PostMapping("/runsyncservice")
	public void runSyncService(@RequestBody AsyncDTO inputRequest, HttpServletRequest request) {
		service.syncMethod(inputRequest, request);
	}
	
	@PostMapping("/saveFieldDefJson")
	public void saveFieldDefJson(HttpServletRequest request) {
		service.saveFieldDefJson(request);
	}
	
	@PostMapping("/serviceToJson")
	public String serviceToJson(HttpServletRequest request) {
		return service.serviceToJson(request);
	}
	
	@PostMapping("/editFields")
	public String editFields(HttpServletRequest request) {
		return service.newEditTabs(request, new JSONObject());
	}
	
	@GetMapping("/lovtoJson")
	public String lovToJson(HttpServletRequest request) {
		return service.lovToJson(request);
	}
	
	@GetMapping("/quotationEdit")
	public String quotationMaster(HttpServletRequest request) {
		try {
		return service.quotationEdit(request);
		}catch(Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
	
	@GetMapping("/userEdit")
	public String userMasterEdit(HttpServletRequest request) {
		try {
			return service.userMasterEdit(request);
			}catch(Exception e) {
				e.printStackTrace();
				return e.getMessage();
			}
	}
	
	@GetMapping("/customerEdit")
	public String customerMasterEdit(HttpServletRequest request) {
		try {
			return service.customerMasterEdit(request);
			}catch(Exception e) {
				e.printStackTrace();
				return e.getMessage();
			}
	}
	
	@GetMapping("/userListSearch")
	public String userSearch(HttpServletRequest request) {
		return service.userSearch(request);
	}
	
	@GetMapping("/claimsEdit")
	public String claimsEdit(HttpServletRequest request) {
		try {
			return service.claimsEdit(request);
			}catch(Exception e) {
				e.printStackTrace();
				return e.getMessage();
			}
	}
	
	@GetMapping("/claimsEstimatEdit")
	public String claimEstimateEdit(HttpServletRequest request) {
		try {
			return service.claimEstimateEdit(request);
			}catch(Exception e) {
				e.printStackTrace();
				return e.getMessage();
			}
	}
	
	@GetMapping("/claimsBeneficiaryEdit")
	public String claimBeneficiaryEdit(HttpServletRequest request) {
		try {
			return service.claimBeneficiaryEdit(request);
			}catch(Exception e) {
				e.printStackTrace();
				return e.getMessage();
			}
	}
	
	@GetMapping("/claimsChargesEdit")
	public String claimChargesEdit(HttpServletRequest request) {
		try {
			return service.claimChargesEdit(request);
			}catch(Exception e) {
				e.printStackTrace();
				return e.getMessage();
			}
	}
	
	@GetMapping("/claimsCheckListEdit")
	public String claimCheckListEdit(HttpServletRequest request) {
		try {
			return service.claimCheckListEdit(request);
			}catch(Exception e) {
				e.printStackTrace();
				return e.getMessage();
			}
	}
	@GetMapping("/docPrintListEdit")
	public String docPrintListEdit(HttpServletRequest request) {
		try {
			return service.docPrintListEdit(request);
			}catch(Exception e) {
				e.printStackTrace();
				return e.getMessage();
			}
	}
	
	@GetMapping("/docParamListEdit")
	public String docParamListEdit(HttpServletRequest request) {
		try {
			return service.docParamListEdit(request);
			}catch(Exception e) {
				e.printStackTrace();
				return e.getMessage();
			}
	}
	@PostMapping("/invokeProcedure")
	public String invokeProcedure(@RequestParam String procedureName, @RequestParam(required = false)String packageName, @RequestBody ProcedureInput procedureInput, HttpServletRequest request) {
		try {
			return service.invokeProcedure(packageName, procedureName, procedureInput, request);
			}catch(Exception e) {
				e.printStackTrace();
				return e.getMessage();
			}
	}
	
	@PostMapping("/invokeAsyncProcedure/{procedureName}/{packageName}")
	public void invokeAsyncProcedure(@PathVariable String packageName, @PathVariable String procedureName, @RequestBody ProcedureInput procedureInput, HttpServletRequest request) {
		try {
			service.invokeAsyncProcedure(packageName, procedureName, procedureInput, request);
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

}
