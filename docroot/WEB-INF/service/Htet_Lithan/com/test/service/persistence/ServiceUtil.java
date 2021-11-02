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

package Htet_Lithan.com.test.service.persistence;

import Htet_Lithan.com.test.model.Service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the service service. This utility wraps {@link ServicePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author USER
 * @see ServicePersistence
 * @see ServicePersistenceImpl
 * @generated
 */
public class ServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Service service) {
		getPersistence().clearCache(service);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Service> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Service> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Service> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Service update(Service service) throws SystemException {
		return getPersistence().update(service);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Service update(Service service, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(service, serviceContext);
	}

	/**
	* Returns all the services where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Service> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the services where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Htet_Lithan.com.test.model.impl.ServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of services
	* @param end the upper bound of the range of services (not inclusive)
	* @return the range of matching services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Service> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the services where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Htet_Lithan.com.test.model.impl.ServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of services
	* @param end the upper bound of the range of services (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Service> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first service in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service
	* @throws Htet_Lithan.com.test.NoSuchServiceException if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Service findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first service in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service, or <code>null</code> if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Service fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last service in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service
	* @throws Htet_Lithan.com.test.NoSuchServiceException if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Service findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last service in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service, or <code>null</code> if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Service fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the services before and after the current service in the ordered set where uuid = &#63;.
	*
	* @param serviceId the primary key of the current service
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next service
	* @throws Htet_Lithan.com.test.NoSuchServiceException if a service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Service[] findByUuid_PrevAndNext(
		long serviceId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_PrevAndNext(serviceId, uuid, orderByComparator);
	}

	/**
	* Removes all the services where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of services where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching services
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the service where uuid = &#63; and groupId = &#63; or throws a {@link Htet_Lithan.com.test.NoSuchServiceException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching service
	* @throws Htet_Lithan.com.test.NoSuchServiceException if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Service findByUUID_G(
		java.lang.String uuid, long groupId)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the service where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching service, or <code>null</code> if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Service fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the service where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching service, or <code>null</code> if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Service fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the service where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the service that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Service removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of services where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching services
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the services where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Service> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the services where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Htet_Lithan.com.test.model.impl.ServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of services
	* @param end the upper bound of the range of services (not inclusive)
	* @return the range of matching services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Service> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the services where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Htet_Lithan.com.test.model.impl.ServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of services
	* @param end the upper bound of the range of services (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Service> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first service in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service
	* @throws Htet_Lithan.com.test.NoSuchServiceException if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Service findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first service in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service, or <code>null</code> if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Service fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last service in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service
	* @throws Htet_Lithan.com.test.NoSuchServiceException if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Service findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last service in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service, or <code>null</code> if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Service fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the services before and after the current service in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param serviceId the primary key of the current service
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next service
	* @throws Htet_Lithan.com.test.NoSuchServiceException if a service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Service[] findByUuid_C_PrevAndNext(
		long serviceId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(serviceId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the services where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of services where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching services
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the services where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Service> findByServiceFinder(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByServiceFinder(groupId);
	}

	/**
	* Returns a range of all the services where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Htet_Lithan.com.test.model.impl.ServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of services
	* @param end the upper bound of the range of services (not inclusive)
	* @return the range of matching services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Service> findByServiceFinder(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByServiceFinder(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the services where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Htet_Lithan.com.test.model.impl.ServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of services
	* @param end the upper bound of the range of services (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Service> findByServiceFinder(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByServiceFinder(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first service in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service
	* @throws Htet_Lithan.com.test.NoSuchServiceException if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Service findByServiceFinder_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByServiceFinder_First(groupId, orderByComparator);
	}

	/**
	* Returns the first service in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service, or <code>null</code> if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Service fetchByServiceFinder_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByServiceFinder_First(groupId, orderByComparator);
	}

	/**
	* Returns the last service in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service
	* @throws Htet_Lithan.com.test.NoSuchServiceException if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Service findByServiceFinder_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByServiceFinder_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last service in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service, or <code>null</code> if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Service fetchByServiceFinder_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByServiceFinder_Last(groupId, orderByComparator);
	}

	/**
	* Returns the services before and after the current service in the ordered set where groupId = &#63;.
	*
	* @param serviceId the primary key of the current service
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next service
	* @throws Htet_Lithan.com.test.NoSuchServiceException if a service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Service[] findByServiceFinder_PrevAndNext(
		long serviceId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByServiceFinder_PrevAndNext(serviceId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the services where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByServiceFinder(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByServiceFinder(groupId);
	}

	/**
	* Returns the number of services where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching services
	* @throws SystemException if a system exception occurred
	*/
	public static int countByServiceFinder(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByServiceFinder(groupId);
	}

	/**
	* Caches the service in the entity cache if it is enabled.
	*
	* @param service the service
	*/
	public static void cacheResult(Htet_Lithan.com.test.model.Service service) {
		getPersistence().cacheResult(service);
	}

	/**
	* Caches the services in the entity cache if it is enabled.
	*
	* @param services the services
	*/
	public static void cacheResult(
		java.util.List<Htet_Lithan.com.test.model.Service> services) {
		getPersistence().cacheResult(services);
	}

	/**
	* Creates a new service with the primary key. Does not add the service to the database.
	*
	* @param serviceId the primary key for the new service
	* @return the new service
	*/
	public static Htet_Lithan.com.test.model.Service create(long serviceId) {
		return getPersistence().create(serviceId);
	}

	/**
	* Removes the service with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param serviceId the primary key of the service
	* @return the service that was removed
	* @throws Htet_Lithan.com.test.NoSuchServiceException if a service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Service remove(long serviceId)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(serviceId);
	}

	public static Htet_Lithan.com.test.model.Service updateImpl(
		Htet_Lithan.com.test.model.Service service)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(service);
	}

	/**
	* Returns the service with the primary key or throws a {@link Htet_Lithan.com.test.NoSuchServiceException} if it could not be found.
	*
	* @param serviceId the primary key of the service
	* @return the service
	* @throws Htet_Lithan.com.test.NoSuchServiceException if a service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Service findByPrimaryKey(
		long serviceId)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(serviceId);
	}

	/**
	* Returns the service with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param serviceId the primary key of the service
	* @return the service, or <code>null</code> if a service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Service fetchByPrimaryKey(
		long serviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(serviceId);
	}

	/**
	* Returns all the services.
	*
	* @return the services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Service> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the services.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Htet_Lithan.com.test.model.impl.ServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of services
	* @param end the upper bound of the range of services (not inclusive)
	* @return the range of services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Service> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the services.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Htet_Lithan.com.test.model.impl.ServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of services
	* @param end the upper bound of the range of services (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Service> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the services from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of services.
	*
	* @return the number of services
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ServicePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ServicePersistence)PortletBeanLocatorUtil.locate(Htet_Lithan.com.test.service.ClpSerializer.getServletContextName(),
					ServicePersistence.class.getName());

			ReferenceRegistry.registerReference(ServiceUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ServicePersistence persistence) {
	}

	private static ServicePersistence _persistence;
}