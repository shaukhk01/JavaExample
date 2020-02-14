//java NullPointerException when null is passed in method argument
class Temp
{
    public static void main(String[]args)
    {
        foo(null);
    }
    public static void foo(String s)
    {
        System.out.println(s.toLowerCase());
    }
}
