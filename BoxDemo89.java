abstract class Animal
{
    private String name;

    public String getName()
    {
        return name;
    }
    public void setName(String theName)
    {
        name = theName;
    }
}
class Hippo extends Animal
{
    public Hippo(String name)
    {
        super.setName(name);//passing argument to the Animal class setName method
    }
}
class MakeHippo
{
    public static void main(String[]args)
    {
        Hippo h = new Hippo("Buffy");
        System.out.println(h.getName());
    }
}


