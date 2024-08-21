-- comment
-- database -> table (row x column)
create database db_bc2405p;

use db_bc2405p;

create table customers (
     id int,
     name varchar(50),
     email varchar(50)
);

-- insert into table_name(column1_name, ...) values (column1_value,.....);
insert into customers (id, name, email) values (1, 'John Lau', 'john@gmail.com');
insert into customers (id, name, email) values (2, 'Peter Wong', 'peter@gmail.com');

-- * = all columns
-- where = conditions
select * from customers;
select * from customers where id = 2;
select * from customers where id = 1 or id = 2;
select * from customers where id = 1 and id = 2;
select name from customers where id = 1;

-- order by
select * from customers order by id;
select * from customers order by id asc;
select * from customers order by id desc;

-- where (filter), order by (sort)
select * from customers where id = 1 order by id desc;

select * from customers where tran_date between '2024-08-21:09:00:00' and '2024-08-21:12:00:00';

create table students(
      id integer, 
      name varchar(20),
      weight numeric(5,2), -- 2 dp
      height numeric(5,2)
);

insert into students (id, name, weight, height) values (1, 'Nic', 65, 178);
insert into students (id, name, weight, height) values (2, 'Zoe', 52, 165);
insert into students (id, name, weight, height) values (3, 'Mar', 65, 174.8);

insert into students (id, name, weight, height) values (6, 'Sally', 55.555, 160.72);


select * from students;
-- create table -> datetime, integer, numeric(10,2), varchar
