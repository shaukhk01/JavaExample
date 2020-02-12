                                FINAL VARIABLE
                            ======================
FINAL INSTANCE VARIABLE:-
========================
"IF THE VALUE OF VARIABLE IS VARIED[CHANGED] FROM OBJECT TO OBJECT SUCH TYPE OF VARIABLE ARE CALLED 
 INSTANCE VARIABLE.
"FOR EVERY OBJECT A SEPRATE COPY OF INSTANCE VARIABLE WILL BE CREATED

"FOR INSTANCE VARIABLE WE ARE NOT REQUIRED TO PERFORM INTIALIZZTION EXPLICITLY JVM ALWAYS PROVIDE DEFAULT 
 value.

EXAMPLE:-
--------
class Test
{
   int x;
   public static void main(String[]args)
   {
        Test t  = new Test();
        System.out.println(t.x);==>0;
        }
 }


"IF THE INSTANCE VARIABLE DECLARE AS FINAL THEN COMPULSORY WE HAVE TO PERFORM INITILIZATION EXPLICITLY 
"WHETHER  WE ARE USING OR NOT AND JVM WON'T PROIVIDE DEFAULT VALUE

EXAMPLE:-
--------

class Test
{
    final int x;
        }Error:-x variable not intializie

Rule:
    "FOR FINAL INSTANCE VARIABLES COMPULSORY WE SHOULD PERFORM INTIALIZATION BEFORE CONSTRUCTOR COMPILITION,
    "i.e THE FOLLOWING OR VARIOUS PLACES FOR INTIALIZATION.

    1:AT THE TIME OF DECLARATION:
        class Test
            {
        final int x = 10;
              }
    2:INSTANCE BLOCK:
        class Test
        {
            final int x;
                {
                    x = 10;
                }
                }
    3:INSIDE CONSTRUCTOR:
        class Test
        {
            final int x;
                Test()
                {
                    x = 10;
                    }
            } 
THESE ARE THE ONLY POSSIBLE PLACES TO PERFORM INTIALIZATION FOR FINAL INSTANCE VARIABLE IF WE ARE TRYING TO
PERFORM INTIALIZATION ANYWHERE ELSE THEN WE WILL GET COMPILE TIME ERROR
   
Example:-
--------

class Test
{
    final int x;
        public void m1()
        {
            x = 10;
            }
            }Error: can not assing value to final variable x;

FINAL STATIC VARIABLE:-
======================

"IF THE VALUE OF A VARIABLE IS NOT VARIED FROM OBJECT TO OBJECT SUCH TYPE OF VARIABLES ARE NOT RECOMMENDED T"O DELCARE AS INSTANCE VARIABLES WE HAVE TO DECLARE THOSE VARIABLE AT CLASS LEVEL BY USING  STATIC MODIFIER.

"IN THE CASE OF INSTANCE VARIABLES FOR EVERY OBJECT A SEPRATE COPY WILL BE CREATED BUT IN THE CASE OF,
"STATIC VARIABLE A SINGLE COPY WILL BE CREATED AT CLASS LEVEL AND SHARED BY EVERY OBJECT OF THAT CLASS.

"FOR STATIC VARIABLE IT IS NOT REQUIRED TO PERFORM INTIALIZATION EXPLICTLY JVM WILL ALWAYS PROVIDE DEFAULT,
values

EXAMPLE:-
--------
class Test
{
    static int x;
    public static void main(String[]args)
    {
        System.out.println(x)==>0;
        }
        }

           *********************************        
  *********e:order of modifer not required i*********
           *********************************        
****************************************************************************************************
"IF THE STATIC VARIBLE DECLARE AS FINAL THEN COMPULSORY WE SHOULD PERFORM INTIALIZATION EXPLICTLY OTHERWISE WE WILL GET COMPILE TIME ERROR AND JVM WON'T PROVIDE ANY DEFAULT VALUE.AND ALSO INTANCE BLOCK NOT INITIALIZE
****************************************************************************************************

EXAMPLE:-
--------
class Test
{
    final static int x;
        }Error:variable x might not have been intialize
