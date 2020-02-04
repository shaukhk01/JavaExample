class A
{
    public interface NestedIface//nested interface
    {
        boolean isNotNegative(int x);//abstract method
    }
}
class B implements A.NestedIface
{
    public boolean isNotNegative(int x)
    {
        return x< 0 ? false : true;
}
}

class NestedDemo
{
    public static void main(String[]args)
    {
        A.NestedIface nif = new B();
       // System.out.println(nif.isNotNegative(12));
       if(nif.isNotNegative(22))//if isNOtNegative method is true then system.out.println  stmt exe
               System.out.println("true");
        if(nif.isNotNegative(-1))
            System.out.println("this won't be displayed");
    }
}
