-- 회원 테이블 생성

create table t_member(
    memberid varchar2(20) primary key,
    passwd varchar2(20) not null,
    name varchar2(30) not null,
    gender varchar2(10),
    joindate date default sysdate
);


-- 게시판 테이블 생성
CREATE TABLE t_board(
    bnum        NUMBER(4) PRIMARY KEY,
    title       VARCHAR2(100) NOT NULL,
    content     VARCHAR2(2000) NOT NULL,
    regdate     TIMESTAMP DEFAULT SYSTIMESTAMP, 
    modifydate  TIMESTAMP,
    hit         NUMBER DEFAULT 0,
    memberid    VARCHAR2(20) NOT NULL,
    CONSTRAINT FK_MemberBoard FOREIGN KEY(memberid)
    REFERENCES t_member(memberid)
);

-- 자동순번
create sequence b_seq;

-- t_member입력
insert into t_member(memberid, passwd, name, gender)
values ('cloud','m12345','이경철','남');

-- t_board 입력
insert into t_board(bnum, title, content, memberid)
values (b_seq.nextval, '가입인사', '안녕하세요 반갑습니다.','cloud');

select * from t_member;

select * from t_board order by regdate desc;

commit;