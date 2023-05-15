-- 부서별 총 급여
select * 
from employee;

-- 부서별 급여 총액이 500만원 이상인 자료 검색
select deptno, sum(sal)
    from employee
    group by deptno
    having sum(sal) > 5000000;


-- 부서별 급여 소계와 총계
select sum(sal)
from employee
group by deptno;

-- 급여 누적값 계산
-- sum(칼럼명) over(order by칼럼명)
select empno,
        ename,
        sum(sal) over(order by empno) sal_sum, -- 오름차순 누적
        sum(sal) over(order by empno -- 오름차순 누적
        rows between unbounded preceding and current row) sal_sum2,
        sum(sal) over(order by empno -- 내림차순 누적
        rows between current  row and unbounded following) sal_sum2
from employee;