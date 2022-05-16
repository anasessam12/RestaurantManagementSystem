create database RestaurantManagementSystem
use RestaurantManagementSystem
-- we have 10 tables in our system and here is the frist one 


-- table number 3 ->  we have 3 types of Customers (marketing , loyalty , reward) the coustomer will select one



--  table number 4 ->  for Customers

create table Customer(
Customer_id int primary key not null, 
Customer_name varchar (50) not null,
);

-- table number 5 ->  for admin

create table Adminn(
admin_id int primary key not null, 
admin_name varchar (50) not null,
admin_pass varchar(50) not null,
);


-- table number 6 -> for employee

create table Employee(
emp_id int primary key not null ,
emp_name varchar(50),
emp_pass varchar(50),
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


-- table number 10 -> for offers..
create table offers (
offer_id int primary key not null,
offer_date varchar(10),
offer_discount float
);
