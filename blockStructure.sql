
                                     PL/SQL
                                    ********
-->pl/sql is a procedural langauge extension with SQL langauge.
-->oracle 6.0 introduce pl/sql
-->it is a combination of sql and procedural statments. 

            oracle 6.0--->pl/sql 1.0
            oracle 7.0--->pl/sql 2.0
            oracle 8.0--->pl/sql 8.0
            oracle 12c--->pl/sql 12c

Basically pl/sql is a block structure programming langauge whenever we are submitting pl/sql 
blocks then all sql statments are executing seperatly by using sql engine and also all procedure
statements are executed seperately.                          [pl/sql Architecture]
                                                         +--------------------------+
In procedural statements executor within pl/sql engine   | +----------------------+ |
                    +--------------------pl/sql Engine---+-+   +------------+     | |
                    |    +--------+                            | procedure  |     | |
      +--------+    |    |pl/sql  +------>  procedural ------> | statement  |     | |
      | pl/sql +----+--->|blocks  +------>  statment  -------> | executor   |     | |
      | Blocks +----+--->|        |                            +------------+     | |
      +--------+    |    +--------+------++                                       | |
                    |                    ||                                       | |         
                    +--------++-----------------------------------------+---------+-+
                                         ||
                                    +-------------+
                                    |  sql engine |
                                    +-------------+

Block Statement:-
===============
declare(optional)

variable declaration,cursor,user defined exception 
Begin(mandatory)
    DML
    select in clause
    conditional,control statement

Exception (optional)
    handling runtime error
end;(mandatory) Declaring a variable:-
=====================
In declare section of the pl/sql Block we can declare
a variable.

syntax:-
-------
        variable datatype(size)

Example:-
--------
        declare
        a number(10);
        b number(20);
storing a value into variable:-
using assignment operator(:=)

syntax:-
-------
        sql>declare
                   a number(10)
                   begin
                    a:50;
                end;
                /
Display a message(or)variable value:-
------------------------------------
syntax:-
-------
        dbms_output.put_line(variable name);
       ------------- --------
       [packageName] [procedureName]

-->This package is used in either in executable section or in exception section of the pl/sql block.

sql>set serveroutput on;
sql>begin
    dbms_output.put_line('welcome');
end;
o/p;
    welcome
-->whenever we are passing data into put_line procedure from dbms output package then automatically
   passed the data into internal buffer.This data is not visible in sql+environment.

-->if we want to display this data then we must set serveroutput enviroment variable in sql + enviroment
   by using Following

syntax:-
--------
        sql>set serveroutput on
Example:-
--------
        declare
        a number(10)
        begin
            a:50;
            dbms_output.put_line(a);
        end;
        /
select into clause:-
-------------------
select into clause isused to retrieve data from table pl/sql variable select into clause always 
returns single record on single value at a time

Syntax:-
-------
        select col1,col2,.....into var1,var2....from tablename
        where condition;
-->This clause is used in executable section of the pl/sql block.

Q:write a pl/sql program for user enter employee no that display name of the emp and his salary from empanel  table?

    declare
    v_ename varchar(10);
    v_sal number(10);

    begin
        select ename,sal into v_ename,v_sal from emp where empno=&no;

        dbms_output.put_line(v_ename||'  '||v_sal);
    end;
    

In pl/sql whenever we are using not null or constant clauses in variable declaration then we must
assign the value at the time of variable creation if declare section of the pl/sql block.

syntax:-
--------
        variablename datatype(size)not null:=value;
syntax:-
--------
        variablename constant datatype(size):=value;

Example:-
--------
        declare
        a number(10)not null:50;
        b constant number(10):=7;
        Begin
            dbms_output.put_line(a);
            dbms_output.put_line(b);
    end;

Q:write a pl/sql program to retrieve emp table and then display the salary?

    declare
    v_sal number(10);
    Begin
        select max(sal)into v_sal;
        from emp
        dbms_output.put_line(v_sal);
end;

declare
a number(10);
b number(10);
c number(10);
begin 
    a :=70;
    b :=30;
    c :=greatest(a,b);
    dbms_output.put_line(c);
end;

In pl/sql expression we are not allowed to use group function decode conversion function but we are 
allowed to use numbers function,character function and date function,date conversion function in pl/sql
expression.

declare
a varchar(10);
begin
    a:=upper('murali');
    dbms_outpu.put_line(a);
end;
        

variable attributes:-
====================
Variable attributes are used to inplace of data in variable declaration
Variable attributes are also called as anchor notations 
Wheever we are using variable attributes then oracle server internally
automatically allocate memory for variable as same as corresponding column data type in a table. 

pl/sql having two types of attrributes:-
=====================================
1:column level attributes:
2:row level attributes:


1:column level attributes:
=======================

In this method we are defining attributes for individual columns 
whenever we are using column level attributes then oracle server internally automatically
alocate memory for the variable as same as corresponding column data type in table.
column level attributes are represented by using (%type)

syntax:-
-------
    variablename tablename.columnname %type;
Example:-
--------
    declare
    v_ename emp.ename%type;
    v_sal emp.sal%type;
    v_hiredate emp.hiredate%type;
    begin 
        select ename,sal,hiredate into v_ename,v_sal,v_hiredate from emp
        where empno=&no;
        dbms_output,put_line(v_ename||' '||v_sal||' '||v_hiredate);
    end;
    /
