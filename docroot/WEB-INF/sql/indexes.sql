create index IX_14F343B2 on HS_Customer (groupId);
create index IX_A70A1ABC on HS_Customer (uuid_);
create index IX_FD711BEC on HS_Customer (uuid_, companyId);
create unique index IX_2227AD6E on HS_Customer (uuid_, groupId);

create index IX_BC8045A3 on HS_Service (groupId);
create index IX_7920E4ED on HS_Service (uuid_);
create index IX_C718B91B on HS_Service (uuid_, companyId);
create unique index IX_FE22CA5D on HS_Service (uuid_, groupId);

create index IX_32D86332 on HS_Services (groupId);
create index IX_12B11A3C on HS_Services (uuid_);
create index IX_BA976C6C on HS_Services (uuid_, companyId);
create unique index IX_BDA81DEE on HS_Services (uuid_, groupId);