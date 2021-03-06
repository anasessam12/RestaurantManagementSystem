create database Restaurant_System
use Restaurant_System
-- we have 10 tables in our system and here is the frist one 

-- table numer 1 -> has the rules for every user that enters to our system such as admin / employee / customer --

create  table rules(
rule_id int primary key not null ,
rule_name varchar(50) not null  ,
);

-- there are 3 rules 

insert into rules values (1,'Admin')
insert into rules values (2,'Employee')
insert into rules values (3,'Customer')

--  table number 2 -> for all users (admin,employee,customer) and we will access the data base on the id that will be entered--

create table users(
userr_id int primary key not null  ,
userr_name varchar(50) not null ,
pass varchar(50) not null ,
rule_ref_id int foreign key  references rules (rule_id)  on delete cascade on  update no action 
);

insert into users values (1,'Abdo','12345',1);

-- table number 3 ->  we have 3 types of Customers (marketing , loyalty , reward) the coustomer will select one

create table Customer_type(
type_id int primary key not null ,
type_name varchar (50) not null,
);

-- tha values are ....
insert into Customer_type values (1,'Marketing')
insert into Customer_type values (2,'Loyalty')
insert into Customer_type values (3,'Reward')

--  table number 4 ->  for Customers

create table Customer(
Customer_id int primary key not null, foreign key (Customer_id) references [users] (userr_id)  on delete cascade on  update no action,--hna el Customer_id  primary key and foreign key 
Customer_name varchar (50) not null,
Customer_type_fk int foreign key references Customer_type (type_id) on delete cascade on update no action
);

-- table number 5 ->  for admin

create table Adminn(
admin_id int primary key not null, foreign key(admin_id) references [users] (userr_id)  on delete cascade on  update no action,--hna el admin_id  primary key and foreign key 
admin_name varchar (50) not null,
admin_pass varchar(50) not null,

);



-- table number 6 -> for employee

create table Employee(
emp_id int primary key not null , foreign key (emp_id) references [users] (userr_id)  on delete cascade on  update no action,--hna el emp_id  primary key and foreign key 
emp_name varchar(50),
emp_pass varchar(50),
salary int,
);

-- table number 7 -> for meals ..

create table meals(
meal_id int primary key ,
meal_name varchar(100),
meal_price float ,
meal_quantity int,
adm_id int foreign key references Adminn (admin_id)  on delete cascade on  update no action
);


-- table number 8 -> for orders...
create table orders(
order_id int identity (1,1) primary key ,
order_date date ,
total_biling float,
cust_id int foreign key references Customer (Customer_id)  on delete no action on  update no action,
emplo_id int foreign key references Employee (emp_id)  on delete no action on  update no action
);

-- table number 9 -> for order detalis
create table order_detalis (
MEALS_quantity int ,
order_ID int identity (1,1) foreign key references orders (order_id)  on delete no action on  update no action,
meal_ID int foreign key references meals (meal_id)  on delete no action on  update no action,

);
drop table orders
drop table order_detalis

-- table number 10 -> for offers..
create table offers (
offer_id int primary key not null,
offer_date varchar(10),
offer_discount float
);

--table number 11 -> for Customer Profile ...
create table Customer_Profile(
cust_id int ,
payments int,
orders int,
offers int
);