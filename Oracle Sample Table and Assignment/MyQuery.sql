select * from employees;
select * from departments;

select employee_id,first_name,salary from employees;

desc employees;
describe employees;

select * from employees;

select employee_id emp_id,first_name fname,salary emp_salary from employees;

select employee_id,first_name,salary,salary+500 as gross_salary from employees;

select first_name||last_name from employees;

select * from employees where salary > 15000;

select * from employees where employee_id < 150;

select * from employees where salary = 17000;

select * from employees where salary between 5000 and 10000

select * from employees where employee_id between 110 and 120

select * from employees where hire_date='28-SEP-97';
select salary from employees where first_name = 'Steven';


Select * from employees where employee_id in(110,116,112,1);

Select * from employees where job_id in('IT_PROG','ST_MAN','PU_CLERK');

Select * from employees where first_name='Steven'

Select * from employees where first_name like 'Steven'


select * from employees where first_name = '%n'

select * from employees where first_name like '%n'

select * from employees where first_name like 'A%'

select * from employees where first_name like '%e%'

select * from employees where first_name like '_e%'

select first_name,salary,commission_pct from employees;

select first_name,salary,commission_pct from employees where commission_pct is null;

select employee_id,first_name,salary from employees order by salary asc;
select employee_id,first_name,salary from employees order by salary desc;
select employee_id,first_name,salary from employees order by salary;

select employee_id,first_name,salary from employees order by salary asc;
select employee_id,first_name,salary from employees order by salary desc;
select employee_id,first_name,job_id,salary from employees order by job_id, salary desc;


select * from table2;
desc table1;

create table table1(srno int, name varchar(10), salary float)

create table table2(accno int, name varchar(10), amount float)

insert into table1 values(1,'Raj',12000);
insert into table1 values(2,'Ravi',12000);

insert into table2 values(1111,'Raj',1000);
insert into table2 values(2222,'Seeta',2000);

select * from table1;
select * from table2;

select srno,salary, accno, amount from table1, table2;

select srno,salary, table1.name,accno, amount from table1, table2;
select srno,salary, table2.name,accno, amount from table1, table2;
select srno,salary, table1.name,table2.name,accno, amount from table1, table2;

select t1.srno,t1.name,t1.salary,t2.accno,t2.name,t2.amount from table1 t1, table2 t2 where t1.name = t2.name;

select t1.srno,t1.name,t1.salary,t2.accno,t2.name,t2.amount from table1 t1, table2 t2 where t1.name = t2.name(+);
select t1.srno,t1.name,t1.salary,t2.accno,t2.name,t2.amount from table1 t1, table2 t2 where t1.name(+) = t2.name;



select t1.srno,t1.name,t1.salary,t2.accno,t2.name,t2.amount from table1 t1 inner join table2 t2 on t1.name = t2.name;
select t1.srno,t1.name,t1.salary,t2.accno,t2.name,t2.amount from table1 t1 left outer join table2 t2 on t1.name = t2.name;
select t1.srno,t1.name,t1.salary,t2.accno,t2.name,t2.amount from table1 t1 full outer join table2 t2 on t1.name = t2.name;

desc employees;
desc departments;

select * from employees;

select emp.first_name,emp.salary,dept.department_name from employees emp,departments dept where emp.department_id=dept.department_id;

select emp.first_name,emp.salary,dept.department_name from employees emp,departments dept where emp.department_id=dept.department_id(+);

select emp.first_name,emp.salary,dept.department_name from employees emp,departments dept where emp.department_id(+)=dept.department_id;

select * from employees;

select emp1.first_name,emp1.job_id,emp2.first_name from employees emp1, employees emp2 where emp1.manager_id= emp2.employee_id;
select * from jobs;

select first_name,upper(first_name) from employees;

select * from dual;
select upper('raj'), lower('RAJ'), initcap('raj') from dual;
select substr('rajdeep',2),substr('rajdeep',2,5) from dual;
select length('raj deep') from dual;

