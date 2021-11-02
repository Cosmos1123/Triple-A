create table HS_Customer (
	uuid_ VARCHAR(75) null,
	customerId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	customerName VARCHAR(75) null,
	customerEmail VARCHAR(75) null,
	customerContact VARCHAR(75) null,
	customerAddress VARCHAR(75) null,
	payment VARCHAR(75) null,
	time_ DATE null,
	servicesId LONG
);

create table HS_Service (
	uuid_ VARCHAR(75) null,
	serviceId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	serviceName VARCHAR(75) null,
	servicePrice VARCHAR(75) null,
	serviceDes VARCHAR(75) null
);

create table HS_Services (
	uuid_ VARCHAR(75) null,
	servicesId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	servicesName VARCHAR(75) null,
	servicesPrice VARCHAR(75) null,
	servicesDesc VARCHAR(75) null
);