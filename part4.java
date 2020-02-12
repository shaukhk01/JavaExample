                                 +--------------------+
                                 |  STATIC MODIFIER   |
                                 +--------------------+

"STATIC KEYWORD IS MODIFIER APPLICABLE FOR METHOD AND VARIABLES BUT NOT FOR CLASSES WE CAN'T DECLARE TOP 
"LEVEL CLASS WITH STATIC MODIFIER BUT WE CAN DECLARE INNER CLASS AS STATIC' [SUCH TYPE OF INNER CLASSARE 
"CALLED STATIC NESTED CLASSES].
****************************************************************************************************

"IN THE CASE OF INSTANCE VARIABLES FOR EVERY OBJECT A SEPRATE COPY WILL CREATED BUT IN THE CASE OF STATIC 
"VARIABLE A SINGLE COPY WILL BE CREATED AT CLASS LEVEL  AND SHARED BY EVERY OBJECT OF THAT CLASS.
"static class inside attribute not automatically becomes static like variable method.:refer:staticlass.java
"we can not access instance method from static method  using instance class name but reference can access.
Example:-
--------

class Test
{
    static int i = 10;
    int y = 20;
    public static void main(String[]args)
    {
        Test t1 = new Test();
             t1.x = 888;
             t1.y = 999;
        Test t2 = new Test();
             System.out.println(t2.x+"-----"+t2.y)==>888.20;
     }                                                |
                                                      |
     }                                                 +--Because of static variable only one copy for ever                                                         -y object.-


"WE CAN'T ACCESS INSTANCE MEMBER DIRECTLY FROM STATIC AREA BUT WE CAN ACCESS FROM INSTANCE AREA DIRECTLY,
"WE CAN ACCESS STATIC MEMBERS FROM BOTH INSTANCE AND STATIC AREA DIRECTLY.

****************************************************************************************************
CONSIDER THE FOLLOWING DECLARATION.
=================================

1:int x = 10;
2:static int x = 10;

3:public void m1()
    {
    Sop(x);
    }

4:public static void m1()
{
    Sop(x);
};


Within the same class which of the above declaration we can take simultaneously 
1 and 3 allowed
    2 and 3 allowed
                        +---------------------------------------------------------------------+
    1 and 4 not allowed |Error:non static variable cannot be references from  a static method |
    2 and 4 allwed      +---------------------------------------------------------------------+
                         +--------------------------------------------+
    1 and 2 invalied     |Error:variable x is already define in Test  |
                         +--------------------------------------------+
                    +--------------------------------------+
    3 and 4 invalid |Error:m1() is already defined in Test |
                    +--------------------------------------+
Example:-
public class Parent
{
    int x = 10;
    public void m1()
    {
        
        System.out.println(x);
    }
}
class child extends Parent
{
    public static void m2()
    {
        System.out.println(x);//errorBecause of can't access instance member from static method.
    }
}


note1:
Overloading concept applicable for static method including main method But JVM always call String[]arg main method only 

Example:-
--------

class Test
{
    public static void main(String[]args)
    {
        System.out.println("String[]");
   }
public static void m1()
{
    System.out.println("i+[]");
}
}

other overloaded method we have to call just like a normal method call 

note2:

"INHERITANCE CONCEPT APPLICABLE FOR STATIC METHOD INCLUDING MAIN METHOD HENCE WHILE EXECUTING CHILD CLASS
"IF CHILD DOSEN'T CONTAIN MAIN METHOD THEN PARENT CLASS MAIN METHOD WILL BE EXECUTED. 

Example:-
--------
class P
{
    public static void main(String[]args)
{
    System.out.println("Parent main");
}
}
class C extends P
{

                                $>javac      P.java
}                                  |
                                   +--+-----------|
                                      |           |
                                  P.class     C.class 

$>java P==>parent main
$>java C==>Parent main


note3:
    class P
{
    public static void main(String[]args)<---------------+
{                                                        |
    System.out.println("Parent main");                   |
}                                                        |
}                                                        | ----->it is method hidding but not overriding. 
class C extends P                                        |
{                                                        |
    public static void main(String[]args)<---------------+
{
    super("child main");
}
}

$>javac P.java
$>java P==>Parent main

