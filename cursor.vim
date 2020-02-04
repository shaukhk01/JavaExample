                                        CURSOR
                                       *******
->cursor is a private sql memory area which is used to process multiple records and also
  this is a record by record process.

->In all relational database these static cursors are two types These are.
        
        1.implicit cursor
        2:Explicit cursor

Explicit Cursor:-
================
->for sql statements returns multiple records is called explicit cursor.
  and also this is a record by record process Explicit memory area is also
  called active set area.

Explicit cursor life cycle:-
---------------------------
->Every Explicit cursor having fllowing four steps these are:
            
          step 1:declare 
          step 2:open
          step 3:fetch
          step 4:close


declare:-
=======
In declare section of the pl/sql block we are defining cursor by using following syntax
syntax:-
-------
cursor cursorname is select * from tablename where condition;

Example:-
--------
sql>declare
    cursor c1 is select * from emp where job='CLERK';

open:-
-----
->whenever we are open a cursor then oracle server fetching data table in to cursor memory area
  because in all relational databases whenever we are opening the cursor then only cursor
  select statment are executed

syntax:-
-------
    open cursorname;
    This open statment is used in executable section of the pl/sql block
note:-
    Ever cursor memory area internally having pointer whenever we are opening in the cursor then
    this cursor pointer always point to first record in the cursor memory area.

fetch:-(fetching data from cursor)
-----
->By using fetch statment we are fetching data from cursor memory area into pl/sql varibles.
syntax:-
------- fetch cursorname into variblename,variablename2....;
    
-->whenever we are closing the cursor then all resources allocate from memory cursor memory area it is 
   automatically release
syntax:-
------
close cursorname;
Example:-
--------
declare
cursor c1 is select ename,sal from emp;
v_ename varchar(10);
v_sal number(10);
begin
open c1;
fetch c1 into v_ename,v_sal;
dbms_output.put_line(v_ename||'  '||v_sal);
fetch c1 into v_ename,v_sal;
dbms_output.put_line('My second employee name is:'||'  '||v_ename);
fetch c1 into v_ename,v_sal;
dbms_output.put_line(v_ename||'  '||'salary'||'  '||v_sal);
close c1;
end;

ouput:-
SMITH 800
My second employee name is:ALLEN
WARD salary is:1250


cursor--->To process multiple records
      --->record by record prrocess


Explicit Cursor Attribute:-
==========================
Every explicit cursor having following four attributes
These are:-
----------
1:%notfound
2:%found
3:%isopen
4:%rowcount

-->when we are using these attribute in pl/sql block then we must use cursor name along with
   these attributes.
syntax:-
-------
cursorname%attributename

here except %rowcount all other cursor attributes return boolean value either true or false
where as %rowcount attribute always return number datatype

%notfound:-
==========
This attribute always return boolean value either true or false
This attribute returns true when fetch statement does not fetches
any row from cursor memory area where as this attribute returns
false when fetch statment fetches at least one row from cursor
memory area.

syntax:-
-------
cursorname%notfound

Q:write a pl/sql explicit cursor program which is used to display all employee and their salary from emp table by using %notfound attribute.

sql>
    declare
    cursor c1 is select ename,sal from emp;
    v_ename varchar(10);
    v_sal varchar(10);
    begin
    open c1;
    loop
    fetch c1 into v_ename,v_sal;
    exit when c1%notfound;
    dbms_output.put_line(v_ename||'  '||v_sal);
end loop;
close c1;
end;

