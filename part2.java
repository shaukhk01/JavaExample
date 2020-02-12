                               +-----------------------+
                               |  CLASS LEVEL MODIFIER |
                               +-----------------------+
***************************************************************************************************

/*WHEN EVER WE ARE WRITING OUR OWN CLASSES WE HAVE TO PROVIDE SOME INFORMATION ABOUT OUR CLASS TO THE,
 *JVM LIKE:-WHETHER THIS CLASS CAN BE ACCESSABLE FROM ANY WHERE OR NOT WHETHERE CHILD CREATION IS POSSIBLE 
 *OR NOT,WHETHER OBJECT CREATION IS POSSBLE OR NOT ETC WE CAN SPECIFY THIS INFORMATION BY USING APPROPRIATE 
 *MODIFIER
 */
***************************************************************************************************                               
By default public class modifier are:
1:public
2:default
3:abstract 4:final
5:strictfp

*But for inner classes the applicable modifiers are 

public modifier ++
               +------------------+
               |private,protected |
               |static            |
               +------------------+

private class Test
{
    public static void main(String[]args)
    {
        System.out.println("Hello world");
        }
}
ERROR:modified private not allowed here.
------------------------------------------------------------------------------------------------------------

                     ACCESS SPECIFYER VS ACCESS MODIFIER
                     ===================================
public,private protected,default are considerd as spacifiers except these remaining are considered,
as modifiers But this rule is applicable only for old languages like c++ But not in JAVA
In java All are consider as modifier only there is no word like spacifier

private class Test
{
    }
ERROR:modifier private not allowed here


PUBLIC CLASSES:-
================
"IF A CLASS DECLARE AS PUBLIC THEN WE CAN ACCESS THAT CLASS FROM ANY WHERE 

FINAL MODIFIER:-
===============

"FINAL IS MODIFIER APPLICABLE FOR CLASSES,METHOD,AND VARIABLE 

FINAL METHOD:-
=============
        CHILD CLASS NOT HAVE TO REDEFINED FINAL METHOD OF PARENT CLASS IMPLEMENTATION IS KNOWNS AS FINAL MET        -HOD.WHAT EVER PARENT CLASS  HAS BY DEFAULT AVAILABLE TO THE CHILD THROUGH INHERITANCE IF THE CHILD          NOT SATISFIED WITH,PARENT METHOD IMPLEMENTATION THEN CHILD IS ALLOWED REDEFINED THAT METHOD BASED 
         ON ITS REQUIREMENT THIS PROCESS IS CALLED OVERRIDING 

Example:

class P
{
public void properties()
{
sop("cash+land+gold);
}
public final void marray()    
{
    sop("Annie");           
  }
}
class c extends P               *******************************          
{                       ********:marry() in c cannot override  ********  
public void marry()  ***         marry() in p; override method         ***
                        ********   in final                    ********  
{                               *******************************          
sop("can not change");
}
}

FINAL CLASS:-;
==============
"IF A CLASS DECLARE AS FINAL WE CANT EXTENDS FUNTIONALITY OF THAT CLASS I.E IS WE CAN'T CREATE,
"CHILD CLASS FOR THAT CLASS I.E INHERITANCE IS NOT POSSIBLE FOR FINAL CLASSES

EXAMPLE:-

final class P
    {


    }
class C extends P
{

} ERROR:cannot inherit from final 
note1:
EVERY METHOD PRESENT INSIDE FINAL CLASS IS ALWAYS FINAL BY DEFAULT BUT EVERY VARIABLE PRESENT INSIDE OF 
FINAL CLASS NEED NOT BE FINAL 
EXAMPLE:-
--------
final class P
 {
    static int x=10;
    public static void main(String[]args)
    {
        x =777;
        System.out.println(x)"777[here you can see variable is changd]
        }
 }

"THE MAIN ADVANTAGE OF FINAL KEYWORD IS WE CAN ACHEVED SECURITY AND WE CAN PROVIDE UNIQUE IMPLEMENT-TATION 
"BUT. 
THE MAIN DISADVANTAGE OF FINAL KEYWORD IS WE ARE MISSING KEY BENIFIT OF OOP'S :INHERITANCE(BECAUSE OF FINAL CLASS)AND POLYMORPHISM BECAUSE OF FINAL METHOD HENCE IF THERE IS NO SPECIFIC REQUIRE-MENT THEN IT IS NOT 
RECOMMENDED TO USE FINAL KEYWORD

****************************************************************************************************
                               +---------------------+
                               |  ABSTRACT MODIFIER  |
                               |  =================  |
                               +---------------------+

"Abstract is modifier applicable for class and method But not for variables
Even though we don't know about implementation still we can declare a method with abstract modifier
"i.e for abstract method only declare is available but not implementation.
hence abstract method declaration should ends with semicoln [;]

EXAMPLE:
abstract public void m1();-->valid
abstract public static void m2() --> not valid

"child is responsible to provide implementation for parent class abstract method 
EXAMPLE:
--------             
1:                   
abstract class vehicle
{                    abstract public int  getwheel();
}                    
 "above only declara ion not implementation
2:                   
"Below all are implementation about abstract class method in child class
class Bus extends vehicle
{                          +--------------------------------------------+
    public int getwheel()  |getwheel() method belong to abstract  method|
    {                      +--------------------------------------------+
            return 7 
      }              
}                    
3:                   
class Auto extends vehicle
{
    public int getweel()
    {
       return 3;
 }
}

"BY DECLARING ABSTRUCT METHOD IN THE PARENT CLASS WE CAN PROVIDE GUIDE LINE TO THE CHILD CLASSES.
"SUCH THAT WHICH METHOD COMPULSORY CHILD HAS TO IMPLEMENT 

*ABSTRACT METHOD NEVER TALK ABOUT IMPLEMENTATION IF ANY MODIFIER TALKS ABOUT IMPLEMENTATION THEN,
*IT FORMS ILLEGAL COMBINATION WITH ABSTRACT MODIFIER. 

THERE ARE  FOLLOWING OF VARIAOUS ILLEGAL COMBINATION OF MODIFIERS FOR METHOD WITH RESPECT TO ABSTRACT.

abstract class:-
===============
*FOR ANY JAVA CLASS IF WE ARE NOT ALLOWED TO CREATE AN OBJECT 
"[BECAUSE OF PARITAL IMPLEMENTATION OR NOT COMPLETE INFORMATION]" 
*SUCH OF TYPE OF CLASS WE HAVE TO DECLARE WITH ABSTRACT MODIFIER
*I.E FOR ABSTRACT CLASS INSTANCETATION IS NOT POSSIBLE

EXAMPLE:-
--------

abstract class Test
{
public static void main(String[]args)
{
    Test t = new Test()
    }
} ERROR;Test is abstract cannot be instantiated

