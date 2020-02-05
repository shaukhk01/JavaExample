class Dog
{
    double size;
    double  getsize()
    {
        return size;
    }
    void setsize(double s)
    {
        size = s;
    }
   /* double getsize()return size;
    double setsize(double x) size = x;*/
        
    void show()
    {
        System.out.println(getsize());
    }
}
class objectArray
{
    public static void main(String[]args)
    {
        Dog obj[] = new Dog[5];
        obj[0]  = new Dog();
        obj[1]  = new Dog();
        obj[1].setsize(30);
        obj[0].setsize(40);
        obj[0].show();
        obj[1].show();

    }
}
