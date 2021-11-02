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

import Htet_Lithan.com.test.service.ClpSerializer;
import Htet_Lithan.com.test.service.ServiceLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author USER
 */
public class ServiceClp extends BaseModelImpl<Service> implements Service {
	public ServiceClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Service.class;
	}

	@Override
	public String getModelClassName() {
		return Service.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _serviceId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setServiceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _serviceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("serviceId", getServiceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("serviceName", getServiceName());
		attributes.put("servicePrice", getServicePrice());
		attributes.put("serviceDes", getServiceDes());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long serviceId = (Long)attributes.get("serviceId");

		if (serviceId != null) {
			setServiceId(serviceId);
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

		String serviceName = (String)attributes.get("serviceName");

		if (serviceName != null) {
			setServiceName(serviceName);
		}

		String servicePrice = (String)attributes.get("servicePrice");

		if (servicePrice != null) {
			setServicePrice(servicePrice);
		}

		String serviceDes = (String)attributes.get("serviceDes");

		if (serviceDes != null) {
			setServiceDes(serviceDes);
		}
	}

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_serviceRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_serviceRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getServiceId() {
		return _serviceId;
	}

	@Override
	public void setServiceId(long serviceId) {
		_serviceId = serviceId;

		if (_serviceRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceId", long.class);

				method.invoke(_serviceRemoteModel, serviceId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_serviceRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_serviceRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_serviceRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_serviceRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_serviceRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_serviceRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_serviceRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_serviceRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_serviceRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_serviceRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_serviceRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_serviceRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServiceName() {
		return _serviceName;
	}

	@Override
	public void setServiceName(String serviceName) {
		_serviceName = serviceName;

		if (_serviceRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceName", String.class);

				method.invoke(_serviceRemoteModel, serviceName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServicePrice() {
		return _servicePrice;
	}

	@Override
	public void setServicePrice(String servicePrice) {
		_servicePrice = servicePrice;

		if (_serviceRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRemoteModel.getClass();

				Method method = clazz.getMethod("setServicePrice", String.class);

				method.invoke(_serviceRemoteModel, servicePrice);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServiceDes() {
		return _serviceDes;
	}

	@Override
	public void setServiceDes(String serviceDes) {
		_serviceDes = serviceDes;

		if (_serviceRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceDes", String.class);

				method.invoke(_serviceRemoteModel, serviceDes);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Service.class.getName()));
	}

	public BaseModel<?> getServiceRemoteModel() {
		return _serviceRemoteModel;
	}

	public void setServiceRemoteModel(BaseModel<?> serviceRemoteModel) {
		_serviceRemoteModel = serviceRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _serviceRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_serviceRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ServiceLocalServiceUtil.addService(this);
		}
		else {
			ServiceLocalServiceUtil.updateService(this);
		}
	}

	@Override
	public Service toEscapedModel() {
		return (Service)ProxyUtil.newProxyInstance(Service.class.getClassLoader(),
			new Class[] { Service.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ServiceClp clone = new ServiceClp();

		clone.setUuid(getUuid());
		clone.setServiceId(getServiceId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setServiceName(getServiceName());
		clone.setServicePrice(getServicePrice());
		clone.setServiceDes(getServiceDes());

		return clone;
	}

	@Override
	public int compareTo(Service service) {
		int value = 0;

		value = getServiceName().compareTo(service.getServiceName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServiceClp)) {
			return false;
		}

		ServiceClp service = (ServiceClp)obj;

		long primaryKey = service.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", serviceId=");
		sb.append(getServiceId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", serviceName=");
		sb.append(getServiceName());
		sb.append(", servicePrice=");
		sb.append(getServicePrice());
		sb.append(", serviceDes=");
		sb.append(getServiceDes());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("Htet_Lithan.com.test.model.Service");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceId</column-name><column-value><![CDATA[");
		sb.append(getServiceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceName</column-name><column-value><![CDATA[");
		sb.append(getServiceName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>servicePrice</column-name><column-value><![CDATA[");
		sb.append(getServicePrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceDes</column-name><column-value><![CDATA[");
		sb.append(getServiceDes());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _serviceId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _serviceName;
	private String _servicePrice;
	private String _serviceDes;
	private BaseModel<?> _serviceRemoteModel;
	private Class<?> _clpSerializerClass = Htet_Lithan.com.test.service.ClpSerializer.class;
}