abstract class Abstraction
{

    Abstraction()
    {
        System.out.println("constructor of abstract");
    }
}
class Execute extends Abstraction
{
    public static void main(String[]args)
    {
        Execute o = new Execute();
    }
}

