class Animal
{
    public Animal()
    {
        System.out.println("Making an Animal");
    }
}
 class Hippo extends Animal
{
    public Hippo()
    {
        System.out.println("Making a Hippo");
    }
}
class TestHippo
{
    public static void main(String[]args)
    {
    System.out.println("Starting...");
    Hippo h = new Hippo();/*ExecutionProcess
                           *First Hippo()constructor goes into a stack
                           *fram at the top of the stack
                           *Hippo()invokes the superclass constructor
                           *which pushes the Animal()constructor onto the top of the stack
                           *Animal()invokes the superclass constructor which pushes the
                           *Object()constructor onto the top of the stack,since Object is
                           *the superclass of Animal
                           *Object()completes and its stack frame Execution goes back to 
                           *Animal()constructorconstructor and Hippos(),
                           */
    }
}
