class A
{
    private void m1(int a)
    {
        System.out.println("A-method");
    }
}
class B extends A
{
    public void m1(int b)
    {
        System.out.println("B-method");
    }
}
class Execute
{
    public static void main(String[]args)
    {
        A o = new B();
        o.m1(10);
        
    }
}


