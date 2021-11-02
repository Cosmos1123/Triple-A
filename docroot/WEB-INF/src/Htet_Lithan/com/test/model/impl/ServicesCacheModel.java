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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Services in entity cache.
 *
 * @author USER
 * @see Services
 * @generated
 */
public class ServicesCacheModel implements CacheModel<Services>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", servicesId=");
		sb.append(servicesId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", servicesName=");
		sb.append(servicesName);
		sb.append(", servicesPrice=");
		sb.append(servicesPrice);
		sb.append(", servicesDesc=");
		sb.append(servicesDesc);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Services toEntityModel() {
		ServicesImpl servicesImpl = new ServicesImpl();

		if (uuid == null) {
			servicesImpl.setUuid(StringPool.BLANK);
		}
		else {
			servicesImpl.setUuid(uuid);
		}

		servicesImpl.setServicesId(servicesId);
		servicesImpl.setGroupId(groupId);
		servicesImpl.setCompanyId(companyId);
		servicesImpl.setUserId(userId);

		if (userName == null) {
			servicesImpl.setUserName(StringPool.BLANK);
		}
		else {
			servicesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			servicesImpl.setCreateDate(null);
		}
		else {
			servicesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			servicesImpl.setModifiedDate(null);
		}
		else {
			servicesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (servicesName == null) {
			servicesImpl.setServicesName(StringPool.BLANK);
		}
		else {
			servicesImpl.setServicesName(servicesName);
		}

		if (servicesPrice == null) {
			servicesImpl.setServicesPrice(StringPool.BLANK);
		}
		else {
			servicesImpl.setServicesPrice(servicesPrice);
		}

		if (servicesDesc == null) {
			servicesImpl.setServicesDesc(StringPool.BLANK);
		}
		else {
			servicesImpl.setServicesDesc(servicesDesc);
		}

		servicesImpl.resetOriginalValues();

		return servicesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		servicesId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		servicesName = objectInput.readUTF();
		servicesPrice = objectInput.readUTF();
		servicesDesc = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(servicesId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (servicesName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(servicesName);
		}

		if (servicesPrice == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(servicesPrice);
		}

		if (servicesDesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(servicesDesc);
		}
	}

	public String uuid;
	public long servicesId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String servicesName;
	public String servicesPrice;
	public String servicesDesc;
}