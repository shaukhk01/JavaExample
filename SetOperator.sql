                                 SET OPERATORS
                                 =============

SET OPERATOR ARE USED TO RETERIVE DATA FROM SINGLE OR MULTIPLE TABLES.  SET OPERATORS ARE ALSO CALLED AS 
VIRTICALE JOINS.

These set Operators are:
========================
1:Union     =>it returns value unique time+sorting
2:Union all =>unique +duplicate
3:Intersect =>return common values
4:Minus     =>value are in first query and those value are not in second query  

EXAMPLE:
--------
sql>select job from emp where deptno=10;

JOB
--------
MANAGER
PRESIDENT
CLERK

sql>select job from emp where deptno=20;

JOB
--------
CLERK
MANAGER
ANALYST
CLERK
ANALYST

sql>select job from emp where deptno=10 union select job from emp where deptno=20;

JOB
--------
ANALYST
CLERK
MANAGER
PRESIDENT

WHEN EVER WE ARE USING SET OPERATOR ALWAYS CORRESPONDING MUST BELONG TO SAME DATA TYPE AND BY DEFAULT SET,
OPERATOR RETURN FIRST QUERY COLUMN NAME AS COLUMN HEADING

sql>select dname from dept union select ename from emp;

    DNAME
    --------
    ACCOUNTING 
    ADMAS
    ALLEN
    BLAKE

note:
------
IN ORACLE WE CAN ALSO RETERRIVE DATA FROM MULTIPLE QUERIES BY USING SET OPERATOR IF CORRESPONDING EXPRESSIONNOT BELONG TO SAME DATA TYPE ALSO IN THIS CASE WE MUST USE APPROPIRATE TIME CONVERSION FUNCTION,

sql>select deptno from emp union select dname from dept;

ERRROR:expression must have same datatype as corresponding expression 

SOLUTION:
----------
sql>select deptno "deptno",to_char(null) "deptnames"from emp

        
                deptno      dnames
              ---------    ----------
                10
                20
                3o         
                          ACCOUNTING
                          Operations
                          RESEARCH
                          SALES
                            

CONVERSIONS:-
==============

CONVERT ONE DATA TYPE INTO ANOTHER DATA TYPE IS CALLED CONVERSION

Oracle having two type of conversion these are:
-----------------------------------------------
1:Implicit conversions.
2:Explicit conversions.

Implicit Conversion:-
----------------------
IN THIS METHOD ORACLE SERVER ONLY INTERNALLY AUTOMATICALLY CONVERTS ONE TYPE INTO ANOTHER TYPE
IN ORACLE WHENEVER STRING REPERSENTING PURE NUMBER[ONLY NUMBER]THEN ORACLE SERVER AUTOMATICALL CONVERTS,
STRING TYPE INTO NUMBER 

EXAMPLE:-
----------
select sal+'100' from emp;

IN ORACLE WHENEVER WE ARE PASSING ANY NUMBER INTO ORACLE PREDEFINED CHARACTER FUNCTION THEN ORACLE SERVER,
INTERNALLY AUTOMATICALLY CONVERT NUMBER INTO CHARACTER TYPE 

EXAMPLE:
--------
sql>select length(3678)from dual;
            =>4

IN ORACLE WHENEVER WE ARE PASSING DATE STRING INTO ORACLE PREDEFINED DATE FUNCTIONS[ADD_MONTHS(),LAST_DAY(),NEXT_DAY(),MONTHS_BETWEEN(),....]
THEN ORACLE SERVER INTERNALLY AUTOMATICALLY CONVERTS DATE STRING INTO ORACLE DATE TYPE,BUT HERE PASSED,
PARAMETER RETURN VALUE MUST MATCHED WITH DEFAULT DATE FORMATE RETURN VLAUES.

-------------------------------------------------------
-------------------------------------------------------
-------------------------------------------------------

WRITE A QUERY WHICH IS USED TO DISPLAY DIAGNAL VALUES.FORM THE FOLLWING TABLE BY USING D-CODE COVERSION

    sql>create table test(col1 number(10),col2 number(10),col3 number(10));
    sql>insert into test values(....);

    sql>select * from test;

    | col1 | col2 | col3 |
    |------+------+------|
    | 10   | 20   | 30   |
    | 40   | 50   | 60   |
    | 70   | 80   | 90   |


    output:10 50 90[diagonal]

    sql>selectt rownum,decode(rownum,1,col1,2,col2,3,col3) result from test;

    | ROWNUM | RESULT |
    |--------+--------|
    | 1      | 10     |
    | 2      | 50     |
    | 3      | 90     |


