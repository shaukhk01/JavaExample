class ExceptionHandling
{
    public static void  ManageException(int a,int b)//methos is static because of calling from 
    {                                               //main method directly otherwise  first object.
        try{
            if(a==1)
               
                b = b/(a-a);
            if(a==2)
            {
                int c[] = {3};
                c[10] = 400;
            }
        }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Index out of range:"+e);
            }
        }
    public static void main(String[]args)
    {
        try{
        int a = args.length;
        int b = 10;
        int c = b/a;
    ManageException(a,b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("ZeroDivison:"+e);
        }
    }
}


