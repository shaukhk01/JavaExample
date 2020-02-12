class ExceptionExample
{
  /* double div  = 10/0;*abnormal termination doesn't matter Exception handle define so better
                        *to use try block these type of riskey statment.
                        */
                        
    public static void main(String[]args)
    {
           // System.out.println(10/0);

       try
        {
           System.out.println("try block executed");
           System.out.println(10/0);
        }
       // catch(ArithmeticException e)//here corresponding catch block is matched
                                      //so catch block not raised exception at last
       catch(NullPointerException e)//here corresponding catch block is not matched after finally
        {                           //block exception raised.
            System.out.println("catch block is executed");
            System.out.println(10/2);
           // System.out.println(10/2);
          // e.printStackTrace();//this method prints exception information on console and,default
         // System.out.println(e);
         //System.out.println(e.getMessage());
         //System.out.println(e.toString());
        }
        finally
        {
            System.out.println("alwaysExecutedbetter to write clean up code");
        }
    }
}
