                                          view
                                          ====

"VIEW IS A DATABASE OBJECT WHICH IS USED TO PROVIDE TABLE LEVEL SECURITY VIEWS ARE CREATED FROM TABLE THOSE
"TABLE ARE ALSO CALLED AS BASE  TABLE.

note:[in baking sector we are using database concept ]

"GENERALLY VIEW DOES NOT STORE ANY DATA THATS WHY VIEW IS ALSO CALLED AS VIRTUAL TABLE OR WINDOW OF A TABLE
IN ALL RELATIONAL DATABASES BASED ON THE TABLE VIEW ARE CATEGORISE INTO TWO VIEW THESE ARE.

1:SIMPLE VIEW
2:COMPLEX VIEW OR JOIN VIEW

"SIMPLE VIEW IS A VIEW WHICH IS CREATED FROM ONLY ONE BASE TABLE WHERE AS COMPLEX VIEW IS A VIEW WHICH IS 
"CREATED FROM MULTIPLE BASE TABLE 

SIMPLE VIEW
-----------
syntax:
-------
create [or replace] view viewname as select * from tablename where condition;

DML OPERATION ON SIMPLE VIEW:
============================
"IN ORACLE WE CAN ALSO PERFORM DML OPERATION THROUGH SIMPLE VIEW TO BASE TABLE BASED ON FOLLOWING RESTRICTION.THESE ARE

"IF A SIMPLE VIEW HAVING GROUP FUNCTION[GROUP BY CLAUSE DISTINCT, ROWNUM,SET OPERATORS,JOINS] THEN WE CAN 
NOT PERFORM DML OPERATION THOUGH SIMPLE VIEW TO BASE TABLE."

WE MUST INCLUDE BASE TABLE PRIMARY KEY OR NOT NULL COLUMN INTO THE VIEW THEN ONLY WE ARE ALLOWED TO PERFORMINSERTION OPERATION.THROUGH SIMPLE VIEW TO BASE TABLE.[[ONLY 10 DOWNWARDS NOT 10ONWARDS]]

Example:
-------
  +-----------------------------------------------------------------------+
  | sql>create or replace view v1 as select * from emp where deptno=10;   |
  | sql>select * from v1;                                                 |
  +-----------------------------------------------------------------------+

SQL>INSERT INTO V1(EMPNO,ENAME,DEPTNO)VALUES(1,'MURLI',30);

  +----------------------------------------------------------------------------------------+
  | EXAMPLE2:                                                                              |
  | --------                                                                               |
  | sql>create or replace VIEW v2 as select ename ,sal,deptno from emp where deptno=10;    |
  |                                                                                        |
  | sql>select * from emp v2;                                                              |
  |                                                                                        |
  | sql>insert into v2(ename,sal,deptno)values('abc',1000,10);                             |
  +----------------------------------------------------------------------------------------+

****************************************************************************************************

"IN ALL RELATIONAL DATABASES WHENEVER WE ARE CREATING A VIEW THEN AUTOMATICALLY VIEW DEFINITION ARE 
"[SELECT STATEMENT] AUTOMATICALLY PERMANENTLY STORED IN DATABASE.

"IN ORACLE IF YOU WANT TO VIEW THESE DEFINITION THEN WE ARE USING TEXT PROPERTIES FROM USER_VIEWS 
"DATA DICTIONARY. 

   +------------------------------------------------------+
   |Example:                                              |
   |--------                                              |
   |desc user_views;                                      |
   |sql>select text from user_views where view_name='V1'; |
   +------------------------------------------------------+


"GENERALLY IN ALL RELATIONAL DATABASES WE CAN ALSO USED VIEWS FOR SIMPLIFYING COMPLEX QUERY PURPOSE
"i.e REGULAR USEDLY COMPLEX QUERY.ARE PUTTING IN VIEW THEN ONLY WE ARE REQUESTING VIEWS WHENEVER NECESSARY BY USING SELECT * FROM VIEWNAME

"GENERALLY IN ALL RELATIONAL DATABASES IF ANY VIEW HAVING FUNCTION OR EXPRESSION THEN 
"WE MUST CREATE ALIAS-NAME FOR THOSE FUNCTION OR EXPRESSION OTHERWISE DATABASE SERVER RETURN ERROR.

   +---------------------------------------------------------------------------------+
   |EXAMPLE:                                                                         |
   |--------                                                                         |
   |sql>create or replace view v1 as select deptno,max(sal)from emp group by deptno; |
   |                                                                                 |
   |ERROR:must name this expression with a column alias                              |
   |[Alias name of expression[Function,rownum,join,set,etc]]                         |
   +----------------------------------------------------------------------------------+
   |SOLUTION:                                                                         |
   |---------                                                                         |
   |sql>create or replace view v1 as select deptno,max(sal)a from emp group by deptno;|
   +----------------------------------------------------------------------------------+

sql>select * from v1;
| deptno | A |
|--------+---|
| 10     |   |
| 20     |   |
| 30     |   |

sql>desc user_views;
sql>select text from user_views whre view_name='V1';
TEXT:
--------------------------------------------------
select deptno,max(sal)a from emp group by deptno;

note:
-----
IN ORACLE WHEN VIEW HAVING ROWNUM PESUDO COLUMN ALSO THEN WE MUST CREATE ALIAS NAME FOR THAT ROWNUM 
OTHERWISE ORACLE SERVER RETURN ERROR.

   +----------------------------------------------------------------------------------+
   |Example2:                                                                         |
   |sql>create or replace view v2 as select rownum,ename from emp where rownum<=2;    |
   |                                                                                  |
   |ERROR:must name this expression with a column alias                               |
   |                                                                                  |
   |solution:                                                                         |
   |---------                                                                         |
   |sql>create or replace view view as select rownum r,ename from emp where rownum<=2;|
   +----------------------------------------------------------------------------------+

sql>select * from v2;

