package Htet_Lithan.com.test;

import java.util.Calendar;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;

import Htet_Lithan.com.test.model.Customer;
import Htet_Lithan.com.test.service.CustomerLocalServiceUtil;

/**
 * Portlet implementation class CustomerPortlet
 */
public class CustomerPortlet extends MVCPortlet {

	public void addCustomer(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Customer.class.getName(), actionRequest);
		
		String customerName = ParamUtil.getString(actionRequest, "customerName");
		String customerEmail = ParamUtil.getString(actionRequest, "customerEmail");
		String customerContact = ParamUtil.getString(actionRequest, "customerContact");
		String customerAddress = ParamUtil.getString(actionRequest, "customerAddress");
		String payment = ParamUtil.getString(actionRequest, "payment");
		Long servicesId = ParamUtil.getLong(actionRequest, "servicesId");
		Long customerId = ParamUtil.getLong(actionRequest, "customerId");
		
		int year = ParamUtil.getInteger(actionRequest, "timeYear");
		int month = ParamUtil.getInteger(actionRequest, "timeMonth");
		int day = ParamUtil.getInteger(actionRequest, "timeDay");
		int hour = ParamUtil.getInteger(actionRequest, "timeHour");
		int minute = ParamUtil.getInteger(actionRequest, "timeMinute");
		int amPm = ParamUtil.getInteger(actionRequest, "timeAmPm");
		
		if(amPm == Calendar.PM){
			hour += 12;
		}
		
		if(customerId>0){
			try {
				CustomerLocalServiceUtil.updateCustomer(serviceContext.getUserId(), customerId, customerName, customerEmail, customerContact, customerAddress, payment, month, day, year, hour, minute, servicesId, serviceContext);
				System.out.println(customerId + " " + " is updated successfully");
			} catch (Exception e) {
				e.printStackTrace();
				actionResponse.setRenderParameter("mvcPath", "/html/customer/customer.jsp");
			}
		}
		else{
			try {
				CustomerLocalServiceUtil.addCustomer(serviceContext.getUserId(), customerName, customerEmail, customerContact, customerAddress, payment, month, day, year, hour, minute, servicesId, serviceContext);
				System.out.println("Customer is added to the database");
			} catch (Exception e) {
				e.printStackTrace();
				actionResponse.setRenderParameter("mvcPath", "/html/customer/customer.jsp");
			}
		}
	}

	public void deleteCustomer(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		long customerId = ParamUtil.getLong(actionRequest, "customerId");
		
		try {
			CustomerLocalServiceUtil.deleteCustomer(customerId);
			System.out.println(customerId + " " + " is deleted successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
