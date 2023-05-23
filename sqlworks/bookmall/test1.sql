select * from book;
select * from customer;
select * from orders;

-- 출판사가 '굿스포츠' 또는 '대한미디어'인 도서를 검색하시오

select * from book where publisher = '굿스포츠' or publisher = '대한미디어';

select * from book where publisher in ('굿스포츠','대한미디어');

-- 도서 이름에 '축구'가 포함된 출판사를 검색하시오

select * from book where bookname like '%축구%';

-- '축구'에 관한 도서 중 가격이 20000원 이상인 도서를 검색하시오.

select * from book where bookname like '%축구%' and sal >= 20000;

-- 도서를 이름순으로 검색하시오(오름차순 정렬)

select * from book
order by bookname;

-- 도서를 가격순으로 검색하고(내림차순), 가격이 같으면 이름순으로 정렬하시오.
select * from book
order by sal desc, bookname;

-- 자료 추가(11,'혼자 공부하는 자바',한빛미디어',24000)
insert into book values (11, '혼자 공부하는 자바','한빛미디어',24000);

-- bookname을 '혼자 공부하는 파이썬'으로 수정하시오.

update book set bookname = '혼자 공부하는 파이썬' where bookid = 11;

-- bookid가 11인 도서 삭제
delete from book where bookid = 11;

-- 서브쿼리(쿼리중첩)
select count(*) 총수량 from book;
-- 책의 총 수량을 구하시오
select max(sal) 최고가격 from book;

-- 가장 비싼 도서의 이름을 검색하시오
select bookname, sal
from book
where sal = (select max(sal) 최고가격 from book);

-- 고객과 고객의 주문에 관한 데이터를 모두 검색하시오
select * from customer;
select * from orders;

-- 김연아 고객의 총 주문가격을 검색하시오
select cus.name, SUM(salprice) from customer cus, orders ord
where cus.custid = ord.custid order by cus.name
having cus.name = '김연아';



