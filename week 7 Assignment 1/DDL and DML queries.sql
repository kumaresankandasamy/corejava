create database twitter;
use twitter;
show databases;
use twitter;
create table if not exists user(
id int,
name varchar(10) );
insert into user values(1,'ram');
create table if not exists user_tweet(
user_id int,
tweet varchar(100));
insert into user_tweet values(10,'first tweet');
create table if not exists user_posttweet(
id int unsigned primary key auto_increment,
title varchar(20));
insert into user_posttweet values(10,'program');
create table if not exists user_like(
id int unsigned primary key auto_increment,
user_like int,
post_id int );
insert into user_like values(10,100,10);
create table if not exists user_comment(
user_id int unsigned primary key auto_increment,
comments varchar(100),
post_id int unsigned);
insert into user_comment values(10,'very nice',10);
select * from user_like;
select * from user_comment;
insert into user_posttweet values(11,'updated1 program');
insert into user_posttweet values(12,'updated2 program');
insert into user_posttweet values(13,'updated3 program');
insert into user_posttweet values(14,'updated4 program');
insert into user_like values(11,100,10);
insert into user_like values(12,100,10);
insert into user_like values(13,100,10);
insert into user_like values(14,100,10);
insert into user_comment values(11,'very nice',10);
insert into user_comment values(12,'very nice',10);
insert into user_comment values(13,'very nice',10);
insert into user_comment values(14,'very nice',10);
alter table user add(
follow int,
follower int);
select * from user;
select * from user_comment;
insert into user values(2,'raj',10,20);
insert into user values(3,'dhoni',100,200);
insert into user values(4,'raina',100,200);
insert into user values(5,'kholi',90,80);
select * from user;
show databases;