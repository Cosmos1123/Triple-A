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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link Htet_Lithan.com.test.service.http.ServicesServiceSoap}.
 *
 * @author USER
 * @see Htet_Lithan.com.test.service.http.ServicesServiceSoap
 * @generated
 */
public class ServicesSoap implements Serializable {
	public static ServicesSoap toSoapModel(Services model) {
		ServicesSoap soapModel = new ServicesSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setServicesId(model.getServicesId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setServicesName(model.getServicesName());
		soapModel.setServicesPrice(model.getServicesPrice());
		soapModel.setServicesDesc(model.getServicesDesc());

		return soapModel;
	}

	public static ServicesSoap[] toSoapModels(Services[] models) {
		ServicesSoap[] soapModels = new ServicesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ServicesSoap[][] toSoapModels(Services[][] models) {
		ServicesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ServicesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ServicesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ServicesSoap[] toSoapModels(List<Services> models) {
		List<ServicesSoap> soapModels = new ArrayList<ServicesSoap>(models.size());

		for (Services model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ServicesSoap[soapModels.size()]);
	}

	public ServicesSoap() {
	}

	public long getPrimaryKey() {
		return _servicesId;
	}

	public void setPrimaryKey(long pk) {
		setServicesId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getServicesId() {
		return _servicesId;
	}

	public void setServicesId(long servicesId) {
		_servicesId = servicesId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getServicesName() {
		return _servicesName;
	}

	public void setServicesName(String servicesName) {
		_servicesName = servicesName;
	}

	public String getServicesPrice() {
		return _servicesPrice;
	}

	public void setServicesPrice(String servicesPrice) {
		_servicesPrice = servicesPrice;
	}

	public String getServicesDesc() {
		return _servicesDesc;
	}

	public void setServicesDesc(String servicesDesc) {
		_servicesDesc = servicesDesc;
	}

	private String _uuid;
	private long _servicesId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _servicesName;
	private String _servicesPrice;
	private String _servicesDesc;
}