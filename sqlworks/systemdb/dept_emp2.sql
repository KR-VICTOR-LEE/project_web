select * from dept;

select * from employee;

delete from dept 
where deptno = '1000';

-- employee 테이블 제약조건에서
-- on delete cascade 제약조건 추가
-- 1. 외래키 제약조건 삭제
alter table employee drop constraint emp_fk;
-- 2. on delete cascade 제약조건 추가
alter table employee add constraint emp_fk
foreing key(deptno) references dept(deptno)
on delete cascade;

