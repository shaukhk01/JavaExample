class File_Terminal
{
    int outer_x = 100;
    public void Write_File()
    {
        for(int i=0;i<10;i++)
        {
            class Open_Tab
            {
                public void read_file()
                {
                    System.out.println("outer_class file: " + outer_x);

               }
            }
        Open_Tab ob = new Open_Tab();
        ob.read_file();
   }
}
}

public class BoxDemo18
{
    public static void main(String[]args)
    {
       File_Terminal TF = new File_Terminal(); 
       TF.Write_File();
    }
}

