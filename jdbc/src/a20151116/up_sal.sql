--up_sal.sql
create or replace procedure up_sal
					(vempno in emp.empno%type) --¿©±â¿¡ 7900
is 
begin
	update emp set sal = sal * 1.1
	where empno = vempno
end

select * from emp where empno in(7900,7902)