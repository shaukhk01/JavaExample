class EncapsulateExample
{
    private int Open;
   // private double context;
    private String context;

    public int getopen()
    {
        return Open;
    }
    public void setopen(int X)
    {
        Open = X;
    }
    //public double getcontext()
    public String getcontext()
    {
        return context;
    }
    public void setcontext(String b)
    {
        context = b;
}
void show()
{
    if(Open > 3)
        System.out.println("no more open");
    else if(context == "http_ref_txt")
        System.out.println("context is active");

}
}
class Execute
{
    public static void main(String[]args)
    {
     EncapsulateExample ob = new   EncapsulateExample();
     ob.setopen(10);
     ob.setcontext("http_ref_txt");
     System.out.println(ob.getopen());
     ob.show();
    // System.out.println(ob.getcontext());
//     ob.setcontext(true);
    }
}

