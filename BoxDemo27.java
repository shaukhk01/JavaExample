class OpenFile
{
    public static void ExeFile(int ...v)
    {
        for(int i : v)
        System.out.println(i);
    }
    public static void ExeFile(boolean ...w)
    {
        for(boolean j : w)
            System.out.println(j);
}
/*public static void ExeFile()
{
    System.out.println("blank");
}*/
}
public class BoxDemo27
{
    public static void main(String[]args)
    {
        OpenFile open = new OpenFile();
        open.ExeFile(10,20,30);
        open.ExeFile(true,false);
        open.ExeFile();//ambiguity error because of passed argument is no of same
    }
}

