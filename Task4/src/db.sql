show databases;

create database organization;

use organization;

show tables;

create table department(
dep_ID int not null,
dep_Name varchar(30),
dep_Location varchar(30),
primary key(dep_ID)
);
describe department;

create table employee(
emp_Id int not null,
emp_Name varchar(50),
joining_Date date,
dep_ID int,
salary bigint,
primary key(emp_Id),
foreign key(dep_ID) references department(dep_ID)
);
describe employee;



insert into department values(121,"Finance","Delhi");
insert into department values(111,"HR","Delhi");
insert into department values(112,"Marketing","Delhi");
insert into department values(113,"Operation","Delhi");
insert into department values(114,"Sales","Delhi");
insert into department values(115,"Purchase","Delhi");
insert into department values(116,"Customer Relationship","Delhi");
insert into department values(117,"Development","Delhi");
insert into department values(118,"R&D","Delhi");
insert into department values(119,"Administrative","Delhi");
insert into department values(120,"IT","Delhi");

insert into employee values(1, "Ajay", "2022-06-10",121,75000);

select * from employee;

select * from department;

select * from employee as e inner join department as d on e.dep_ID=d.dep_ID;