PIVOTING:-[*][10G]
==========

IN ALL RELATIONAL DATABASES CONVERTING ROWS INTO COLUMNS AND ALSO DISPLAY AGGREGATE FUNCTION VALUES IN 
TABULAR FORM WITHIN THESE COLUMNS ARE ALSO CALLED AS PIVOTING.

IN ORACLE IF YOU WANT IMPLEMENT PIVOTING REPORT THEN WE MUST USED DECODE CONVERSION FUNCTION WITHIN 
GROUP FUNCTION IN GROUP BY CLAUSE QUERIES. 

IN ORACLE IF YOU WANT TO IMPLEMENT PIVOTING REPORTS THEN WE MUST USE DECODE CONVERSION FUNCTION WITHIN,
GROUP FUNCTIONS IN GROUP BY CLAUSE QUERIES 

EXAMPLE:
--------
sql>select job,sum(sal)from emp group by job;

| JOB       | SUM(SAL) |
|-----------+----------|
| CLEARK    | 5450     |
| SALESMAN  | 6800     |
| PRESIDENT | 5400     |
| MANAGER   | 9275     |
| ANALYST   | 6600     |

WRITE A QUERY TO DISPLAY DEPTNO10,DEPTNO20,DEPTNO30 COLUMN AND EACH JOB SUM SALARY.BY USING DECODE()

sql>select job,sum(decode(deptno,10,sal))"deptno10",sum(decode(deptno,20,sal))"deptno20",sum(decode(deptno ,30,sal))"deptno30" from emp group by job;

| JOB       | deptno10 | deptno20 | deptno30 |
|-----------+----------+----------+----------|
| clerk     | 1700     | 2500     | 1250     | +----------------------------------------------------------+
| salesman  |          |          | 6800     | |   each rows sum of salary like clerk 2 times in dept10   |
| president | 5400     |          |          | |   that's its become 1700                                 |
| manager   | 2850     | 3275     | 3150     | |   salesman is not in deptno 10 that why it is empty      |
| analyst   |          | 6600     |          | |   saleman is deptno30 so that deptno30  is sum of sales  |
                                               +----------------------------------------------------------+

CASE STATMENT:-
=================
CASE STATMENT ALSO USED TO DECODING VALUES ORACLE 8.0 INTRODUCED CASE STATMENT AND ALSO ORACLE 8I INTRODUCEDCASE CONDITIONAL STATMENT'S THIS CASE CONDITIONAL STATEMENT IS ALSO CALLED AS SEARCHED CASE STATMENT
CASE STATMENT PERFORMANCE IS VERY HIGH COMPARE TO DECODE CONVERSION FUNCTION

note1:
-------
DECODE INTERNALLY USES EQUALITY OPERATOR WHERE AS IN CASE STATMENT WE ARE ALLOWED TO USED ALL SQL OPERATOR,
EXPLICTLY.[<,>,<=,>=,....]

ORACLE PROVIDE TWO METHOD FOR CASE STATMENT.THESE ARE

method1:-case statment
----------------------

method2:-case conditional
-------------------------
stmt(or) searched case statment


method1:-case statment
        --------------
    SYNTAX:-
    -------
    case columnname
    when value1 then stmt1
    when value2 then stmt2

    else
    stmts end;


sql>select ename,sa,deptno,case deptno when 10 then 'ten' when 20 then 'twenty' else 'other' end from emp;

    | DEPTNO | CASE   |
    |--------+--------|
    | 10     | ten    |
    | 20     | twenty |
    | 30     | others |


WRITE A QUERY TO UPDATE GENDER MALE TO FEMALE AND FEMALE TO MALE FROM TABLE

sql>select * from test;

    SNO     G
    --------- 
    1      female
    2      male
    3      female
    4      male

sql>update test set G = case G when 'female' then 'male' when 'male' then 'female' else 'other' end;

Grouping_id:-
=============
THIS FUNCTION IS USED ALONG WITH ROWNUM,FEW CLAUSES ONLY THIS FUNCTION ACCEPTS GROUP BY CLAUSE COLUMNS,
AND RETURNS NUMBERS 

Example:-
---------
grouping_id(deptno,job)==>1
                          2
                          3

