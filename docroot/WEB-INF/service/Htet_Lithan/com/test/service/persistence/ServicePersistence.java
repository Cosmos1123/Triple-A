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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the service service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author USER
 * @see ServicePersistenceImpl
 * @see ServiceUtil
 * @generated
 */
public interface ServicePersistence extends BasePersistence<Service> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ServiceUtil} to access the service persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the services where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<Htet_Lithan.com.test.model.Service> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<Htet_Lithan.com.test.model.Service> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<Htet_Lithan.com.test.model.Service> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first service in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service
	* @throws Htet_Lithan.com.test.NoSuchServiceException if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public Htet_Lithan.com.test.model.Service findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first service in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service, or <code>null</code> if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public Htet_Lithan.com.test.model.Service fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last service in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service
	* @throws Htet_Lithan.com.test.NoSuchServiceException if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public Htet_Lithan.com.test.model.Service findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last service in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service, or <code>null</code> if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public Htet_Lithan.com.test.model.Service fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public Htet_Lithan.com.test.model.Service[] findByUuid_PrevAndNext(
		long serviceId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the services where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of services where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching services
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service where uuid = &#63; and groupId = &#63; or throws a {@link Htet_Lithan.com.test.NoSuchServiceException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching service
	* @throws Htet_Lithan.com.test.NoSuchServiceException if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public Htet_Lithan.com.test.model.Service findByUUID_G(
		java.lang.String uuid, long groupId)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching service, or <code>null</code> if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public Htet_Lithan.com.test.model.Service fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching service, or <code>null</code> if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public Htet_Lithan.com.test.model.Service fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the service where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the service that was removed
	* @throws SystemException if a system exception occurred
	*/
	public Htet_Lithan.com.test.model.Service removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of services where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching services
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the services where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<Htet_Lithan.com.test.model.Service> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<Htet_Lithan.com.test.model.Service> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<Htet_Lithan.com.test.model.Service> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public Htet_Lithan.com.test.model.Service findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first service in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service, or <code>null</code> if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public Htet_Lithan.com.test.model.Service fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public Htet_Lithan.com.test.model.Service findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last service in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service, or <code>null</code> if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public Htet_Lithan.com.test.model.Service fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public Htet_Lithan.com.test.model.Service[] findByUuid_C_PrevAndNext(
		long serviceId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the services where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of services where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching services
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the services where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<Htet_Lithan.com.test.model.Service> findByServiceFinder(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<Htet_Lithan.com.test.model.Service> findByServiceFinder(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<Htet_Lithan.com.test.model.Service> findByServiceFinder(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first service in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service
	* @throws Htet_Lithan.com.test.NoSuchServiceException if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public Htet_Lithan.com.test.model.Service findByServiceFinder_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first service in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service, or <code>null</code> if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public Htet_Lithan.com.test.model.Service fetchByServiceFinder_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last service in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service
	* @throws Htet_Lithan.com.test.NoSuchServiceException if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public Htet_Lithan.com.test.model.Service findByServiceFinder_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last service in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service, or <code>null</code> if a matching service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public Htet_Lithan.com.test.model.Service fetchByServiceFinder_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public Htet_Lithan.com.test.model.Service[] findByServiceFinder_PrevAndNext(
		long serviceId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the services where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByServiceFinder(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of services where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching services
	* @throws SystemException if a system exception occurred
	*/
	public int countByServiceFinder(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the service in the entity cache if it is enabled.
	*
	* @param service the service
	*/
	public void cacheResult(Htet_Lithan.com.test.model.Service service);

	/**
	* Caches the services in the entity cache if it is enabled.
	*
	* @param services the services
	*/
	public void cacheResult(
		java.util.List<Htet_Lithan.com.test.model.Service> services);

	/**
	* Creates a new service with the primary key. Does not add the service to the database.
	*
	* @param serviceId the primary key for the new service
	* @return the new service
	*/
	public Htet_Lithan.com.test.model.Service create(long serviceId);

	/**
	* Removes the service with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param serviceId the primary key of the service
	* @return the service that was removed
	* @throws Htet_Lithan.com.test.NoSuchServiceException if a service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public Htet_Lithan.com.test.model.Service remove(long serviceId)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException;

	public Htet_Lithan.com.test.model.Service updateImpl(
		Htet_Lithan.com.test.model.Service service)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service with the primary key or throws a {@link Htet_Lithan.com.test.NoSuchServiceException} if it could not be found.
	*
	* @param serviceId the primary key of the service
	* @return the service
	* @throws Htet_Lithan.com.test.NoSuchServiceException if a service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public Htet_Lithan.com.test.model.Service findByPrimaryKey(long serviceId)
		throws Htet_Lithan.com.test.NoSuchServiceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param serviceId the primary key of the service
	* @return the service, or <code>null</code> if a service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public Htet_Lithan.com.test.model.Service fetchByPrimaryKey(long serviceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the services.
	*
	* @return the services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<Htet_Lithan.com.test.model.Service> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<Htet_Lithan.com.test.model.Service> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<Htet_Lithan.com.test.model.Service> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the services from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of services.
	*
	* @return the number of services
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}