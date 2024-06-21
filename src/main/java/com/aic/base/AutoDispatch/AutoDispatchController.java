package com.aic.base.AutoDispatch;

import org.json.JSONObject;
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
@RequestMapping("/auto-dispatch")
public class AutoDispatchController {
	
	@Autowired
	private AutoDispatchService autoDispatchService;
	
//	@PostMapping("/autoDispatch")
//	public String AutoDispatch(@RequestParam String eventId) {
//		return emailTemplateService.startAutoDispatch(eventId);
//	}
	
	@PostMapping("/createAutoDispatch")
	public String createAutoDispatchDetails(@RequestBody AutoDispatchRequest autoDispRequest) {
		try {
		return autoDispatchService.createAutoDispatchDetails(autoDispRequest);
		}catch(Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
	
	@GetMapping("/getAutoDispDetails")
	public String getAutoDispDetails(HttpServletRequest request, @RequestParam String screenCode, @RequestParam String screenName, @RequestParam Integer tranId) {
		return autoDispatchService.getAutoDispDetails(request, screenCode, screenName, tranId);
	}
	
	@PostMapping("/updateAutoDispDetails/{tranId}")
	public String updateAutoDispDetails(@RequestBody AutoDispatchRequest autoDispRequest, @PathVariable Integer tranId) {
		return autoDispatchService.updateAutoDispDetails(autoDispRequest, tranId);
	}
	
	@PostMapping("/deleteAutoDispDetails/{tranId}")
	public String deleteAutoDispDetails(@PathVariable Integer tranId) {
		return autoDispatchService.deleteAutoDispDetails(tranId);
	}
	
	@PostMapping("/triggerAutoDispatch")
	public String triggerSyncAutoAutoDispatch(@RequestBody AutoDispatchDTO autoDispatchDTO, HttpServletRequest request) {
		return autoDispatchService.triggerSyncAutoDispatch(autoDispatchDTO, request);
	}

}
