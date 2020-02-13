                                   *********   
"                               ***INTERFACE***
                                   *********   
INTRODUCTION:-
=============
"ANY SERVICE REQUIREMENT SPACIFICATION [SRS]IS CONSIDER AS AN INTERFACE.'
example:1
jdbc API access requirement spacification to develop data base driver
database vender is responsible to implement this jdbc API.
    
                
                        
               +------------------+
               |   jdbc API       |
               +------------------+
                |         |
                |         |
                |         |
                |         |
                |         |
        +-------+------++-+------------+
        | oracle driver||  mysql driver|
        +--------------++--------------+
Example2:
servlet API access requirement spacification to develop web server 
Web server vendor is responsible to implement servlet API


             +------------------+
             | servlet API      |
             +------------------+
               |       |
               |       |
               |       |
               |   +---+-------+-----+
               |   | oracle web logic|
        +------+---+--+--------+-----+
        | apache tomcat|
        +-------------+

"FROM CLIENT POINT OF VIEW AN INTERFACE DEFINE THE SET OF SERVICES WHAT HE IS EXPECTING'

"FROM SERVICE PROVIDER POINT OF VIEW AN INTERFACE DEFINE THE SET OF SERVICES WHAT HE IS OFFERING HENCE ANY 
"CONTRUCT BETWEEN  CLIENT AND SERVICE PROVIDER IS CONSIDER AS AN INTERFACE.

EXAMPLE:
========
THOURGH BANK ATM GUI SCREEN BANK PEOPLE ARE HIGHLIGHTING THE SET OF  SERVICES WHAT THEY ARE OFFERING AT 
SAME TIME THE SAME GUI SCREEN REPRESENT THE SET OF SERVICES WHAT CUSTOMER IS EXPECTING HENCE THIS GUI SCREE-N ACCESS CONTRUCT BETWEEN CUSTOMER AND BANK PEOPLE 

                                                                  
               ^               +----------------+                ^
               |               | +--------+     |                |
               |               | |withdraw|     |                |
               |               | +--------+     |                |
               |               |                |                |
               +-------+       |                | <---+          ^
               |       |       |  +--------+    |     |----------|
               ^       +-----> |  |minstmt |    |                |
               |               |  +--------+    |                ^
               ^               |                |                |
               |               |                |                |
               |               |  +--------+    |                |
               |               |  |ban chk |    |                |
               |               |  +--------+    |                |
               |               +----------------+
        Customer                   ATM                         Bank care
****************************************************************************************************
DEFINATION3:
===========
"INSIDE INTERFACE EVERY METHOD IS ALWAYS ABSTRACT WHETHER WE ARE DECLARE OR NOT' 
"HENCE INTERFACE IS CONSIDERD AS 100% PURE ABSTRACT CLASS 

SUMMARY DEFINATION:-
-------------------
"ANY SERVICE REQUIREMENT SPACIFICATION OR ANY CONTRUCT BETWEEN CLIENT AND SERVICE PROVIDER OR 100% 
"PURE ABSTRACT CLASS IS NOTHING BUT INTERFACE 

*WHEN EVER WE ARE IMPLEMENTING AN INTERFACE FOR EACH AND EVERY METHOD OF THAT INTERFACE WE HAVE TO PROVIDE 
*IMPLEMENTATION OTHERWISE WE HAVE TO DECLARE CLASS AS ABSTRACT THEN NEXT LEVEL CHILD CLASS IS RESPONSIBLE 
TO PROVIDE IMPLEMENTATION 

"EVERY INTERFACE METHOD IS ALWAYS PUBLIC AND ABSTRACT WHETHER WE DECLAREING OR NOT' HENCE WHENEVER WE ARE
"IMPLEMENTING AN INTERFACE METHOD COMPULSORY WE SHOULD DECLARE AS PUBLIC OTHERWISE WE WILL GET COMPILE ERROR
refer:interface.java
Example:
    
interface Interf
{
    void m1();
    void m2();
    }
abstract class serviceprovider implement Interf
{
    public void m1()
    {
    }
}
class SubServiceProvider extends ServiceProvider
{
    public void m2()
    {
    }
}
****************************************************************************************************
"                           Extends Vs Implements:-
                           ---------------------

