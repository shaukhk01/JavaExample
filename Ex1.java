class Temp
{
    public static void main(String[]args)
    {
        Temp t = m1();
        t.foo("Hi");/*here you see NullPointerException raise because invoking method on object 
                     *instance but at runtime the object is null
                     */
    }
    private static Temp m1()
    {
        return null;
    }
    public void foo(String s)
    {
        System.out.println(s.toLowerCase());
    }
}
