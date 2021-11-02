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

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import Htet_Lithan.com.test.servicesNameException;
import Htet_Lithan.com.test.servicesPriceException;
import Htet_Lithan.com.test.model.Services;
import Htet_Lithan.com.test.service.base.ServicesLocalServiceBaseImpl;

/**
 * The implementation of the services local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link Htet_Lithan.com.test.service.ServicesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author USER
 * @see Htet_Lithan.com.test.service.base.ServicesLocalServiceBaseImpl
 * @see Htet_Lithan.com.test.service.ServicesLocalServiceUtil
 */
public class ServicesLocalServiceImpl extends ServicesLocalServiceBaseImpl {
	//Finder Method 
		public List<Services> getServicess(long groupId) throws SystemException{
			return servicesPersistence.findByservicesFinder(groupId);
		}
	//Finder Method with pagination
		public List<Services> getServicess(long groupId, int start, int end) throws SystemException{
			return servicesPersistence.findByservicesFinder(groupId, start, end);
		}
	//Validation method
		protected void validate(String servicesName, String servicesPrice) throws PortalException{
			if(Validator.isNull(servicesName))
				throw new servicesNameException();
			
			if(Validator.isNull(servicesPrice))
				throw new servicesPriceException();
		}
		//Add Services Method
		public Services addServices(long userId, String servicesName, String servicesPrice, String servicesDesc, ServiceContext serviceContext) throws PortalException, SystemException{
			
			//Scope Column(uuid, groupId, companyId)
			//User Column (userId, userName)
			//Audit Column (createDate, modifiedDate)
			
			User user = userPersistence.findByPrimaryKey(userId);
			Date now = new Date();
			long servicesId = counterLocalService.increment();
			
			Services services = servicesPersistence.create(servicesId);
			
			services.setUuid(serviceContext.getUuid());
			services.setGroupId(serviceContext.getScopeGroupId());
			services.setCompanyId(serviceContext.getCompanyId());
			
			services.setUserId(user.getUserId());
			services.setUserName(user.getFullName());
			
			services.setCreateDate(serviceContext.getCreateDate(now));
			services.setModifiedDate(serviceContext.getModifiedDate(now));
			
			services.setServicesName(servicesName);
			services.setServicesPrice(servicesPrice);
			services.setServicesDesc(servicesDesc);
			
			services.setExpandoBridgeAttributes(serviceContext);
			
			servicesPersistence.update(services);
			
			resourceLocalService.addResources(user.getCompanyId(),serviceContext.getScopeGroupId(), userId, Services.class.getName(), servicesId, false, true,true);
			
			return services;
		}
		//Update Service 
		public Services updateServices(long userId, long servicesId, String servicesName, String servicesPrice, String servicesDesc, ServiceContext serviceContext) throws PortalException, SystemException {
			//get current pizzaId 
			Services services = servicesPersistence.findByPrimaryKey(servicesId);
			
			//set modified date
			services.setModifiedDate(serviceContext.getModifiedDate());
			
			//allows to edit or update servicesName, servicesPrice, servicesDescription
			services.setServicesName(servicesName);
			services.setServicesPrice(servicesPrice);
			services.setServicesDesc(servicesDesc);
			
			services.setExpandoBridgeAttributes(serviceContext);
			
			servicesPersistence.update(services);
			User user = userPersistence.findByPrimaryKey(userId);
			
			resourceLocalService.updateResources(
					user.getCompanyId(),serviceContext.getScopeGroupId(),Services.class.getName(),servicesId,
					serviceContext.getGroupPermissions(),
					serviceContext.getGuestPermissions());
					
			
			return services;
		}
		
		@Override
		public Services deleteServices(long userId, long servicesId, ServiceContext serviceContext)
				throws PortalException, SystemException {
			//Get servicesId which we want to delete
			Services services = getServices(servicesId);
			//Call deleteServices method by passing current servicesId which want to delete
			services =  deleteServices(servicesId);
			//return current services object
			
			resourceLocalService.deleteResource(
					serviceContext.getCompanyId(),Services.class.getName(),
					ResourceConstants.SCOPE_INDIVIDUAL,servicesId);
			return services;
		}				

}