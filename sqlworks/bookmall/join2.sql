-- bookmall

select * from book;
select * from customer;
select * from orders;


-- 고객의 이름과 고객이 주문에 도서의 판매가격을 구하시오

select cus.name, ord.salprice
    from customer cus, orders ord
    where cus.custid = ord.custid
    order by cus.name;

-- 박지성 고객의 이름과 고객이 주문에 도서의 판매가격을 구하시오

select cus.name, ord.salprice
    from customer cus, orders ord
    where cus.custid = ord.custid
    and cus.name = '박지성';
    
-- 고객별로 주문한 모든 도서의 총 판매액을 구하시오(group by절, sum()함수)
select cus.name, sum(salprice)
    from customer cus, orders ord
    where cus.custid = ord.custid
    group by cus.name;
    
-- 안산고객이 주문한 모든 도서의 총 판매액을 구하시오(group by절, sum()함수 having)
select cus.name, sum(salprice) 총판매액
    from customer cus, orders ord
    where cus.custid = ord.custid
    group by cus.name 
    having cus.name = '안산';
    

    
-- 표준 sql - inner join on~
select cus.name, ord.salprice
    from customer cus inner join orders ord
    on cus.custid = ord.custid
    order by cus.name;

-- 박지성 고객의 이름과 고객이 주문에 도서의 판매가격을 구하시오
select cus.name, ord.salprice
    from customer cus inner join orders ord
    on cus.custid = ord.custid
    and cus.name = '박지성'; 

-- 고객이 주문한 이름과 책 판매가격
select cus.name, bk.bookname, ord.salprice
    from customer cus, orders ord, book bk
    where cus.custid = ord.custid
    and bk.bookid = ord.bookid;
-- 박지성 고객이 주문한 도서의 이름과 판매가격을 구하시오
select cus.name, bk.bookname, ord.salprice 판매가격, ord.orderdate 주문일
    from customer cus, orders ord, book bk
    where cus.custid = ord.custid
    and bk.bookid = ord.bookid
    and cus.name = '박지성';

-- 외부 조인('+' 연산자 사용) : join 조건에 충족하는 데이터가 아니어도 검색하는 방식
-- WHERE 절에서 모든 행이 출력되는 테이블의 반대편 테이블에 '+'를 붙임
-- 주문이 없는 고객을 포함하여 이름과 주문한 도서의 판매가격을 찾으시오
select cus.name, ord.salprice
    from customer cus, orders ord
    where cus.custid = ord.custid(+);
    
-- 표준 sql - left outer join on ~
select cus.name, ord.salprice
    from customer cus left outer join orders ord
    on cus.custid = ord.custid
    order by cus.name;
    