--add at least 3 records into each table
--add product iPhone priced at $200
--add customer Tina Smith
--create order for Tina Smith bought and iPhone
--report all orders by Tina Smith
--report all revenue genereated by sales of iPhone- increase the price of iPhone to $250

create table Products(
	pID smallint primary key , 
	prodName varchar(max),
	price money
)

create table Orders(
	orderID smallint,
	productID smallint,
	customerID smallint primary key
)

create table Customers(
	ID smallint primary key,
	firstName varchar(max),
	lastName varchar(max),
	cardNumber bigint
)

select * from Products;
select * from Orders;
select * from Customers;

--creates three records in each table
insert into Products
values(1, 'iPhone', 200), (2, 'Xbox', 400), (3, 'Flatscreen TV', 600)

insert into Orders
values (1, 1, 1), (2, 2, 2), (3, 3, 3)
insert into Orders
values (4, 1, 4)

insert into Customers
values(1, 'Mark', 'Walhberg', 123456789012), (2, 'Jackie', 'Chan', 098765432109),
(3, 'Jennifer', 'Lopez', 43793456709876)

--Tina Smith bought an iPhone
insert into Customers
values(4, 'Tina', 'Smith', 567812340987)

--report orders from Tina Smith: in this moment, she has 1 order (an iPhone)
select count(CustomerID) from Orders where CustomerID = 4;

--report all revenue generated by sales of iPhone- increase the price to $250
select sum(Products.price) from Products join Orders on productID = 1 
where Orders.productID =1;