class Execute
{
    public static void main(String[]args)
    {
        int a=100;
        boolean b = false;
        String  s = "annie";
        ConExample[] ce = new ConExample[5];
            ce[0] = new ConExample();
            ce[1] = new ConExample(10);
            ce[2] = new ConExample(true,"hector");
            ce[3] = new ConExample(s,a,b);
    }
}
class ConExample
{
    public ConExample()
    {
        System.out.println("no-arg");
    }
    public ConExample(int a)
    {
        System.out.println("one-arg:"+a);
    }
    public ConExample(boolean b,String s)
    {
        System.out.println("two-arg:"+b+" "+s);
    }
    public ConExample(String s,int a,boolean b)
    {
        System.out.println("three-arg:"+s+"  "+a+"  "+b+" ");
    }
}