| R | ENAME |
|---+-------|
| 1 | SMITH |
|---+-------|
| 2 | ALLEN |


TESTING:
========
sql>desc user_views;
sql>select text from user_views where view_name='V2';

Text:
--------------------------------------------------
select rownum r,ename from emp where rownum<=2;


COMPLEX VIEW or JOIN VIEW:
==========================

"COMPLEX VIEW IS A VIEW WHICH IS CREATED FROM MULTIPLE BASE TABLE.
"GENERALLY IN ALL RELATIONAL DATABASES WE CANT NOT PERFORM DML OPERATION IN COMPLEX VIEW.

   +---------------------------------------------------------------------+
   |Example:                                                             |
   |-------                                                              |
   |sql>create table test1(name varchar2(10));                           |
   |sql>create table test2(sub varchar2(10));                            |
   |                                                                     |
   |COMPLEX VIEW:                                                        |
   |-------------                                                        |
   |sql>create or replace view v3 as select name,sub from test1,test2;   |
   +---------------------------------------------------------------------+

sql>create or replace view cv1 as select e1.ename,d1.dname from emp e1,dept d1 where e1.deptno=d1.deptno

sql>insert into v3(name,sub)values('murli','oracle');

ERROR:cannot modify a column which maps to a non key-preserved key


MATERIALIZED VIEW:
================

"ORACLE 8I INTRODUCED MATERIALIZED VIEW MATERIALIZED VIEWS ALSO CREATED FROM BASE TABLE. 
"GENERALLY MATERIALIZED-VIEW ARE CREATED BY DATABASE ADMINISTRATOR AND ALSO MATERIALIZED
"VIEW ARE USED IN DATA WAREHOUSING APPLIC-ATION.

"GENERALLY VIEW DOES NOT STORE ANY DATA WHERE AS MATERIALIZED VIEW STORES DATA.

SYNTAX:
------
create materialized view viewname as select statement


                     DIFFERENCE B/W VIEW,MATERIALIZED VIEW
                     =====================================
----------------------------------------------------------------------------------------------------
            VIEW                            MATERIALIZED VIEW                                    

"VIEW DOES NOT STORE ANY DATA          |MATERIALIZED VIEW CAN STORE DATA"
"SECURITY PURPOSE                      |IMPROVE PERFORMANCE PURPOSE"
"WHEN WE ARE DROPPING A BASE TABLE THEN|"
VIEW CANNOT BE ACCESSIBLE"             |WHEN WE ARE DROPPING BASE TABLE ALSO THEN MATERIALIZED VIEW CAN 
                                       | ACCESSIBLE.
                                       |IN MATERIALIZED VIEW WE CANNOT PERFORM DML OPERATIONS

----------------------------------------------------------------------------------------------------


IN ORACLE BEFORE WE ARE CREATING MATERIALIZED VIEW THEN DATABASE ADMINISTRATOR MUST GIVE CREATE ANY 
MATERIALIZED VIEW PERMISSION TO USER BY USING FOLLOWING SYNTAX OTHERWISE ORACLE SERVER RETURNS ERROR.
"
SYNTAX:
--------
grant create any  materialized view to username;

   +------------------------------------------------------+
   |EXAMPLE:                                              |
   |--------                                              |
   |sql>conn scott/tiger;                                 |
   |sql>create materialized view mb1 as select * from emp;|
   |ERROR:insufficient privileges;                        |
   +------------------------------------------------------+

   +------------------------------------------------------+
   |SOLUTION:                                             |
   |--------                                              |
   |sql>conn sys as sysdba;                               |
   |sql>grant create any materialized view to scott       |
   |sql>conn scoot/tiger;                                 |
   |sql>create materialized view mb1 as select * from emp;|
   |Materialized view cread.                              |
   +------------------------------------------------------+

note:
-----
WHEN WE ARE CREATING VIEWS IF ORACLE SERVER RETURNS INSUFFICIENT PRIVILEGES ERROR THEN ALSO DATABASE,
ADMINISTRATOR MUST GIVE CREATE ANY VIEW PERMISSION TO USER BY USING FOLLOWING SYNTAX.

SYNTAX:
-------
GRANT CREATE ANY VIEW TO USER;
EX:
sql>conn scott/tiger;
sql>create or replace view v1 as select * from emp where deptno=10;

Error:insufficent privileges

SOLUTION:
--------
sql>conn sys as sysdba;
[If you are using oracle12c then you must also connect to pluggable database before grant permmission]
[alter session set container=pdb1]
sql>grant create any view to scott;
sql>conn scott/tiger;
sql>create or replace view v1 as select * from emp where deptno=10;

note:
-----
"PRIOR TO ORACLE 11G WHEN EVER WE ARE CREATING MATERIALIZED VIEW ON OF THE MATERIALIZED VIEW BASED TABLE,
"MUST HAVE PRIMARY KEY OTHERWISE ORACLE SERVER RETURN ERROR.[[BUT NOT IN 12C]]

EXAMPLE:
--------
sql>create table test(sno number(10));
sql>create materialized view mb2 as select * from test;
Error:table 'TEST' does not constain a primary key constraint

EXAMPLE:
sql>create table base(sno number(10),primary key,name varchar2(10));
sql>insert into base values(....);
sql>select * from base;
       | SNO | NAME |
       |-----+------|
       | 1   | a    |
       | 2   | b    |
       | 3   | c    |
       | 4   | d    |
       |-----+------|

sql>create materialized view mc1 as select * from base;
Materialized view created

****************************************************************************************************

"HERE MATERIALIZED VIEW ALSO SAME AS VIEW BECAUSE WHENEVER WE ARE CREATING MATERIALIZED VIEW ALSO
MATERIALIZED VIEW DEFINITION ARE AUTOMATICALLY STORED IN ORACLE DATABASE SAME LIKE VIEW DEFINITION

"IN ORACLE IF YOU WANT VIEW MATERIALIZED VIEW DEFINITION THEN WE ARE USING USER_MVIEWS DATA DICTIONARY.

