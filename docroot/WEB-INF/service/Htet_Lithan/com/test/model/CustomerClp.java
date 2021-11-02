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
import Htet_Lithan.com.test.service.CustomerLocalServiceUtil;

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
public class CustomerClp extends BaseModelImpl<Customer> implements Customer {
	public CustomerClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Customer.class;
	}

	@Override
	public String getModelClassName() {
		return Customer.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _customerId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCustomerId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _customerId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("customerId", getCustomerId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("customerName", getCustomerName());
		attributes.put("customerEmail", getCustomerEmail());
		attributes.put("customerContact", getCustomerContact());
		attributes.put("customerAddress", getCustomerAddress());
		attributes.put("payment", getPayment());
		attributes.put("time", getTime());
		attributes.put("servicesId", getServicesId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long customerId = (Long)attributes.get("customerId");

		if (customerId != null) {
			setCustomerId(customerId);
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

		String customerName = (String)attributes.get("customerName");

		if (customerName != null) {
			setCustomerName(customerName);
		}

		String customerEmail = (String)attributes.get("customerEmail");

		if (customerEmail != null) {
			setCustomerEmail(customerEmail);
		}

		String customerContact = (String)attributes.get("customerContact");

		if (customerContact != null) {
			setCustomerContact(customerContact);
		}

		String customerAddress = (String)attributes.get("customerAddress");

		if (customerAddress != null) {
			setCustomerAddress(customerAddress);
		}

		String payment = (String)attributes.get("payment");

		if (payment != null) {
			setPayment(payment);
		}

		Date time = (Date)attributes.get("time");

		if (time != null) {
			setTime(time);
		}

		Long servicesId = (Long)attributes.get("servicesId");

		if (servicesId != null) {
			setServicesId(servicesId);
		}
	}

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_customerRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCustomerId() {
		return _customerId;
	}

	@Override
	public void setCustomerId(long customerId) {
		_customerId = customerId;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomerId", long.class);

				method.invoke(_customerRemoteModel, customerId);
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

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_customerRemoteModel, groupId);
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

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_customerRemoteModel, companyId);
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

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_customerRemoteModel, userId);
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

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_customerRemoteModel, userName);
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

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_customerRemoteModel, createDate);
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

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_customerRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCustomerName() {
		return _customerName;
	}

	@Override
	public void setCustomerName(String customerName) {
		_customerName = customerName;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomerName", String.class);

				method.invoke(_customerRemoteModel, customerName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCustomerEmail() {
		return _customerEmail;
	}

	@Override
	public void setCustomerEmail(String customerEmail) {
		_customerEmail = customerEmail;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomerEmail", String.class);

				method.invoke(_customerRemoteModel, customerEmail);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCustomerContact() {
		return _customerContact;
	}

	@Override
	public void setCustomerContact(String customerContact) {
		_customerContact = customerContact;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomerContact",
						String.class);

				method.invoke(_customerRemoteModel, customerContact);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCustomerAddress() {
		return _customerAddress;
	}

	@Override
	public void setCustomerAddress(String customerAddress) {
		_customerAddress = customerAddress;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomerAddress",
						String.class);

				method.invoke(_customerRemoteModel, customerAddress);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPayment() {
		return _payment;
	}

	@Override
	public void setPayment(String payment) {
		_payment = payment;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setPayment", String.class);

				method.invoke(_customerRemoteModel, payment);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getTime() {
		return _time;
	}

	@Override
	public void setTime(Date time) {
		_time = time;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setTime", Date.class);

				method.invoke(_customerRemoteModel, time);
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

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setServicesId", long.class);

				method.invoke(_customerRemoteModel, servicesId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Customer.class.getName()));
	}

	public BaseModel<?> getCustomerRemoteModel() {
		return _customerRemoteModel;
	}

	public void setCustomerRemoteModel(BaseModel<?> customerRemoteModel) {
		_customerRemoteModel = customerRemoteModel;
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

		Class<?> remoteModelClass = _customerRemoteModel.getClass();

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

		Object returnValue = method.invoke(_customerRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CustomerLocalServiceUtil.addCustomer(this);
		}
		else {
			CustomerLocalServiceUtil.updateCustomer(this);
		}
	}

	@Override
	public Customer toEscapedModel() {
		return (Customer)ProxyUtil.newProxyInstance(Customer.class.getClassLoader(),
			new Class[] { Customer.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CustomerClp clone = new CustomerClp();

		clone.setUuid(getUuid());
		clone.setCustomerId(getCustomerId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCustomerName(getCustomerName());
		clone.setCustomerEmail(getCustomerEmail());
		clone.setCustomerContact(getCustomerContact());
		clone.setCustomerAddress(getCustomerAddress());
		clone.setPayment(getPayment());
		clone.setTime(getTime());
		clone.setServicesId(getServicesId());

		return clone;
	}

	@Override
	public int compareTo(Customer customer) {
		int value = 0;

		value = getCustomerName().compareTo(customer.getCustomerName());

		value = value * -1;

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

		if (!(obj instanceof CustomerClp)) {
			return false;
		}

		CustomerClp customer = (CustomerClp)obj;

		long primaryKey = customer.getPrimaryKey();

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
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", customerId=");
		sb.append(getCustomerId());
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
		sb.append(", customerName=");
		sb.append(getCustomerName());
		sb.append(", customerEmail=");
		sb.append(getCustomerEmail());
		sb.append(", customerContact=");
		sb.append(getCustomerContact());
		sb.append(", customerAddress=");
		sb.append(getCustomerAddress());
		sb.append(", payment=");
		sb.append(getPayment());
		sb.append(", time=");
		sb.append(getTime());
		sb.append(", servicesId=");
		sb.append(getServicesId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("Htet_Lithan.com.test.model.Customer");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customerId</column-name><column-value><![CDATA[");
		sb.append(getCustomerId());
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
			"<column><column-name>customerName</column-name><column-value><![CDATA[");
		sb.append(getCustomerName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customerEmail</column-name><column-value><![CDATA[");
		sb.append(getCustomerEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customerContact</column-name><column-value><![CDATA[");
		sb.append(getCustomerContact());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customerAddress</column-name><column-value><![CDATA[");
		sb.append(getCustomerAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>payment</column-name><column-value><![CDATA[");
		sb.append(getPayment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>time</column-name><column-value><![CDATA[");
		sb.append(getTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>servicesId</column-name><column-value><![CDATA[");
		sb.append(getServicesId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _customerId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _customerName;
	private String _customerEmail;
	private String _customerContact;
	private String _customerAddress;
	private String _payment;
	private Date _time;
	private long _servicesId;
	private BaseModel<?> _customerRemoteModel;
	private Class<?> _clpSerializerClass = Htet_Lithan.com.test.service.ClpSerializer.class;
}