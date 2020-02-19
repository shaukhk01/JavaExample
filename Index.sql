                                     INDEX
                                     =====

INDEX IS A DATABASE OBJECT WHICH IS USED TO RETRIEVE DATA VERY FASTLY FROM DATABASE THATS WHY INDEXES ARE 
USED TO IMPROVE PERFORMANCE OF APPLICATION GENERALLY INDEX ARE CREATED ARE TABLE COLUMN. 

IN ORACLE WE ARE CREATING INDEX IN TWO WAYS:
============================================

1:AUTOMATICALLY
2:MANUALLY

AUTOMATICALLY:
==============

IN ORACLE WHENEVER WE ARE CREATING PRIMARY KEY  OR UNIQUE CONSTRANT THEN ORACLE SERVER INTERNALLY 
AUTOMATICALLY CREATES BTREE INDEX ON THOSE COLUMN.

MANUALLY:
=========
IN ORACLE WE CAN ALSO CREATE INDEXES MANUALLY BY USING FOLLOWING SYNTAX:

SYNTAX:
=======

CREATE INDEX INDEXNAME ON TABLENAME(COLUMNNAME);

IN ORACLE WHENEVER WE ARE CREATING INDEX ON THE TABLE COLUMN THEN ORACLE SERVER AUTOMATICALLY STORES THOSE,
COLUMN VALUE IN ASCENDING ORDER SEPRATELY IN INDEX ENTRIES WHENEVER WE ARE REQUESTING DATA BY USING INDEXED
COLUMN THEN ORACLE SERVER VERY FASTLY RETRIEVE DATA FROM INDEX ENTRIES.
BY USING INDEX SCAN MECHANISM.

note:
------
IN ALL RELATIONAL DATABASES WHENEVER WE ARE REQUESTING DATA BY USING WHERE CLAUSE OR BY USING ORDER BY 
CLAUSE THEN ONLY DATABASE SERVER SEARCHING FOR INDEXES.

note:
-----
IN ORACLE WHENEVER WHERE CLAUSE HAVING <> OR IS NULL OR IS NOT NULL OPERATOR THEN ORACLE SERVER DOES NOT
SEARCH FOR INDEXES IF THOSE COLUMN HAVING INDEXES ALSO.

ORACLE HAVING TWO TYPES OF INDEXES THESE ARE: 
=============================================

1:B-TREE  INDEXES :
2:BIT-MAP INDEXES :

->BTREE INDEXES     :-
 ================

IN ORACLE BY DEFAULT INDEXES ARE B-TREE INDEXES.

SYNTAX:-
-------
Create index indexname on tablename(columnname);


IN ORACLE WHEVEVER WE ARE CREATING B-TREE INDEX THEN ORACLE SERVER AUTOMATICALLY CREATES TREE STRUCTURE
BASE ON INDEX COLUMN VALUE IN THIS TREE STRUCTURE ALWAYS LEAF BLOCKS STORES ACTUAL DATA ALONG WITH ROWIDS.

WHENEVER USER REQUESTING DATA BY USING WHERE CLAUSE OR ORDER BY CLAUSE THEN ORACLE SERVER FIRST CHECK THOSE
WHERE CLAUSE OR ORDER BY CLAUSE COLUMNS  HAVING INDEXES OR NOT.

WHENEVER THOSE COLUMN HAVING B-TREE INDEXES THEN ORACLE SERVER VERY FASTLY RETRIEVE DATA FROM LEAF BLOCKS.
WITHIN B-TREE STRUCTURE BY USING INDEX SCAN MECHANISM 

EXAMPLE:

                                      DBA           
        sql>create index ini on emp(empno);
                             +----------------------+
                             |  data dictionary     |
                             |+--------------------+|
                             ||emp ini   normal    ||
                             ||                    ||
                             |+--------------------+|
                             +----------------------+

IN ORACLE ALL INDEXES INFORMATION STORE UNDER USER_INDEXES DATA DICTIONARY 
Example:

sql>create index in1 on emp(ename);
sql>desc user_indexes;
sql>select index_name,index_type from user_indexes where table_name='EMP';

| INDEX_NAME | INDEX_TYPE |
|------------+------------|
| PK_EMP     | NORMAL     |
|------------+------------|
| IN1        | NORMAL     |

note:
-----
IN ORALCE IF YOU WANT TO VIEW COLUMN NAME ALONG WITH INDEX NAMES THEN WE ARE USING USER_IND_COLUMNS DATA 
DICTIONARY.

Example:
sql>desc user_ind_columns;
sql>select column_name,index_name from user_ind_columns where table_name='EMP';

