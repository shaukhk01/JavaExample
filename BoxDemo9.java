class Test
{
    //instance variable
    int a,b;

    //constructor
    Test(int i,int j)
    {
        a = i;
        b = j;
    }
    //return true if o is equal to the invoking object
    
    //object passed in method
    boolean equal(Test o)//o type is Test
    {
        if(o.a == a && o.b == b)//o value object coming from Test o.equal(ob2))
            return true;
        else
           return false;
    }
}
class PassOb
{
    public static void main(String[]args)
    {
    Test ob1 = new Test(100,22);
    Test ob2 = new Test(100,22);
    Test ob3 = new Test(-1,-1);
    System.out.println("Ob1 == ob2: "+ob1.equal(ob2));
    System.out.println("ob1 == ob3: "+ob2.equal(ob3));
    
                                    
    }
}


