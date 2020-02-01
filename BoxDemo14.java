class Box
{
    int a;
    public int b;
    private int c;

    public void setc(int i)
    {
        c = i;
    }
    public int getc()/* it must be accessed through 
                      * its public methods:setc(),getc()
                      * */
    {
        return c;
    }
    void disp()
    {
        System.out.println("default variable: " +a);
        System.out.println("public variable : " +b);
//        System.out.println("private variable: " +c);//from same calss can access private directly
}
}
public class BoxDemo14
{
    public static void main(String[]args)
    {
        Box ob = new Box();
        ob.a = 100;
        ob.b = 500;
//        ob.c = 100;this instance variable can not initialize directly
        ob.setc(1000);
        ob.disp();

        System.out.println("private variable: "+ob.getc());

    }
}

