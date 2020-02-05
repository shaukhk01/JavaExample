interface A
{
    void meth1();
    void meth2();
}
interface B extends A//here interface is extends
{
    void meth3();
}
class Iface implements B
{
    public void meth1()
    {
        System.out.println("Implements meth1().");
    }

    public void meth2()
    {
        System.out.println("Implements methd2().");
    }
    public void meth3()
    {
        System.out.println("Implements methd3().");
    }
}
public class BoxDemo52
{
    public static void main(String[]args)
    {
        Iface nif = new Iface();
        nif.meth1();
        if.meth2();
        nif.meth3();
    }
}
    
