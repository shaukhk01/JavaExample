interface I
{
    int x = 100;
}
interface J
{
    int x  = 200;
}
class A implements I,J
{
    public static void  main(String[]args)
    {
        System.out.println(I.x);
        System.out.println(J.x);
    }
}