****************************************************************************************************
Rule:
    FOR FINAL STATIC VARIABLE COMPULSORY WE SHOULD PERFROM INTILIZATION BEFORE CLASS LOADING COMPLITION
    i.e THE FOLLOWING ARE VARIOUS PLACES FOR THIS.

    1:AT THE TIME OF DECLARATION:
        class Test
        {
                final static    int x =10;
           } 2:Inside static block:
        class Test
        {
            final static int x;
            static
            {
                x = 10;
                }
         }
         "THESE ARE THE ONLY POSSIBLE PLACES TO PERFORM INTILIZATION FOR FINAL STATIC VARIABLES IF WE ARE,
         "TRYING TO PERFROM INTIALIZATION ANYWHERE ELSE THEN WE WILL GET COMPILE TIME ERROR
****************************************************************************************************
         Example:-

         class Test
         {
            final static int x;
                public void m1()
                {
                    x = 10;
                    }
             }
             Error:cannot assing value to final variable x
****************************************************************************************************
FINAL LOCAL VARIABLES:-
=====================

"SOME TIME TO MEET TEMPORARIES REQUIREMENT OF PROGRAMMER WE HAVE TO DECLARE VARIABLES INSIDE A METHOD OR ,
"BLOCK OR CONSTRUCTOR SUCH TYPE OF VARIABLE ARE CALLED LOCAL VARIABLES OR TEMPORARIES VARIABLE OR STACK VARIA-BLE OR AUTOMATIC VARIABLES
****************************************************************************************************

"FOR LOCAL VARIABLES JVM WON'T PROVIDE ANY DEFAULT VALUES COMPULSORY WE SHOULD PROVIDE INTIALIZATION EXPLICTL-Y BEFORE USING THE LOCAL VARIABLE i.e IF WE ARE NOT USING THEN IT IS NOT REQUIRED TO PERFORM INTIALIZATION FOR LOCAL VARIABLE.

Example:-
--------
                                          |   
class Test                                |  class Test
{                                         |   {
    public static void main(String[]args) |     public static void main(String[]args)
    {                                     |            {
        int x;                            |                 int x;
        System.out.println("Hello");      |            System.out.println(x)==>Error must be intialize
        }                                 |             }
        }==>allowed                       |       }
                                          |
                                          |
                                          |


EVEN THOW LOCAL VARIABLE IS FINAL BEFORE USING ONLY WE HAVE TO PERFORM INTIALIZATION I.E IF WE ARE NOT USINGTHEN IT IS NOT REQUIRED TO PERFORM INTIALIZATION EVEN THOW IT IS FINAL.

Example:-
--------

class Test
{
    public static void main(String[]args)
    {
            final int x;
            System.out.println("Hello");==>allowed
            }
            }
****************************************************************************************************
"THE ONLY APPLICABLE MODIFIER FOR LOCAL VARIABLE IS FINAL BY MISTAKE IF WE ARE TRYING TO APPLYING ANY OTHER 
"MODIFIER THEN WE WILL GET COMPILE TIME ERROR.
****************************************************************************************************
Example:-
--------

class Test
{
    public static void main(String[]args)
    {
        public int x = 10;  |
        private int x = 10; |
        protecte in x = 10; |
        static int x = 10;  +-----Aall are invalid-
        tranjent int x =10; |
        volatile int x = 10;|
        }                   |
        final int x = 10; ==valid only


note:
"IF WE ARE NOT DECLARING ANY MODIFIER THEN BY DEFAULT IT IS DEFAULT BUT THIS ROLE IS APPLICABLE ONLY FOR
"INSTANCE AND STATIC VARIABLES BUT NOT FOR LOCAL VARIABLS.

FORMAL PARAMETER OF METHOD SIMPLY ACCESS LOCAL VARIABLE OF THAT METHOD HENCE FORMAL PARAMETER CAN BE DECLAR-E AS FINAL 
IF FORMAL PARAMETER DECLARE AS FINAL WITHIN THE METHOD WE CAN'T PERFORM REASSINGMENT. 

EXAMPLE:-
--------
class Test 
{
    public static void main(String[]args)
    {
        m1(10,20);
    }
    public static void m1(final int x,int y)
        
        {                 |
        int x = 100;      +-----> we cannot assign value to final variable
           int y = 200;  |
            System.out.println(x+"------"+y);Error:
            }
            }

