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

package Htet_Lithan.com.test.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Services}.
 * </p>
 *
 * @author USER
 * @see Services
 * @generated
 */
public class ServicesWrapper implements Services, ModelWrapper<Services> {
	public ServicesWrapper(Services services) {
		_services = services;
	}

	@Override
	public Class<?> getModelClass() {
		return Services.class;
	}

	@Override
	public String getModelClassName() {
		return Services.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("servicesId", getServicesId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("servicesName", getServicesName());
		attributes.put("servicesPrice", getServicesPrice());
		attributes.put("servicesDesc", getServicesDesc());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long servicesId = (Long)attributes.get("servicesId");

		if (servicesId != null) {
			setServicesId(servicesId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String servicesName = (String)attributes.get("servicesName");

		if (servicesName != null) {
			setServicesName(servicesName);
		}

		String servicesPrice = (String)attributes.get("servicesPrice");

		if (servicesPrice != null) {
			setServicesPrice(servicesPrice);
		}

		String servicesDesc = (String)attributes.get("servicesDesc");

		if (servicesDesc != null) {
			setServicesDesc(servicesDesc);
		}
	}

	/**
	* Returns the primary key of this services.
	*
	* @return the primary key of this services
	*/
	@Override
	public long getPrimaryKey() {
		return _services.getPrimaryKey();
	}

	/**
	* Sets the primary key of this services.
	*
	* @param primaryKey the primary key of this services
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_services.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this services.
	*
	* @return the uuid of this services
	*/
	@Override
	public java.lang.String getUuid() {
		return _services.getUuid();
	}

	/**
	* Sets the uuid of this services.
	*
	* @param uuid the uuid of this services
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_services.setUuid(uuid);
	}

	/**
	* Returns the services ID of this services.
	*
	* @return the services ID of this services
	*/
	@Override
	public long getServicesId() {
		return _services.getServicesId();
	}

	/**
	* Sets the services ID of this services.
	*
	* @param servicesId the services ID of this services
	*/
	@Override
	public void setServicesId(long servicesId) {
		_services.setServicesId(servicesId);
	}

	/**
	* Returns the group ID of this services.
	*
	* @return the group ID of this services
	*/
	@Override
	public long getGroupId() {
		return _services.getGroupId();
	}

	/**
	* Sets the group ID of this services.
	*
	* @param groupId the group ID of this services
	*/
	@Override
	public void setGroupId(long groupId) {
		_services.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this services.
	*
	* @return the company ID of this services
	*/
	@Override
	public long getCompanyId() {
		return _services.getCompanyId();
	}

	/**
	* Sets the company ID of this services.
	*
	* @param companyId the company ID of this services
	*/
	@Override
	public void setCompanyId(long companyId) {
		_services.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this services.
	*
	* @return the user ID of this services
	*/
	@Override
	public long getUserId() {
		return _services.getUserId();
	}

	/**
	* Sets the user ID of this services.
	*
	* @param userId the user ID of this services
	*/
	@Override
	public void setUserId(long userId) {
		_services.setUserId(userId);
	}

	/**
	* Returns the user uuid of this services.
	*
	* @return the user uuid of this services
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _services.getUserUuid();
	}

	/**
	* Sets the user uuid of this services.
	*
	* @param userUuid the user uuid of this services
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_services.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this services.
	*
	* @return the user name of this services
	*/
	@Override
	public java.lang.String getUserName() {
		return _services.getUserName();
	}

	/**
	* Sets the user name of this services.
	*
	* @param userName the user name of this services
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_services.setUserName(userName);
	}

	/**
	* Returns the create date of this services.
	*
	* @return the create date of this services
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _services.getCreateDate();
	}

	/**
	* Sets the create date of this services.
	*
	* @param createDate the create date of this services
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_services.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this services.
	*
	* @return the modified date of this services
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _services.getModifiedDate();
	}

	/**
	* Sets the modified date of this services.
	*
	* @param modifiedDate the modified date of this services
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_services.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the services name of this services.
	*
	* @return the services name of this services
	*/
	@Override
	public java.lang.String getServicesName() {
		return _services.getServicesName();
	}

	/**
	* Sets the services name of this services.
	*
	* @param servicesName the services name of this services
	*/
	@Override
	public void setServicesName(java.lang.String servicesName) {
		_services.setServicesName(servicesName);
	}

	/**
	* Returns the services price of this services.
	*
	* @return the services price of this services
	*/
	@Override
	public java.lang.String getServicesPrice() {
		return _services.getServicesPrice();
	}

	/**
	* Sets the services price of this services.
	*
	* @param servicesPrice the services price of this services
	*/
	@Override
	public void setServicesPrice(java.lang.String servicesPrice) {
		_services.setServicesPrice(servicesPrice);
	}

	/**
	* Returns the services desc of this services.
	*
	* @return the services desc of this services
	*/
	@Override
	public java.lang.String getServicesDesc() {
		return _services.getServicesDesc();
	}

	/**
	* Sets the services desc of this services.
	*
	* @param servicesDesc the services desc of this services
	*/
	@Override
	public void setServicesDesc(java.lang.String servicesDesc) {
		_services.setServicesDesc(servicesDesc);
	}

	@Override
	public boolean isNew() {
		return _services.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_services.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _services.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_services.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _services.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _services.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_services.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _services.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_services.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_services.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_services.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ServicesWrapper((Services)_services.clone());
	}

	@Override
	public int compareTo(Htet_Lithan.com.test.model.Services services) {
		return _services.compareTo(services);
	}

	@Override
	public int hashCode() {
		return _services.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Htet_Lithan.com.test.model.Services> toCacheModel() {
		return _services.toCacheModel();
	}

	@Override
	public Htet_Lithan.com.test.model.Services toEscapedModel() {
		return new ServicesWrapper(_services.toEscapedModel());
	}

	@Override
	public Htet_Lithan.com.test.model.Services toUnescapedModel() {
		return new ServicesWrapper(_services.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _services.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _services.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_services.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServicesWrapper)) {
			return false;
		}

		ServicesWrapper servicesWrapper = (ServicesWrapper)obj;

		if (Validator.equals(_services, servicesWrapper._services)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _services.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Services getWrappedServices() {
		return _services;
	}

	@Override
	public Services getWrappedModel() {
		return _services;
	}

	@Override
	public void resetOriginalValues() {
		_services.resetOriginalValues();
	}

	private Services _services;
}