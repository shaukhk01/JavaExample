class Parent
{
    public void m1(int ... i)
    {System.out.println("overriden");
    }
}
class Child extends Parent
{
    public void m1( int i)
    {System.out.println("overloading");
    }
    public static void main(String[]args)
    {
        Parent p1= new Parent();
        p1.m1(10);
        Child c = new Child();
        c.m1(10);
        Parent p2 = new Child();
        p2.m1(10);

}
}