| COLUMN_NAME | INDEX_NAME |
|-------------+------------|
| EMPNO       | PK_EMP     |
| ENAME       | IN1        |


FIND OUT WHETHER A QUERY SEARCHING FOR INDEXES OR NOT:
=======================================================
IN ORACLE WHENEVER WE ARE SUBMITTING ANY QUERY INTO THE ORACLE SERVER THEN ORACLE SERVER INTERNALLY,
AUTOMATICALLY CREATES PLAN TABLE BASES ON INTERNAL QUERIES EXECUTION PROCESS IF YOU WANT TO VIEW THOSE,
EXECUTION PROCESS PLAN TABLE AND ALSO QUERY RESULT THEN WE ARE USING FOLLOWING SYNTAX.

SYNTAX:
=======
sql>set autotrace on explain;

AFTER IDENTIFYING QUERY EXECUTION PROCESS THEN WE MUST OFF TRACING QUERY.

SYNTAX:
=======
sql>set autotrace on off;

EXAMPLE:(without using indexes)
-----------------------------
sql>set autotrace on explain;
sql>select * from emp where ename='FORD';

EXAMPLE:(with using indexes):
-----------------------------
sql>create index in1 on emp(ename);
sql>select * from emp where ename='FORD';
sql>set autotrace on off;


FUNCTION BASED INDEX:-
=====================

ORACLE 8i INTRODUCED FUNCTION BASED INDEX BY DEFAULT FUNCTION BASED INDEX IS A B-TREE INDEX.
GENERALLY WHENEVER WHERE CLAUSE HAVING FUNCTION OR EXPRESSION THEN ORACLE SERVER DOES NOT SEARCH FOR INDEXS
IF THOSE COLUMNS ALREADY HAVING INDEXES ALSO TO OVER COME THIS PROBLEM ORACLE 8i INTRODUCED EXTENSION OF,
THE B-TREE INDEXES CALLED FUNCTION BASED INDEXES WHICH IS USED TO CREATE INDEXES OF COLUMNS ALONG WITH,
FUNCTIONS 

SYNTAX:
-------
create index indexname on tablename (function name (columnname))
                                          |
                                          +-(stored expression)


EXAMPLE:(without using function based index)
---------------------------------------------

sql>set autotrace on explain;
sql>select * from emp where upper(ename)='FORD';

EXAMPLE:(with using function based index):
------------------------------------------

sql>create index in2 on emp(upper(ename));
sql>select * from emp where upper(ename)='FORD';

sql>set autotrace off

sql>desc user_indexes;
sql>select index_name,index_type from user_indexes where table_name='EMP';

| INDEX_NAME | INDEX_TYPE            |
|------------+-----------------------|
| IN2        | FUNCTION-BASED NORMAL |


VIRTUAL COLUMN:-
==============

ORACLE 11G INTRODUCE VIRTUAL COLUMN IN A TABLE GENERALLY PRIOR TO ORACLE,
11G DATA BASE ADMINSTRATOR ONLY STORES STORED EXPRESSION IN ORACLE DATABASE 
INDIRECTLY BY USING FUNCTION,BASED INDEXES,VIEWS WHERE AS ORACLE 11G  
WE CAN ALSO STORES STORED EXPRESSION DIRECTLY IN ORACLE DATABASE.
BY USING VIRTUAL COLUMNS THROUGH THE VIRTUAL COLUMNS 
WE ARE STOREING STORED EXPRESSION THEN WE MUST USED 
GENRATED ALWAYS AS CLAUSE.

SYNTAX:
-------
COLUMNNAME DATATYPE(SIZE)GENERATED ALWAYS AS(STORED EXPRESSION)[VIRTUAL]

GENERALLY WE CAN NOT INSERT DATA INTO VIRTUAL COLUMNS 

sql>create table test(a number(10),b number(10),c number(10) generated always as(a+b)virtual);

sql>insert into test(a,b)values(30,20);

sql>select * from test;

    A      B      C
===================
    30     20     50


IN ORACLE IF YOU WANT TO VIEW VIRTUAL COLUMN EXPRESSION THEN WE MUST USED DATA_DEFAULT PROPERTIES FROM
USER_TAB_COLUMNS DATA DICTIONARY 

EXAMPLE:
sql>desc user_tab_columns;
sql>select column_name,data_default from user_tab_columns where table_name='TEST';

column_name     data_default
----------------------------
C                   "A+B"

Oracle Having Two Types of B-tree Indexes These are:-
===================================================

1:Non unique Btree index
2:Unique     Btree index

