class Animal
{

}
class Monkey extends Animal
{

}
class Execute
{
    public void methodone(Animal a)
    {
        System.out.println("animal method");
    }
    public void methodone(Monkey m)
    {
        System.out.println("monkey method");
    }

    public static void main(String[]args)
    {
        Animal a = new Animal();
        Monkey m = new Monkey();
        Execute e= new Execute();
        e.methodone(a);
        e.methodone(m);
    }
}
