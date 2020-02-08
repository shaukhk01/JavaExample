class HandleException
{
    public static void main(String[]args)
    {
        try{
        int a = args.length;
        System.out.println("a = "+a);
        int b = 42 / a;
        int c[] = {1};
            c[4]  = 100;
        }
        catch(ArithmeticException e)
        {
            System.out.println("zero Division");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("IndexoutofRange:");
        }
        System.out.println("please debug ur program");
    }
}
