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

import Htet_Lithan.com.test.model.Customer;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Customer in entity cache.
 *
 * @author USER
 * @see Customer
 * @generated
 */
public class CustomerCacheModel implements CacheModel<Customer>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", customerId=");
		sb.append(customerId);
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
		sb.append(", customerName=");
		sb.append(customerName);
		sb.append(", customerEmail=");
		sb.append(customerEmail);
		sb.append(", customerContact=");
		sb.append(customerContact);
		sb.append(", customerAddress=");
		sb.append(customerAddress);
		sb.append(", payment=");
		sb.append(payment);
		sb.append(", time=");
		sb.append(time);
		sb.append(", servicesId=");
		sb.append(servicesId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Customer toEntityModel() {
		CustomerImpl customerImpl = new CustomerImpl();

		if (uuid == null) {
			customerImpl.setUuid(StringPool.BLANK);
		}
		else {
			customerImpl.setUuid(uuid);
		}

		customerImpl.setCustomerId(customerId);
		customerImpl.setGroupId(groupId);
		customerImpl.setCompanyId(companyId);
		customerImpl.setUserId(userId);

		if (userName == null) {
			customerImpl.setUserName(StringPool.BLANK);
		}
		else {
			customerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			customerImpl.setCreateDate(null);
		}
		else {
			customerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			customerImpl.setModifiedDate(null);
		}
		else {
			customerImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (customerName == null) {
			customerImpl.setCustomerName(StringPool.BLANK);
		}
		else {
			customerImpl.setCustomerName(customerName);
		}

		if (customerEmail == null) {
			customerImpl.setCustomerEmail(StringPool.BLANK);
		}
		else {
			customerImpl.setCustomerEmail(customerEmail);
		}

		if (customerContact == null) {
			customerImpl.setCustomerContact(StringPool.BLANK);
		}
		else {
			customerImpl.setCustomerContact(customerContact);
		}

		if (customerAddress == null) {
			customerImpl.setCustomerAddress(StringPool.BLANK);
		}
		else {
			customerImpl.setCustomerAddress(customerAddress);
		}

		if (payment == null) {
			customerImpl.setPayment(StringPool.BLANK);
		}
		else {
			customerImpl.setPayment(payment);
		}

		if (time == Long.MIN_VALUE) {
			customerImpl.setTime(null);
		}
		else {
			customerImpl.setTime(new Date(time));
		}

		customerImpl.setServicesId(servicesId);

		customerImpl.resetOriginalValues();

		return customerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		customerId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		customerName = objectInput.readUTF();
		customerEmail = objectInput.readUTF();
		customerContact = objectInput.readUTF();
		customerAddress = objectInput.readUTF();
		payment = objectInput.readUTF();
		time = objectInput.readLong();
		servicesId = objectInput.readLong();
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

		objectOutput.writeLong(customerId);
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

		if (customerName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(customerName);
		}

		if (customerEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(customerEmail);
		}

		if (customerContact == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(customerContact);
		}

		if (customerAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(customerAddress);
		}

		if (payment == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(payment);
		}

		objectOutput.writeLong(time);
		objectOutput.writeLong(servicesId);
	}

	public String uuid;
	public long customerId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String customerName;
	public String customerEmail;
	public String customerContact;
	public String customerAddress;
	public String payment;
	public long time;
	public long servicesId;
}