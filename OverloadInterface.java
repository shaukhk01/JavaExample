import java.util.Scanner;//pacakge present inside inputmethod,like System.in

interface Myinterface
{
    void disp();
    void disp(String name,int age);
}
public class OverloadInterface implements Myinterface
{
    String name;
    int age;
    public void disp()
    {
        System.out.println("This is implementation class of interface method");
    }
    public void disp(String name,int age)
    {
        System.out.println("Name:"+name);
        System.out.println("Age :"+age);
    }
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ur name:");
        String name = s.next();
        System.out.println("Enter ur age:");
        int age = s.nextInt();

        OverloadInterface oi = new OverloadInterface();
        oi.disp();
        oi.disp(name,age);
    }
}