$>javac C.java
$>java C==>child main

+---------------------------------------------------------------------------------------------------------+
|IT SEEMS OVERIDING CONCEPT APPLICABLE FOR STATIC METHOD BUT IT IS NOT OVERRIDING AND IT IS METHOD HIDDING|
+---------------------------------------------------------------------------------------------------------+
note:
=====
"FOR STATIC METHOD OVERLOADING AND INHERITANCE CONCEPT ARE APPLICALBE BUT OVERRIDING CONCEPT ARE NOT 
"APPLICABLE BUT INSTEAD OF OVERRIDING METHOD HIDDING CONCEPT IS APPLICABLE. 

Inside method implementation if we are using at least one instance variable then that method talks about' 
particular object hence we should declare method as instannce method'

Inside method implemenation if we are not using any instance variable then this method no ware related to 
particular object hence we have to declare such type of method as static method irrespective of whether we
are using static variable or not                    |
                                                    |   class Thunderbird
Example:-                                           |     {
                                                    |           String Brand;
class Student                                       |           static Price;
{                                                   |
    String name;                                    |        // public String GetInfo1()
                                                                public static GetInfo1();//error non-static
    int rollno;                                     |           {                        // variable brand
    int marks;                                      |               return Brand;        // cannot be refe
    static String cname;                            |            }
   +-------------------+                            |         public int GetInfo2()
   |getStudentInfo()   |                            |            {
   |{                  | --->instance method        |               return Price;
   |return name+-+marks|                            |             }
   +-------------------+                            |       public static void main(String[]args)
  +----------------------+                          |              {
  | getCollegeInfo()     |                          |                   Thunderbird t = new Thunderbird();
  | {                    |                          |                        t.Brand = "ROYAL";
  |     return cname;    |  --->static method       |                        t.Price = 165000;
  |     }                |                          |                   System.out.println(t.GetInfo1());
  +-------------------------+                       |                   System.out.println(t.GetInfo2());
  | getAverage()            |                       |               }
  | {                       |                       |
  |     return x+y/2;       |  --->static method    |
  |     }                   |                       |
  +-------------------------------------------------------+
  | getCompleteInfo()                                     |
  | {                                                     | --->instance method 
  |     return name+"----"+rollno+---"+marks+---"+cname;  |
  +-------------------------------------------------------+


"FOR STATIC METHOD IMPLEMENTATION SHOULD BE AVAILABLE WHERE AS FOR ABSTRACT METHOD IMPLEMENTATION IS NOT 
"AVAILABLE HENCE ABSTRACT STATIC COMBINATION IS ILLEGAL FOR METHOD.


SYNCHRONIZED MODIFIER:-
======================

synchronized IS  THE MODIFIER APPLICABLE FOR METHOD AND BLOCKS BUT NOT FOR CLASSES AND VARIABLE.'

IF MULTIPLE THREAD TRYING TO OPERATE SIMULTANEOUSLY ON THE SAME JAVA OBJECT THEN THERE MAY BE CHANCE OF' ,
DATA INCONSISTANCE PROBLEM' THIS IS CALLED RACE CONDITION
WE CAN OVERCOME THIS PROBLEM BY USING SYNCHRONIZED KEYWORD'

IF A METHOD OR BLOCK DECLARE AS SYNORONIZED THEN AT A TIME ONLY ONE THREAD IS ALLOWED TO EXECUTE' 
THAT METHOD OR BLOCK ON THE GIVEN OBJECT SO THAT DATA INCONSISTANCE PROBLEM WILL BE RESOLVED.

BUT MAIN DISADVANTAGE SYNCRONIZED KEYWORD IS IT INCREASEING WAITING TIME OF THREAD' AND CREATE PERFORMANCE,
PROBLEM HENCE IF THERE NO SPACIFIC REQUIRMENT THEN IT IS NOT RECOMMENDED TO USE SYNCRONIZED .

SYNCRONIZED METHOD SHOULD COMPULSORY CONTAIN IMPLEMENTATION WHERE AS ABSTRACT METHOD  DOSEN'T CONTAIN ANY,
IMPLEMENTATION HENCE ABSTRACT SYNCRONIZED IS ILLEGAL COMBINATION OF MODIFIERS FOR METHODS.


