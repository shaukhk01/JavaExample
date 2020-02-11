interface OpenFile
{
    
    int Open();//static modifier not allowed in interface here.
    double Save();
    String SaveAs();
}
abstract class Editing implements OpenFile
{
    public int Open()
    {
        return 01010;
    }
    public double Save()
    {
        return 33.33;
    }
}
class Execute1 extends  Editing
{
    public  String SaveAs()
    {
        return "annie";
    }

}
class Execute
{
    public static void main(String[]args)
    {
        Execute1 o = new Execute1();
        System.out.println(o.Open());
        System.out.println(o.Save());
        System.out.println(o.SaveAs());
    }
}