EXAMPLE: sql>desc user_mviews;
sql>select query from user_mviews where mview_name='MC1';

EXECUTION:
==========
IN ORACLE WHENEVER WE ARE CREATING VIEW THEN AUTOMATICALLY VIEW DEFINITION ARE PERMANENTLY STORED IN
ORACLE DATABASE WHENEVER "WE ARE REQUESTING VIEW BY USING

"SELECT * VIEWNAME THEN ORACLE SERVER AUTOMATICALLY EXECUTE VIEW DEFINITION THATS IN THIS CASE 
"CORRESPONDING BASE TABLE ARE EFFECTED i.e WHEN WE ARE REQUESTING VIEW MORE NO OF TIMES ALSO THEN EACH 
"AND EVERY TIME,BASE TABLE ARE EFFECTED BECAUSE IN EACH AND EVERY TIME VIEW DEFINITION ARE EXECUTED.

IN ORACLE WHENEVER WE ARE CREATING MATERIALIZED VIEW THEN ORACLE SERVER AUTOMATICALLY STORED QUERY RESULT,
WITHIN MATERIALIZED VIEW AND ALSO MATERIALIZED VIEW DEFINITION ARE INTERNALLY AUTOMATICALLY STORED IN,
DATADICTIONARY. 

"WHENEVER USER REQUESTING MATERIALIZED VIEW BY USING SELECT * FROM MATERIALIZED VIEWNAME
"THEN ORACLE SERVER DIRECTLY RETRIEVE DATA FROM MATERIALIZED VIEW THAT'S WHY IN THIS CASE MATERIALIZED VIEW
"DEFINITION ARE NOT EXECUTED THAT'S WHY MATERIALIZED BASE TABLE ALSO NEVER EFFECTED BUT WHEN 
"WE ARE REFRESHING MATERIALIZED VIEW THEN ONLY ORACLE SERVER EXECUTE MATERIALIZED VIEW DEFINITION AND IN 
"THIS CASE ONLY MATERIALIZED VIEW AND BASE TABLE ARE EFFECTED..THAT'S WHY MATERIALIZED VIEW IMPROVE 
"PERFORMANCE COMPARE TOVIEW BECAUSE IN MATERIALIZED VIEW CORRESPONDING BASE TABLES ARE EFFECTED VERY LESS 
"NO OF TIMES COMPARE TO "CORRESPONDING VIEWS BASE TABLES


EXAMPLE:
sql>select * from v1;

| sno | name |
|-----+------|
| 1   | a    |
| 2   | b    |
| 3   | c    |
| 4   | d    |

sql>select * from mc1;
| sno | name |
|-----+------|
| 1   | a    |
| 2   | b    |
| 3   | c    |
| 4   | d    |

sql>select rowid,sno,name from base;

sql>select rowid,sno,name from v1;

"HERE VIEW ROWID ARE ALSO SAME AS BASE TABLE ROWID THATS WHY VIEW ARE STORED ANY DATA THATS WHY VIEW IS 
ALSO CALLED AS VIRTUAL TABLE OR WINDOW OF TABLE. BUT THROUGH THE VIEW WE CAN ACCESS BASE TABLE DATA."

       +---------------------------------------+
       |sql>select rowid,sno,name from base;   |
       |                                       |
       |sql>select rowid,sno,name from mc1;    |
       +---------------------------------------+

UNTIL THE NOT CHANGED BOTH ROWID WILL BE SAME
MATERIALIZED VIEW ROWID ARE DIFFERENT FROM BASE TABLE ROWID THATS WHY MATERIALIZED VIEW STORES DATA,


sql>SELECT * FROM BASE;
| sno | na | rowid |
|-----+----+-------|
| 1   | a  | 1111  |
| 2   | b  | 2222  |
| 3   | c  | 3333  |
| 4   | d  | 3333  |

sql>select * from mv1;

| sno | na | rowid |
|-----+----+-------|
| 1   | a  | 1111  |
| 2   | b  | 2222  |
| 3   | c  | 3333  |
| 4   | d  | 4444  |

sql>UPDATE BASE SET NAME=UPPER(NAME);

| SNO | NAME |
|-----+------|
| 1   | A    |
| 2   | B    |
| 3   | C    |
| 4   | D    |

sql>select * from mc1;
    
| sno | name |
|-----+------|
| 1   | a    |
| 2   | b    |
| 3   | c    |
| 4   | d    |


MATERIALIZED VIEW ALSO STORES DATA SAME LIKE TABLE BUT WHEN WE  ARE REFRESHING MATERIALIZED VIEW SYNCHRONIZBASED ON BASE TABLE.


IN ORACLE IF YOU WANT TO REFRESH MATERIALIZED THEN THEN WE ARE USING FOLLOWING SYNTAX
SYNTAX:
------
sql>exec dbms_mview.refr|sh('materialized viewname')
          ---+----      +----+
             |packages name  +--procedure name

                      +---------------------------------+
                      | exec dbms_mview.refresh('mc1'); |
                      +---------------------------------+

sql>select * from mc1;

| sno | name |
|-----+------|
| 1   | A    |
| 2   | B    |
| 3   | C    |
| 4   | D    |
[note: in this case rowid changed]


"ORACLE HAVING TWO TYPES OF MATERIALIZED VIEW."

1>COMPLETE REFRESH MATERIALIZED VIEW.

2>FAST REFRESH MATERIALIZED VIEW.

COMPLETE REFRESH MATERIALIZED VIEW.
====================================>

IN ORACLE BY DEFAULT MATERIALIZED VIEW ARE COMPLETE MATERIALIZED VIEW THESE MATERIALIZED VIEW DOES NOT 
GIVE, MORE PERFORMANCE WHEN WE ARE REFRESHING MATERIALIZED VIEW MORE NO OF TIMES BECAUSE IN THESE 
MATERIALIZED VIEW,INTERNALLY ROWID ARE RECREATED WHEN WE ARE REFRESHING MATERIALIZED VIEW.

