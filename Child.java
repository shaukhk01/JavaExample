package com.protect;
import java.util.Random;
class Protected
{
   public int empno;
   public String ename;
   public int deptno;

public Protected()
{      //if we taking parameterized constructor then we must declare default constructor
      //with public  otherwise we will get compile time error.  
}
   public Protected(int e,String name,int d)
   {
       empno = e;
       ename = name;
       deptno = d;
   }
   public void info()
   {
       System.out.println("Employee Empno : " +empno);
       System.out.println("Employee Name  : " +ename);
       System.out.println("Employee Deptno:" +deptno);
   }
   public static void disp()
   {
       Random rand = new Random();
       for(int i=0;i<10;i++)
       {
           System.out.println(rand.nextInt(1000));
       }
   }
}
public class Child extends Protected
{
    public Child(int e,String name,int d)
    {
        super(e,name,d);
    }
    public Child()
    {//if we taking parameterized constructor then we must declare default constructor
    }//with public  otherwise we will get compile time error.  
    public static void main(String[]args)
    {
        Child c = new Child(43212,"annie",10);
       // c.info();
       // c.disp();
    }
}
        
