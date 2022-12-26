create table otdel(nameot varchar(255) not null, time int, name varchar(255) not null, price int);
insert into otdel (nameot, time,name,price) values ('Grocery','14','tea','120');
insert into otdel (nameot, time,name,price) values ('Grocery','14','coffe','220');
insert into otdel (nameot, time,name,price) values ('Dairy Department','12','milk','56');
insert into otdel (nameot, time,name,price) values ('Dairy Department','12','cheez','100');
select *from otdel;
delete from otdel;