SYNTAX
-------
sql>create materialized view viewname |refresh complete as select statement
                                      +-------------+-[KEYWORD]

WHENEVER WE ARE USING COMPLETE MATERIALIZED VIEWS AND ALSO WHEN WE ARE REFRESHING THESE MATERIALIZED VIEW 
THEN ORACLE SERVER INTERNALLY AUTOMATICALLY TRUNCATE MATERIALIZED VIEW THATS WHY ROWID ARE CHANGED,WHEN WE
ARE REFRESHING MATERIALIZED VIEW TO OVER COME THIS PROBLEM ORACLE PROVIDE FAST REFRESH MATERIALIZED VIEW.

EXAMPLE OF COMPLETE REFRESH MATERIALIZED VIEW:-
===============================================>
sql>select rowid,sno,name from mc1;

sql>exec dbms_mview.refresh('mc1');

sql>select rowid,sno,name from mc1;
(here rowids are changed)
+---------------------------------------------------------------------------------------------------------+
|If you are adding new column after dbms_mview execution then again updation for column and data will get | Error.
+---------------------------------------------------------------------------------------------------------+

2:FAST REFRESH MATERIALIZED VIEW:-
=================================>

"FAST REFRESH MATERIALIZED VIEWS IS ALSO CALLED AS INCREMENTAL REFRESH MATERIALIZED VIEWS FAST MATERIALIZED
VIEW GIVES MORE PERFORMANCE THEN THEN COMPLETE MATERIALIZED VIEW BECAUSE IN FAST REFRESH MATERIALIZED VIEW ROWID ARE NEVER CHANGED WHEN WE ARE REFRESHING MATERIALIZED VIEWS MORE NO OF TIMES ALSO 

SYNTAX:
-------
sql>create materialized view viewname |refresh fast as select statement;
                                      +--[KEYWORD]

****************************************************************************************************

BEFORE WE ARE CREATING FAST MATERIALIZED VIEW THEN WE MUST CREATE MATERIALIZED VIEW LOG ON BASE TABLES,
BY USING FOLLOWING SYNTAX OTHERWISE ORACLE SERVER RETURN ERROR.

SYNTAX:
--------
create materialized view log on base table;
[MAKE SURE TABLE CONTAIN PRIMARY KEY ORACLE 12C]

MATERIALIZED VIEW LOG:
=====================>
BEFORE WE ARE CREATING FAST REFRESH MATERIALIZED VIEW THEN WE NEED A MECHANISM TO CAPTURE ANY CHANGED 
MADE TO ITS BASE TABLE THIS MECHANISM IS ALSO CALLED AS| "materialized view log.                                                                                                                                                                                              |
THESE CHANGED AUTOMATICALLY STORE IN DATA DICTIONARY AND ALSO WHEN EVER REFRESHING FAST REFRESH 
MATERIALIZED VIEW THEN ORACLE SERVER DIRECTLY RETRIEVE DATA FROM DATA DICTIONARY THATS WHY IN THIS CASE 
MATERIALIZED NEVER,CHANGED

  +----------------------------------------------------------------------+
  | EXAMPLE:                                                             |
  | --------                                                             |
  | sql>create MATERIALIZED view log on base;                            |
  |                                                                      |
  | sql>create Materialized view mc2 refresh fast as select * from base; |
  |                                                                      |
  | sql>select rowid,sno,name from base;                                 |
  | sql>update base set name='xy'where sno=1;                            |
  | sql>insert into base values(10,'bridget);in this case only inserted new rowd id will be generated.                                                                   |
  | sql>select rowid,sno,name from mc2;                                  |
  +----------------------------------------------------------------------+


          +---------------------------------------------------------------+
          | SQL>EXEC DBMS_MVIEW.REFRESH('MC2');                           |
          | SQL>SELECT ROWID,SNO,NAME FROM MC2;                           |
          | (here rowids are never changed)                               |
          | (inserte into....using then new rowid created remaining same) |
          |                                                               |
          +---------------------------------------------------------------+

*IF YOU ARE ADDING NEW COLUMN AFTER LOG CREATION THEN AGAIN UPDATION FOR COLUMN AND DATA WILL NOT UPDATE |  

ON DEMAND/ON COMMIT:-
===================

IN ORACLE WE ARE REFRESHING MATERIALIZED VIEW IN TWO WAYS THESE ARE.

*MANUALLY
*AUTOMATICALLY

MANUALLY:-
=========
IN THIS METHOD WE ARE REFRESHING MATERIALIZED VIEW BY USING DBMS_MVIEW PACKAGES THIS METHOD IS ALSO CALLED
AS ON DEMAND METHOD BY DEFAULT METHOD IS ON DEMAND 

AUTOMATICALLY:-
=============
"IN THIS METHOD WE CAN ALSO REFRESH MATERIALIZED VIEW AUTOMATICALLY WITHOUT USING DBMS_MVEIW [PACKAGES]
"This method is also called as ON COMMIT method

          +--------------------------------------------------------------+
          | Syntax:                                                      |
          | -------                                                      |
          | create materialized view view name refresh COMPLETE/refresh  |
          | FAST on DEMAND/on commit as select statement;                |
          +--------------------------------------------------------------+

EXAMPLE:
--------
sql>select * from base;
        | SNO | NAME |
        |-----+------|
        | 1   | XY   |
        | 2   | B    |
        | 3   | C    |
        | 4   | D    |


***********************************************************************************************************

sql>create materialized view mc5 refresh fast on commit as select * from base;
+-------------------------------------------------------------------------------------------------------+
|[We can not create without primary key on fast refresh materialized view]And also log must be required]|
+----------------------------------+--------------------------------------------------------------------+-+
                                   |Make sure change after log creating add new column into base;        |
                                   |then it will not effect to mview table it will always retrieve from log|
                                   |inside log new column information is not available that's why         |
