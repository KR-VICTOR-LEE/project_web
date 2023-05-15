select * from tbl_class;
select * from tbl_student;

-- 조인
select stu.sname, stu.age, stu.gender , cls.cname 
    from tbl_class cls, tbl_student stu
    where cls.cid = stu.cid;

-- 학과별 학생수를 구하시오
select cls.cid, count(*) 학생수
    from tbl_class cls, tbl_student stu
    where cls.cid = stu.cid
    group by cls.cid;