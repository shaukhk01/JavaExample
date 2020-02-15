class Parent
{
    public void m1()
    {
        System.out.println("non-private method");
    }
}
class Child extends Parent
{
    public final void m1()
    {
        System.out.println("private");
    }
}
class Test
{
    public static void main(String[]args)
    {
        Child c = new Child();
        c.m1();
        Parent p = new Child();
        p.m1();
        Parent p2 = new Parent();
        p2.m1();
    }
}
