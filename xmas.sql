--  db 생성
create database xmas;

-- shop db 권한 주기
grant all privileges on xmas.* to root@localhost with grant option;

show databases;
use xmas;
show tables;


select * from member;
select * from item order by reg_time desc;
select * from item_img order by reg_time desc;
select * from orders order by reg_time desc;
select * from order_item order by reg_time desc;

