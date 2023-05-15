-- tcl_test 테이블 생성
create table tcl_test(
    c1 number(2),
    c2 number(3)
);

SAVEPOINT t1;
insert into tcl_test values(10,100);

savepoint t2;
insert into tcl_test values (20,200);

select * from tcl_test;

ROLLBACK to t2; -- t2 rollback(취소)

commit;

drop table tcl_test;