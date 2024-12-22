/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.docs.code81.service.impl;

import com.liferay.docs.code81.model.Employee;
import com.liferay.docs.code81.service.base.EmployeeLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.docs.code81.model.Employee",
	service = AopService.class
)
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {

	public List<Employee> findByEmployeeName(String employeeName) {

		return employeePersistence.findByEmployeeName("%" + employeeName + "%");
	}

	public List<Employee> findALlEmployees() {

		return employeePersistence.findAll();
	}

	public Employee addEmp(){
		long employeeId = counterLocalService.increment();
		Employee employee = employeePersistence.create(employeeId);
		employee.setEmployeeName("Mahmoud");
		employee.setDepartmentName("Pre Sales");
		employee.setPositionName("Manager");
		employee.setEmail("Mahmoud@gmail.com");
		employeePersistence.update(employee);
		long employeeId2 = counterLocalService.increment();
		Employee employee2 = employeePersistence.create(employeeId2);
		employee2.setEmployeeName("Ahmed");
		employee2.setDepartmentName("Development");
		employee2.setPositionName("Development");
		employee2.setEmail("Ahmed@gmail.com");
		employeePersistence.update(employee2);
		long employeeId3 = counterLocalService.increment();
		Employee employee3 = employeePersistence.create(employeeId3);
		employee3.setEmployeeName("Karem");
		employee3.setDepartmentName("Development");
		employee3.setPositionName("Team Leader");
		employee3.setEmail("Karem@gmail.com");
		employeePersistence.update(employee3);
		return employee;
	}
}