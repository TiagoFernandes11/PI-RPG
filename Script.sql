drop database if exists projeto;
create database if not exists projeto;

use projeto;

create table client(
id integer(3) primary key auto_increment,
email varchar(300) not null unique,
password varchar(30) not null
);

insert into client values(null,"tiagofernandesribeiro@yahoo.com.br", "senha1234");

select * from client;