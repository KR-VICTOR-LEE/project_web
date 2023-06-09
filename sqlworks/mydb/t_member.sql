-- 회원 테이블 생성

create table t_member(
    memberid varchar2(20) primary key,
    passwd varchar2(20) not null,
    name varchar2(30) not null,
    gender varchar2(10),
    joindate date default sysdate
);

insert into t_member(memberid, passwd, name, gender)
values ('cloud','m12345','이경철','남');

select * from t_member;

commit;