class OpenFile
{
    public static void SaveAs(String message,int ...varg)
    {
        System.out.println(message+"==>" + varg.length);

        for(int Access : varg)
        {
            System.out.println(Access);

            System.out.println();
        }

    }
}
public class BoxDemo25  
{
    public static void main(String[]args)
    {
        OpenFile.SaveAs("one",10);
        OpenFile.SaveAs("two",20,30);
        OpenFile.SaveAs("three",40,50,60);
    }
}