==>Enter value for no:7902
   FORD 3000 03-DEC-81

2:Row level attributes:-
  ======================
  In this method single variable represents all different data type in a row within a table.
  This variable is also called as record type variable 
  It is also same as structrue in c-langauge

  Row level attributes are represented by using Row type.
syntax:-
-------
variablename tablename%rowtype;

Example:-
--------
    declare
    i emp%rowtype;
    begin
        select ename,sal,hiredate into
        i.ename,i.sal,i.hiredate from emp
        where enmpno=&no;
        dbms_output.put_line(i.ename ||' '||i.sal||' '||i.hiredate);
    end;
    /
Enter value for no:7902
FORD 3000 03-DEC-81

or
declare
i emp%rowtype;
begin
    select * into i from emp
    where empno=&no;
    dbms_output.put_line(i.ename ||' '||i.sal||'  '||i.hiredate||'   '||'  '||i.deptno);
end;
/
Enter value for no:7092
FORD 3000 03-DEC-81 20
                       
                             i.ename
declare               i.empno                                  i.deptno
    i  emp%rowtype; --------------------------------------+---+-----+
                    |    |    |       |    |         |    |   |     |
    i        +----->|7902|FORD|ANALYST|7839|03-DEC-81|3000|-  |20   |
  +-----+    |      +----+----+-------+----+---------+----+---+-----+
  |     +----+
  +-----+

Oracle having two Engine
---------------
1:sql Engine
2:pl/sql Engine

whenever we are submitting pl/sql block into oracle server 
then all sql statement are executed within sql Engine and also all procedural statement are Executed
within procedural statement executer under pl/sql e-chart.
+---------------------------------------------------------------------------------------------------+
|                                      plsql Engine                                                 |
|  +-------------+                +----------+--------- ----------> +----------------+              |
|  |   pl/sql    +--------------> |  pl/sql   --------------------->| procedural stmt|              |
|  |   Block     +--------------> |  Block   +------------+         | executer       |              |
|  +-------------+                +----------+---------+  |         +----------------+              |
|                                                      |  |                                         |
|                                                      |  |                                         |
|                                                      |  |                                         |
|                                                   +-----------+                                   |
|                                                   | sqlEngine |                                   |
|                                                   +-----------+                                   |
|                                                                                                   |
+-+-------------------------------------------------------------------------------------------------+                                            |

Conditional Statement:-
=====================

    *If
    *If-else
    *elsif
    
1)if:-
=====
    .syntax:-
     ------.if condition then
                stmts;
        end if;

2)if-else:-
==========
         .syntax:-
          -------.if conditional then
                        stmts;
                    else
                        stmts;
                end if;

3)elsif:-
=======
To check more no of condition then we are using elsif.
      .syntax:-
       -------.if conditionl then
                    stmts;
                elsif conditonl2 then 
                    stmts;
                elsif conditionl3 then
                    stmts;
                    ------------
                    --------------
                else
                    stmts;
            end if;

Example:-
--------
Declare
v_deptno number(10);
begin
    select deptno into v_deptno from dept where deptno=&deptno;
    if v_deptno = 10 then
        dbms_output.put_line('ten');
        elsif v_deptno=20 then
            dbms_output.put_line('twenty');
        elsif v_deptno=30 then
            dbms_output.put_line('thirty');
        else
            dbms_output.put_line('others');

    end if;
end;
/

Enter value for deptno: 40
others

sql>/
Enter value for deptno: 90
ERROR

note1:
-----
    whenever pl/sql having select.. into clause and also if request data not available 
    in table through this clause then oracle server returns and error
    ORA-1403:no data found.

note2:
-----
    whenever pl/sql block having pure dml[insert delete update]having and also if request
    data not available in a table through these dml statements then oracle server does
    not return any error message for handling these types of block then we are using
    implicit cursor attributes
Example:-
--------
sql>begin
        delete from emp where ename='welcome';
end;
/

pl/sql procedure successfully completed.

note3:
-----
    whenever select into clause try to return multiple records or try to return multiple value from
    a single column at a time then oracle server returns an error.
    ORA-1422:Exact fetch returns more than requested number of rows 

Example:-
--------
sql>declare
    i emp%rowtype
    begin
        select * into i from emp where deptno=10;
        dbms_output.put_line(i.ename||'  '||i.sal);
    end;
    /
ORA-1422:exact fetch returns more than requested number of rows


pl/sql datatypes of variables;
============================

1:it supports all sql datatypdatatypes)
2:complete datatypes
3:ref objects
4:lob(large object) datatypes(clob,blob,btle datatypes)
5:Blind variables (or)non pl/sql variables

pl/sql having two types of blocks:-
==================================
1:Anonymous block(declare)
2:Named block (procedure,function,trigger..)


Example:-
--------
sql>declare                          BLOCK
    begin         +----------------------------------------------+
        -----     |                                              |
        -----     |                                              |
    end;          |                                              | ex:procedure,function..
                  |                                              |
                  |                                              |
            1:Annonymous block                                   |
                                                            2:Named block
1:these blocks doest not have any name.
2:these block are not stored perminently in oracle database
3:these blocks are not allowed to call in client application

Named block:-
------------
1:these block having name
2:these blocks are automatically perminently stored in oracle database
3:these blocks are allowed to call in client application.

