package com.Constructor;

public class ExtendsSuper extends Person
{
    public  String name;
    ExtendsSuper()
    {
        System.out.println("ExtendsSuper Created");
    }
    public ExtendsSuper(int de , String n)
    {
        super(de);
        this.name = n;
        System.out.println("ExtendsSuper Created");
    }
}
