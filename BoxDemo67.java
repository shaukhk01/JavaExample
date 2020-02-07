class OpenTerminal 
{
   void OpenFile()
   {
       System.out.println("create new file");
   }
}
class OpenTab extends OpenTerminal
{
    void OpenFile()
    {
        System.out.println("open file");
    }
}
class Save extends OpenTerminal
{
    void OpenFile()
    {
        System.out.println("save file");
    }
}
class SaveAs extends OpenTerminal 
{
    void OpenFile()
    {
        System.out.println("SaveAs file");
    }
}
class Execute
{
    public static void main(String[]args)
    {
        OpenTerminal[] terminals = new OpenTerminal[3];
                    
                       terminals[0] = new OpenTab();
                       terminals[1] = new Save();
                       terminals[2] = new SaveAs();
                       for(int i=0;i<3;i++)
                           terminals[i].OpenFile();

                       
        }
    }
