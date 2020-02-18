package com.Constructor;
public class Person
{
    public  int deptno;
    public Person()
    {
        System.out.println("default");
    }
    public Person(int deptno)
    {
        this.deptno = deptno;//getting value from ExtendsSuper class you have to call this
                            //instance using ExtendsSuper reference only.
        System.out.println("One Argument Constructor is Created");
    }
}