materialized view is created.      +----------------------------------------------------------------------+


***********************************************************************************************************

sql>select * from mc5;

        | SNO | NAME |
        |-----+------|
        | 1   | XY
        | 2   | B    |
        | 3   | C    |
        | 4   | D    |

sql>update base set name='zz' where sno=2;
sql>select * from base;
        | SNO | NAME |
        |-----+------|
        | 1   | XY   |
        | 2   | ZZ   |
        | 3   | C    |
        | 4   | D    |

sql>select * from mc5;

        | SNO | NAME |
        |-----+------|
        | 1   | XY   |
        | 2   | B    |
        | 3   | C    |
        | 4   | D    |
        
sql>commit;

sql>select * from mc5;

        | SNO | NAME |
        |-----+------|
        | 1   | XY   |
        | 2   | ZZ   |
        | 3   | C    |
        | 4   | D    |
**********************************************************************************************************


**********************************************************************************************************
 ---------------------------------------------------------------------------------------------------------
| COMPLETE REFRESH MATERIALIZED     | FAST REFRESH MATERIAIZED VIEW OR COMMIT ON DEMAND                  |
|-----------------------------------+--------------------------------------------------------------------|
| WHEN WE ARE PERFORMING UPDATION,  | WHEN WE ARE PERFORMING UPDATION/INSERTION OPERATION ON BASE TABLE, |
| OPERATION THEN AUTOMATICALLY ALL, | THEN F MATERIALIZED VIEW CHANGE ONLY PARTICULAR ROW OF ROWS ID,AND |
| ROWS OF ROWID WILL CHANGED.       | REMAINING ALL ADDRESS WILL BE SAME BUT IN CASE OF COMMIT NOT ANY ADD                                       -ress will changed|
|                                   | 
**********************************************************************************************************


**********************************************************************************************************

DATA CONTROL LANGUAGE(DCL)
========================
1:GRANT
2:REVOKE
      +--------------------------------------------------+
      | CREATE A USER                                    |
      | ================                                 |
      | sql>conn sys as sysdba; or                       |
      | sql>conn system/manager;                         |
      | sql>create user username identified by password; |
      | sql>grant connect,resource to username;          |
      | sql>conn username/pasword;                       |
      +--------------------------------------------------+

              +-----------------------------------------------+
              | EXAMPLE:                                      |
              | -------                                       |
              | sql>conn sys as sysdba;                       |
              | Enter password:sys                            |
              |                                               |
              | sql>create user murali identified by murali;  |
              |                                               |
              | sql>grant connect,resource to murali;         |
              +-----------------------------------------------+

             +---------------------------------------+
             |  sql>conn murali/murali;              |
             |                                       |
             |  sql>select * from emp;               |
             |                                       |
             |  ERROR;table or view does not exist   |
             |                                       |
             |  sql>conn scott/tiger;                |
             |  sql>grant all on emp to murali;      |
             |                                       |
             |  sql>conn murali/murali;              |
             |  ERROR:table or view does not exist   |
             |                                       |
             |  sql>select * from scott.emp;         |
             +---------------------------------------+

PRIVILEGE:-
=========

PRIVILEGE IS WRITE GIVEN TO THE USER OR PRIVILEGE IS ALSO CALLED AS PERMISSION 

IN ALL RELATIONAL DATABASES DATA SECURITY POINT OF VIEW EVERY USER HAVING TWO TYPES OF PRIVILEGES.

1>System Privileges:
2>Object Privilege:
'
BY USING grant COMMAND WE ARE ALLOWD TO VIEW THESE SYSTEM OBJECT PRIVIEGE INTO THE ANOTHER USER AND ALSO,
BY USING REVOKE COMMAND WE ARE ALLOWD TO CANCELLD THESE SYSTEM OR OBJECT PRIVILEGE FROM USER.

SYSTEM PRIVILEGES:
=================

"WHO RECIEVE SYSTEM PRIVILEGES THEN THOSE USERS ARE ALLOWED TO CREATE DATABASE OBJECT OR ALLOWED TO DROP,
"DATABASE OBJECT ORACLE HAVING MORE THEN 80 SYSTEM PRIVILEGE [PREDEFINE COMMAND] THESE ARE.

   +-----------------------------+
   |create session               |
   |create table,                |
   |create any view              |
   |create any materialized view |
   |create trigger               |
   |create procedure,            |
   |create any index             |
   +-----------------------------+

SYNTAX:
-------
grant systemprivilege to username1,username2,...;

note:
----
THESE SYSTEM PRIVILEGE ARE GIVEN BY DATABASEE ADMINISTATOR ONLY

CREATE SESSION:
===============
"IN ORACLE IF ANY USER WANT TO CONNECT THE ORACLE DATABASE THEN THAT USER MUST HAVE CREATE SESSION SYSTEM,
"PRIVILEGE OTHERWISE ORACLE SERVER RETURN ERROR

    EXAMPLE:
    --------
    sql>conn sys as sysdba;
    sql>create user india identified by india;

    sql> conn india/india;

    ERROR:user INDIA lacks CREATE SESSION privilege; logon denied;


        SOLUTION:
        ---------
        sql>conn sys as sysdba;
        sql>grant create session to india;

        sql>conn india/india;


IN ORACLE IF YOU WANT TO VIEW SYSTEM PRIVILEGE RELATED TO PARTICULAR USER.
THEN WE ARE USEING FOLLOWING SELECT STATMENT.

SYNTAX:
sql>select * from session_privs;

    sql>conn india/india;
    sql>select * from session_privs;
    PRIVILEGE
    ------------------
        EXAMPLE:
        --------
        sql>conn sys as sysdba;
        sql>grant create procedure,create trigger,create any materialized view to scott,murli;


ROLE:-
======
"ROLE IS NOTHING BUT COLLECTION OF SYSTEM PRIVILEGER ORACLE HAVING TWO TYPES OF ROLE.
 THERE ARE :

