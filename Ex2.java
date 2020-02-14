//Java NullPointerException while accessing/modifying filed of null object

class Temp
{
    int x = 10;
    public static void main(String[]args)
    {
        Temp t = m1();
        t.x = 20;
    }
    public static Temp m1()
    {
        return null;
    }
}
