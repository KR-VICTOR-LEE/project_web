-- 조인과 서브쿼리

select * from customer;
select * from book;
select * from orders;


-- 고객과 고객의 주문에 관한 데이터를 모두 검색하시오
select cus.custid, cus.name, ord.salprice, ord.orderdate 
    from customer cus, orders ord
    where cus.custid = ord.custid
    -- and cus.name ='박지성'; -- 김연아 고객의 주문내역
   -- and salprice >= 20000;  -- 판매가격이 20000원 이상인 주문내역
   and orderdate = '2018-7-8'; -- 주문일이 2018-7-8인 주문 내역
   
-- 고객 이름별로 주문한 모든 도서의 총 판매액을 구하시오
select cus.name, sum(salprice)판매금액,
    rank() over(order by sum(salprice)desc)순위
    from customer cus, orders ord
    where cus.custid = ord.custid
    group by cus.name;
    
-- 고객의 이름과 고객이 주문한 도서의 이름을 검색하시오
select cus.custid, cus.name, ord.salprice, ord.orderdate 
    from customer cus, orders ord, book boo
    where cus.custid = ord.custid
    and boo.bookid = ord.bookid
    order by cus.name; -- 정렬을 하면 그룹화도 가능

-- 가장 비싼 도서의 이름을 검색하시오
select max(sal) from book; -- 35000
select bookname from book -- 골프 바이블
where sal = 35000;

-- 중첩쿼리
select bookname 
from book
where sal = (select max(sal) from book);

-- 도서를 구매한 적이 있는 고객의 이름을 검색하시오
-- 1. 주문 테이블에서 고객아이디 검색
select custid from orders;
-- 2. 고객 아이디가 있는 고객 이름 검색
select name from customer
where custid in(select custid from orders);

-- 도서를 구매한 적이 없는 고객의 이름을 검색하시오
select name from customer
where custid not in(select custid from orders);

-- '김연아' 고객의 주문내역을 검색하시오
--1. 김연아 고객의 아이디 검색

--2. 김연아 고객의 아이디로 주문테이블에서 검색
select * from orders
where custid=(select custid from customer where name = '김연아');

-- 인라인 뷰 : from 절에 부속질의
-- 고객번호가 2이하인 고객의 판매액을 검색하시오.
select cus.name, sum(ord.salprice)판매금액 
from (select custid, name from customer where custid <= 2)cus, orders ord
where cus.custid = ord.custid
group by  cus.name;


-- 뷰(View) 생성
-- 주소에 '대한민국'을 포함하는 고객들로 구성된 뷰를 만들고 
-- create view 뷰이름
-- as select 문
create view vw_customer
as select * from customer 
where address like '%대한민국%';

-- 뷰 검색
select * from vw_customer;
-- 뷰 삭제
drop view vw_customer;

-- 고객의 이름과 주문한 도서의 이름과 가격을 검색하시오
create view vw_orders
as select cus.name, bo.bookname, ord.salprice
from customer cus, orders ord, book bo
where cus.custid = ord.custid
and bo.bookid = ord.bookid;

-- 뷰로 검색
select * from vw_orders;

-- 고객과 고객의 주문에 관한 데이터를 모두 검색하시오
select cus.name, ord.salprice
from customer cus, orders ord
where cus.custid = ord.custid
order by cus.name;
-- standart join (from 절에 inner join - on : 동등조인)
select cus.name, ord.salprice
from customer cus inner join orders ord
on cus.custid = ord.custid
order by cus.name;

-- outer join : 외부 조인
-- join 조건에 충족하는 데이터가 아니어도 출력될 수 있는 방식
-- left oute join, light outer join

-- 주문이 없는 고객을 포함하여 고객의 주문에 관한 데이터를 모두 검색하시오.
select cus.name, ord.salprice
from customer cus left outer join orders ord
on cus.custid = ord.custid
order by cus.name;
