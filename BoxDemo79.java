interface Nose
{
    public int iMethod();
}
abstract class A implements Nose
{
    public int iMethod()
    {
        return 7;
}
}
class B extends A
{
}

class C extends A
{
    public int iMethod()
    {
        return 5;
    }
}
class D extends B
{
    public static void main(String[]args)
    {
        Nose[] i = new Nose[3];
        i[0] = new B();
        i[1] = new C();
        i[2] = new D();


        for(int x=0;x<3;x++)
            System.out.println(i[x].iMethod()+"  "+i[x].getClass());
    }
}