IN ORACLE BY DEFAULT AUTOMATICALLY CREATED INDEXES ARE UNIQUIE BTREE INDEXES 
WHERE AS MANUALLY CREATED INDEXES ARE NON UNIQUE BTREE INDEXES
BY DEFAULT UNIQUE BTREE INDEXES PERFORMANCE IS VERY HIGH COMPARE TO NON UNIQUE B-TREE INDEXES 
IN ORACLE WE CAN ALSO CREATE UNIQUE B-TREE INDEXES EXPLICITLY BY USING FOLLOWING SYNTAX:

SYNTAX:
-------
create unique index indexname on tablename(columnname);

GENERALLY WE CAN NOT CREATE UNIQUE INDEX ON DUPLICATE VALUE COLUMN

EXAMPLE
-------
sql>create unique index in3 on emp(ename);
index created

sql>create unique index in4 on emp(job);

Error:cannot CREATE UNIQUE
INDEX;duplicate keys found


BITMAPINDEX:-
------------

ORACLE 7.3 INTRODUCED BITMAP INDEX 

SYNTAX:
------
CREATE BITMAP INDEX INDEXNAME ON TABLENAME(COLUMNNAME);

GENERALLY BITMAP INDEXES ARE USED IN DATAWAREHOUSING APPLICATIONS

GENERALLY BITMAP INDEXES ARE CREATED ON LOW CARDINALITY COLUMN

CARDINALITY OF A COLUMN = NUMBER OF DISTINCT VALUE OF COLUMN
                           ---------------------------------
                                 TOTAL NUMBER OF ROWS

EX:
cardinality of empno = 14/14 = 1; -->high cardinality-->btree indexes

ex2:
cardinality of job = 5/14=0.357 -->low cardinality-->bitmap 

WHEN EVER WE ARE CREATING BITMAP INDEX THEN ORACLE SERVER INTERNALLY AUTOMATICALLY CREATES BITMAP TABLE.
ALONG WITH ROWID BASED ON INDEX COLUMN VALUES.

WHENEVER USER REQUESTING DATA BY USING LOGICAL OPERATORS OR BY USING EQUALITY OPERATOR THEN DIRECTLY ,
BITS OR OPERATOR WITHIN BITMAP TABLE.

AND ALSO BASED ON THE REQUIRED QUERIES WHERE BIT 1 AVAILABLE THOSE ROWID ARE COLLECT  BY THE ORACLE SERVER.
AND ALSO THOSE ROWID ARE MATCHED WITH TABLE ROWIDS BY USING INTERNAL BITMAP FUNCTION.
THEN ONLY THOSE ROWS ARE RETRIEVE FROM TABLE 

EXAMPLE:
--------
sql>Select * from emp where job='CLERK';
                 +----[rows]  +------------[index]
                 |  |
   --------------+------------+-------------------------------------------
   | CLERK     | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 |
   |-----------+---+---+---+---+---+---+---+---+---+----+----+----+----+----|
   | CLERK     | 1 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0  | 1  | 1  | 0  | 1  |
   | SALESMAN  | 0 | 1 | 3 | 0 | 1 | 0 | 0 | 0 | 0 | 1  | 0  | 0  | 0  | 0  |
   | MANAGER   | 0 | 0 | 0 | 1 | 0 | 1 | 1 | 0 | 0 | 0  | 0  | 0  | 0  | 0  |
   | ANALYST   |   | 0 | 0 | 0 | 0 | 0 | 0 | 1 | 0 | 0  | 0  | 0  | 1  | 0  |
   | PRESEDENT | 0 | 0 | 0 | 0 |   | 0 | 0 | 0 | 0 | 0  | 0  | 0  | 1  | 0  |
   

note:
-----
GENERALLY WHENEVER MORE DML OPERATION ARE REQUIRED THEN WE ARE NOT ALLOWED TO USE BITMAP INDEXES BECAUSE,
WHENEVER WE ARE MODIFYING ATLEAST ON ROW BASED ON BITMAP INDEXED COLUMN THEN ALL OTHER ROWS ARE AUTOMTICALY-
LOCKED.

note:
-----
IN ALL RELATIONAL DATABASE BY USING INDEX WE ARE ACHIEVING PHYSICAL DATA INDEPENDENCE i.e WHEN EVER WE ARE
AN INDEX IN INTERNAL LEVEL THEN STRUCTURE OF TABLE WILL NOT BE EFFECTED AT CONCEPTUAL LEVEL BUT HERE
PERFORMANCE WILL BE EFFECTED THIS IS CALLED PHYSICAL DATA INDEPENDENCE IN ORACLE.

IN ORACLE WE CAN ALSO DROP INDEX BY USING 

DROP INDEX INDEXNAME;
EXAMPLE:
-------
sql>drop index abc;


