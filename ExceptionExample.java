public class ExceptionExample
{
    public static void main(String[]args)
    {
        String test = "NO";
        try
        {
            System.out.println("start tryBlock");
            doRisk(test);
        }
        catch(InterruptedException e)
        {
            System.out.println("scary Exception");
        }
        finally
        {
            System.out.println("finally");
        }
        System.out.println("end of main");
    }
    public static void doRisk(String test)throws InterruptedException{
        System.out.println("start risky");

        if ("NO".equals(test))
        {
            throw new InterruptedException();//this will call to where handling InterrutedException
        }                                    
        System.out.println("end risky");
        return;
    }
}