"A CLASS CAN EXTENDS ONLY ONE CLASS AT A TIME'
"AN INTERFACE CAN EXTENDS ANY NUMBER OF INTERFACES SIMULTANEOUSLY'

    Example:
        interface A | interface B
        {           | {
                    |
        }           |}
interface C extends A,B
{

}
"A CLASS CAN IMPLEMENT ANY NUMBER OF INTERFACES SIMULTANEOUSLY' 

"A class can extends another class and can implement any number of interfaces simultaneously'

class A extends B implements C,D,E
{

}

which of the following is valid.

1:A class can extends any number of classes at a time[invalid]

2:A class can implement only one interface at a time[invalid]

3:Interface can extends only one interface at time [invalid]
4:An interface can implement any number of interfaces simultaneously[valid] 

5:A class can extends other class or can implement an interface but not both simultaneously [invalid]
6:None of the above[True]

consider the following expression
      +-------------+
      | X extends Y |
      +-------------+
which of the following possibility of the above expression is valid

        1:both x and y should be classes.[invalid]
        2:both x and y should be interfaces.[invalid]
        3:both x and y either classes or interface[valid]
+-----------+
|x extends y|
+-----------+
+-------------+
|x extends y,z|
+-------------+
x,y,z should be interface
+----------------+
|x implement y,z |
+----------------+
x-->class 
y,z--->interface
+------------------------+
|x extends y implement z |
|
+------------------------+
x,y --->classes
z ------->interface
+----------------------------+
|x implement y extends z     |
+----------------------------+
CE:-because we have to take extends first followed by interface

****************************************************************************************************

INTERFACE METHOD:-
=================
"EVERY METHOD PRESENT INSIDE A INTERFACE IS ALWAYS PUBLIC AND ABSTRACT WHETHERE WE ARE DECLARING OR NOT

                               interface Interf
                                      {
                           +------void m1();
                           |          }
                           |
                           |
                           +--public->:"TO MAKE THIS METHOD AVAILABLE TO EVERY IMPLEMENTATION CLASS.
                           |                                                                      
                           |                                                                      
                           |                                                                      
                           |                                                                      
                           +--abstract->:"IMPLEMENTATION CLASS IS RESPONSIBLE TO PROVIDE IMPLEMENTATION.                                                                  
+---------------------------------------------------------------------------+
|   Hence inside interface the following method declaration are equal       |
|                                                                           |
|       void m1();                                                          |
|       public void m1();                                                   |
|       abstract void m1();                                                 |
|       public abstract void m1();                                          |
+---------------------------------------------------------------------------+

"As Every interface method is always public and abstract we cant Declare interface method with the'
"FOLLOWING MODIFIER' private protected
   +----------------------------------------------------------------------------------------------------+
   |*AS EVERY INTERFACE METHOD IS ALWAYS PUBLIC AND ABSTRACT WE CAN'T DECLARE INTERFACE METHOD WITH THE |
   |*FOLLOWIN-G MODIFIER                                                                                |
   +-------------------------+---------------------+----------------------------------------------------+
                             |      private        |
                             |      protected      |
                             |      static         |
                             |      final          |
                             |      synchronized   |
                             |      strictfp       |
                             |      native         |
                             +---------------------+

+--------------------------------------------------------------------------------+
|   which of the following method declaration are allowed inside interface       |
|                                                                                |
|                                                                                |
|       public void m1()==:invalid[because of semicoln]                          |
|       private void m1();==:invalid                                             |
|       protected void m1();==:invalid                                           |
|       static void m1();==:invalid                                              |
|       public abstract native void m1();==:invalid                              |
|       abstract public void m1();==:valid                                       |
+--------------------------------------------------------------------------------+

****************************************************************************************************

"AN INTERFACE CAN CANTAIN VARIABLES THE MAIN PURPOSE OF INTERFACE VARIABLE IS TO DEFINE REQUIREMENT LEVEL 
"CONSTANT

