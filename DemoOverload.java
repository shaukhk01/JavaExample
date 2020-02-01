class OverloadDemo
{
    public void test()
    {
        System.out.println("No parameter");
    }
    public void test(int a)
    {
        System.out.println("a: "+a);
    }
    public void test(int a,int b)
    {
        System.out.println("a b: "+a+"  "+b);
    }

    public double test(double a,double b)
    {
        System.out.println("double: "+a+"  "+b);
        return a*b;
    }
}
class Overload
{
    public static void main(String[]args)
    {
        OverloadDemo ob = new OverloadDemo();
        double result;
        ob.test();
        ob.test(10);
        ob.test(10,20);
        ob.test(3.5,5.5);

        result = ob.test(3.5,5);
    }
}


