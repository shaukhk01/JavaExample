package Mypack;
public class BoxDemo45
{
    String name;
    double bal;

    public BoxDemo45(String n,double b)
    {
        name    = n;
        bal     = b;

    }
   public void show()
   {
        if(bal<0)
            System.out.println("-->");
        System.out.println(name + ": $" +bal);
   }
}

            

