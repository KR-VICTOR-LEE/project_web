-- java 연동 테이블 생성
create table person(
    userid varchar2(10) primary key,
    userpw varchar2(10) not null,
    name varchar2(20) not null,
    age number(3)
);

insert into person(userid, userpw, name, age)
values('cloud', 'cloud123', '구름이', 120);

commit;

select * from person;