"EVERY INTERFACE VARIABLE IS ALWAYS PUBLIC,STATIC ,FINAL WHETHER WE ARE DECLARING OR NOT.'

                    interface Inter
                    {
                   +--->int x = 10;
                   |
                   |    }
                   |     
                   +-->public:"TO MAKE THIS VARIABLE AVAILABLE TO EVERY IMPLEMENTATION CLASS.  
                   |     
                   |     
                   |     
                   +-->static:"WITHOUT EXISTING OBJECT IMPLEMENTATION CLASS HAS TO ACCESS THIS VARIABLE  
                   |
                   |
                   +-->final :"IF ONE IMPLEMENTATION CLASS CHANGE VALUE THEN REMAINING IMPLEMENTATION CLASS 
                              "WILL BE EFFECTED TO RESTRICT THIS EVERY INTERFACE  VARIABLE IS ALWAYS FINAL.

+----------------------------------------------------------------------+
|   Hence within the interface the following declaration are equal.    |
|                                                                      |
|                       int x=10;                                      |
|                       public int x =10;                              |
|                       static int x = 10;                             |
|                                                                      |
|                       final int x = 10;                              |
|                       public static int x = 10;                      |
|                       public final int x = 10;                       |
|                       static final int x = 10;                       |
|                       public static final int x = 10;                |
+----------------------------------------------------------------------+

*AS EVERY INTERFACE VARIABLE IS ALWAYS PUBLIC,STATIC,FINAL WE CANT DECLARE WITH THE FOLLWING MODIFIERS.'
                                +-------------+
                                |  private    |
                                |  protected  |
                                |  transient  |
                                |  volatile   |
                                +-------------+

"FOR INTERFACE VARIABLE COMPUSORY WE SHOULD PERFORM INTIALIZATION AT THE TIME OF DECLARATION.OTHERWISE
"WE WILL GET COMPILE TIME ERROR.'

EXAMPLE:
=======
interface Inter
{
    int x ;
    }Error:equal symbol expected.

