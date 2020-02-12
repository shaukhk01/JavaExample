interface I
{
    void m1();
}
interface J
{
//int m1(int a);overload
//void m1(int a);overload
int m1();//not possible
}

class Execute implements I,J
{
    public void m1()
    {
        System.out.println("HELLO");
    }
    //public int m1(int a)
    public int m1()
    {
       System.out.println("world"); 
       //return 0;
    }
public static void main(String[]args)
{
    Execute o = new Execute();
    //o.m1(10);
    o.m1();
}
}
