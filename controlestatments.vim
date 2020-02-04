                               control statment
                                     loop
                            *************************
* pl/sql haivng three type of loop these are.

1:simple loop
2:while loop
3:for loop

simple loop:-
------------
            -->This loop is also called as infinite loop
            -->here body of loop statement are executed repeatdly
syntax:-
------
loop
    stmts
end loop;
            
-->This loop is used executable section of the pl/sql block


Example:-
-------
sql>begin
        loop
        dbms_outpu.put_line('welcome');
    end loop;
end;

To exit from infinte loop:-
--------------------------
oracle providing two method.

method1:-
syntax:-exit when Truecondition.

Example:-
--------
DECLARE
n number(10):=1;
begin
    loop
    dbms_output.put_line(n);
    exit when n>=10;
    n:n+1;
end loop;
end;

method2:-(using if)
-------
syntax:-
------- if truecondition then 
            exit;
        end if;
Example:-
--------
DECLARE
n number(10):=1;
begin
loop
dbms_output.put_line(n);
if n>=10 then
    exit;
end if;
n:=n+1;
end loop;
end;

while loop:-
==========
syntax:-
-------
while(condition)
    loop
    stmts
end loop;

-->here condition always return boolean value either true or false
   whenever condition is true then only controle goes to body of the loop.
   and also body of the loop statments are executed repeatedly
   and if condition is false. 

Example:-
--------
DECLARE
n number(10):=1;
begin
while (n<=10)
    loop
    dbms_output.put_line(n);
    n:=n+1;
end loop;
end;

for loop:-
=========
syntax:
------- for indexvariablename in lowerbound.. upperbound
            loop
            stmts;
        end loop;
Example:-
-------
declare
n number(10);
begin
    for n in 1..10
        loop
        dbms_output.put_line(n);
    end loop;
end;

note:-
----
-->In pl/sql for loops we are not allowed to use incrementation and decrementation explictly
   Because in for loop by default auto incremented by 1. 

Example:-
--------
declare
n number(10);
begin
for n in reverse 1..10
    loop
    dbms_output.put_line(n);
end loop;
end;

note:-
----- whenever we are using for loop we are not required to declare variable  because
      we are using for loop index variable internally behaves like a integer  variable
      thats why pl/sql for loop also called as numaric for loop.
Example:-
-------
begin
for i in 1..10
    loop
    dbms_output.put_line(i);
end loop;
end;
/

Example:-
--------
    sql>create table test(sno number(10));

    sql>
        begin
        for i in 1..50
            loop
           insert into test values(i);
        end loop;
    end;
    /
    sql>select * from test;


Bind variable (or)non pl/sql variable:-
======================================
->bind variables are session variable created at host environment thats why these variable also
  called as host variable

->These variable also called as non pl/sql variables Because these variable  are used in sql,pl/sql
  dynamic sql language

->In pl/sql we can also use these bind variables for executing a procedure having out or in out parameter

->In oracle we are creating bind variable by using following three process.
    
    step1:-create a bind variable
    step2:-using bind variable
    step3:-display value from bind variables

step1:-create a bind variable:-
-----------------------------
->we are creating bind variable at sql promote by using following syntax
syntax:-
-------sql>variable varname datatype;

step2:-using bind variable:-
---------------------------
syntax:-bindvariablename
-------

step3:-display value from bind variable:-
----------------------------------------
syntax:-print bindvarname;
Example:-
--------
sql>DECLARE
    a number(10):=1000;
    begin
    :g :=a/2;
end;
/
sql>print g;
    G
 -------
   500

