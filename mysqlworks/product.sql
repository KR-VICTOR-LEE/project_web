-- Product 테이블 생성
use javaweb;

create table product(
	p_id varchar(10) primary key,
    p_name varchar(30),
    p_unitPrice integer,
    p_description text,
    p_category varchar(20),
    p_manufacturer varchar(20),
    p_unitsInStock long,
    p_condition varchar(20),
    p_productImage varchar(20)
);

-- 상품 추가

insert into product values('P1234','iphone 14pro','1800000','123test123',
	'Smart Phone', 'Apple', 1000 ,'New', 'P1234.png');
    
    commit;
    
    select * from product;
  