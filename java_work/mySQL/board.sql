create table board(
	id int auto_increment primary key,
    title varchar(100),
    pname varchar(100),
    pw varchar(100),
    upfile varchar(100),
    content varchar(9999),
    reg_date timestamp,
    cnt int,
    seq int,
    lev int,
    gid int
);

insert into board(id, title, pname, pw, content, reg_date, cnt, seq, lev, gid)
values
(1,'첫번째','테스터1','1111','첫글내용','2023-05-05',0,0,0,1),
(2,'두번째','테스터2','1111','두글내용','2023-05-07',0,0,0,2),
(3,'세번째','테스터3','1111','세글내용','2023-05-09',0,0,0,3),
(4,'네번째','테스터4','1111','네글내용','2023-05-12',0,0,0,4),
(5,'다섯번째','테스터5','1111','다섯글내용','2023-05-15',0,0,0,5);
commit;
select * from board;

drop table board;