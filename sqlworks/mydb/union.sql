-- 집합 연산

create table job(
    job_id VARCHAR2 (10),
    salary number(5) -- 달러로 입력
);

insert into job values('manager', 1300);
insert into job values('manager', 1500);
insert into job values('manager', 1900);
insert into job values('helper', 1000);
insert into job values('helper', 1500);
insert into job values('helper', 2500);

-- job 전체의 개수와 급여의 총 합계를 구하시오
select count(*) 개수, sum(salary) 총합계
    from job;

-- 직업 id 별 개수와 급여의 총 합계 구하시오
select job_id 아이디, count(*) 개수, sum(salary) 총합계
    from job
    group by job_id;

-- 직업 id 별 개수와 급여의 최대값 구하기
select job_id 아이디, max(salary) 최대급여
    from job
    group by job_id;

-- 직업 id 별 개수와 급여의 최소값 구하기
select job_id 아이디, min(salary) 최소급여
    from job
    group by job_id;
    
-- 직업 id 별 개수와 급여의 최대값 최소값 구하기
select job_id 아이디, max(salary) 최대급여, min(salary) 최소급여
    from job
    group by job_id;    
    
-- 직업 id 별 개수와 급여의 최대값 최소값 구하기
select job_id 아이디, max(salary) result
    from job
    group by job_id
    union
    select job_id 아이디, min(salary) result
    from job
    group by job_id;
    

commit;

select * from job;