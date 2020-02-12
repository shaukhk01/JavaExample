class ExceptionStatment
{
    public static void main(String[]args)
    {
        System.out.println(m1());//calling m1()method
    }
        public static int m1()
        {
        try
        {
            System.out.println(10/0);
           // return ;//this will return at last after finally block.
           return 77;
           // System.out.println(10/0);//unreachableStatment
        }
        catch(ArithmeticException e)
        {
            //System.out.println("catch block");
            return 88;
        }
        finally
        {
            System.out.println("finally block");
            return 99;
        }
        }
    }
