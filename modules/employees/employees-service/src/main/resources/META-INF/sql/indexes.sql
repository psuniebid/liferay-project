create index IX_C1CCDC3C on EMP_Employee (departmentName[$COLUMN_LENGTH:75$]);
create index IX_F5EC79D8 on EMP_Employee (employeeName[$COLUMN_LENGTH:75$]);
create index IX_DF92183F on EMP_Employee (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_EF1A281 on EMP_Employee (uuid_[$COLUMN_LENGTH:75$], groupId);