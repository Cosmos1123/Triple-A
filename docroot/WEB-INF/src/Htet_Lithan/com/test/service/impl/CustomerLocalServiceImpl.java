/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package Htet_Lithan.com.test.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import Htet_Lithan.com.test.customerAddressException;
import Htet_Lithan.com.test.customerNameException;
import Htet_Lithan.com.test.model.Customer;
import Htet_Lithan.com.test.service.base.CustomerLocalServiceBaseImpl;

/**
 * The implementation of the customer local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link Htet_Lithan.com.test.service.CustomerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author USER
 * @see Htet_Lithan.com.test.service.base.CustomerLocalServiceBaseImpl
 * @see Htet_Lithan.com.test.service.CustomerLocalServiceUtil
 */
public class CustomerLocalServiceImpl extends CustomerLocalServiceBaseImpl {
	//FinderMethod	
		public List<Customer> getCustomers (long groupId) throws SystemException{
			return customerPersistence.findByCustomerFinder(groupId);
		}
		
		//FinderMethod with pagination
		public List<Customer> getCustomers (long groupId, int start, int end) throws SystemException{
			return customerPersistence.findByCustomerFinder(groupId, start, end);
		}
		
		//Validation
		protected void validate(String customerName, String customerAddress) throws PortalException{
			if(Validator.isNull(customerName))
				throw new customerNameException();
			
			if(Validator.isNull(customerAddress))
				throw new customerAddressException();
		}
		//Add Customer
		public Customer addCustomer(long userId, String customerName, String customerEmail, String customerContact, String customerAddress,  String payment, int month, int day, int year, int hour, int minute, long servicesId, ServiceContext serviceContext) throws PortalException, SystemException{
			
			//Scope Column(uuid, groupId, companyId)
			//User Column (userId, userName)
			//Audit Column (createDate, modifiedDate)
					
			User user = userPersistence.findByPrimaryKey(userId);
			Date now = new Date();
			
			long customerId = counterLocalService.increment();
			Customer customer = customerPersistence.create(customerId);
			
			customer.setUuid(serviceContext.getUuid());
			customer.setGroupId(serviceContext.getScopeGroupId());
			customer.setCompanyId(serviceContext.getCompanyId());
			
			customer.setUserId(user.getUserId());
			customer.setUserName(user.getFullName());
			
			customer.setCreateDate(serviceContext.getCreateDate(now));
			customer.setModifiedDate(serviceContext.getModifiedDate(now));
			
			customer.setCustomerName(customerName);
			customer.setCustomerEmail(customerEmail);
			customer.setCustomerContact(customerContact);
			customer.setCustomerAddress(customerAddress);
			customer.setPayment(payment);
			

			//Create calendar object to initialize current time zone
			Calendar dateCal = CalendarFactoryUtil.getCalendar(user.getTimeZone());
			dateCal.set(year, month, day, hour, minute);
			
			//Create date object to get Calendar date
			Date calDate = dateCal.getTime();
			
			
			customer.setTime(calDate);
			
			customer.setServicesId(servicesId);
			
			customer.setExpandoBridgeAttributes(serviceContext);
			
			customerPersistence.update(customer);

			return customer;
		}
		public Customer updateCustomer(long userId, long customerId, String customerName, String customerEmail, String customerContact, String customerAddress,  String payment, int month, int day, int year, int hour, int minute, long servicesId, ServiceContext serviceContext) throws SystemException, PortalException{
			Customer customer = customerPersistence.findByPrimaryKey(customerId);
			
			Date now = new Date();
			User user = userPersistence.findByPrimaryKey(userId);
			
			customer.setModifiedDate(serviceContext.getModifiedDate(now));
			
			customer.setCustomerName(customerName);
			customer.setCustomerEmail(customerEmail);
			customer.setCustomerContact(customerContact);
			customer.setCustomerAddress(customerAddress);
			customer.setPayment(payment);
			
			//Create calendar object to initialize current time zone
			Calendar dateCal = CalendarFactoryUtil.getCalendar(user.getTimeZone());
			dateCal.set(year, month, day, hour, minute);
			
			//Create date object to get Calendar date
			Date calDate = dateCal.getTime();
			
			
			customer.setTime(calDate);
			
			customer.setServicesId(servicesId);
			
			customer.setExpandoBridgeAttributes(serviceContext);
			
			customerPersistence.update(customer);

			return customer;
		}
		public Customer deleteCustomer(long customerId) throws SystemException, PortalException{
			Customer customer = getCustomer(customerId);
			customer = deleteCustomer(customer);
			return customer;
		}
}