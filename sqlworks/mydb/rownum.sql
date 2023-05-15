-- rownum : 순번을 정해놓은 sudo column이다
-- 조회되는 행의 수를 제한할때 사용
select rownum, bno, title, writer, content
    from board
    where rownum > 0 and rownum <= 10
    order by bno;

-- 11 ~ 20번 까지 검색
select * from
    (select rownum rn, bno, title, writer, content
    from board
    order by bno)
    where rn > 10 and rn <= 20; -- 별칭(rn)을 사용해야 함
-- rownum의 올바른 사용
create table ex_score(
    name VARCHAR2(10),
    score number
);
insert into ex_score values('김하나', 94);
insert into ex_score values('이하나', 100);
insert into ex_score values('박하나', 97);
insert into ex_score values('정하나', 77);
insert into ex_score values('조하나', 87);
insert into ex_score values('안하나', 87);
insert into ex_score values('유하나', 66);
insert into ex_score values('오하나', 80);
insert into ex_score values('한하나', 80);
insert into ex_score values('성하나', 95);

select * from ex_score;
-- 점수가 높은 순으로 5명 검색
select rownum, name, score
    from ex_score
    where rownum <=5
    order by score desc;
-- 올바른 사용
select rownum, name, score from
    (select rownum, name, score
    from ex_score
    order by score desc)
    where rownum <=5;

-- 성적 순위
select name,
        score,
    rank() over(order by score desc) rank,
    dense_rank() over(order by score desc) dense_rank
from ex_score;