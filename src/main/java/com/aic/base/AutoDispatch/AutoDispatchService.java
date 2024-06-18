package com.aic.base.AutoDispatch;

import jakarta.servlet.http.HttpServletRequest;

public interface AutoDispatchService {

	String createAutoDispatchDetails(AutoDispatchRequest autoDispRequest);

	String getAutoDispDetails(HttpServletRequest request, String screenCode, String screenName, Integer tranId);

	String updateAutoDispDetails(AutoDispatchRequest autoDispRequest, Integer tranId);

	String deleteAutoDispDetails(Integer tranId);

}
