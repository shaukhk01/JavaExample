class ExceptionMethod
{
    public void m1()
    {
        try
        {
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {

            m2();
        }
    }
    public void m2()
    {
        {
            System.out.println("zero division");
        }
    }
    public static void main(String[]args)
    {
        ExceptionMethod o = new ExceptionMethod();
        o.m1();
    }
}


