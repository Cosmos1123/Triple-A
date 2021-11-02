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

import Htet_Lithan.com.test.model.Services;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the services service. This utility wraps {@link ServicesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author USER
 * @see ServicesPersistence
 * @see ServicesPersistenceImpl
 * @generated
 */
public class ServicesUtil {
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
	public static void clearCache(Services services) {
		getPersistence().clearCache(services);
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
	public static List<Services> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Services> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Services> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Services update(Services services) throws SystemException {
		return getPersistence().update(services);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Services update(Services services,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(services, serviceContext);
	}

	/**
	* Returns all the serviceses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Services> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the serviceses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Htet_Lithan.com.test.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @return the range of matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Services> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the serviceses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Htet_Lithan.com.test.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Services> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first services in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching services
	* @throws Htet_Lithan.com.test.NoSuchServicesException if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first services in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching services, or <code>null</code> if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last services in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching services
	* @throws Htet_Lithan.com.test.NoSuchServicesException if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last services in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching services, or <code>null</code> if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the serviceses before and after the current services in the ordered set where uuid = &#63;.
	*
	* @param servicesId the primary key of the current services
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next services
	* @throws Htet_Lithan.com.test.NoSuchServicesException if a services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services[] findByUuid_PrevAndNext(
		long servicesId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_PrevAndNext(servicesId, uuid, orderByComparator);
	}

	/**
	* Removes all the serviceses where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of serviceses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the services where uuid = &#63; and groupId = &#63; or throws a {@link Htet_Lithan.com.test.NoSuchServicesException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching services
	* @throws Htet_Lithan.com.test.NoSuchServicesException if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services findByUUID_G(
		java.lang.String uuid, long groupId)
		throws Htet_Lithan.com.test.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the services where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching services, or <code>null</code> if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the services where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching services, or <code>null</code> if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the services where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the services that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws Htet_Lithan.com.test.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of serviceses where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the serviceses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Services> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the serviceses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Htet_Lithan.com.test.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @return the range of matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Services> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the serviceses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Htet_Lithan.com.test.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Services> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first services in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching services
	* @throws Htet_Lithan.com.test.NoSuchServicesException if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first services in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching services, or <code>null</code> if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last services in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching services
	* @throws Htet_Lithan.com.test.NoSuchServicesException if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last services in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching services, or <code>null</code> if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the serviceses before and after the current services in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param servicesId the primary key of the current services
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next services
	* @throws Htet_Lithan.com.test.NoSuchServicesException if a services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services[] findByUuid_C_PrevAndNext(
		long servicesId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(servicesId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the serviceses where uuid = &#63; and companyId = &#63; from the database.
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
	* Returns the number of serviceses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the serviceses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Services> findByservicesFinder(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByservicesFinder(groupId);
	}

	/**
	* Returns a range of all the serviceses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Htet_Lithan.com.test.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @return the range of matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Services> findByservicesFinder(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByservicesFinder(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the serviceses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Htet_Lithan.com.test.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Services> findByservicesFinder(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByservicesFinder(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first services in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching services
	* @throws Htet_Lithan.com.test.NoSuchServicesException if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services findByservicesFinder_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByservicesFinder_First(groupId, orderByComparator);
	}

	/**
	* Returns the first services in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching services, or <code>null</code> if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services fetchByservicesFinder_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByservicesFinder_First(groupId, orderByComparator);
	}

	/**
	* Returns the last services in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching services
	* @throws Htet_Lithan.com.test.NoSuchServicesException if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services findByservicesFinder_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByservicesFinder_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last services in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching services, or <code>null</code> if a matching services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services fetchByservicesFinder_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByservicesFinder_Last(groupId, orderByComparator);
	}

	/**
	* Returns the serviceses before and after the current services in the ordered set where groupId = &#63;.
	*
	* @param servicesId the primary key of the current services
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next services
	* @throws Htet_Lithan.com.test.NoSuchServicesException if a services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services[] findByservicesFinder_PrevAndNext(
		long servicesId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByservicesFinder_PrevAndNext(servicesId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the serviceses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByservicesFinder(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByservicesFinder(groupId);
	}

	/**
	* Returns the number of serviceses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByservicesFinder(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByservicesFinder(groupId);
	}

	/**
	* Caches the services in the entity cache if it is enabled.
	*
	* @param services the services
	*/
	public static void cacheResult(Htet_Lithan.com.test.model.Services services) {
		getPersistence().cacheResult(services);
	}

	/**
	* Caches the serviceses in the entity cache if it is enabled.
	*
	* @param serviceses the serviceses
	*/
	public static void cacheResult(
		java.util.List<Htet_Lithan.com.test.model.Services> serviceses) {
		getPersistence().cacheResult(serviceses);
	}

	/**
	* Creates a new services with the primary key. Does not add the services to the database.
	*
	* @param servicesId the primary key for the new services
	* @return the new services
	*/
	public static Htet_Lithan.com.test.model.Services create(long servicesId) {
		return getPersistence().create(servicesId);
	}

	/**
	* Removes the services with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param servicesId the primary key of the services
	* @return the services that was removed
	* @throws Htet_Lithan.com.test.NoSuchServicesException if a services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services remove(long servicesId)
		throws Htet_Lithan.com.test.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(servicesId);
	}

	public static Htet_Lithan.com.test.model.Services updateImpl(
		Htet_Lithan.com.test.model.Services services)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(services);
	}

	/**
	* Returns the services with the primary key or throws a {@link Htet_Lithan.com.test.NoSuchServicesException} if it could not be found.
	*
	* @param servicesId the primary key of the services
	* @return the services
	* @throws Htet_Lithan.com.test.NoSuchServicesException if a services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services findByPrimaryKey(
		long servicesId)
		throws Htet_Lithan.com.test.NoSuchServicesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(servicesId);
	}

	/**
	* Returns the services with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param servicesId the primary key of the services
	* @return the services, or <code>null</code> if a services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static Htet_Lithan.com.test.model.Services fetchByPrimaryKey(
		long servicesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(servicesId);
	}

	/**
	* Returns all the serviceses.
	*
	* @return the serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Services> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<Htet_Lithan.com.test.model.Services> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the serviceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Htet_Lithan.com.test.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<Htet_Lithan.com.test.model.Services> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the serviceses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of serviceses.
	*
	* @return the number of serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ServicesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ServicesPersistence)PortletBeanLocatorUtil.locate(Htet_Lithan.com.test.service.ClpSerializer.getServletContextName(),
					ServicesPersistence.class.getName());

			ReferenceRegistry.registerReference(ServicesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ServicesPersistence persistence) {
	}

	private static ServicesPersistence _persistence;
}