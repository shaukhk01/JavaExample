package com.Constructor;

class Ex
{
    public static void main(String[]args)
    {
        Person p = new Person();
        ExtendsSuper p2 = new ExtendsSuper(10,"annie");
        System.out.println(p2.deptno);
        System.out.println(p2.name);

    }
}
