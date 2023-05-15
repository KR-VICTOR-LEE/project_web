create table tbl_class(
    cid number(8) ,
    cname varchar2(30) not null,
    ctel varchar2(15)not null,
    clocation varchar2(20) not null,
    primary key(cid)
);
drop table tbl_class;
drop table tbl_student;
create table tbl_student(
    snumber number(8) primary key,
    sname varchar2(20) not null,
    age number(3),
    gender varchar2(6) not null,
    address varchar2(50),
    cid number(3) not null,
    CONSTRAINT fk_class foreign key(cid)
    REFERENCES tbl_class(cid) on delete cascade
);

insert into tbl_class values (101, '소프트웨어학과', '02-1234-1234','B동 3층');
insert into tbl_class values (102, '화학공학과', '02-1234-4567','B동 4층');
insert into tbl_class values (103, '전기전자공학과', '02-1234-5678','B동 5층');

insert into tbl_student values (20211234, '이강',22, '여자','서울시 종로구', 102); 
insert into tbl_student values (20211235, '박대양',25, '남자','경기도 성남시', 101);
insert into tbl_student values (20211236, '한비야',23, '여자','경기도 수원시', 103);

select * from tbl_student;

--1. 주소가 경기도인 학생 검색
select * from tbl_student where address like '%경기도%';
--2. 주소가 경기도 이고 남자인 학생 검색
select * from tbl_student where address like '%경기도%' and gender = '남자';
--3. 나이가 많은 순으로 정렬
select * from tbl_student order by age desc;
--4. 박대양의 나이를 30세로 (수정)
update tbl_student set age = 30 where sname ='박대양';