*Q:write a pl/sql program which is used to calculate total salary from emp table without using sum function.
sql>
    Declare
    cursor c1 is select sal from emp;
    v_sal number(10);
    n number(10);
    Begin
        loop
        fetch c1 into v_sal;
        exit when c1%notdound
        n:=n+v_sal;
    end loop;
    dbms_output.put_line('Total'||  '||n);
end;

note:-
------whenever resource table column having then the above program returns total is null
      to overcome this problem then we must use nvl()
Example:-
--------
        n:=n+nvl(v_sal,0);
        
2:%rowcount:-
 ---------- 
Q:write a pl/sql expilicit cursor program which is used to display first five highest salary employee from
  emp table by using %rowcount attribute.

sql>
    Declare
    cursor c1 is select ename,sal from emp order by sal desc;
    v_ename varchar(10);
    v_sal number(10);
    Begin
    open c1;
    loop
    fetch c1 into v_ename,v_sal;
    dbms_output.put_line(v_ename||'  '||v_sal);
    exit when c1%rowcount>=5;
end loop;
close c1;
end;

Q:write a pl/sql expilicit cursor program which is used to display even number of record from emp table 
  By using %rowcount attribute.

sql>
    Declare
    cursor c1 is select ename,sal from emp;
    v_ename varchar(10);
    v_sal number(10);
    Begin
    open c1;
    loop
    fetch c1 into v_ename,v_sal;
    exit when c1%notdound;
    if mod(c1%rowcount,2)=0 then
        dbms_output.put_line(v_ename||'  '||v_sal);
    end if;
end loop;
close c1;
end;
-->In oracle whenever we are creating expilicit cursor then oracle server internally automatically
   creates four memeory location along with cursor memory area these memory location are identified
   throgh expilicit cursor attributes these attribute also like variables
Ex:
  declare
   a number(10);
   b boolean;
   begin
   a:=50;
   b:=True;
   end;

   These variable value also stored at a time
     c1%notfound     c1%found        c1%isoper     c1%Rowcount                             
      +-------+     +----------+    +-----------+  +--------+
      | True  |     |  False   |    |  True     |  |  2     |
      +-------+     +----------+    +-----------+  +--------+

This attribute always return number data i.e it counts number of records fetch from cursor memory area
Ex:-
    DECLARE
    cursor c1 is select ename,sal from emp;
    v_ename varchar(10);
    v_sal number(10);
    begin
    open c1;
    fetch c1 into v_ename,v_sal;
    dbms_output.put_line(v_ename||'   '||v_sal);
    fetch c1 into v_ename,v_sal;
    dbms_output.put_line(v_ename||'  '||v_sal);
    dbms_output.put_line('number of records number fetched from records number ffetched from cursor is:'||'  '||c1%rowcount(;
    close c1;
end;
Q:write a pl/sql expilicit program which is used to display  5th record from emp table by using
  %rowcount attribute.

sql>
    Declare
    cursor c1 is select * from emp;
    i emp%rowtype;
    Begin
    open c1;
    loop
    fetch c1 into i;
    exit when c1%notfound;
    if c1%rowcount=5 then
        dbms_output.put_line(i.ename||'  '||i.sal);
    end if;
end loop;
close c1;
end;

o/p:    MARTIN 1250

note:-
-----By using cursor we can also transfer data from one oracle table into another oracle table
     
sql>create table target(sno number(10),name varchar(10),salary number(10));

sql>
    declare
        cursor c1 is select * from emp;
        where sal>2000;
        i emp%rowtype;
        n number(10);
        Begin
            open c1;
            loop
            fetch c1 into i;
            exit when c1%notfound;
            n:=c1%rowcount; "n:= is storing rowcount[1,2,3,4]
            insert into target(n,i.ename,i.sal);
        end loop;
        close c1;
    end;
sql>select * from target;

| SNO | NAME  | SALARY |
|-----+-------+--------|
| 1   | JONE  | 3075   |
| 2   | BLAKE | 2850   |
| 3   | CLARK | 2950   |

4:%found:-
 --------This attributes always return boolean value either true or false
         it returns true when fetch stmts at least on record in memory area
         where as it returns false when fetch statment does not fetches any
         records from cursor memory area.
syntax:-
------ cursorname%found

sql>
    declare
    cursor c1 is select * from emp
    where ename='&ename';
    i emp%rowtype;
    Begin
    open c1;
    fetch c1 into i;
    if c1%found then
        dbms_output.put_line('u r record exists with having a employee name'||
        '  '||i.ename||'  '||'and salary is'||'   '||i.sal);
    elsif c1%notfound then
        dbms_output.put_line('u r record does not exists');
    end if;
    close c1;
end;

o/p:sql>/
    Enter value for ename:abc

    u r record deos not exits
This attribute always return boolean value either true or false it returns true if cursor is
already open where as it returns false when cursor is not open 

syntax:-
-------
       cursorname%isopen

sql>    
    declare
    cursor c1 is select * from emp;
    i emp%rowtype;
    Begin
    open c1;
    if c1%isopen then
        dbms_output.put_line('cursor is already opened');
    else
        dbms_output.put_line('cursor is not opened');
    end if;
    close c1;
end;
+-----------------+--------------+----------------------------------------------------------------+
|Expilicit cursor |              |if fetch stmts fetches at least any row from cursor memory are  |
|  attribute      |Returns value |                                                                |
+-----------------+--------------+----------------------------------------------------------------+
|%found           |True --------->if fetch stmts does not fetches any row                         |
|                  False--------->if fetch stmts does not fetches any row from cursor memory      |
+-----------------+--------------+----------------------------------------------------------------+
|%notfound        |True-------->if fetch statement doesn't return any row                         |
|                  False------->if fetch statement returns atleast one row                        |
+-----------------+--------------+----------------------------------------------------------------+
|%isopen          |True--------->if cursor already open                                           |
|                  False-------->if cursor not opened                                             |
+-----------------+--------------+----------------------------------------------------------------+
|%rowcount        |number-----+->|                                                                |
+-----------------+--------------+----------------------------------------------------------------+

==>In oracle we can also terminate expilict cursor lifecycle by using cursor for loop.
   this method is also called as shortcut method of cursor.
   In this method we are not allowed to used open,fetch,close statments expilictly i.e
   whenever we are using cursor for loops then oracle server only internally automatically
   open the cursor and also fetch data from the cursor,and also close the cursor automatically.

cursor for loop:-
---------------
syntax:-
-----+-----<-------<-----+
     |                   |
for indexvarname in cursorname
   loop
  stmts;
 end loop;

    * This cursor for loop is used in executable section of the pl/sql block. 
    *   
note:-
    here for loop indexvariable internally behave like a recordtype variable[%rowtype].
    
Q:write a pl/sql cursor program which is used to display all employee name and their salary from emp
  table by using cursor for loop.

declare
cursor c1 is select * from emp;
begin
for i in c1
    loop
    dbms_output.put_line(i.ename||'  '||i.sal);
end loop;
end;

note:-
    In oracle we can also terminating declare section of the expilict cursor by using
    cursor for loop in this case we must spacify cursor select statments implicit of 
    cursorname within cursor for loop
syntax:-
------
for indexvariablename in (select stmt)
    loop
    stmts;
end loop;

Begin
for i in(select * from emp)
    loop
    dbms_output.put_line(i.ename||'   '||i.sal);
end loop;
end;

Q:write a pl/sql expilict program by using cursor for loop to display 5th record from emp table by using
  %rowcount attribute.

sql>
  declare 
  cursor c1 is select * from emp;
  begin
  for i in c1
      loop
      if c1%rowcount=5 then 
          dbms_output.put_line(i.ename||'   '||i.sal);
      end if;
  end;

MARTIN  1250

Q:write a pl/sql expilict cursor program by using cursor for loop which is used to dispaly total salary
  from emp table without using sum().

sql>
  declare
  cursor c1 is select sal from emp;
  n number(10);
  begin
  for i in c1
      loop
      n = n+i.sal;
  end loop;
  dbms_output.put_line('total salary is: '||'  '||n);
  end;

parameterized cursor:-
====================
In oracle we can also pass parameters into the expilicit cursor
these type of cursor are also called as parameterized cursors
In parameterized cursor we must spacifiy formal parameters when
we are declaring the cursor and also we must pass actual parameters
when we are opening the cursor.
syntax:-              [formal parameters]
-----                 ---------------------
    cursor cursorname(parametername datatype) is select * from tablename
    where colname = parametername;

    or

    open cursorname(actual parameters);


==>If we want to provide different where condition value either statically or dynamically then we are
   using parameterized cursor. 

==>In relational database whenever we are passing data from one cursor to another cursor then receiving 
   cursorr is parameterized cursor 

note:-
-----In pl/sql when we are using formal parameters in cursor,procedures,function,then we are not 
      allowed to spacifiy data type size in formal parameter declaration. 

Q:Write a pl/sql parameterized cursor program for passing department number as parameter and display
 employee details from emp table based on passed requirement number.

 sql>
    declare
    cursor c1(p_deptno number)
    is select * from emp;
    where deptno=p_deptno;
    i emp%rowtype;

    begin
    open c1(10);
    loop
    fetch c1 into i;
    exit when c1%notfound;
    dbms_output.put_line(i.ename||'  '||i.sal||'  '||i.deptno);
    end loop;
    close c1;
end;

o/p:
    CLARK       3450        10
    KING        6100        10
    MILLER      2300        10

Q:write a pl/sql parameterized cursor program for passing job as parameter then display employees
  working as clerk or analyst from emp table and also display Final output statically if you flowing
  formate.

  Employees working as clerks
  smith
  adams
  james
  miller
  
  Employee working as analysts
  scott
  ford

sql>
    declare
    cursor c1(p_job varchar2)is select * from emp
    where job=p_job;
    i emp%rowtype;
    begin
    open c1('CLERK');
    dbms_output.put_line('Employees working as clerk');
    loop
    fetch c1 into i;
    exit when c1%notfound;
    dbms_output.put_line(i.ename);
end loop;
close c1;
open c1('ANALYST');
dbms_output.put_line(i.ename);
end loop;
close c1;
end;

note1:
----->Before we are reopen the cursor then we must close the cursor properly.
      otherwise oracle server return an error.

note2:
----->if parameterized cursor we can also pass default values by using either DEFAULT clause or by using
      := operator.
syntax:-
-------
       parametername datatype default(or):= defaultvalue
Example:-
--------
declare
cursor c1(p_deptno number default 30)is select * from emp where deptno=p_deptno;
begin
for i in c1
    loop
    dbms_output.put_line(i.ename||'  '||i.sal||'  '||i.deptno);
end loop;
end;
/

ALLEN   1600    30
WARD    1250    30
MARTIN  1250    30
BLAKE   2850    30  

Q:write a pl/sql expilict cursor program by using cursor for loop for passing job as parameter then
display employees either clerk or analyst  and display final output statically

sql>
declare
cursor c1(p_job varchar2) is select * from emp
where job=p_job;

begin
dbms_output.put_line('Employees working as clerks');
for i in c1('CLERK')
loop
dbms_output.put_line(i.ename);
end loop;
dbms_output.put_line('Employees working as analysts');

for i in c1('ANALYST')
    loop
    dbms_output.put_line(i.ename);
end loop;
end;
/

Q.write a pl/sql program which is used to reterive  departno from dept into expilict cursor and also
  passed these departmentno from this cursor into another perameterized cursor which is used to
  reterive employee details from emp table.

sql>
  declare
  cursor c1 is select deptno from dept;
  cursor c2 (p_deptno number) select * from emp
  where deptno=p_deptno;
  begin
  for i in c1
      loop
      dbms_output.put_line('My depth table deptno is:'||'  '||i.deptno);
      for j in c2(i.deptno)
          loop
          dbms_output.put_line(j.ename||'  '||j.sal||'   '||j.deptno);
      end loop;
  end loop;
  end;

output:
======
    My dept table deptno is: 10

    CLARK   2450    10
    KING    5000    10
    MILLER  1300    10
    My dept table deptno    is:20
    SMITH   800     20
    JONES   2975    20

--------------------------------------

Function(or)Exression are used in explicit cursor:-
--------------------------------------------------
* In oracle we can also used function or expression ane explicit cursor in select statments in this
  case we must create alias name for those function or expression in select stmts and also
  we must declare cursor requirement variable in declaration section of the plsql block.

syntax:-
-----
    variablename cursorname%rowtype;

Q.write a plsql explicit program which is used to calculate total salary from emp table by using sum()

sql>
 declare
 cursor c1 is select sum(sal)a from emp;
 i c1%rowtype;
 begin
 open c1;
 fetch c1 into i;
 dbms_outptu.put_line('total salary is: '||'  '||i.a);
 close c1;
 end;

output:-
-------
    total salary is: 29025

 
Q.Write a perrameterized cursor program deptno is parameter then display no of employees,minimum salary,
maximum salary,total salary,total  salary from emp table based on  and also display final output in the 
following formate.

Enter value for deptno:
number of employees are:
minimum salary is:
maximum salary is:
total salary is  :

sql>
  declare
  cursor c1(p_deptno number) is 
  select count(*) a,min(sal)b,max(sal)c,sum(sal)d from emp
  where deptno=p_deptno;
  i c1%rowtype;

  begin
  open c1(&deptno);
  fetch c1 into i;
  dbms_output.put_line('number of employees are: '||'  '||i.a);
  dbms_output.put_line('minimum salary is      : '||'  '||i.b);
  dbms_output.put_line('maximum salary is      : '||'  '||i.c);
  dbms_output.put_line('total salary   is      : '||'  '||i.d);
  close c1;
  end;

o/p:
    Enter  value for deptno:10
    number of employees are:3
    minimum salary is      :1300
    maximum salary is      :5000
    total   salary is      :8750

Implict Cursor:-
===============
-->for sql statement returns single record is also called as implict cursor
-->implicit cursor memory area is also called as context area
Example:-
--------
        sql>declare
            v_ename varchar(10);
            v_sal number(10);
            begin
            select ename,sal into v_ename,v_sal from emp where empno=&no;
            dbms_output.put_line(v_ename||'  '||v_sal||);
        end;

    Enter value for no: 7566
    JONES   2000

-->whenever plsql block having select into clause or plsql block having pure dml statement then oracle
   server internally automatically allocate memory area this memory area is also called as sql area
   or context area or implicit cursor this memory area returns single return select into clause
   this memory area also return multiple records when plsql block having pure dml statement. 
   but we cannot controle individual records from these multiple records because these multiple
   records process at a time by using sqlEngine along with this memory area oracle server internally
   automatically allocate four memory location thise memory location are identified by using implicit
   cursor attributes.these implicit cursor attributes are

1:sql%notfound
2:sql%found
3:sql%isopen
4:sql%rowcount

-->here sql%isopen attribute always return false where as sql%notfound,sql%found attribute returns
   boolean value either true or false and also sql%rowcount attribute always return number datatype.
   
                            sqlArea
        +------------------------------------------------+
        |                                    pure        |
        |    select...into                dml stmst      | multiple record +--
        |           clause               ----------------+---------------> | these all records prcessed
        |                                ----------------+---------------> | at a time by sqlEngine
        |                                ----------------+---------------> |
        |                                                |                 +--
        +------------------------------------------------+


         sql%notfound       sql%found        sql%isopen           sql%rowcount
       +----------+       +-----------+    +-------------+     +--------------+
       |          |       |           |    |             |     |              |
       |          |       |           |    |             |     |              |
       |          |       |           |    |             |     |              |
       +----------+       +-----------+    +-------------+     +--------------+
Example:-
--------
        sql>
        begin
        delete from emp where ename='welcome';
    end;
    /
    o/p:
        pl/sql procedure successfullyy completed.

solution:-(by using implicit cursor attributes)
=============================================
sql>
    begin
    delete from emp where ename='welcome';
    if sql%found then
    dbms_output.put_line('u r records is deleted');
end if;
if sql%notfound then 
    dbms_output.put_line('u r record does not exist');
end if;
end;

Example:-
--------
        begin
        update emp set sal=sal+100
        where job='CLERK'
        dbms_output.put_line('affected number of clerk are:'||'  '||sql%rowcount);
    end;
    /
    o/p:
        affected number of clerk are:4;
        

update,delete statements are used in explicit cursor(without using where current of,for update clauses):
=======================================================================================================
Q:write plsql expilicit cursor program which is used to modified salary of the employee in the emp table
  based on following condition.
1:if job='CLERK' then increment  salary--->100
2:if job='SALESMAN' then decrement salary---->200

Example:-
--------
declare
cursor c1 is select * from emp;
i emp%rowtype;
begin
open c1;
loop
fetch c1 into i;
exit when c1%notfound;
if i.job='CLERK' then
    update emp set sal=sal+100 where empno=i.empno;
    elsif i.job='SALESMAN' then 
    update emp set sal=sal-200 where empno=i.empno;
end if;
end loop;
close c1;
end;
    
sql>select * from emp;