select round(345.678,0) from dual;
select round(345.678,1) from dual;
select round(345.678,2) from dual;
select round(345.678,3) from dual;
select round(344.678,-1) from dual;
select round(344.678,-2) from dual;
select round(644.678,-3) from dual;

select trunc(345.678,0) from dual;
select trunc(345.678,1) from dual;
select trunc(345.678,2) from dual;
select trunc(345.678,3) from dual;
select trunc(344.678,-1) from dual;
select trunc(344.678,-2) from dual;
select trunc(644.678,-3) from dual;

select ceil(10.1), ceil(10.9), floor(10.1), floor(10.9) from dual;

select sysdate from dual;
select add_months(sysdate, 2) from dual;
select next_day(sysdate,'Mon') from dual;

select months_between(sysdate, '01-jan-21') from dual;

select * from employees;

select sum(salary) from employees;
select max(salary) from employees;
select min(salary) from employees;
select avg(salary) from employees;
select count(manager_id) from employees
select count(commission_pct) from employees;
select count(employee_id) from employees;
select count(*) from employees;

select first_name,salary,commission_pct from employees;


select first_name,salary,nvl(commission_pct,0) from employees;

select count(nvl(commission_pct,0)) from employees;

select sysdate from employees;

select to_char(sysdate, 'dd-mon-yyyy hh24:mi:ss') from employees;

select to_char(sysdate, 'dd-MM-yyyy hh24:mi:ss') from employees;

select to_char(sysdate, 'day month year dd-mon-yyyy hh24:mi:ss') from employees;

select to_char(hire_date, 'day month year dd-mon-yyyy hh24:mi:ss') from employees;

select commission_pct from employees;
select nvl(to_char(commission_pct),'No Commission') from employees;

select nvl(commission_pct,'No commission') from employees;

select sum(salary) from employees;

select * from employees;

select sum(salary) from employees group by job_id;
select sum(salary) from employees group by department_id;
select sum(salary) from employees group by manager_id

select job_id, sum(salary) from employees group by job_id;

select job_id, sum(salary) from employees group by job_id;

select department_id,sum(salary) from employees group by department_id;

select department_id,sum(salary),max(salary) from employees group by department_id;


select department_id,sum(salary)from employees group by department_id having sum(salary) > 50000

select department_id,sum(salary)from employees where department_id <> 100 group by department_id having sum(salary) > 50000

select department_id,sum(salary)from employees where department_id <> 100 group by department_id having sum(salary) > 50000 order by department_id asc;



select avg(salary) from employees;

select avg(salary) from employees where department_id=100

select first_name,salary from employees where salary > 6461


select first_name salary from employees where salary > (select avg(salary) from employees)

select first_name from employees where job_id in (select job_id from employees where department_id=90)

select first_name from employees where department_id in (select department_id from departments where location_id=1400)

desc departments
select * from departments

select first_name,salary from employees where salary >any (select salary from employees where department_id=100);

select * from employees where EXISTS (select * from departments where department_id=1000)


select * from employee;

drop table employee;



create table employee(id int, name varchar(10),salary float,dob date)

insert into employee(id,name,salary,dob) values(100,'Raj',12000,'01-Jan-90')
insert into employee(id,name,salary) values(101,'Ravi',14000)
insert into employee(id,name) values(102,'Ramesh')
insert into employee values(103,'Rajesh',18000,'06-Feb-98')
insert into employee values(104,'Ajay',22000,null)


select * from employee

drop table employee

alter table employee add desg varchar(2)

alter table employee drop column dob

insert into employee values(105,'Vijay',23000,'Hr')
insert into employee values(106,'Mahesh',25000,'Manager')

alter table employee modify desg varchar(10)

update employee set salary = 45000

update employee set salary = 35000 where id =100;
update employee set salary = 37000 where name like 'Ravi';

truncate table employee
