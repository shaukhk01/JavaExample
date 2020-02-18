
Encapsulation:-
==============

 +---------------------------------------------------------------------------------------------------------+
 |  *ENCAPSULATION IS THE ONE WAY TO ACHIEVE ABSTRACTION IN OBJECT ORIENTED PROGRAMMING.                   |
 |  *ENCAPSULATION IS THE PROCESS OF HIDDING OBJECT PROPERTIES FROM OUTERWORLD AND PROVIDE  METHOD TO ACCES|
 |   THEM                                                                                                  |
 |  *BIND TOGETHER THE DATA AND FUNCTION THAT WORK ON IT                                                   |
 |  *ENCAPUSLATION HIDE A OBJECT DATA SO IT IS ALSO CALLED DATA HIDDING                                    |
 +---------------------------------------------------------------------------------------------------------+

WE CAN ACHEIVE ENCAPSULATION BY DECLAREING PRIVATE CLASS FILEDS OBJECT OR ATTRIBUTE
AND DEFINE PUBLIC GETTTER(),SETTER()"[refer:Encapsulation.java]

ADVANTAGE OF ENCAPSULATION:-
===========================
THE ENCAPSULATION CODE IS LOSSELY COUPLED.WE CAN CHANGE THE CLASS VARIABLE NAME WITHOUT
EFFECTING THE CLIENT PROGRAM.

COUPLING:-
=========
THE DEGREE OF THE DEPENDENCES BETWEEN THE COMPONENT[CLASS]IS CALLED COUPLING.

If dependences is more then tighly coupled
If dependences is less then loosly coupled

Example:Tightly coupled:
------------------------
class A
{ static int i = B.j;
}
class B
{
    static j = C.k;
}
class C
{
    static k = D.m;//here you can see this program is tighly coupled because dependence is more.
}

*THERE ARE TWO TYPES OF COUPLED:
================================
1:Tightly  Coupled:-tightly coupling is not good programming practice.
                    tightly coupling means the two classes often changes
                    together.
Example:-
--------
class Subject
{
    Topic t = new Topic();
    public void startReading()
    {
        t.understand();
    }
}
class Topic
{
    public void understand()
    {
        System.out.println("Tightly coupled concept");
    }
}/*in this program Subject class dependent on the Topic class
  * Subject class is tightly coupled with Topic class
  * it means if any change in Topic class required subject class to change.
  * Example for if Topic class understand method  change to Goit() then
  * you have to change in Subject class startReading method() to Goit()
  */
class Volume
{
    public static void main(String[]args)
    {
        Box b = new Box(5,5,5);
        System.out.println(b.Volume());
    }
}
class Box
{
    public int volume;
    Box(int length,int width,int height)
    {
        this.volume = length * width * height;
    }
}/*here you can see strong inter-dependence between both the classes.
  *if there is any changes in Box class then they  reflects in the 
  *result of Class volume.
  */
  
2:LOOSELY  COUPLED:-ONE INTERFACE REFERENCE VARIABLE CAN HOLD DIFFERENT TYPE OF IMPLEMENTATION CLASS.
  Example:-
  --------IF YOU CHANGE YOUR SHIRT THEN YOU ARE NOT TO FORCED CHANGE YOUR BODY.
          WHEN YOU CAN DO THAT THEN YOU HAVE LOOSLING COUPLING.

public interface Topic
{
    void understand();
}
class Chapter1 implements Topic
{
    public void understand()
    {
        System.out.println("You can Start Chapter1 Now");
    }
}
class Chapter2 implements Topic
{
    public void understand()
    {
        System.out.println("You can Start Chapter2 Now");
    }
}
public class Subject
{
    public static void main(String[]args)
    {
        Topic t = new Chapter1();
        t.understand();
    }
}/*above you can see Chapter1 and Chapter2 object are loosely coupled 
  *it means Topic is an interface. 
  */

class Volume
{
    public static void main(String[]args)
    {
        Box b = new Box(5,5,5);
        System.out.println(b.getVolume());
    }
}
final class Box
{
    private int volume;
    Box(int length ,int width,int height)
    {
        this.volume =length * width * height;
    }
    public int getVolume()
    {
        return volume;

} +-------------------------------------------------------------------------+
} | /*above program there is no dependence between both the class.          |
  |  *if we change anything in the Box classes then we don't have           |
  |  *to change anything in Volume class.                                   |
  |  */                                                                     |
  |                                                                         |
  |                 /*Tight coupling does not provide concept of interface  |
  |                  * loose coupling provide concept of interface.         |
  |                  */                                                     |
  +-------------------------------------------------------------------------+

COHESION:-
===========

"For Every Class[component]clear Well Defined Functionality is Defined
"COHESION REPRESENT HOW ALL ABOUT SINGLE CLASS IS DEFINED
"Class is Designed with a Single,Well-Focused Purpose.
Example:-
---------/*suppose we have a class that multiply two number
          *but same class also display pop window for result
          *this is the example of low cohensive.
          *but it is nolonger uses in object oriented
          */

High Cohesion:-
=============
This Cohesion is Alway Good Programming Practice It Has Several Advantages. 
"WITHOU EFFECTING REMAINING CLASS WE CAN MODIFY ANY CLASS INHACEMENT BECOMES EASY.
"HIGH COHESION IS WHEN YOU HAVE A CLASS DOES A WELL DEFINED JOB.
Example:-
----------
class Multiply
{
    int a=10;
    int b=20;
    int compute;
    Multiply(int i,int j)
    {
        this.compute = i*j;
    }
}
class Display
{
    public static void main(String[]args)
    {
        Multiply m = new Multiply();
        System.out.println(m.compute);
    }
}
//Example of High Cohensive
class Name
{
    String name;
    public String getName(String name)
    {
        this.name = name;
        return name;
    }
}
class Age
{
    int age;
    public int getAge(int age)
    {
        this.age = age;
        return age;
    }
}
class Number
{
    int number;
    public int getNumber(int number)
    {
        this.number = number;
        return number;
    }
}
class Execute
{
    public static void main(String[]args)
    {
        Name n = new Name();
        System.out.println(n.getName("Annie");
        Age  a = new Age();
        System.out.println(a.getAge(20));
        Number m = new Number();
        System.out.println(m.getNumber(402205);
    }
}

        