here 1 represent first grouping column sub total
here 2 represent second grouping column sub total;
here 3 represent grant total

WRITE A QUERY TO DISPLAY GROUP WISE SUM OF SALARY LIKE FIRST GROUP OF SUM,SECOND GROUP OF SUM,GRANTTOTAL.

select deptno,job,sum(sal),grouping_id(deptno,job)from emp group by cube(deptno,job)order by 1,2;

DEPTNO  SUM(SAL) GROUPING_ID(DEPTNO,JOB)
------- -------- -----------------------
10      1300                 0
10      2450                 0
10      5000                 0
10      8750                 1  sum of 10 deptno salary
20      1900                 0
20      2975                 0
20      6000                 0
20      10875                1  sum of 20 deptno salary
30      950                  0
30      2850                 0
30      5600                 0
30      9400                 1  sum of 30 deptno salary
        4150                 2  sum of 10,20,30 deptno 'CLERK' salary
        5000                 2  sum of 10 deptno PRESIDENT salary                                   
        6000                 2 sum of 20 deptno ANALYS salary only
        8275                 2
subtotal[       ]            3 sum of all salary 



sql>select deptno,job,sum(sal)case grouping_id(deptno,job)when 1 then 'Dept Subtotal' when 2 then 'Job Subtotal'when 3 then 'Grand Total' end as subtotals from emp group by cube(deptno,job)order by 1,2;


Method:-case conditional statment(or)searched case statment[8i]
-----------------------------------------------------------

ORACLE 8I INTRODUCED SEARCHED CASE STATMENT IN THIS CASE SEARCHED STATMENT WE CAN ALSO USED ALL SQL OPTR'S,

SYNTAX:
-------
case when columncondition1 then stmt1 when columncondition2 then stmt2.... ... ... else stmts end;

WRITE A QUERY TO DISPLAY SAL>3000 'HIGH SALARY,SAL>2000 AND SAL<3000 THEN 'MEDIUM SALARY' FROM EACH SALARY 
PRINT STRING VALUE BASED ON CONDITION.
EXAMPLE:
--------
select ename,sal,case when sal<1000 then 'low salary' when sal between 1000 and 30000 then 'medium salary'
when sal in(3200,3450,3600,38000)then 'special salary' else 'other salary' end from emp;

EXAMPLE2:
---------
sql>select decode(200,100,100,'200','200') from dual;

output:-200;

sql>select case 200 when 100 then 100 when '200' then '200' else '300' end from dual; when '200' then '200'

ERROR;-inconsistent datatypes;
expected number got char


DIFFERENCE BETWEEN decode(),case STATMENT
=========================================

DECODE IS A CONVERSION FUNCTION ONLY WORKS IN ORACLE WHERE AS CASE IS STATMENT WHICH WORKS WITH ALL,
RELATIONAL DATA BASE PRODUCT BECAUSE CASE IS A ANSI STANDARD STATMENT AND ALSO CASE STATMENT PERFORMANCE,
IS VERY HIGH COMPARE TO DECODE CONVERSION FUNCTION

CASE CAN WORKS AS PL/SQL CONSTRUCT BUT DECODE IS USED ONLY IN SQL STATMENT AND CASE STATMENT CAN ALSO WORK,
WITH SEARCHABLE SUBQUERY.

GENERALLY DECODE FUNCTION INTERNALLY USES EQUALITY OPERATOR WHERE AS IN CASE STATMENT WE ARE ALLOWED TO,
USE ALL SQL OPERATOR EXPLICTLY AND ALSO CASE STATMENT EXPECTS DAT TYPE CONSISTANCE WHERE AS DECODE ,
FUNCTION DOES NOT

GENERALLY IN PL/SQL CASE STATMENT CAN BE USED AS PARAMETER OF A PROCEDURE OR FUNCTION WHERE AS DECODE,
FUNCTION CANNOT BE PASSED AS PARAMETER TO THE PROCEDUREAL FUNCTION

PIVOT():-[*]
=======
ORACLE 11G INTRODUCED PIVOT FUNCTION WHICH IS USED TO CONVERT ROWS INTO COLUMNS AND ALSO DISPLAY AGGREGATE,
FUNCTION VALUES IN TABULAR FORM PIVOT FUNCTION PERFROMANCE IS VERY HIGH COMPARE TO DECODE CONVERSION FUNCTI-ON,

