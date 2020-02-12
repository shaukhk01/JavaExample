                             Java Source File Structure:-
                             *************************
'A java porgram can contain any number of classes But at most one class can be declare as public'.
'If there is a public class then name of the program and name of the public class must be matched'.
'otherwise we will get compile time error'.
Example:-
------+----------+
      | class A  |
      | {        |
      | }        |
      | class B  |
      | {        |
      | }        |
      | class C  |
      | {        |
      +----------+
case1:
-----
'If there is not public class then we can use any name of program and there are no restriction'.
Example:-
--------
        A.java
        B.java
        C.java
        Duraga.java

case1:
-----
If class B is public then name of the program should be B.java otherwise we will get compile time error.
saying.
    CE:class B is public,should be declared in a file name B.java


case1:
-----
If class B and C declared as public and name of the program is B.java then we will get compile time error.
saying.
        CE:class C is public,should be declared in a file named C.java
Example:-
--------
        class A
        {
        public static void main(String[]args)
        {
        System.out.println("A class main);
        }
        }
        class B
        {
        public static void main(String[]args)
        {
        System.out.println("B class main");
        }
        }
        class C
        {
        public static void main(String[]args)
        {
        System.out.println("C class main");
        }
        }
        class D
        {

        }
        $>java A
        o/p:A class main
        $>java B
        o/p:B class main
        $>java C
        o/p:C class main
        $>java D
        CE:noSuchMethod
        $>java Durga
        CE:NoClassFoundError:dourga
conculusion:-
-----------
1:"WhenEver we are compiling a java program for every class present in the program a seprate .class file is 
   generated
2:"We can compile A java program [java source file]But we can run a java .class File.
3:"Whenever we are executing a java class the corresponding main method will be executed.
4:"If the class dosn't contain main method then we will get run time Exception saying:NoSuchmethoError:main
5:"If the corresponding .class file is not available then we will get run time Exception saying:NoclassDefFoundError.

6:It is not recomended to declare multiple classes in a single source file,It is highly recomended to declare only one
  per source file and name of the program we have to keep as class name.
  The main advantage of this approach is readabilities and maintanabilities will be improved.

import statement:-
================
Example:-
--------
         class Test
         {
         public static void main(String[]args)
         {
            ArrayList l = new ArrayList();
            }
            }
            CE:cannot find symbol
               symbol:arrayList
               Location:class Test
==>we can solve this problem by using fully-qulified-name.
        java.util.ArrayList l = new java.util.ArrayList()

    The problem with uses of fully-qualified-name is it increases length of code and reduced readabilities.
    We can solve this problem by using import statement.
    WhenEver we are writing import statement it is not required to used fully-Qualified-name Every time we can use
    short name directly.

Example:-
--------
        import java.util.ArrayList;

        class Test
        {
            public static void main(String[]args)
            {
            ArrayList l = new ArrayList();
            }         short-cut
          } 
    Hence import statement access typing shortcut 

Types of Import Statement:-
=========================
There are two types of import statement.
1:Explicit Class Import.
2:Implicit Class Import.

Explicit Class import:-
----------------------
Example:-
--------
        import java.util.ArrayList;
It is highly recomended to used Explicit class import Because it improve readabilities of the code.        
Best suitable for Hi-Tec-City where readabilities is important 

Implicit Class import:-
----------------------
Example:-
--------
        import java.util.*
Not recomended to used Because it reduces readabilities of the code.
Besut suitable for Amerpeet where Typing is important.

Q:which of the following import statement are meaningful.

                import.java.util.ArrayList;  [valid]
                import.java.util.ArrayList.*;[invalid]

                import java.util.*;        [valid]
                import java.util;          [invalid][after package name .* or class name only allowed not;]

>Consider the following code. 
                class myObject extends java.rmi.UnicastRemoteOjbect
                {

                }
  The code compile fine Even thow we are not writing import statement Because we used fully qualified name.
note:-
-----
WhenEver we are using fullyqualified name it is not required to write import statment similarly whenever we
are writing import statement it is not required to used fully-qualified name.

import java.util.*;
import java.sql.*;
class Test
{
    public static void main(String[]args)
    {
        Date d = new Date();
        }
        }CE:reference to Date is ambiguous

note:-
-----
Even in the case of list also we may get same ambiguities problem Because it is available in both util and 
java.sql package

==>while resolving class name compiler will always gives the precedence in the following order.
1:Explicit class import
2:class present in current working directory[default packages]
3:Implicit class import

Example:-
--------
        import java.util.Date;
        import java.sql.*;

        class Test
        {
            public static void main(String[] args)
            {
                Date d  = new Date();
                System.out.println(d.getClass().getName());
                }
            }
In the above example util packages Date got considerd.

==>WhenEver we are importing a java packages all classs and interfaces present in that packages By default 
   available. 
But not subpackage classes If we want to use subpackege class compulsories we should write import statement until     subpackege level.
Example:-
--------
        java ---->package 
          |
          +--util ---->subpackage
          |
          +--regex --->package
          |
          |
          +--Pattern --->class

   To used pattern class in our program which import statement is required.
Example:-
--------
        1:import java.*;
        2:import java.util.*;
        3:import java.util.regex.*;[valid]
        4:No import reuired

==>All class and interfaces present in the following packages or by default available to Every java program.
   hence we are not required to write import statement.
    
        1:java.lang package
        2:Default package[package pwd]

==>Import statement is totaly compile time related concept ,if more no of inputs then more will be the compile time,
   But there is no effect on Execution time within run time.

Q:Difference Between C-language #include<> and Java-language import statement?

        In the case of c-language #include<> all input/output header files will be loaded at beggining only
        [at Translation Time]hence it is static include<>

        But in the case of java import statement no.class will be loaded at the beggining whenEver we are 
        a particular class  then only corresponding .class file will be loaded this is like dynamic include
        or load on Demand or Load on Fly.

note:-
-----
1.5V new features 
        1:for-each loop
        2:var-arg method
        3:Autoboxing& Autounboxing
        4:Generics
        5:Convarient return type
        6:Queus
        7:Annotations
        6:enum
        7:static import

static import:-
=============
1:introduce in 1.5V
2:According to SUN uses of static input reduces length of code and improve readabilities But according to 
  worldwide
  programming Expert [like us] uses of static import create confusion and reduces readabilities
  hence if there is no spacific requirement then it is not recommended to use static import. 

 Useually we can static members by using class name but whenever we are writing static import we can access static 
members directly without class name.
Example:-
--------
        
                       without static import                   with static import
                    ----------------------------------------+-------------------------
                       class Test                           | import static java.lang.math.sqrt;
                       {                                    | import static java.lang.math.*;
                       public static void main(String[]args)| class Test
                       {                                    |        {
                        System.out.println(Math.sqrt(4));   |        public static void main(String[]args)
                        System.out.println(Math.max(10,20));|              {
                        System.out.println(math.random());  |              System.out.println(sqrt(4));
                        }                                   |              System.out.println(max(10,20));
                        }                                   |              System.out.println(random());
                                                                            }

***********************************************************************************************************                                                                            
Q:Explain About System.out.println?                  | 
                                                     | class System 
    class Test                                       |  {
    {                                                |      static PrintStream out;
    static String s = "java";                        | 
    }                                                |   }
 +--------------------+                              | +-------------------------+
 |  Test.s.length()   |                              | |  System.out.println();  |
 +---^---^----^----------+                           | +----^-----^-----^-----------+
     |   |    |                                      |      |     |     |<----- --------------------println is method-
     |   |    +----------------+-----------------+   |      |     +-----+---+-----------------+     present in 
+----------+-+                 | |lenght() is    |   |      |               |out is static    |     printStream class
|Test is   |  |s is static      |  method present |  |System is class       |variable present |
|class name|   varible present  |  String class   |  | present in java.lang |in System class  +--+
+----------+  in Test class of +-----------------+   |                      |Type is PrintStream |
              the type                               |                      +--------------------+
              java.lang.string                       |

==>out is static variable present in System class hence we can access by using class name System but whenEver we are
   writing static import it is not required to used class name and we can access directly.
Example:-
--------
        import static java.lang.System.out;

        class Test
        {
        public static void main(String[]args)
        {
        out.printl("Hello");
        out.println("Hello");
         }
        }
    

Example:-
--------
        import static java.lang.Integer.*;
        import static java.lang.Byte.*;

        public class Test
        {
              System.out.println(MAX_VALUE);
            }
        }CE:reference to MAX_VALUE is ambiguous

==>While resolving static members compiler always consider the precedence in the following order.
   1:current class static members.
   2:Explicit static import.
   3:Implicit static import.

Example:-
--------
       import static java.lang.Integer.MAX_VALUE;
       import static java.lang.Byte.*;

       class Test
       {
        static int MAX_VALUE=999;
        public static main(String[]args);
        {
            System.out.println(MAX_VALUE);
        }
        }o/p:999;
==>If we comment line one then Explicit static import will be considerd and hence Interger class MAX_VALUE will be 
   considerd in this case the output is.
                                o/p:2147483647
==>If we comment both line one and two then implicit static import will be considerd in this case output is.
                o/p:127[Byte class MAX_VALUE]

Normal import                          |     static import
---------------                        |     -------------- 
  1:Explict import                     |    1:Explicit static import:
  syntax:-                             |     Syntax:- import static packagename.staticmember;
  ------                               |               import static java.lang.math.sqrt;
        eg:import java.util.ArrayList; |               import static java.lang.System.out;
  2:Implicit import                    |
    syntax:                            |    2:Implict static import
    ------                             |    syntax:-
         eg:import packagename.*;      |    ------
                                       |          import static packagename.classname.*;
                                       |          eg:
                                       |            import static java.lang.math.*;
                                                    import static java.lang.System.*;

Q:which of the following import statement are valid?.

    import  java.lang.Math.*;[invalid]          
    import static java.lang.Math.*;[valid]
    import java.lang.Math.sqrt;[invalid]
    import static java.lang.Math.sqrt();[invalid]

    import java.lang.Math.sqrt.*;[invalid]
    import static java.lang.Math.sqrt;[valid]
    import java.lang;[invalid]
    import static java.lang;[invalid]
    import java.lang.*;[valid]

    import static java.lang.*;[invalid]

==>Two packages contains A class or interface with same name  is a very rare,and hence ambiguities problem is also
   very rare in normal import.
   But two classes or interfaces contain a variable or method with same name is very common and hence ambiguities,
   problem is also very common problem in static import.

===>uses of static import reduces readabilities and creates confusion and hence if there is no spacific requirement
    then it is not recomended to use static import.

Q:Difference Between Normal import and Static import.
    
   1:We can use normal import to import classes and interfaces of a particular packages. 
   2:WhenEver we are using Normal import it is not required to used fully-qualified-name and we can use 
   short_name directly.
   3:we can use static import to import static member of a particular class or interface.
   4:WhenEver we are writing static import it not required to used class name to access static members and we can acce    ss directly.

---------------------------------------------------------------------------------------------------------

Packages:-
=========
It is an encapsulation mechanism to group related classes an interfaces into a single unit,which is nothing but 
package.
Example:-
--------
        All classes an interfaces which are required for database operation or grouped into a single package        which is nothing but java.sql packages.
Example:-
        All classes an interfaces which are useful for file i/o operation or grouped into a seprate packages        which is nothing but java.io packages.
+-------------------------------------------------------------------------------+
|   *The main advantages of package are                                         |
|   1:To resolve nameing conflict[i.e unique identification of our component]   |
|   2:It improve modularity of the application                                  |
|   3:It improve maintablities of the application.                              |
|   4:It provide security for our component.                                    |
+-------------------------------------------------------------------------------+
==>There is one universally accepted naming convention for packages i.e to use internet domain name in reverse.
Example:-
--------
        com.icicibank.loan.housing.Account
        ---- - ------ ---- ------- -------[class name]
        client domain  |   [sub module] 
        name           +-[module]
                          name
Example:-
--------
        package com.durgasoft.scjp;

        public class Test
        {
            public static void main(String[]args)
            {
                System.out.println("package demo");
                }
        }
        $>javac Test.java
        [generated .class file will be placed in current working directory in that Test.class]
                        
                          *************       
                      ****  CWD        ****   
                    **       |             ** 
                    *        +---Test.class * 
                    **       |             ** 
                      ****   |         ****   
                          *************       
        $>javac -d . Test.java
                ----
                [destination to place generated .class file]                            

        Generated .class file will be placed in corresponding package structure. 

                        CWD
                         |
                         |
                         +---com
                         |    |
                         |    +---durgasoft
                         |    |      |
                         |           +------scjp
                                     |       |
                                     |       +-----Test.class
                                             |
        >if the corresponding package structure not already available then this command itself will create 
         corresponding package structure.

        >As destination instead of we can take any valid directory name.
        $>javac -d F:Test.java
            
                F:
                |
                +----com
                |     |
                |     +---durgasoft
                      |       |
                      |       |
                              +-----scjp
                              |      |
                              |      |
                                     +-----Test.java
                                     |
                                     |
        >If the spacified directory is not already available then we will get compile time error.
        $>javac -d Z: Test.java[invalid]
        if Z:not available then we will get compile time error saying directory not found Z:

        >At the time of execution we have to use fully qualified name.
        >java com.durgasoft.scjp.Test

           o/p:Package demo

conculusion1:-
-----------+---------------------------------------------------------------------------------------------+
           |In any java source file there can be at most one package statement i.e more then one package |
           |statement is not allowed otherwise we will get compile time error.                           |
           |Example:-                                                                                    |
           +---------------------------------------------------------------------------------------------+
                    package pack1;
                    package pack2
                    public class A
                    {

                    }
                    CE:interface or enum expected
conculusion2:
-------+---------------------------------------------------------------------------------------------------+
       |In any java program the first non comment statement should be package statement [if it is available|        otherwise we will get compile time error.
Example+---------------------------------------------------------------------------------------------------+
--------
        import java.util.*;
        package pack1;
        public class A
        {


        }
        CE:class,interface or enum expected

Q:The following is valid java source file structure.
+----------------------------------------+
|       package statement;               |
|       import statement;                |
|       class/interface/enum declarations|
+----------------------------------------+[order is important]
note:-                                          
"An empty source file is a valid java program hence the following are valid java source file.

       +--------+   +--------------+    +---------------------+
       |        |   |package pack1;|    | import java.util.*; |
       |        |   |              |    |                     |
       +--------+   +--------------+    +---------------------+
       Test.java    Test.java            Test.java

          +--------------------+  +--------------+
          |packagepack1;       |  | class Test   |
          |import java.util.*; |  | {            |
          |                    |  |              |
          +--------------------+  | }            |
         Test.java                +--------------+
                                  Test.java


