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

package Htet_Lithan.com.test.model.impl;

import Htet_Lithan.com.test.model.Services;
import Htet_Lithan.com.test.model.ServicesModel;
import Htet_Lithan.com.test.model.ServicesSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Services service. Represents a row in the &quot;HS_Services&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link Htet_Lithan.com.test.model.ServicesModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ServicesImpl}.
 * </p>
 *
 * @author USER
 * @see ServicesImpl
 * @see Htet_Lithan.com.test.model.Services
 * @see Htet_Lithan.com.test.model.ServicesModel
 * @generated
 */
@JSON(strict = true)
public class ServicesModelImpl extends BaseModelImpl<Services>
	implements ServicesModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a services model instance should use the {@link Htet_Lithan.com.test.model.Services} interface instead.
	 */
	public static final String TABLE_NAME = "HS_Services";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "servicesId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "servicesName", Types.VARCHAR },
			{ "servicesPrice", Types.VARCHAR },
			{ "servicesDesc", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table HS_Services (uuid_ VARCHAR(75) null,servicesId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,servicesName VARCHAR(75) null,servicesPrice VARCHAR(75) null,servicesDesc VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table HS_Services";
	public static final String ORDER_BY_JPQL = " ORDER BY services.servicesName ASC";
	public static final String ORDER_BY_SQL = " ORDER BY HS_Services.servicesName ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.Htet_Lithan.com.test.model.Services"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.Htet_Lithan.com.test.model.Services"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.Htet_Lithan.com.test.model.Services"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long UUID_COLUMN_BITMASK = 4L;
	public static long SERVICESNAME_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Services toModel(ServicesSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Services model = new ServicesImpl();

		model.setUuid(soapModel.getUuid());
		model.setServicesId(soapModel.getServicesId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setServicesName(soapModel.getServicesName());
		model.setServicesPrice(soapModel.getServicesPrice());
		model.setServicesDesc(soapModel.getServicesDesc());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Services> toModels(ServicesSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Services> models = new ArrayList<Services>(soapModels.length);

		for (ServicesSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.Htet_Lithan.com.test.model.Services"));

	public ServicesModelImpl() {
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

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getServicesId() {
		return _servicesId;
	}

	@Override
	public void setServicesId(long servicesId) {
		_servicesId = servicesId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getServicesName() {
		if (_servicesName == null) {
			return StringPool.BLANK;
		}
		else {
			return _servicesName;
		}
	}

	@Override
	public void setServicesName(String servicesName) {
		_columnBitmask = -1L;

		_servicesName = servicesName;
	}

	@JSON
	@Override
	public String getServicesPrice() {
		if (_servicesPrice == null) {
			return StringPool.BLANK;
		}
		else {
			return _servicesPrice;
		}
	}

	@Override
	public void setServicesPrice(String servicesPrice) {
		_servicesPrice = servicesPrice;
	}

	@JSON
	@Override
	public String getServicesDesc() {
		if (_servicesDesc == null) {
			return StringPool.BLANK;
		}
		else {
			return _servicesDesc;
		}
	}

	@Override
	public void setServicesDesc(String servicesDesc) {
		_servicesDesc = servicesDesc;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Services.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Services.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Services toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Services)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ServicesImpl servicesImpl = new ServicesImpl();

		servicesImpl.setUuid(getUuid());
		servicesImpl.setServicesId(getServicesId());
		servicesImpl.setGroupId(getGroupId());
		servicesImpl.setCompanyId(getCompanyId());
		servicesImpl.setUserId(getUserId());
		servicesImpl.setUserName(getUserName());
		servicesImpl.setCreateDate(getCreateDate());
		servicesImpl.setModifiedDate(getModifiedDate());
		servicesImpl.setServicesName(getServicesName());
		servicesImpl.setServicesPrice(getServicesPrice());
		servicesImpl.setServicesDesc(getServicesDesc());

		servicesImpl.resetOriginalValues();

		return servicesImpl;
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

		if (!(obj instanceof Services)) {
			return false;
		}

		Services services = (Services)obj;

		long primaryKey = services.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		ServicesModelImpl servicesModelImpl = this;

		servicesModelImpl._originalUuid = servicesModelImpl._uuid;

		servicesModelImpl._originalGroupId = servicesModelImpl._groupId;

		servicesModelImpl._setOriginalGroupId = false;

		servicesModelImpl._originalCompanyId = servicesModelImpl._companyId;

		servicesModelImpl._setOriginalCompanyId = false;

		servicesModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Services> toCacheModel() {
		ServicesCacheModel servicesCacheModel = new ServicesCacheModel();

		servicesCacheModel.uuid = getUuid();

		String uuid = servicesCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			servicesCacheModel.uuid = null;
		}

		servicesCacheModel.servicesId = getServicesId();

		servicesCacheModel.groupId = getGroupId();

		servicesCacheModel.companyId = getCompanyId();

		servicesCacheModel.userId = getUserId();

		servicesCacheModel.userName = getUserName();

		String userName = servicesCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			servicesCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			servicesCacheModel.createDate = createDate.getTime();
		}
		else {
			servicesCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			servicesCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			servicesCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		servicesCacheModel.servicesName = getServicesName();

		String servicesName = servicesCacheModel.servicesName;

		if ((servicesName != null) && (servicesName.length() == 0)) {
			servicesCacheModel.servicesName = null;
		}

		servicesCacheModel.servicesPrice = getServicesPrice();

		String servicesPrice = servicesCacheModel.servicesPrice;

		if ((servicesPrice != null) && (servicesPrice.length() == 0)) {
			servicesCacheModel.servicesPrice = null;
		}

		servicesCacheModel.servicesDesc = getServicesDesc();

		String servicesDesc = servicesCacheModel.servicesDesc;

		if ((servicesDesc != null) && (servicesDesc.length() == 0)) {
			servicesCacheModel.servicesDesc = null;
		}

		return servicesCacheModel;
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

	private static ClassLoader _classLoader = Services.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Services.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _servicesId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _servicesName;
	private String _servicesPrice;
	private String _servicesDesc;
	private long _columnBitmask;
	private Services _escapedModel;
}