USER DEFINED ROLES:-
PREDEFINED ROLES:-

USER DEFINED ROLE:-
==================
"USER DEFINED ROLES ARE CREATED BY DATABASE ADMINISTATOR ONLY GENERALLY IN MULTI USER ENVIROMENT SO MANY,
"EMPLOYEES ARE WORKING ON SAME PROJECT IN THAT CASE SO MANY EMPLOYEE REQUIREDS SAME SET OF SYSTEM PRIVILEGEIN THIS CASE ONLY DATABASE ADMINISTATOR CREATE ROLE AND THEN ASSINGED COMMAND SET O SYSTEM PRIVILEGER 
AND THEN ONLY THOSE ROLES ARE DIVIDE INTO NO OF USERS.'


             system prvie     +----+
     --------------------|    |    |
                         +----+ROLE| -------------user1
     --------------------|    |    |              user2
                              +----+


IN ORACLE USER DEFINE ROLE ARE CREATED BY USING FOLLWOING THREE STEP PROCESS.

      +---------------------------------------+
      | 1:create a role:                      |
      | 2:assign system privilegs into role.  |
      | 3:assing rolename to number of users; |
      +---------------------------------------+

CREATE A ROLE
=============

SYNTAX:
-------
create role rolename;

ASSING SYSTEM PRIVLEGES INTO ROLE
=================================
syntax:

grant system privileges to rolename;

ASSING ROLENAME TO NUMBER OF USER
==================================
syntax:
grant rolenmae to user1,user2,.....;

   +------------------------------------------------------------------------------+
   |EXAMPLE:                                                                      |
   |--------                                                                      |
   |sql>create role r1;                                                           |
   |sql>grant create procedure,create trigger,create any materialized view to r1; |
   |                                                                              |
   |sql>grarnt r1 to scott , murali;                                              |
   ------------------------------------------------------+------------------------

NOW WE ARE ABLE TO CREATE VIEW,MATERIALIZED VIEW BECAUSE ROLE PERMISSION YOU CAN SO GIVE USER PERMISSION].

IN ORACLE IF YOU WANT TO VIEW SYSTEM PRIVILEGE RELATED TO ROLE THEN WE ARE USING ROLE_SYS_PRIVIS 
DATA DICTIONARY

    sql>desc role_SYS_privis;
    sql>select role,privilege from role_sys_privs where role='R1';


| ROLE | PRIVILEGE                    |
|------+------------------------------|
| R1   | CREATE TRIGGER               |
| R1   | CREATE ANY MATERIALIZED VIEW |
| R1   | CREATE PROCEDURE             |

PREDEFINED ROLES:
=================

"WHENEVER WE ARE INSTALLAING ORACLE SERVER THEN AUTOMATICALY THREE PREDEFINED ROLES ARE CREATED WITHIN 
ORACLE DATABASE

       +---------------------+
       |1:CONNECT(end users) |
       |2:RESOURCE(developer)|
       |3:DBA:(adminstrator);|
       +---------------------+


 *********************************************************************************************************


----------------------------------------------------------------------------------------------------------+
"IN ORACLE 12C WHENEVER WE ARE CONNECT TO ANY USER THEN WE ARE TYPING CONN USERNAME/PASSWORD@PDB1 HERE YOU,|
SEE USERNAME/PASSWORD ALONG WITH PDB ALSO TYPE BECAUSE OF USER CONFLICT WE ARE SPECIFYING THIS USER BELONG,|
TO PDB1 OR SAME USER BELONG TO TRAINING[OTHER PLUGGABLE DATA BASE NAME]YOU CAN ALSO CREATE SAME USER NAMEIN|DIFFERENT PDB NAME"
 -----------------------------------------++--------------------------------------------------------------


      | Example:                                  ||
      | sql>alter session set container=pdb1;     ||                                                           
      | sql>create scott identified by tiger      ||
      | sql>alter session set container=training; ||
      | sql>create scott identified by tiger;     ||
      | user created.                             ||
      | -----------------------------------------++
      +--------------------------------------------+


"IN ORACLE IF YOU WANT VIEW PREDEFINED ROLES AND ALSO RELATED SYSTEM PRIVILEGES THEN WE ARE USING 
 ROLE_SYS_PRIVS DATA DICTIONARY 

       +----------------------------------------------------------------------------------+
       |EXAMPLE:                                                                          |
       |sql>conn sys as sysdba;                                                           |
       |sql>desc role_sys_privs;                                                          |
       |sql>select role,privilege from role_sys_privs where role in('CONNECT','RESOURCE');|
       +----------------------------------------------------------------------------------+


| ROLE     | PRIVILEGE        |
|----------+------------------|
| RESOURCE | create sequence  |
| RESOURCE | create trigger   |
| RESOURCE | create  cluster  |
| RESOURCE | create procedure |
| RESOURCE | create type      |
| RESOURCE | create operator  |
| connect  | create session   |
| RESOURCE | create table     |
| RESOURCE | create indextype |


sql>select role,privilege from role_sys_privs  where role in('DBA');

note:
-----
IN ORACLE CONNECT ROLE INTERNALLY HAVING CREATEE SESSION SYSTEM PRIVILEGES WHICH IS USED TO USERS ARE,
ALLOWED TO CONNECT TO THE ORACLE DATABASE.


OBJECT PRIVILEGES:-
===================

OBJECT PRIVILEGES ARE GIVEN ARE EITHER DATABASE DEVELOPERS OR DATABASE ADMINISTRATOR WHO RECIEVE OBJECT,
PRIVILEGES THEN THOSE USERS ARE ALLOWED TO PERFORM OPERATION ON THE OBJECT.

ORACLE HAVING INSERT,UPDATE,DELETE,SELECT OBJECT PRIVILEGERS THESE OBJECT PRIVILEGES ALSO REPRESENTED BY,
USING ALL KEYWORD 

