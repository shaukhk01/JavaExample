//java program to demonstrate theat assignment
//operator only creates a new reference to same
//object.
import java.util.*;

class Test
{
    int x,y;
    Test(int i,int y)
    {
        this.x = i;
        this.y = y;
    }
}
class Execute
{
    public static void main(String[]args)
    {
        Test t = new Test(10,20);
        System.out.println(t.x+"  "+t.y);
        
        //createing new reference variable t2
        //pointing to same address as t
        Test t2 = t;
        t2.x = 100;
        t2.y = 300;

        System.out.println(t.x+"  "+t.y);
        System.out.println(t2.x+" "+t2.y);
    }
}

