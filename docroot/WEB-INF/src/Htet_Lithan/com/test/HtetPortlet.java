package Htet_Lithan.com.test;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;

import Htet_Lithan.com.test.model.Services;
import Htet_Lithan.com.test.service.ServicesLocalServiceUtil;

/**
 * Portlet implementation class HtetPortlet
 */
public class HtetPortlet extends MVCPortlet {
	
public void addServices(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
	
	ServiceContext serviceContext = ServiceContextFactory.getInstance(Services.class.getName(), actionRequest);

	String servicesName = ParamUtil.getString(actionRequest, "servicesName");
	String servicesPrice = ParamUtil.getString(actionRequest, "servicesPrice");
	String servicesDesc = ParamUtil.getString(actionRequest, "servicesDesc");
	
	//PizzaId which want to edit (from service.jsp)
	Long servicesId = ParamUtil.getLong(actionRequest, "servicesId");
	
	if(servicesId > 0){
		try {
			ServicesLocalServiceUtil.updateServices(serviceContext.getUserId(), servicesId, servicesName, servicesPrice, servicesDesc, serviceContext);
			System.out.println(servicesId + " " + " is updated successfully");
		} catch (Exception e) {
			e.printStackTrace();
			actionResponse.setRenderParameter("mvcPath","/html/htet/servicess.jsp");
		}
	}

	else{
		try {
			ServicesLocalServiceUtil.addServices(serviceContext.getUserId(), servicesName, servicesPrice, servicesDesc, serviceContext);
			System.out.println("Services is added successfully");
			System.out.println("Services name is " + servicesName);
		} catch (Exception e) {
			e.printStackTrace();
			actionResponse.setRenderParameter("mvcPath","/html/htet/servicess.jsp");
		
		}
	}
}

public void deleteServices(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
	long servicesId = ParamUtil.getLong(actionRequest, "servicesId");
	
	try {
		ServicesLocalServiceUtil.deleteServices(servicesId);
		System.out.println(servicesId + " " + " is deleted ");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}