                  +---------------------------------------+
                  |  ABSTRACT CLASS VS ABSTRACT METHOD:-  |
                  |  ==================================   |
                  +---------------------------------------+
1:IF A CLASS CONTAIN AT LEAST ONE ABSTRACT METHOD THEN COMPULSORY WE SHOULD DECLARE CLASS AS ABSTRA-T 
  OTHERWISE WE WILL GET COMPILE TIME ERROR.

REASON:-
-------
"IF A CLASS CONTAIN ONE ABSTRACT METHOD THEN IMPLEMENTATION IS NOT COMPLETE AND HENCE IT IS,
"NOT RECOMMENDED TO CREATE OBJECT TO RESTRICT OBJECT INSTANTATION COMPULSORY WE SHOULD DECLARE,
"CLASS AS ABSTRACT
****************************************************************************************************
"EVEN THOW CLASS DOESN'T CONTAIN ANY ABSTRACT METHOD STILL WE CAN DECLARE CLASS AS ABSTRACT IF,
"WE DON'T WANT INSTANCETIATION I.E ABSTRACT CLASS CAN CONTAIN 0 NUMBER OF METHOD ALSO
****************************************************************************************************
EXAMPLE:
HTTPSERVERLET CLASS IS ABSTRACT BUT IT DOSEN'T CONTAIN ANY ABSTRACT METHOD
EVERY ADAPTER CLASS IS RECOMENDED TO DECLARE AS ABSTRACT BUT IT DOSEN'T CONTAIN ANY ABSTRACT METHOD

EXAMPLE:
class P1
{
    public void m1();
    }ERROR:missing method body or declare abstract

Class p2
{
    public abstract void m1()
    {
    }
}ERROR:abstract method cannot have body

class P3
{
    public abstract void m1();
}ERROR:P3 is not abstract and does not override abstract method m1() in p3
****************************************************************************************************
"IF WE ARE EXTENDING ABSTRACT CLASS THEN FOR EACH AND EVERY ABSTRACT METHOD OF PARENT CLASS WE
"SHOULD PROVIDE IMPLEMENTATION OTHERWISE WE HAVE TO DECLARE CHILD CLASS AS ABSTRACT IN THIS CASE,
"NEXT LEVEL CHILD CLASS IS RESPONSIBLE TO PROVIDE IMPLEMENTATION [refer:/java/Abstract.java]
****************************************************************************************************
class P
{
    public abstract void m1();
    public abstract void m2();
    }
class C extends P
{
    public void m1(){}
    }ERROR:C is not abstract and doesn't override abstract method m2() in P
                          +------------------------+
                          |  Final VS abstract:-   |
                          +------------------------+

"ABSTRACT METHOD COMPULSORY WE SHOULD OVERRIDE IN CHILD CLASSES TO PROVIDE IMPLEMENTATION WHERE AS WE CAN'T
"OVERRIDE FINAL METHOD HENCE FINAL ABSTRACT COMBINATION IS ILLEGAL COMBINATION FOR METHODS
****************************************************************************************************
"FOR FINAL CLASSES WE CAN'T CREATE CHILD CLASS WHERE AS FOR ABSTRACT CLASSES WE SHOULD CREATE CHILD CLASS,
"TO PROVIDE IMPLEMENTATION HENCE FINAL ABSTRACT COMBINATION IS ILLEGAL FOR CLASSES
****************************************************************************************************
"ABSTRACT CLASS CAN CONTAIN FINAL METHOD WHERE AS FINAL CLASS CAN'T CONTAIN ABSTRACT METHOD


abstract class Test           | final class Test
{                             | {   
    public final void m1()    |   public abstract void m1();
    {                         | }==>not valid
    }                         |
}==>valid                     |
                              |
note2:
"IT IS HIGHLY RECOMMENDED TO USE ABSTRACT MODIFIER BECAUSE IT PROMOTS SEVERAL OOPS FEATURES LIKE INHERITANCE  AND POLIMORPHISM.
****************************************************************************************************
                     +---------------------------------+
                     | STRICTFP[STRICT FLOATING POINT] |
                     +---------------------------------+
****************************************************************************************************
1:Introduced in 1.2V version
2:WE CAN DECLARE STRICTFP FOR CLASSES AND METHOD BUT NOT FOR VARIABLE

"USUALLY THE RESULT OF FLOATING POINT ARTHMATIC IS VARIED FROM PLATFORM TO PLATFORM IF WE WANT PLATFORM,
"INDEPENDENT RESULT FOR FLOATING POINT ARITHMATIC THEN WE SHOULD GO FOR STRICTFP MODIFIER

STRICTFP METHOD:-
================
IF A METHOD DECLARE AS STRICTFP ALL FLOATING POINT CALCULATION IN THAT METHOD HAS TO FOLLOW IEEE 754STANDARD
SO THAT WE WILL GET PLATFORM INDEPENDENT RESULT. 

"ABSTRACT MODIFIER NEVER TALK ABOUT IMPLEMENTATION WHERE AS STRICTFP METHOD ALWAYS TALK ABOUT IMPLEMENTATION
"HENCE ABSTRACT STRICTFP COMBINATION IS ILLEGAL FOR METHOD

STRICTFP CLASS:-
==============
IF A CLASS DECLARE AS STRICTFP THEN EVERY FLOATING POINT CALCULATION PRESENT IN EVERY CONCERET METHOD HAS ,
TO FOLLOW IEEE 754 STANDARD SO THAT WE WILL GET PLATFORM INDEPENDENT RESULTS[refer:strictfp.java] 

"WE CAN ABSTRACT STRICTFP COMBINATION FOR CLASSES I.E ABSTRACT STRICTFP COMBINATION IS LEGAL FOR CLESSES
"BUT ILLEGAL FOR METHOD 

EXAMPLE:-
abstract strictfp class Test ==>allowed
{
    abstract strictfp void m1()==>not allowed
}
abstract strictfp m1(); is illegal combination 

****************************************************************************************************
                           +------------------------------------------------------+
                           | MEMBER MODIFIERS(METHOD OR VARIABLE LEVEL MODIFIERS)  |
                           +------------------------------------------------------+
****************************************************************************************************                       
1:-PUBLIC MEMBER:-
=================

"IF A MEMBER DECLARE AS PUBLIC THEN WE CAN ACCESS THAT MEMBER FROM ANYWHERE  BUT CORRESPONDING SHOULD BE
"VISBLE i.e IS BEFORE CHECKING MEMBER VISIBILITY WE HAVE TO CHECK CLASS VISIBILITY.
****************************************************************************************************
Example:-
--------                                     |  packages pack2;
package pack1;                               |  import pack1.A
                                             |  class B
class A                                      |  {
{                                            |     public static void main(String[]args)
    public  void m1()                        |       {
        SOP('A CLASS METHOD');               |              A a = new A();  
 }                                           |              a.m1();}}
$>java -d A.java==>allowed                   |        $>javac -d B.java==>Error
                                             |

                                            
*IN THE ABOVE EXAMPLE EVEN THOW M1 METHOD IS PUBLIC WE CAN'T ACCESS FROM OUTSIDE PACKAGES BECAUSE ,
*CORRESPONDING CLASS A IS NOT PUBLIC i.e IF BOTH CLASS AND METHOD ARE PUBLIC THEN ONLY WE CAN ACCESS THE ,
*METHOD FROM OUTSIDE PACKAGES 
****************************************************************************************************
2:DEFAULT MEMBERS:-
=================

"IF A MEMBER DECLARE AS DEFAULT THEN WE CAN ACCESS THAT MEMBER ONLY WITHIN THE CURRENT PACKAGES 
"FROM OUTSIDEOF THE PACKAGES WE CAN'T ACCESS HENCE DEFAULT ACCESS KNOWN AS PACKAGES LEVEL ACCESS 

3:PRIVATE MEMBERS:-
=================

"IF A MEMBER IS PRIVATE THEN WE CAN ACCESS THAT MEMBER ONLY WITHIN THE CLASS i.e FROM OUT SIDE OF THE CLASS
"WE CAN'T ACCESS 

*ABSTRACT METHOD SHOULD BE AVAILABLE TO THE CHILD CLASS TO PROVIDE IMPLEMENTATION WHERE AS PRIVATE METHOD,
*ARE NOT AVAILABLE TO THE CHILD CLASSES TO PROVIDE IMPLEMENTATION.
*HENCE PRIVATE ABSTRACT COMBINATION IS ILLEGAL FOR METHOD

4:PROTECTED MEMBERS:(THE MOST MISSUNDERSTOOD MODIFIER IN JAVA):
====================------------------------------------------

"IF A MEMBER DECLARE AS PROTECTED THEN WE CAN ACCESS THAT MEMBER ANYWHERE WITHIN THE CURRENT PACKAGES BUT,
"ONLY IN CHILD CLASSES OF OUTSIDE PACKAGES 
+------------------------
protected =default+kids  
+------------------------
*WE CAN ACCESS PROTECTED MEMBER'S WITHIN THE CURRENT PACKAGES ANYWHERE EITHER BY USING PARENT REFERENCE OR
*BY USING CHILD REFERENCE.
"BUT WE CAN ACCESS PROTECTED MEMBERS IN OUTSIDE PACKAGES ONLY IN CHILD CLASSES AND WE SHOULD USED CHILD 
"references only.i.e parent references cannot be used to access protected members' from outside packages.

Example:-
--------                                                    |package pack2;
                                                            |import pack1.A
packages pack1;'this will create auto'                      |class C extends A
                                                            |{
public class A                                              |   public static void main(String[]args)
{                                                           |     {
    protected void m1()                                     |           A a = new A();
    {                                                       |             a.m1(); ==>not allowed error
    System.out.println("this most missunderstood modifier");|           C c = new C();
    }                                                       |              c.m1(); ==>Allowed
                                                            |           A a1 = new c();
}                                                           |             a1.m1(); ==>not allowed
class B extends A                                           |
{                                                           |
  public static void main(String[]args)                     |
  {                                                         |
       A a = new A();                                       |
       a.m1(); ==>allowed                                   |
       B b = new B();                                       |
       b.m1(); ==>allowed                                   |
       A a1 = new A();                                      |
       a1.m1();==>allowed                                   |
       }                                                    |
 }
        

"WE CAN ACCESS PROTECTED MEMBER FROM OUTSIDE PACKAGE ONLY IN CHILD CLASSES AND WE SHOULD USE THAT CHILD CLASREFERENCES ONLY FROM D CLASS IF YOU WANT TO ACCESS WE SHOULD USE D CLASS REFERENCES ONLY

Example:-
--------
packages pack2;
import pack1.A;
class C extends A
{
}
class D extends C
{
    public static void main(String[]args)
    {
        A a  = new A();
          a.m1()
        C c  = new C();
          c.m1();
        D d  = new D();
          d.m1()'allowed only this'
        A a1 = new C();
          a1.m1()
        C c1 = new C();
          c1.m1();
    }

}

summary table of private,default,protected,public modifier
/*************************************************************************************^
| visibility                           | private | default | proceted      | public  |
|--------------------------------------+---------+---------+---------------+---------|
| within the same class                | allowed | allowed | allowed       | allowed |
|--------------------------------------+---------+---------+---------------+---------|
| within the child class of same pack  | not     | allowed | allowed       | allowed |
|--------------------------------------+---------+---------+---------------+---------|
| from non-child class of same package | not     | allowed | allowed       | allowed |
|--------------------------------------+---------+---------+---------------+---------|
| from child class of outside packag   | not     | not     | allowed c-ref | allowed |
|--------------------------------------+---------+---------+---------------+---------|
| from non-child class of outside pack | not     | not     | not           | allowed |
***************************************************************************************/

"THE MOST RESTRICTED ACCESS MODIFIER IS PRIVATE

"THE MOST ACCESSABLE MODIFIER IS PUBLIC.
+-------------------------------------------+
|   private < default < protected < public  |
+-------------------------------------------+
"RECOMMENDED MODIFIER FOR DATA MEMBER [VARIABLE IS PRIVATE]
"RECOMMENDED MODIFIER FOR METHOD IS PUBLIC .
