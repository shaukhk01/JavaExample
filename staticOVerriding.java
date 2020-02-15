class Parent
{
    public void m1()//consider as overriden
   // public static void m1()//hidding
    {
        System.out.println("overriden");
    }
}
class Child extends Parent
{
    public void m1()//consider as overriding
    //    public static void m1()//method hidding
    {
        System.out.println("overriding");
    }
    public static void main(String[]args)
    {
        Parent p = new Parent();
        p.m1();
        Child c = new Child();
        c.m1();
        Parent p1 = new Child();
        p1.m1();
}
}

