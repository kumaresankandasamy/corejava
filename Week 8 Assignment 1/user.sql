create database ListUsersServlet;
use ListUsersServlet;
create table if not exists user(
id int,
name varchar(12),
age int,
location varchar(12)
);
insert into user values(1,'ram',22,'Bangalore');
insert into user values(2,'raj',22,'Bangalore');
insert into user values(3,'raghu',22,'Bangalore');
insert into user values(4,'balu',22,'Bangalore');
