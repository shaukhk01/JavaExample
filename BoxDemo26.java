class OpenFile
{
    public static void ExeFile(int ...p)
    {
        System.out.println("Number of Argument: " + p.length);

            for(int access :p)
            {
                System.out.println("access data: " + access);
                System.out.println();
            }
    }
    public static void ExeFile(boolean ...b1)
    {
        System.out.println("Access  Boolean Data");

        for(boolean b2 : b1)
        {
            System.out.println(b2);
        }
    }
    public static void  ExeFile(String msg,boolean ... b2)
    {
        System.out.println(msg);
        
        for(boolean access : b2)
        {
            System.out.println(access);
            System.out.println();
        }
    }
}
public class BoxDemo26
{
    public static void main(String[]args)
    {
        //allocate  reference to  object
         OpenFile open = new OpenFile();
        //passing argument and variable argument
            open.ExeFile(1,2,3);
        for(int i=0;i<=3;i++)
            open.ExeFile(true,false);
       open.ExeFile("data from Boxdemo26...",true); 
    }
}

