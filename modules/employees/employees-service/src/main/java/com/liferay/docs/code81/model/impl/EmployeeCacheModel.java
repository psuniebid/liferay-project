/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.docs.code81.model.impl;

import com.liferay.docs.code81.model.Employee;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EmployeeCacheModel
	implements CacheModel<Employee>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EmployeeCacheModel)) {
			return false;
		}

		EmployeeCacheModel employeeCacheModel = (EmployeeCacheModel)object;

		if (employeeId == employeeCacheModel.employeeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, employeeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", employeeId=");
		sb.append(employeeId);
		sb.append(", employeeName=");
		sb.append(employeeName);
		sb.append(", departmentName=");
		sb.append(departmentName);
		sb.append(", positionName=");
		sb.append(positionName);
		sb.append(", email=");
		sb.append(email);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Employee toEntityModel() {
		EmployeeImpl employeeImpl = new EmployeeImpl();

		if (uuid == null) {
			employeeImpl.setUuid("");
		}
		else {
			employeeImpl.setUuid(uuid);
		}

		employeeImpl.setEmployeeId(employeeId);

		if (employeeName == null) {
			employeeImpl.setEmployeeName("");
		}
		else {
			employeeImpl.setEmployeeName(employeeName);
		}

		if (departmentName == null) {
			employeeImpl.setDepartmentName("");
		}
		else {
			employeeImpl.setDepartmentName(departmentName);
		}

		if (positionName == null) {
			employeeImpl.setPositionName("");
		}
		else {
			employeeImpl.setPositionName(positionName);
		}

		if (email == null) {
			employeeImpl.setEmail("");
		}
		else {
			employeeImpl.setEmail(email);
		}

		employeeImpl.setGroupId(groupId);
		employeeImpl.setCompanyId(companyId);

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		employeeId = objectInput.readLong();
		employeeName = objectInput.readUTF();
		departmentName = objectInput.readUTF();
		positionName = objectInput.readUTF();
		email = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(employeeId);

		if (employeeName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(employeeName);
		}

		if (departmentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(departmentName);
		}

		if (positionName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(positionName);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);
	}

	public String uuid;
	public long employeeId;
	public String employeeName;
	public String departmentName;
	public String positionName;
	public String email;
	public long groupId;
	public long companyId;

}