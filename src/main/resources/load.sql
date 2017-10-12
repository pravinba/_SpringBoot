drop table stock;
create table stock(
stock_id int,
company_name varchar(50),
symbol varchar(10),
price decimal(10,2)
);

insert into stock values(1,'VM Ware','VMW',56.05);
insert into stock values(2,'Facebook','FB',100.05);
insert into stock values(3,'Microsoft','MSFT',256.05);
insert into stock values(4,'Tesla','TSL',256.05);
insert into stock values(5,'SpaceX','MSFT',256.05);