"ORACLE ALSO SUPPORT EXECUTE,READ,WRITE,OBJECT PRIVILEGES IN PL/SQL.

Syntax:
-------
grant object privileges on objectname to usernames/rolename/public;"

       +--------------------------------+
       |EXAMPLE:-                       |
       |--------                        |
       |sql>conn scott/tiger;           |
       |sql>grant all on emp to murali; |
       |sql>conn murali/murali;         |
       |sql>select * from scott.emp;    |
       +--------------------------------+

note:
-----
#If you create materialized view from scott.emp using murali user then Error will get
#sql>create materialized view mv1 as select * from scottt.emp where deptno=0;
#Error:No privileges on tablespace 'USER'

SOLUTION:
---------
#Here we can also see already we given materialized view permission also getting error here creating error is not this ERROR is inserting error 
#VERIFY:
#sql>CREATE MATERIALIZED VIEW MV2 AS SELECT * FROM SCOTT.EMP WHERE 1=2[here materialized view is created but data will not insert ]

#+------------------------------------------------------------------------+
#|You cannot insert data because you have quota of 0 on the tablespace    |
#+------------------------------------------------------------------------+


SOLUTION:
+--------------------------------------------------------+
|   sql>conn as sys as sysdba;                           |
|   sql>alter session set container=pdb1;                |
|   sql>alter user hector quota unlimited on usera;      |
|   here users is predefined tablespace name             +--------------------+
|                                                                             |
|VIEW PREDEFINE TABLESPACE NAME:                                              |
================================                                              |
|sql>select username,default_tablespace from dba_users where username='XXXX'  |
+--------------------------------------------------------+--------------------+


NOTE:
------
IN ORACLE WE CAN ALSO GIVE OBJECT PRIVILEGES ON SPECIFIC COLUMNS BY SPECIFYING THOSE COLUMNS WITHIN ()
EXAMPLE:
sql>grant update(ename,sal)on emp to murali;

WITH GRANT OPTION:-
===================
WITH GRANT OPTION IS AN OPTIONAL CLAUSE USED ALONG WITH OBJECT PRIVILEGE WHO RECEVIES WITH DRAW 
GRANT CLAUSE THEN THOSE USERS ALLOWED TO GIVE SOME OBJECT PRIVILEGE TO ANOTHER USER.

SYNTAX:
grant objectprivilege on objectname to usernames/public with grant option.

note:
-----
IN ORACLE WITH GRANT OPTION CLAUSE DOES NOT WORK WITH ROLES 

EXAMPLE:
--------
sql>grant all on emp to r1 with grant option;

ERROR:cannot GRANT to a role with Grant option.


******************************************************************************************************

| sql>conn scott/tiger           | sql>conn murali/murali            | sql>conn a1/a1         |
|--------------------------------+-----------------------------------+------------------------|
| sql>grant all or emp to murali | sql>select * from scott.emp       |                        |
| [solution]                     |                                   | sql>select * from emp; |
| sql>grant all on emp to murali | sql>grant all on scott.emp to     |
| with grant option;             | a1;Error:no privilege to grant    |
| sql>                           | sql>grant all on scott.emp to a1; |

********************************************************************************************************


IN ORACLE ALL OBJECT INFORMATION  STORE UNDER USER_TAB_PRIVS DATADICTIONARY

EXAMPLE
sql>desc user_tab_privs

REVOKE:
======>
REVOKE COMMAND IS USED TO CANCALLED EITHER SYSTEM OR OBJECT PRIVILEGES FROM USERS 

Syntax;
-------
1):revoke systemprivileges from username,,,,,;

Syntax:
-------
2):revoke objectprivileges on objectname from usernames/rolename/public;

EXAMPLE:
--------
sql>conn sys as sysdba
sql>create user u1 identified by u1;
sql>grant connect to u1;
sql>conn u1/u1;

sql>select * from session_privs;

PRIVILEGES
==========
create session

sql>conn sys as sysdba;
sql>revoke connect from u1;
revoke succeeded.
****************************************************************************************************
[Make sure in oracle 12c sql>revoke create session,resource from hector in this case only]
****************************************************************************************************
sql>conn u1/u1;
Error:user u1 lacks create session privilege; logon denied

warning:you are no longer connected to oracle.

EXAMPLE:
-------
sql>conn sys as sysdba;
sql>revoke all on scott.emp from public;
revoke succeeded.

EXAMPLE:
--------
sql>conn scott/tiger;
sql>revoke all on emp from hector;

note:
------
grant with option permission here not work until the parent grant revoke by grand parent revoke.

