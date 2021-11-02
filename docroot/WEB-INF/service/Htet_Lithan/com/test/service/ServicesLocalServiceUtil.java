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

package Htet_Lithan.com.test.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Services. This utility wraps
 * {@link Htet_Lithan.com.test.service.impl.ServicesLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author USER
 * @see ServicesLocalService
 * @see Htet_Lithan.com.test.service.base.ServicesLocalServiceBaseImpl
 * @see Htet_Lithan.com.test.service.impl.ServicesLocalServiceImpl
 * @generated
 */
public class ServicesLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link Htet_Lithan.com.test.service.impl.ServicesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the services to the database. Also notifies the appropriate model listeners.
	*
	* @param services the services
	* @return the services that was added
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services addServices(
		Htet_Lithan.com.test.model.Services services)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addServices(services);
	}

	/**
	* Creates a new services with the primary key. Does not add the services to the database.
	*
	* @param servicesId the primary key for the new services
	* @return the new services
	*/
	public static Htet_Lithan.com.test.model.Services createServices(
		long servicesId) {
		return getService().createServices(servicesId);
	}

	/**
	* Deletes the services with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param servicesId the primary key of the services
	* @return the services that was removed
	* @throws PortalException if a services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services deleteServices(
		long servicesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteServices(servicesId);
	}

	/**
	* Deletes the services from the database. Also notifies the appropriate model listeners.
	*
	* @param services the services
	* @return the services that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services deleteServices(
		Htet_Lithan.com.test.model.Services services)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteServices(services);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Htet_Lithan.com.test.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Htet_Lithan.com.test.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Htet_Lithan.com.test.model.Services fetchServices(
		long servicesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchServices(servicesId);
	}

	/**
	* Returns the services with the matching UUID and company.
	*
	* @param uuid the services's UUID
	* @param companyId the primary key of the company
	* @return the matching services, or <code>null</code> if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services fetchServicesByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchServicesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the services matching the UUID and group.
	*
	* @param uuid the services's UUID
	* @param groupId the primary key of the group
	* @return the matching services, or <code>null</code> if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services fetchServicesByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchServicesByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the services with the primary key.
	*
	* @param servicesId the primary key of the services
	* @return the services
	* @throws PortalException if a services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services getServices(
		long servicesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getServices(servicesId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the services with the matching UUID and company.
	*
	* @param uuid the services's UUID
	* @param companyId the primary key of the company
	* @return the matching services
	* @throws PortalException if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services getServicesByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getServicesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the services matching the UUID and group.
	*
	* @param uuid the services's UUID
	* @param groupId the primary key of the group
	* @return the matching services
	* @throws PortalException if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services getServicesByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getServicesByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the serviceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Htet_Lithan.com.test.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @return the range of serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Services> getServiceses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getServiceses(start, end);
	}

	/**
	* Returns the number of serviceses.
	*
	* @return the number of serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static int getServicesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getServicesesCount();
	}

	/**
	* Updates the services in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param services the services
	* @return the services that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services updateServices(
		Htet_Lithan.com.test.model.Services services)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateServices(services);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<Htet_Lithan.com.test.model.Services> getServicess(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getServicess(groupId);
	}

	public static java.util.List<Htet_Lithan.com.test.model.Services> getServicess(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getServicess(groupId, start, end);
	}

	public static Htet_Lithan.com.test.model.Services addServices(long userId,
		java.lang.String servicesName, java.lang.String servicesPrice,
		java.lang.String servicesDesc,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addServices(userId, servicesName, servicesPrice,
			servicesDesc, serviceContext);
	}

	public static Htet_Lithan.com.test.model.Services updateServices(
		long userId, long servicesId, java.lang.String servicesName,
		java.lang.String servicesPrice, java.lang.String servicesDesc,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateServices(userId, servicesId, servicesName,
			servicesPrice, servicesDesc, serviceContext);
	}

	public static Htet_Lithan.com.test.model.Services deleteServices(
		long userId, long servicesId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteServices(userId, servicesId, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static ServicesLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ServicesLocalService.class.getName());

			if (invokableLocalService instanceof ServicesLocalService) {
				_service = (ServicesLocalService)invokableLocalService;
			}
			else {
				_service = new ServicesLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ServicesLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ServicesLocalService service) {
	}

	private static ServicesLocalService _service;
}