INSIDE INTERFACE WHICH OF THE FOLLOWING VARIABLE DECLARATION IS ALLOWED.
                                +---------------------------------+
                                |int x;[invalid                   |
                                |private int x =10;[invalid       |
                                |protected int x = 10;[invalid    |
                                |volatile int x = 10;[invalid     |
                                |transient int x = 10;[invalid]   |
                                |public static int x = 10;[valid] |
                                +---------------------------------+

"INSIDE IMPLEMENTATION CLASS WE CAN ACCESS INTERFACE VARIABLE BUT WE CAN'T 'MODIFIY VALUES' 

Example:-
--------
interface Inter
{
    int x = 10;
    }
class Test implements Inter
{
    public static void main(String[]args)
    {
        x = 777;//here we are using variable of Interface variable'
        }
        }Error:can not assing value to final variable.

2:

class Test implements Inter
{
    public static void main(String[]args)
    {
        int x = 777;//here we are declaring variable not using'
        System.out.println(x);
    }
}

****************************************************************************************************

interface NAMING CONFLIT:-
========================

METHOD NAMING CONFLIT:
---------------------
"IF TWO INTERFACES CONTAIN A METHOD WITH SAME SIGNATURE[METHOD NAME] AND SAME RETURN TYPE THEN IN THE,'
"IMPLEMENTATION CLASS WE HAVE TO PROVIDE IMPLEMENTATION FOR ONLY ONE METHOD'

Example:-
-------
    interface left        | interface right
    {                     |  {
        public void m1(); |     public void m1();
        }                 |     }
                          |
class Test implements left,righ
{
    public void m1()//must be public 
    {

    }

    }
****************************************************************************************************

"IF TWO INTERFACES CONTAIN A METHOD WITH SAME NAME BUT DIFFERENT ARGUMENT TYPES THEN IN THE 
"IMPLEMENTATION FOR BOTH METHOD AND THESE METHOD ACCESS OVERLOADED.[refer:Overloadinterface.java]  

EXAMPLE:-
-------
interafce left            | interface right
{                         |  {
    public void m1();     |     public void m1(int n);
    public void m2(int i);
    }                     |   }

class Test implements left,right
{
    public void m1();
    {

    }
    public void m1(int i)
    {

    }
 }"[refer:OverloadInterface.java]


*IF TWO INTERFACES CONTAIN METHOD WITH SAME SIGNATURE BUT DIFFERENT RETURN TYPES THEN IT IS,
*IMPOSIBLE TO IMPLEMENT BOTH INTERFACES SIMULTANEOUSLY[IF RETURN TYPE ARE NOT COVARIENT]

Example:-
--------

interface left                  interface right
{                               {
    public void m1();            public int m1();
    }                           }
"WE CAN'T WRITE ANY JAVA CLASS WHICH IMPLEMENT BOTH INTERFACE SIMULTANEOUSLY  

****************************************************************************************************

//Q:IS A JAVA CLASS CAN IMPLEMENT ANY NUMBER OF INTERFACES SIMULTANEOUSLY.

YES EXCEPT A PARTICULAR CASE IF TWO INTERFACES CONTAINS A METHOD WITH SAME SIGNATURE BUT DIFFERENT RETURN
TYPE THEN IT IS IMPOSIBLE TO IMPLEMENT BOTH INTERFACES SIMULTANEOUSLY

INTERFACE VARIABLE NAMEING CONFLICT:-
===================================
TWO INTERFACES CAN CONTAIN A VARIABLE WITH THE SAME NAME' AND THERE MAY BE A CHANCE OF VARIABLE NAMING CONFILITS BUT WE CAN SOLVE THIS PROBLEM BY USING INTERFACE NAMES 

Example:-
--------

interface Left              interface right
{                           {
    x = 777;                    x = 888;
    }                         }

class Test implements Left,right;
{
    public static void main(String[]args)
    {
        System.out.println(x);Error:ambiguous
        System.out.println(Left.x)==>777;
        System.out.println(right.x)==>888;
        }
   }"[refer:interfacevariable.java]

****************************************************************************************************

                               *****************    
"                          *****Marker Interface *****
                               *****************    

"IF AN INTERFACE DOESN'T CONTAIN ANY METHOD AND BY IMPLEMENTING THAT INTERFACE IF OUR OBJECT WILL GET SOME 
"ABILLITY SUCH TYPE OF INTERFACES ARE CALLED MARKER INTERFACES.

                       +---------------------------------+
                       |    --------               |     |
                       |    1:Serialidable(I)      +----------------------------------+
                       |    2:cloneable(I)         |These|are marked for some ability |
                       |    3:RandomAccess(I)      +----------------------------------+
                       |    4:SingleThreadmodel(I) |     |
                       +---------------------------------+"refer:cloneable():cloneObject.java
EXAMPLE:
--------
BY IMPLEMENTING SERIALIDABLE INTERFACE OUT OBJECT CAN BE SAVED TO THE FILE AND CAN TRAVEL ACROSS THE NETWORK

Example2:
--------
"BY IMPLEMENTING CLONEABLE INTERFACE OUR OBJECT IN POSTION TO PRODUCED EXACTLY DUPLICATE CLONE OBJECT.
                                                                               "refer:cloneObject.java

Q:Is it possible to create our own marker interface.
Yes but customization of JVM is required 
--------

ADAPTER CLASS:-
=============
"ADAPTER CLASS IS A SIMPLE JAVA CLASS THAT IMPLEMENTS AN INTERFACE WITH ONLY EMPTY IMPLEMENTATION'

EXample:-
--------
interface X            | class Adapter implements X
{                      |  {
    m1();              |  m1(){}
    m2()               |  m2(){}
    m3();              |  m3(){}
    .                  |   .
    .                  |   .
    .                  |   .
    .                  |   .
    m1000();           |   m1000(){}
    }                  |

"IF WE IMPLEMENT AN  INTERFACE FOR EACH AND EVERY METHOD OF THAT INTERFACE COMPULSORY WE SHOULD PROVIDE 
"IMPLEMENTATION WHETHER IT IS REQUIRED OR NOT REQUIRED.

class Test implements X
{
    m3()
    {
       10 lines only need
    }
    m1(){}
    m2(){}
    m3(){}
    .
    .
    .
    .
    m1000(){}

"THE PROBLEM IN THIS APPROACH IT INCREASES LENGTH OF THE CODE REDUCED READIABILITE WE CAN SOLVE THIS PROBLEM BY USING ADAPTER CLASSES INSTEAD OF IMPLEMENTING INTERFACE IF WE EXTENDS ADAPTER CLASS WE HAVE TO PROVIDE 
"IMPLEMENTATION ONLY FOR REQUIRED METHOD AND WE ARE NOT RESPONSIBLE TO PROVIDE IMPLEMENTATION  FOR EACH AND 
"EVERY METHOD OF THE INTERFACE SO THAT LENGTH OF THE CODE WILL REDUCED

class Test extends Adapter x
{
    m3()
    {
    -----
    -----
    ------
    -------
    }
    } 
class simple extends Adapter X
{
    m7()
    {



    }
}
class Demo extends Adapter
{
    m1000()
    {
   ---- 
   -----
    }
}


WE CAN DEVELOP A SERVLET IN THE FOLLOWING THREE WAYS.
                      +----------------------------------+
                      |   BY IMPLEMENTING SERVLET.       |
                      |   BY EXTENDING GENERIC SERVLET   |
                      |   BY EXTENDING HTTPSERVLET       |
                      +----------------------------------+


                                               servlet(I)
                               --------------> |
                              /                |
                             /                 |
              *******       /                  |
            **       **    /                   |
          **MyServlet  **--------------------> Generic servlet(Ac)
          *             */                     |
          **           **\                     |
            **       **   \                    |
              *******      \                   |
                            \                  |
                             ----------------> HttpServlet(Ac)


"IF WE IMPLEMENT SERVLET INTERFACE FOR EACH AND EVERY METHOD OF THAT INTERFACE WE SHOULD PROVIDE 
"IMPLEMENTATION IT INCREASES LENGTH OF  THE CODE AND REDUCED READABILITIES.

"INSTEAD OF IMPLEMENTING SERVLET INTERFACE DIRECTLY IF WE EXTENDS GENERIC SERVLET WE HAVE TO PROVIDE 
"IMPLEMENTATION ONLY FOR SERVICE METHOD AND ALL REMAINING METHOD WE ARE NOT REQUIRED TO PROVIDE 
"IMPLEMENTATION .

HENCE MORE OR LESS GENRIC SERVLET ACCESS ADAPTER CLASS FOR SERVLET INTERFACE 

*MARKER INTERFACE AND ADAPTER CLASSES SIMPLIFY COMPLIXITY OF PROGAMMING  AND THESE ARE BEST UTILITIES TO THE PROGRAMMER AND PROGRAMMER LIFE WILL BECOME SIMPLE 

****************************************************************************************************

Interface Vs Abstract Class Vs Concrete Class: 
=============================================
"IF WE DON'T KNOW ANYTHING ABOUT IMPLEMENTATION JUST WE HAVE REQUIREMENT SPECIFICATION THEN WE SHOULD GO FOR INTERFACE 
Example:
    servlet
"IF WE ARE TALKING ABOUT IMPLEMENTATION BUT NOT COMPLETELY [PARTIAL IMPLEMENTATION] THEN WE SHOULD GO FOR 
"ABSTRACT CLASS 
Example:
    GenericServlet,httpservlet
"IF WE ARE TALKING ABOUT IMPLEMENTATION COMPLETELY AND READY TO PROVIDE SERVICE THEN WE SHOULD GO FOR 
"CONCRETE CLASS
Example:-
    MyownServlet

Difference Between Interface and Abstract Class:-
===============================================
"IF WE DON'T KNOW ANY THING ABOUT IMPLEMENTATION AND JUST WE HAVE REQUIREMENT SPECIFICATION THEN WE SHOULD 
"GO INTERFACE

"IF WE ARE TALKING ABOUT IMPLEMENTATION BUT NOT COMPLETELY [PARTIAL IMPLEMENTATION]THEN WE SHOULD GO FOR 
"ABSTRACT CLASS

"INSIDE INTERFACE EVERY METHOD IS ALWAYS PUBLIC AND ABSTRACT WHETHERE WE ARE DECLARING OR NOT HENCE 
"INTERFACE IS CONSIDERD AS 100% PURE ABSTRACT CLASS 

"IF METHOD PRESENT INSIDE ABSTRACT CLASS NEED NOT BE PUBLIC AND ABSTRACT AND WE CAN TAK CONCRETE METHOD ALSO

"AS EVERY INTERFACE METHOD ALWAYS PUBLIC AND ABSTRACT AND HENCE WE CAN'T DECLARE WITH THE FOLLOWING 
MODIFIERS:- private,protected,final,static,synchronized,native and strictfp

"THERE ARE NO RESTRICTATION ON ABSTACT CLASS METHOD MODIFIERS 

"EVERY VARIABLE PRESENT INSIDE INTERFACE IS ALWAYS PUBLIC STATIC FINAL WHETHERE WE ARE DECLARING OR NOT

"EVERY VARIABLE PRESENT INSIDE ABSTRACT CLASS NEED NOT BE PUBLIC,STATIC,FINAL
"AS EVERY INTERFACE VARIABLE IS ALWAYS PUBLIC,STATIC,FINAL WE CAN'T DECLARE WITH THE FOLLOWING MODIFIERS 
 private,protected,volatile,transient

"THERE ARE NO RETRICTION ON ABSTRACT CLASS VARIABLE MODIFIERS

"FOR INTERFACE VARIABLE COMPULSORY WE SHOULD PERFORM INTIALIZATION AT THE TIME OF DECLARATION ONLY OTHERWISE WE WILLGET COMPILE TIME ERROR

"FOR ABSTRACT CLASS VARIABLES WE ARE NOT REQUIRED TO PERFORM INTIALIZATION AT THE TIME OF DECLARATION  

"INSIDE INTERFACE WE CAN'T DECLARE STATIC AND INSTANCE BLOCK[because 100%abstraction]
"INSIDE ABSTRACT CLASS WE CAN DECLARE STATIC AND INSTANCE BLOCKS

"INSIDE INTERFACE WE CAN'T DECLARE CONSTRUCTORS 
"INSIDE ABSTRACT CLASS WE CAN DECLARE CONSTRUCTOR 

/*ANYWAY WE CAN'T CREATE OBJECT FOR ABSTRACT CLASS BUT ABSTRACT CLASS CAN CONTAIN CONSTRUCTOR WHAT IS THE 
NEED?----------------------------------------------------------------------------------------------------*/ 

"ABSTRACT CLASS CONSTRUCTOR WILL BE EXECUTED WHENEVER WE ARE CREATING CHILD CLASS OBJECT TO PERFORM 
"INTIALIZATION OFF CHILD CLASS OBJECT"[refer:Abstractobject.java]

WITHOUT HAVING CONSTRUCTOR IN ABSTRACT CLASS.
class student extends Parent
{                                             | class Teacher extends Parent
    int rollno;                               |  {
    Student(String name,int age,......)       |     String subject;
    {                          100 properties |     Teacher(String name,int age,...)
        this.name = name;   |                 |           {
        this.age  = age;    |                 |             this.name = name;
        -------------       | 100 properties  |             this.age  = age;
        ------------        |                 |             .
        this.rollno = rollno|                 |             .
    }                                         |             .
   }                                          |             this.subject = subject
                                              |            }
student t1 = new Student (101,properties)     |      }
                                  |           |      Teacher t2 = new Teacher(101,properties)
                                  |    *********      
                                  ^ ***         ***   
                                  **More code      ** 
                                  * code redundency * 
                                  **               ** 
                                    ***         ***   
                                       *********      

Aproach2:
with constructor inside abstract class.

abstract class Parent
{
    String name;
    int age;
    .
    .
    .
    100properties
    Parent(String name,int age,....)
    {
        this.name = name;   |          +------------------------------------+
        this.age = age;     |          |                                    |
        .                   | ---------|This constructor will work for every| 
        .                   |          |child class object creation         |
        .                   |          |but approach1 we have to define each|                                   
                                       |explicity each class constructor    |
        100 lines of code              +------------------------------------+
        }
   }
class Teacher extends Parent
{
    String subject;
    Teacher(String name,int age,....)
    {                     101 properties
        super(100 properties)
        this.subject = subject;
        }
    }
Teacher t  = new Teacher(101 properties)
                   *********      
                ***         ***   
              **   less code   ** 
              * code reusability* 
              **               ** 
                ***         ***   
                   *********      

"EITHER DIRECTLY OR INDIRECTLY WE CAN'T CREATE OBJECT FOR ABSTRACT CLASS 

/*ANYWAY WE CANT CREATE OBJECT FOR ABSTRACT CLASS AND INTERFACE BUT ABSTRACT CLASS CAN CONSTRUCTOR BUT 
INTERFACE DOSN'T CONTAIN CONSTRUCTOR WHAT IS THE REASON?
----------------------------------------------------------------------------------------------------*/

+---------------------------------------------------------------------------------------------------------+
|       THE MAIN PURPOSE OF CONSTRUCTOR IS TO PERFROM INITIALIZATION FOR INSTANCE VARIABLE                |
|       ABSTRACT CLASS CAN CONTAIN INSTANCE VARIABLE WHICH ARE REQUIRED FOR CHILD OBJECT TO               |
|       PERFROM INTIALIZATION OF THOSE INSTANCE VARIABLE CONSTRUCTOR IS REQUIR-ED FOR ABSTRACT CLASS      |
+---------------------------------------------------------------------------------------------------------+

                   +-----------------------------------------------------------+
                   | BUT EVERY VARIABLE PRESENT INSIDE INTERFACE IS            |
                   | always public,static,final WHETHERE WE ARE                |
                   | DECLARING OR NOT AND THERE IS NO CHANCE OF                |
                   | EXISTING  INSTANCE VARIABLE INSIDE INTERFACE              |
                   | HENCE CONSTRUCTOR CONCEPT IS NOT REQUIRED FOR INTERFACE.  |
                   +-----------------------------------------------------------+

"WHEN EVER WE ARE CREATING CHILD CLASS OBJECT PARENT OBJECT WON'T BE CREATED JUST PARENT CLASS CONSTRUCTOR 
"WILL BE EXECUTED FOR CHILD OBJECT PURPOSE ONLY."[refer:constest.java]

Example:
--------
class P
{
    P()
    {
        System.out.println(this.hashCode());
        }
   }
class C extends P
{
    C()
    {
        System.out.println(this.hashCode());
        }
    }
class Test
{
    public static void main(String[]args)
    {
        C c = new C();
        System.out.println(c.hashCode());
    }
 }

INSIDE INTERFACE EVERY METHOD IS ALWAYS ABSTRACT AND WE CAN TAKE ONLY ABSTRACT METHOD IN ABSTRACT CLASS ALSOTHEN.

/*WHAT IS THE DIFFERENCE BETWEEN INTERFACE AND ABSTRACT CLASS I.E IS IT POSIBLE TO REPLACE INTERFACE WITH ABSTRACT CLASS*/

WE CAN REPLACE INTERFACE WITH ABSTRACT CLASS BUT IT IS NOT GOOD PROGRAMMING PRACTICE THIS IS SOMETHING LIKE 
REQURETING IAS OFFICER FOR SWIPING ACTIVITY 

"IF EVERYTHING ABSTRACT THEN IT IS HIGHLY RECOMENDED TO GO FOR INTERFACE BUT NOT FOR ABSTRACT CLASS

Approach1:
    
    abstract class X      | interface X
    {                     |  {
    ----                  |     
    ----                  |    }
    }                     | class Test implement X
    class Test extends X  |   {
    {                     |
    -----                 |   }
    -----                 |   Test t = new Test();
    }                     |
                          |
  Test t = new Test();    |
  more time taking        |     less time taking 
                          |

  +-------------------------------------------------------------------------------------------------------+
  | WHILE EXTENDING ABSTRACT CLASS IT IS NOT POSSIBLE TO EXTENDS ANY OTHER CLASS AND HENCE WE ARE MISSING |
  | INHERITANCE BENIFIT                                                                                   |
  +-------------------------------------------------------------------------------------------------------+

                       +------------------------------------------------------------+
                       |WHILE IMPLEMENTING INTERFACE WE CAN EXTEND SOME OTHER CLASS |
                       |AND HENCE WE WAN'T MISS ANY INHERITANCE BENIFIT             | 
                       +------------------------------------------------------------+


                           +------------------------------------------------+
                           |  IN THIS CASE OBJECT CREATING IS VERY COSTLY   |
                           |             Test t = new Test();               |
                           |                    +-----+                     |
                           |                    |2min |                     |
                           |                    +-----+                     |
                           +------------------------------------------------+

                               +-------------------------------------------+
                               |IN THIS CASE OJBECT CREATING IS NOT COSTLY |
                               |            Test t = new Test();           |            
                               |                +-----+                    |              
                               |                |2sec |                    |              
                               |                +-----+                    |              
                               +-------------------------------------------+
