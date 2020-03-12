*WRITE A QUERY TO DISPALY EMP WHO'S ENAME 2ND LETTER WOULD BE CAPITAL LA FROM EMP TABLE USING SUBSTR()?

*WRITE A QUERY TO DISPLAY EMPLOYEE WHO'S ENAME LENGTH IS 5 FROM EMP TABLE?

*WRITE A QUERY WHICH IS COUNT NO OF OCCURENCES GIVEN CHARACTER('SLEEP')?

*WRITE A QUERY WHICH IS USED TO DISPLAY FIRST DATE OF THE CURRENT MONTH BY USING SYSDATE,ADD_MONTHS
 ,LAST_DAY()

*WRITE A QUERY WHICH IS USED TO ADD 5 DAYS INT GIVE DATE(15-JUN-20');

*WRITE A QUERY WHICH IS USED TO TO_CHAR() TO DISPLAY '15-JUN-20' TO '15-JUNE-20'?

*WRITE A QUERY TO DISPLAY WHO'S EMPLOYEE ARE JOING INT DECEMBER USING TO_CHAR()?

*WRITE A QUERY TO DISPLAY WHO'S EMPLOYEE JOINING IN 81?

*WRITE A QUERY TO DISPLAY EMPLOYEE WHOS JOING EVERY MONTH BEFORE 15TH?

*WRITE A QUERY TO DISPLAY EMPLOYEE WHO'S JOINING TODAY?

*WRITE A QUERY TO DISPLAY EMPLOYEE NUMBER IN EACH DEPTNO?

*WRITE A QUERY TO DISPLAY EMPLOYEE NUMBER IN EACH JOB?

*WRITE A QUERY TO DISPLAY EACH DEPTNO MAXIMUM AND MINIMUM SALARY FROM EMP?

*WRITE A QUERY TO DISPLAY DEPTNO HAVING MORE THEN 3 EMPLOYEES IN EMP TABLE BY USING GROUP BY CLAUS?

*WRITE A QUERY TO DISPLAY THOSE DEPARTMENT NUMBER SUM SALARY HAVING MORE THEN 20000?

*WRITE A QUERY TO DISPLAY YEAR AND NUMBER OF EMPLOYEE IN YEAR JOIN AND MORE THEN 1 EMPLOYEE?

*WRITE A QUERY TO DISPLAY THOSE DEPTNO SUM(SAL)HAVING MORE THEN 3 EMPLOYEES?

*WRITE A QUERY WHICH COUNT NO OF COLUMN FROM EMP TABLE?

*UPDATE DEPTNO COLUMN ONLY FROM EMP TABLE USING MERGE STATMENT?
 +--------------------------------------------------------------------------------------------------+
 |  MERGE INTO EMP1 T USING EMP S ON(T.EMPNO=S.EMPNO)WHEN METCHED THEN UPDATE SET DEPTNO=T.DEPTNO   |
 |  WHEN NOT MATCHED THEN INSERT VALUES(T.EMPNO,T.ENAME,T.SAL,T.DEPTNO);                            |
 +--------------------------------------------------------------------------------------------------+

*WRITE A QUERY TO DISPLAY WHOS GETTING MORE SALARY THEN THEIR AVERAGE SALARY FROM EMP?

*WRITE A QUERY TO DISPLAY EMPLOYEE WHO'S ARE WORKING IN SALES DEPARMENT FROM DEPT,EMP TABLE?

*WRITE A QUERY TO DISPLAY EMPLOYEE WHO'S WORKING SAMES AS SMITH DEPARMENT?

*WRITE A QUERY TO DISPLAY SENIOR MOST EMPLOYEE DETAILS FROM EMP TABLE?

*WRITE A QUERY TO DISPLAY EMPLOYEE WHO ARE GETTING MORE SALARY THEN THE HIGHEST PAID EMPLOYEE IN 20TH DEPTNO

*WRITE A QUERY TO DISPLAY EMPLOYEE WHO ARE GETTING MORE SALARY THEN THE LOWEST PAIND EMPLOYEE IN 10TH DEPTNO

*WRITE A QUERY TO DISPLAY SECOND HIGHEST SALARY FROM EMP TABLE?

*WRITE A QUERY TO DISPLAY SECOND HIGHEST SALARY DETAILS FROM EMP?

*WRITE A QUERY TO DISPLAY FIRST HIGHEST SALARY DETAILS FROM EMP?

*WRITE A QUERY TO DISPLAY LOWEST JOB AVERAGE SALARY FROM EMP TABLE BY USING GROUP BY CLAUSE?

*WRITE A QUERY TO DISPLAY THOSE JOB AVERAGE SALARY IS MORE THEN CLERK JOB AVARAGE SALARY FROM EMP?

*WRITE A QUERY TO DISPLAY HIGHEST EMPLOYEE DEPTNO FROM EMP TABLE?

*WRITE A QUERY TO DISPLAY EACH DEPTNO NUMBER OF EMPLOYEE?

*WRITE A QURERY TO DISPLAY WHO ARE WORKING UNDER BLAKE AS MANAGER FROM EMP TABLE USING MGR,EMPNO?

*WRITE A QUERY TO DISPLAY MAXIMUM SALARY IN EACH DEPTNO?

*WRITE A QUERY TO DISPLAY EACH DEPTNO MAXIMUM SALARY DETAILS FROM EMP?

*WRITE A QUERY TO DISPLAY EMPLOYEE DETAILS WHO ARE WORKING EITHER SALES OR RESEARCH DEPTNO?

*WRITE A QUERY TO DISPLAY EMPLOYEE WHO ARE GETTING ANNSAL MORE THEN 30000 USING SAL*12 ALIAS NAME?

*WRITE A QUERYT TO DISPLAY FIRST ROW FROM EMP TABLE USING ROWNUM?

*WRITE A QUERY TO DISPLAY FIRST 5 ROWS FROM EMP TABLE BY USING ROWNUM ?

*WRITE A QUERY TO DISPLAY FIRST 5 HIGHEST SALARY FROM EMP TABLE?

*WRITE A QUERY TO DISPLAY 5TH HIGHEST SALARY FROM EMP TABLE USING MINUS OPERATOR?

*WRITE A QUERY TO DISPLAY SECOND ROW FROM EMP TABLE BY USING MINUS OPERATOR?

*WRITE A QUERY TO DISPLAY LAST TWO ROWS FROM EMP TABLE BY USING ROWNUM AND MINUS OPERATOR?

*WRITE A QUERY TO DISPLAY SECOND ROW FROM EMP TABLE BY USING ROWNUM ALIAS?

*WRITE A QUERY TO DISPLAY SALARY BETWEE 5 TO 9 BY FROM EMP TABLE USING ROWNUM ALIAS NAME?

*WRITE A QUERY TO DISPLAY EMPLOYEE DETAILS 2,3,5,7 FROM EMP TABLE BY USING ROWNUM ALIAS? 

*WRITE A QUERY TO DISPLAY FIRST AND LAST EMPLOYEE DETAILS FROM EMP TABLE USING ROWNUM?

*WRITE A QUERY TO SKIP FIRST 3 ROWS FROM EMP TABLE BY USING ROWNUM?

*WRITE A QUERY TO DISPLAY EVEN NUMBER SALARY FROM EMP TABLE?

*WRITE A QUERY TO DISPLAY NTH HIGHEST SALARY FROM EMP TABLE BY USING ROWNUM ALIAS?

*WRITE A QUERY TO DISPLAY EACH DEPTNO EMPLOYEE AND ASSING NUMBER ALSO USING RANK_NUMBER()?

*WRITE A QUERY TO DISPLAY HIGHEST SALARY EMPLOYEE IN EACH DEPARTMENT FROM EMP TABLE BY USING ANALYTICAL?

*WRITE A QUERY TO DISPLAY 5TH HIGHEST SALARY EMPLOYE FROM EMP BY USING ANALYTICAL FUNCTION?

*WRITE A QUERY TO DISPLAY NTH HIGHEST SALARY FROM EMP TABLE BY USING ANALYTICAL FUNCTION?

*WRITE A QUERY TO DISPLAY FIRST ROW OF EMP TABLE BY USING ROWID?

*WRITE A QUERY TO DISPLAY LAST ROW OF EMP TABLE BY UISNG ROWID?

*WRITE A QUERY TO DISPLAY DUPLICATE ROWS FROM TABLE?

*WRITE A QUERY TO DELETE DUPLICATE ROWS FROM A TABLE?

*WRITE A QUERY TO DISPLAY SECOND SALARY FROM EMP TABLE BY USING ROWID

*WRITE A QUERY TO DISPLAY NTH SALARY FROM EMP TABLE BY USING ROWID?

*WRITE A QUERY TO DISPLAY LAST TWO ROWS FROM EMP TABLE BY USING ROW_NUMBER(), ROWID?

*WRITE A QUERY TO DISPLAY EACH DEPTNO SECOND ROWS FROM EMP TABLE BY USING ROWID?

*WRITE A QUERY TO DISPLAY EMPLOYEE WHOS CONTAIN AM OR AR USING REGULAR EXPRESSION?

*WRITE A QUERY TO DISPLAY EMPLOYEE WHOS ENAME START WITH A OR B FROM EMP TABLE USING REGULAREXPRESSION?

*WRITE A QUERY TO DISPLAY EMPLOYE WHOS ENAME ENDS WITH EITHER N OR S FROM EMP TABLE?

*WRITE A QUERY TO DISPLAY EMPLOYEE WHOS ENAME SECOND LETTER IS EITHER M OR L,A BY USING REGULAREXPRESSON?

*WRITE A QUERY TO DISPLAY PHONENUMBER FROM TABLE BASED ON FOLLOWINGG REGULAR EXPRESSION PATTERN?
        pattern:3digit,3digit,3digit

*WRITE A QUERY BY USING FOLLOWING TABLE MATCH ATLEAST TWO a ,ZERO OR MORE b AND ATLEAST ONE c?

*WRITE A QUERY TO DISPLAY THE EMPLOYEE FROM THE ABOVE TABLE BASED ON FOLLOWING PATTERN BY USING REGEXP_LIKE
() pattern anydigit.one or more space.abc

*select regexp_instr('ABCDEF5KMN','[[:digit:]]',1,1,1)from dual;
 [regexp_instr()accept one extrac paramter 1 or 0 here 1 represent next value,0 represent currrent value.]

*WRITE A QUERY TO DISPLAY VALID MAILID FROM TABLE USING REGEXP_INSTR()?

      +-----------------------------------------------------------------+
      | *select regexp_substr('oracle12c','[[:digit:]]+')from dual;     |
      | *select regexp_substr('hector@gmail.com','[^@]+')from dual;     |
      | *select regexp_substr('hector@gmail.com','[^@]+',1,2)from dual; |
      +-----------------------------------------------------------------+

*WRITE A QUERY WHICH IS USED TO RETERIVE FIRST SUBSTRING FROM THE FOLLOWING STRING BY USING REGEXP_SUBSTR()
    string:-ORACLE10G,ORACLE12C,ORACLE19C
    
   +----------------------------------------------------------------------------------------+
   |*select regexp_replace('oracle12c','([[:alpha:]]+)([[:digit:]]+.)','\1   \2')from dual; |
   |*select regexp_replace('oracle12c','([[:alpha:]]+)([[:digit:]]+)','\2    \1')from dual; |
   |*select regexp_count('hello','l')from dual;//count noof occurence characters.           |
   +----------------------------------------------------------------------------------------+

*WRITE A QUERY TO DISPLAY WHOS NAME START WITH S_ FROM TABLE USING ESCAPE CHARACTER?

*WRITE A QUERY TO DISPLAY WHOS NAME START WITH S_ FROM TABLE USING REGEXP_LIKE();

*WRITE A QUERY WHO ARE GETTING SALARY LESS THEN 2000 FROM EMP TABLE AND ALSO DISPLAY ALL 14 ROWS FROM EMP
 TABLE WITHOUT USING WHERE CONDITION AND ALSO DISPLAY NULL VALUE INPLACE OF MORE THEN 2000 SALARY WITHIN
 SAL COLUMN AND ALSO DISPLAY LESS THEN 2000 SALARY  WITHIN SALARY COLUMN BY USING NULLIF GREATEST()?


*WRITE A QUERY TO DISPLAY DAIGONAL VALUES FROM TABLE USING DECODE()?

+------------------------------------------------------------------------------------------ +
|Pivoting:Converting Rows In To Columns and Display Aggregate function value In Tabular Form| 
|                                                                                           |
|select job,sum(decode(deptno,10,sal))"deptno10",sum(decode(deptno,20,sal))"deptno20"       |
| sum(decode(deptno,30,sal))"deptno30" from emp group by job                                |
+------------------------------------------------------------------------------------------+

+----------------------------------------------------------------------------------------------------------+
|   case statment:-                                                                                        |
|   ==============                                                                                         |
|   Case statment also used to decoding values oracle 8.0 introduce case statment and also oracle 8i       |
|   Introduce  case conditional statments this is also called as search case conditional statments         |
|   case performance is very high compare to decode().                                                     |
|                                                                                                          |
|   sql>select dname,deptno,case deptno when 10 then upper('ten')when 20 then upper('twenty') when 30 then |
|   upper('thirty') else upper('other') end from emp;                                                      |
+----------------------------------------------------------------------------------------------------------+

*WRITE A QUERY TO CHANGE MALE TO FEMALE USING CASE STATMENT?

*WRITE A QUERY TO DISPLAY GROUP WISE SALARY FROM EMP TABLE USING GROUPING_ID()?

*WRITE A QUERY TO DISPLAY SAL>3000 'HIGH SALARY ,SAL>2000 AND SAL<30000 THEN 'MEDIMUM SALARY FROM EMP.

*select * from(select job,sal,deptno from emp)pivot(sum(sal) for deptno in(10 as deptno10,20 as deptno20,30 as deptno30));

*WRITE A QUERY TO COUNT NO OF JOB PRESENT IN EACH DEPTNO NUMBER LIKE CLEARK IN 10,20,30 DEPTNO?

*WRITE A QUERY TO ADD ANY NUMBER INTO GIVEN STRING:-'$35.8'?

                   +-----------------------------------------------------+
                   |*select ename,sal,to_number(sal,'$9999')*12 from emp;|
                   +-----------------------------------------------------+

*WRITE A QUERY WHICH IS USED TO SUBSTITUE ANY MESSAGE INPLACE OF NULL VALUE WITHIN MGR COLUMN.

                       +----------------------------------------------+
                       |select to_char(9843219,'99g999g99')from dual; |
                       |select to_char(560,'L999')from dual;          |
                       +----------------------------------------------+

       *LEADING ZERO:-select to_char(sal,'09999')from dual;

   +-------------------------------------------------------------------------------------------------+
   |IN ORACLE WHENEVER WE ARE CREATING PRIMARY KEY  OR UNIQUE CONSTRANT THEN ORACLE SERVER INTERNALLY|
   |AUTOMATICALLY CREATES BTREE INDEX ON THOSE COLUMN.                                               |
   +-------------------------------------------------------------------------------------------------+
   +------------------------------------------------------------------------------------------------------+
   |IN ALL RELATIONAL DATABASES WHENEVER WE ARE REQUESTING DATA BY USING WHERE CLAUSE OR BY USING ORDER BY|
   |CLAUSE THEN ONLY DATABASE SERVER SEARCHING FOR INDEXES.                                               |
   +------------------------------------------------------------------------------------------------------+
   +----------------------------------------------------------------------------------------------------+
   |IN ORACLE WHENEVER WHERE CLAUSE HAVING <> OR IS NULL OR IS NOT NULL OPERATOR THEN ORACLE SERVER DOES|
   |NOT SEARCH FOR INDEXES IF THOSE COLUMN HAVING INDEXES ALSO.                                         |
   +----------------------------------------------------------------------------------------------------+


IN ORACLE WHEVEVER WE ARE CREATING B-TREE INDEX THEN ORACLE SERVER AUTOMATICALLY CREATES TREE STRUCTURE
BASE ON INDEX COLUMN VALUE IN THIS TREE STRUCTURE ALWAYS LEAF BLOCKS STORES ACTUAL DATA ALONG WITH ROWIDS.

WHENEVER USER REQUESTING DATA BY USING WHERE CLAUSE OR ORDER BY CLAUSE THEN ORACLE SERVER FIRST CHECK THOSE
WHERE CLAUSE OR ORDER BY CLAUSE COLUMNS  HAVING INDEXES OR NOT.

WHENEVER THOSE COLUMN HAVING B-TREE INDEXES THEN ORACLE SERVER VERY FASTLY RETRIEVE DATA FROM LEAF BLOCKS.
WITHIN B-TREE STRUCTURE BY USING INDEX SCAN MECHANISM 

                   +----------------------------------+
                   |sql>create index in1 on emp(ename)|
                   +----------------------------------+
                   sql>desc user_indexes
                   sql>select index_name from user_indexes where table_name='EMP'
                   sql>select column_name,index_name from user_ind_columns where table_name='EMP';

                   sql>set autotrace on explain;
                   sql>set autotrace off;

SQL>CREATE TABLE VIRTUAL_TABLE(A NUMBER(5),B NUMBER(5),C NUMBER(10)GENERATED ALWAYS AS(A+B)VIRTUAL);
SQL>CREATE UNIQUE INDEX IN2 ON DEPT(DNAME);


