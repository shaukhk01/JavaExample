/*Dynamic method dispatch:
*Dynamic method dispatch is the mechanism by which a call to an overriden method is resovled at
*run time*/
class A 
{
    void callme()
    {
        System.out.println("Inside A's callme method");
    }
}
class B extends A
{
    //override
    void callme()
    {
        System.out.println("Inside B's callme method");
    }
}
class C extends A
{
    //override
    void callme()
    {
        System.out.println("Inside C's callme method");
    }
}
class Execute
{
    public static void main(String[]args)
        {
            A a = new A();
            B b = new B();
            C c = new C();
            
            A r;//obtain a reference of type A
            r = a;//r refer to object A
            r.callme();
            r = b;
            r.callme();
            r = c;
            r.callme();

        }
}


