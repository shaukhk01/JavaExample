class BoxDemo
{
    int a;

    BoxDemo(int i)
    {
        a = i;
    }
    BoxDemo addTen()//addTen method retrun type is BoxDemo
    {
        BoxDemo temp = new BoxDemo(a+10);
        return temp;
}
}
public class BoxDemo13
{
    public static void main(String[]args)
    {
        BoxDemo ob1 = new BoxDemo(2);
        BoxDemo ob2;

        ob2 = ob1.addTen();

        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.addTen();//from here ob2 passing 12 value from ob2=ob1.addTen
        System.out.println("ob2.a; " + ob2.a);
    }
}



