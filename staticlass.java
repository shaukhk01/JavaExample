class outer
{
    static int a =10;
    int b = 10;
    int mo1()
    {
       a++; 
        return ++b;
    }

    static class inner
    {
        int a = 10;
        public void mi1()
        {
            System.out.println(a);
        }

    }
    public static void main(String[]args)
    {
        outer.inner oi = new outer.inner();
        oi.mi1();
        outer o1 = new outer();//outer firstobject
        o1.b +=10;
        o1.a +=10;
        System.out.println("instance: "+o1.mo1());//instance variable
        outer o2 = new outer();
        System.out.println("instance: "+o2.mo1());
        //outer.mo1();//class name can't access of instance method from static method
        System.out.println("static: "+o1.a);//static variable
        System.out.println("static: "+o2.a);
        
    
}
}
