class Open_File
{
    public static void Save(int ...args)
    {
        System.out.println("Length of args: " + args.length);

        for(int Open : args)
            System.out.println(Open);
    }
}
public class BoxDemo24
{
    public static void main(String[]args)
    {
        Open_File o = new Open_File();
        o.Save(1,2,3,4,5);

    }
}


