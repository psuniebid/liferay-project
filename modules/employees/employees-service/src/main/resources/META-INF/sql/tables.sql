create table EMP_Employee (
	uuid_ VARCHAR(75) null,
	employeeId LONG not null primary key,
	employeeName VARCHAR(75) null,
	departmentName VARCHAR(75) null,
	positionName VARCHAR(75) null,
	email VARCHAR(75) null,
	groupId LONG,
	companyId LONG
);