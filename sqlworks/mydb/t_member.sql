-- 회원 테이블 생성
CREATE TABLE t_member(
    memberid    VARCHAR2(20) PRIMARY KEY,
    passwd      VARCHAR2(20) NOT NULL,
    name        VARCHAR2(30) NOT NULL,
    gender      VARCHAR2(10),
    joindate    DATE DEFAULT SYSDATE
);
-- 게시판 테이블 생성
CREATE TABLE t_board(
    bnum    NUMBER(4) PRIMARY KEY,
    title   VARCHAR2(100) NOT NULL,
    content VARCHAR2(2000) NOT NULL,
    regdate TIMESTAMP DEFAULT SYSTIMESTAMP,
    modifydate TIMESTAMP,
    hit NUMBER DEFAULT 0,
    memberid VARCHAR2(20) NOT NULL,
    CONSTRAINT FK_MemberBoard FOREIGN KEY(memberid)
    REFERENCES t_member(memberid) ON DELETE CASCADE
);
-- 글번호, 글제목, 글내용, 작성일, 수정일, 조회수, 아이디(외래키)
-- 자동 순번(SEQUENCE) 전체코드 (CACHE 기본값 20)
CREATE SEQUENCE b_seq
INCREMENT BY 1
START WITH 1
MINVALUE 1
MAXVALUE 9999
NOCYCLE
NOCACHE;

-- 파일 업로드 칼럼 추가
alter table t_board add fileupload varchar2(100);

INSERT INTO t_member(memberid, passwd, name, gender)
VALUES ('cloud', 'm12345', '이경철', '남');

INSERT INTO t_board(bnum, title, content, memberid)
VALUES (b_seq.NEXTVAL, '가입인사', '안녕하세요. 반갑습니다.', 'cloud');

COMMIT;
SELECT * FROM t_member;
SELECT * FROM t_board;

-- id 중복체크
select decode(count(*),1 , 'true', 'false') as result
    from t_member where memberid = 'test';

-- 페이지 처리
select rownum, t_board.*
from t_board 
where rownum >= 1 and rownum <= 10
order by bnum desc;

-- 페이지 처리
select*
from
(select rownum RN, t_board.*
from t_board order by bnum desc)
where RN >= 1 and RN <= 10;
-- order by bnum desc;



-- 총 행의 수 
select count(*) from t_board;


DROP TABLE t_board;  -- board 테이블 삭제
DROP SEQUENCE b_seq; -- 시퀀스 삭제