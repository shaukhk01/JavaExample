import java.lang.Exception;

class Customized extends Exception//Exception class is available in java.lang.Exception
{
    private int details;//this private variable get value when throws exception raised
    Customized(int a)   //throws Customized(X)
    {
        details = a;
    }
    public String toString()
    {
        return "CustomizedException["+details+"]";
    }
}
class ExecuteException
{
    static  void compute(int X)throws Customized
    {
        System.out.println("called compute("+X+")");
        if(X>10)
            throw new Customized(X);//here X will automatically assinged to the Customized instance
        System.out.println("Normal exit");//variable.
    }
    public static void main(String[]args)
    {
        try
        {
            compute(1);//calling method
            compute(20);
        }
        catch(Customized e)//handling Customized Exception.
        {
            System.out.println("Caught"+e);
        }
}
}
