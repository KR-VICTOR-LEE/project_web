-- 옵티마이저 - sql 최적화
select * from board;

-- 작성자가 'admin'인 게시글을 조회
select * from board
where writer = '긴하루';

-- 작성자가 'admin'인 게시글 조회 - 인덱스로 만들기
-- creates index 인덱스이름 on 테이블이름(칼럼이름)
create index idx_writer on board(writer);

-- 오라클 힌트
-- /*+ index (테이블이름 인덱스이름)
select /*+ index(board idx_writer)*/ * from board
where writer = 'admin';

-- 실행계획 보는 코드
SELECT * FROM TABLE(DBMS_XPLAN.DISPLAY_CURSOR(null, null, 'ALLSTATS LAST'));