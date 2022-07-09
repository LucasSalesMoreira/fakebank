create database fakebank;

create table user (
	id varchar(36) primary key,
    name varchar(30),
    email varchar(50),
    pass varchar(255),
    money double,
    active boolean
);

create table pix (
	id varchar(36) primary key,
    sender_user_id varchar(36),
    recipient_user_id varchar(36),
    value double
);

select * from user;
select count(id) from pix;