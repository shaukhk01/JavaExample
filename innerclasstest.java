class Test
{
    static int a =10;
    double b = 20;
  static class inner
    {
       static int x = 100;
       int y = 200;
        static
        {

       System.out.println(a);
      System.out.println(x); 
      System.out.println(new inner().y);/*we can not access non-static varible within static block
                                         But we can access thorugh reference new inner().y*/
      System.out.println(new Test().b);//because of instance variable not. 
}
    }
public static void main(String[]args)
{
   
    Test.inner o  = new Test.inner();
    System.out.println(o.x);
    System.out.println(o.y);

}
}
