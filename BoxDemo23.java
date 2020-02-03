class SaveAs
{
    public static void Execute_Operation(int v[])
    {
        System.out.println("Number of Args: " + v.length);

        for(int x : v)
            System.out.println(x);
    }
}
public class BoxDemo23
{
    public static void main(String[]args)
    {
        SaveAs o = new SaveAs();
        int  n1[] = {10};
        int  n2[] = {20,30};
        int  n3[] = {40,50,60};
        int  n4[] = {70,80,90,100};
        SaveAs.Execute_Operation(n1);
        SaveAs.Execute_Operation(n2);
        SaveAs.Execute_Operation(n3);
        
        o.Execute_Operation(n4);//using references
    }
}

