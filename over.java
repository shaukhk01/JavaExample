class Parent
{
    public void m1(int i)
    {
        System.out.println("overriden");
    }
}
class Child extends Parent
{
    public static void m1(int i)//not possible
   // public static void m1()//possible but it will become overloading
    {
        System.out.println("can't overriding");
    }
}
