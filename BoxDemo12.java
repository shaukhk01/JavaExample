class BoxDemo
{
    int i;
    int j;
    BoxDemo(int a,int b)
    {
        i = a;
        j = b;
    }
    public void meth(BoxDemo o)
    {
        i *=2;
        j *=3;
    }
}
public class BoxDemo12
{
    public static void main(String[]args)
    {
        BoxDemo ob = new BoxDemo(10,15);
        System.out.println("a and b before call: "+ob.i+"  "+ob.j);
        ob.meth(ob);
        System.out.println("a and b after call : "+ob.i+"  "+ob.j);
    }
}

