class BoxDemo
{
    int i;
    private  int j;
    void showij()
    {
        System.out.println(i);
    }
    public void setj(int x)
    {
        j = x;
    }
    public int getj()
    {
        return j;
    }

}
public class BoxDemo31 extends BoxDemo
{
    public static void main(String[]args)
    {
        BoxDemo o = new BoxDemo();
        o.i = 10;
        o.setj(300);
        o.showij();
       System.out.println(o.getj()); 
    }
}


