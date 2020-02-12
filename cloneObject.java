import java.lang.Cloneable;
//import java.util.ArrayList;

class Test
{
    int x,y;
}
//Contained a reference of Test and implements
//Cloneable interface
class Test2 implements Cloneable
{
    int a;
    int b;
    Test obj1 = new Test();
    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class Execute
{
    public static void main(String[]args)throws CloneNotSupportedException
    {
        Test2 obj2 = new Test2();
        obj2.a = 10;
        obj2.b = 20;
        obj2.obj1.x = 30;
        obj2.obj1.y = 40;
        
        //creating a copy of object obj2 and passing obj3
       Test2 obj3 = (Test2)obj2.clone();

       System.out.println("before changing object");

       System.out.println(obj2.a+"  "+obj2.b+"  "+obj2.obj1.x+"  "+obj2.obj1.y);

       System.out.println();
            //change primitive type of obj3 will not be reflected in obj2 fileds
        obj3.obj1.x = 100;//this will will relflect in both obj2 and obj3 because of otherclass
            obj3.b = 200;//here you can see obj3.b is changed only for obj3 object not obj2 object
            obj3.a = 500;

       System.out.println("after modified object");
       System.out.println(obj2.a+"  "+obj2.b+"  "+obj2.obj1.x+"  "+obj2.obj1.y);
       System.out.println("---------------------------------------------------");
       System.out.println(obj3.a+" "+obj3.b+" "+obj3.obj1.x+"  "+obj3.obj1.y);

    }
}

