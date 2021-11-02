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
import Htet_Lithan.com.test.service.ServicesLocalServiceUtil;

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
public class ServicesClp extends BaseModelImpl<Services> implements Services {
	public ServicesClp() {
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
	public long getPrimaryKey() {
		return _servicesId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setServicesId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _servicesId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_servicesRemoteModel != null) {
			try {
				Class<?> clazz = _servicesRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_servicesRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getServicesId() {
		return _servicesId;
	}

	@Override
	public void setServicesId(long servicesId) {
		_servicesId = servicesId;

		if (_servicesRemoteModel != null) {
			try {
				Class<?> clazz = _servicesRemoteModel.getClass();

				Method method = clazz.getMethod("setServicesId", long.class);

				method.invoke(_servicesRemoteModel, servicesId);
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

		if (_servicesRemoteModel != null) {
			try {
				Class<?> clazz = _servicesRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_servicesRemoteModel, groupId);
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

		if (_servicesRemoteModel != null) {
			try {
				Class<?> clazz = _servicesRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_servicesRemoteModel, companyId);
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

		if (_servicesRemoteModel != null) {
			try {
				Class<?> clazz = _servicesRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_servicesRemoteModel, userId);
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

		if (_servicesRemoteModel != null) {
			try {
				Class<?> clazz = _servicesRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_servicesRemoteModel, userName);
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

		if (_servicesRemoteModel != null) {
			try {
				Class<?> clazz = _servicesRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_servicesRemoteModel, createDate);
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

		if (_servicesRemoteModel != null) {
			try {
				Class<?> clazz = _servicesRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_servicesRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServicesName() {
		return _servicesName;
	}

	@Override
	public void setServicesName(String servicesName) {
		_servicesName = servicesName;

		if (_servicesRemoteModel != null) {
			try {
				Class<?> clazz = _servicesRemoteModel.getClass();

				Method method = clazz.getMethod("setServicesName", String.class);

				method.invoke(_servicesRemoteModel, servicesName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServicesPrice() {
		return _servicesPrice;
	}

	@Override
	public void setServicesPrice(String servicesPrice) {
		_servicesPrice = servicesPrice;

		if (_servicesRemoteModel != null) {
			try {
				Class<?> clazz = _servicesRemoteModel.getClass();

				Method method = clazz.getMethod("setServicesPrice", String.class);

				method.invoke(_servicesRemoteModel, servicesPrice);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServicesDesc() {
		return _servicesDesc;
	}

	@Override
	public void setServicesDesc(String servicesDesc) {
		_servicesDesc = servicesDesc;

		if (_servicesRemoteModel != null) {
			try {
				Class<?> clazz = _servicesRemoteModel.getClass();

				Method method = clazz.getMethod("setServicesDesc", String.class);

				method.invoke(_servicesRemoteModel, servicesDesc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Services.class.getName()));
	}

	public BaseModel<?> getServicesRemoteModel() {
		return _servicesRemoteModel;
	}

	public void setServicesRemoteModel(BaseModel<?> servicesRemoteModel) {
		_servicesRemoteModel = servicesRemoteModel;
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

		Class<?> remoteModelClass = _servicesRemoteModel.getClass();

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

		Object returnValue = method.invoke(_servicesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ServicesLocalServiceUtil.addServices(this);
		}
		else {
			ServicesLocalServiceUtil.updateServices(this);
		}
	}

	@Override
	public Services toEscapedModel() {
		return (Services)ProxyUtil.newProxyInstance(Services.class.getClassLoader(),
			new Class[] { Services.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ServicesClp clone = new ServicesClp();

		clone.setUuid(getUuid());
		clone.setServicesId(getServicesId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setServicesName(getServicesName());
		clone.setServicesPrice(getServicesPrice());
		clone.setServicesDesc(getServicesDesc());

		return clone;
	}

	@Override
	public int compareTo(Services services) {
		int value = 0;

		value = getServicesName().compareTo(services.getServicesName());

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

		if (!(obj instanceof ServicesClp)) {
			return false;
		}

		ServicesClp services = (ServicesClp)obj;

		long primaryKey = services.getPrimaryKey();

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
		sb.append(", servicesId=");
		sb.append(getServicesId());
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
		sb.append(", servicesName=");
		sb.append(getServicesName());
		sb.append(", servicesPrice=");
		sb.append(getServicesPrice());
		sb.append(", servicesDesc=");
		sb.append(getServicesDesc());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("Htet_Lithan.com.test.model.Services");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>servicesId</column-name><column-value><![CDATA[");
		sb.append(getServicesId());
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
			"<column><column-name>servicesName</column-name><column-value><![CDATA[");
		sb.append(getServicesName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>servicesPrice</column-name><column-value><![CDATA[");
		sb.append(getServicesPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>servicesDesc</column-name><column-value><![CDATA[");
		sb.append(getServicesDesc());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _servicesId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _servicesName;
	private String _servicesPrice;
	private String _servicesDesc;
	private BaseModel<?> _servicesRemoteModel;
	private Class<?> _clpSerializerClass = Htet_Lithan.com.test.service.ClpSerializer.class;
}