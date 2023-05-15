show user;

-- 사용자 계정 만들기
-- DB이름, 비밀번호, 테이블 공간 생성
create user c##mydb identified by mydb
default tablespace users
temporary tablespace temp;

grant connect, resource, dba to c##mydb;