SYNTAX:
-------
select * from (select col1,col2,... from tablename)pivot(aggregate functionName() for [clause]colname in(value1,value2,.....));

EXAMPLE:
---------
sql>select * from (select job,sal,deptno from emp)pivot(sum(sal)for deptno in(10 as deptno10,20 as deptno20,30 as deptno30));

| JOB       | deptno 10 | deptno20 | deptno30 |
|-----------+-----------+----------+----------|-----+
| CLERK     | 2300      | 2800     | 1850--+  +---+ |
| SALESMAN  |           |          | 5600     | +-------------------------------------------------+
| PRESIDENT | 5700      |          |          | |> here you can see each deptno job salary disp   |
| MANAGER   | 3150      | 3575     | 3450     | | 10 dept sum 'CLERK' job salary.                 |
| ANALYST   |           | 7200     |          | | 20 dept sum 'CLERK' job salary.                 |
                                                | 30 dept sum 'CLERK' job salary.                 |
                                                +-------------------------------------------------+
Q:write a query to display count no of job present in each deptno like deptno10 how much CLERK,deptno20 how much SALESMAN.
Example2:
---------
sql>select * from(select job,deptno from emp)pivot(count(*)for deptno in(10 as deptno10,20 as deptno20,30 as deptno30));

| JOB       | deptno10 | deptno20 | deptno30 |
|-----------+----------+----------+----------|+-----------------------------------------------------------+
| CLERK     | 1        | 2        | 1        ||>here you can see each deptno particular value.            |
| SALESMAN  | 0        | 0        | 4        || 10 dept nof of CLERK is only 1                            |
| PRESIDENT | 1        | 0        | 0        || 20 dept no  of CLERK is only 2                            |
| MANAGER   | 1        | 1        | 1        || 30 dept no  of CLERK is only 1                            |
| ANALYST   | 0        | 2        | 0        ||ex:select count(*)from emp where job='CLERK' and deptno=20;|
                                              +-----------------------------------------------------------+
[[above queries shows how many ecach rows available in each deptno like 'cleark' is 1 in deptno10
but deptno20 in 2 like]]

Data Type Conversion Function:-
==============================

Oracle having following data types conversion function these are.

1:to_number();
2:to_char();          to_number()-----------to_date ----
3:to_date();         +-                |            
                     |  
                     |  
                     |  
                    number            char          date
                     |      
to_number():         |                 |              |
-------------        |                 |              |
                     +to_char()- ------+--------------+

to_number():-
============
THIS FUNCTION IS USED TO CONVERTING STRING REPRESENTING NUMARIC VALUE WITH FORMAT INTO WITHOUT FORMAT. 

WRITE A QUERY WHICH IS USED TO ADD ANY NUMBER INTO THE GIVEN STRING '$35.8';

sql>select '$35.8'+3 from dual;
ERROR:invalid number

