class BoxDemo
{
    public void meth(int i,int b)
    {
        i *=2;
        b /=2;
    }
}
public class BoxDemo11
{
    public static void main(String[]args)
    {
        BoxDemo ob = new BoxDemo();

        int a =100;
        int b =20;

        System.out.println("a and b before call: "+a +"  "+b);

        ob.meth(a,b);
        System.out.println("a and b before call: "+a +"  "+b);
    }
}