example:                                                                                                  |
sql>grant all on emp to hector grant with option;                                                         |
sql>conn hector/oracle;                                                                                   |
sql>grant all on scott.emp to annie;                                                                      |
sql>conn scott/tiger;                                                                                     |
sql>revoke all on emp to annie;[here it wil not work because of this user given permission by hector user,|
so revoke all on emp to hector then automatically annie user also effect]                                 |
----------------------------------------------------------------------------------------------------------+
note:
IN ORACLE BEFORE WE ARE GIVING CREATE TABLE SYSTEM PRIVILEGES TO USER THEN WE MUST GIVE UNLIMITED TABLESPACE
SYSTEM PRIVILEGE TO USER OTHERWISE ORACLE SERVER RETURNS ERROR.

        EXAMPLE:
        --------
        sql>conn sys as sysdba;
        sql>creat user u2 identified by u2;
        sql>grant connect to u2;
        sql>conn u2/u2;
        sql>create table h1(sno number(10)
        Error:insufficent privileges.

    sql>conn sys as sysdba;
    sql>grant create table to u2;

    sql>conn u2/u2;
    sql>create table h2(sno number(10));
    Error:01950 no privileges on tablespace 'users'

         +------------------------------------------+
         |  SOLUTION:-                              |
         |  --------                                |
         |  sql>conn sys as sysdba;                 |
         |  sql>grant UNLIMTED TABLESPACE to u2;    |
         +------------------------------------------+

sql>conn u2/u2;

sql>create table h1(sno number(10));

table created.

In oracle if you want give object privilege on view to another user then we are using following syntax:
SYNTAX:
+-------
grant objectprivileges on viewname to usernme1,username2,.....;


**********************************************************************************************************


DBMS ARCHITECTURE(or)ansi/sparc architecture(or)3 level architecture:-
======================================================================

Ansi[American National Institute] has Established Three Level Architecture for DBMS This Architecture is,
also called as ANSI/SPARC(standard planning and requirements commitee)

main objective of DBMS architecture to seprate users view of the database from the way physically how data,
store within the database.

DBMS architecture having Three level these are:

1:Conceptual level
2:External level
3:Internal level
 ----------------------------------+
database object:table,view,synoym, |
-----------------------------------+


          +------------+ +------+ +-----------+
          |  view1     | | view2| |   view3   |        view synonym
          +--------+---+ ++-----+ +-+---------+
   external level  |      |         |
                   |      |         |
   Logical data--->|      |         |
                  ++------+---------++
                  |conceptual level  |     Table
                  +-------+----------+
                          ^           
                          |           
                          |           
                  +-------+----------+
                  | Internal level   |     index,cluster
                  +-------+----------+
                          |           
                          |           
                          |           
                +---------+------------|
                |                      |
                |                      |
                |   DATABASE           | 
                |                      |
                |                      |
                +----------------------+


Three Level Architecture provide data independence:

DATA INDEPENDENCE
=================
Upper level are uneffected by chainging in lower level is called data independence.
All database having two types of data independences these are:

1:Logical data independence .
2:Physical data independence.


Logical data independence:
--------------------------
When ever changed made in conceptual level then we are not required to changed external level is called,
Logical data independence.

In oracle whenever we are adding new column into the  table within conceptual level the structure of the,
view will not be effected in external level is called logical data independence in oracle.

EXAMPLE:
--------
sql>conn scott/tiger;
sql>create or replace view v1 as select * from emp where deptno=10;
sql>grant all on v1 to murali;
sql>conn murali/murali;
sql>select * from scott.v1;


TESTING:
========
sql>conn scott/tiger;
sql>alter table emp add address varchar2(10);
sql>select * from emp;
sql>grant all on v1 to murali;
sql>conn murali/murali;
select * from scott.v1;
[here you can see address column is not available]

Physical Data Independence:
===========================

When ever changed made in internal level then we are not required to changed conceptual level is called,
physical data independence 

Example:
In oracle when ever we are adding index in internal level then structure of table will not be effected,
At conceptual level is called Physical data independence.
                                                     
Conceptual Level:
=================
Conceptual level define logical structure of the database however this level does not define How data,
store physically in data base.ie. is it defines what type of data can be store in database by specifying dat-type and size and also conceptual defines What type of data cannot be stored in database by specifying,
constraints 

EXAMPLE:(conceptual level)
========
sql>create table bank(accno number(10)primary key,name varchar2(10),bal number(10));

sql>insert into bank values(1001,'murali',9000);

sql>select * from bank;
| ACCNO | NAME   | BAL  |
|-------+--------+------|
| 1001  | MURALI | 9000 |

sql>insert into bank values(1001,'abc',4000);
Error:unique constraint voilated

External Level:
===============
External Level defines indevidual users view of database

Generally data is confidential within relational database that's why data security point of view,database,
administators create views from the conceptual level and then only those view given to the no of users.

Then only number of users allowed to access portion of data from the conceptual level this is called,
table security 

Uses of view:
=============
In all relational databases view are used in following three purpose.

1:Simplifying complext querys
2:Acheving logical data independence
3:Providing table level security

Force view:
===========

IN ORACLE WE CAN ALSO CREATE A VIEW WITHOUT HAVING ANY BASE TABLE THESE TYPE OF VIEW ARE ALSO CALLED AS.
FORCE VIEW OR FORCED VIEW.

Syntax:
create or replace force view viename as select * from anyname;
Example:
sql>create or replce force view v1 as select * from hyd;
Warning:view created with compilation errors.
sql>create table hyd(sno number(10),name varchar(10));
sql>alter view v1 compile;
sql>desc;

WITH CHECK OPTION:
=================

WITH CHECK IS AN OPTIONAL CLAUSE USED ALONG WITH WHERE CONDITION WITHIN VIEWS
GENERALLY IF YOU VIEW HAVING WITH CHECK OPTIONAL THEN WE ARE NOT ALLOWED TO INSERT OTHER THEN WHERE 
CONDITION VALUE THROUGH VIEW TO BASE TABLE.

GENERALLY IF YOU WANT PROVIDE CONSTRAINT TYPE MECHANISM ON VIEWS THEN WE ARE USING WITH CHECK OPTIONAL 
CLAUSE.

Syntax:
-------
create or replace view viewname as select * from tablename where condition with check option;

EXAMPLE:
sql>create or replace view v1 as select * from emp where deptno=10 with check option;

sql>select * from v1;
sql>insert into v1(empno,ename,deptno) values(1,'murali',30);
ERROR:VIEW WITH CHECK OPTION where-clause violation.

sql>insert into v1(empno,ename,deptno)values(2,'abc',10);

READ ONLY VIEWS:
===============

IN ORACLE WHEN VIEW HAVING READ OPTIONAL CLAUSE THEN WE CAN NOT PERFORM DML OPERATION THROUGH VIEW TO BASE,
TABLE THESE TYPE OF VIEW ARE ALSO CALLED READ ONLY VIEWS.

syntax:
create or replace view viewname as select * from tablename with read only;

Ex:
sql>create or replace view v3 as select * from emp where deptno=10 with read only 
view created.

TESTING:
sql>delete from v3 where deptno=10;
Error:cannot delete from view..

In oracle we can also drop a view by using drop view viewname;