select to_number('$35.8'+3 from dual;

ERROR:invalid number


IN ORACLE WHEN EVER WE ARE CONVERTING STRING REPRESENTING NUMARIC  VALUE WITH FORMAT INTO WIHOUT FORMAT,
THEN WE MUST USED SECOND PARAMETER AS SAME AS FIRST PARAMETER FORMAT BY USING PREDEFINED FORMAT ELEMENT

SOLUTION:
---------
sql>select to_number('$35.8','$99.9')+3 from dual;
            38.8
sql>create table test(ename varchar2(10),sal varchar2(10));
sql>insert into test values(.....);

sql>select * from test;

| ENAME | SAL   |
|-------+-------|
| a     | $1000 |
| b     | $2000 |
| c     | $3000 |

sql>select ename,sal,sal*12 annsal from test;

ERROR:invalid number

solution:
---------

sql>select ename,sal,to_number(sal,'$9999')*12 annsal from test;

| ENAME | SAL   | ANNSAL |
|-------+-------+--------|
| a     | $1000 | 12000  |
| b     | $2000 | 24000  |
| c     | $3000 | 36000  |

Example:
--------
sql>select to_number('a35.8','a99.9')+5 from dual;

ERROR:invalid number format model

to_char():-
==========
to_char() is a Overloding Function Which is Use to convert number type into Character type And also used to,
convert date type into date string.

Converting Number type into Character Type.
--------------------------------------------
Q:Write a query which is used to substitue any message inplace of null value within mgr column.

sql>select nvl(mgr,'no manager')from emp;

ERROR;invalid number 

SOLUTION:-
---------
sql>select nvl(to_char(mgr),'no manager')from emp;

            mgr
        -----------
            7902
            7698
            7698
            no manager
            7698
            7788
            ----
            ----

SYNTAX:-
--------
to_char(number,'format')

ORACLE PROVIDED FOLLOWING PREDEFINED FORMAT ELEMENT FOR THE SECOND PARAMETER OF THE TO_CHAR(NUMBER)TO_CHAR()

Predefined Format Elements:-
---------------------------

0---------->represents a number
g---------->group seperator
d---------->decimal indicator
$---------->dollar sign
L---------->Local currency
0---------->leading zero
,---------->comma
.---------->decimal
sql>select to_char(1234567,'99g99g999d99') from dual;

12,34,567.00
***********************************************************************************************************
***********************************************************************************************************
Local currency(L):-
================                                  
sql>select to_char(123,'L999')from dual;
    $123
National language support[NLS]:-
==========================
NATIONAL LANGUAGE SUPPORT ALLOWS USERS INTERACTING WITH DATABASE WITH THERE NATIVE LANGUAGE AND ALSO                                
APPLICATION RUN IN DIFFERENT LANGUAGE ENVIROMENTS THESE NLS PARAMETER HANDLE BY DATABASE ADMINISTRATOR
ONLY. 
                                                                       
IN ORACLE ALL PREDEFINED NLS PARAMETER NAMES AND THOSE PARAMETER DEFAULT VALUES STORED IN NLS_SESSION_PARAMETERS DATA DICTIONARY. 


sql>desc nsl_session_parameters;

  Name
----------
  PARAMETER
  VALUE

sql>select PARAMETER,VALUE FROM nls_session_parameters;

PARAMETER                   VALUE
----------------------------------

NLS_LANGUAGE                AMERICAN        
NLS_CURRENCY                $
NLS_DATE_FORMAT             DD-MON-YYY
NLS_DATE_LANGUAGE           AMERICAN

EXAMPLE:-
-------

sql>select sysdate from dual;
    27-SEP-19

sql>alter session set nls_date_format='DD/MM/YYYY HH:MI:SS';

session altered.

sql>select sysdate from dual;
    27/09/2019          03:31:10

sql>alter session set nls_date_format='DD-MON-YY';
sql>select sysdate from dual;
    27-SEP-19

We can also use these nls parameter within in third parameter of the to_number,to_char,to_date() function

SYNTAX:
------
to_char(number,'format','[nls parameter]')

here nls parameter is a optional parameter  this parameter is must be specify within single quote[''] this
parameter used by following syntax.

SYNTAX:-
--------
nls parametername=value

In oracle default currency is dollar if you want to display other then default currency then we must used,
nls_currency parameter within 3rd parameter of the to_char() function.

EXAMPLE:-
--------
select to_char(123,'L999')from dual;
$123

sql>select to_char(123,'L999','nls_currency=RS')from dual;
        RS123

note1:

whenever we are using to_char() and also if first parameter number exceeded then the second parameter ,
format element number of 9's then oracle return # symbol's 

Example:
sql>select to-char(875,'9,999')from dual;
sql>select to_char(787554,'9,999')from dual;

                ######
sql>select to_char(955.89,'999.9')from dual;

                955.9(here oracle server automatically round this number)

0(leading zero):-
================
sql>select to_char(123,'0999')from dual;
                0123
sql>select to_char(123,'9990') from dual;
                 123

$(dollar sign):-
===============
sql>select to_char(123,'$999')from dual;

                $123
sql>select to_char(sal,'L99g99g999g99','nls_currency=RS')from dual;

| ENAME | TO_CHAR(SAL) |
|-------+--------------|
| SMITH | RS1,500.00   |
| ALLEN | RS1,000,00   |
| WARD  | RS650.00     |

2:Converting datetype into charactertype:-
=========================================
sql>select to_char(sysdate,'day month'),to_char(sysdate,'day month','nls_date_language=french')from dual;

| TO_CHAR()          | TO_CHAR()        |
|--------------------+------------------|
| SATURDAY SEPTEMBER | SAMEDI SEPTEMBRE |

to_date():-
==========
It is used to convert date string into Oracle date type 
select to_char('28/09/19','dd/mm/yy')+2 from dual;

        28/09/19
---------------------------------------------------------------------------------------------------


