abstract class AbstractExample
{
   abstract void m1();
   abstract void m2();
}
class nonAbstract extends AbstractExample
{
    void m3()
    {
//after abstract class must be implement abstract class method from first non-abstract class
    }

}
class Non extends AbstractExample
{
    void m1()/*here abstract class implementation not required must be first concret class.
               *it is the second concret class that given error*/
    {
System.out.println("m1");
    }

    void m2()
    {

        System.out.println("m2");
    }
}
