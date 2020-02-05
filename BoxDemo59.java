class NoofTimesExecute
{
    public void OpenFile(int three)
    {
        while(three>0)
        {
        System.out.println("Open file "+three);
        three--;
    }
}
}

class Test extends NoofTimesExecute
{
    public static void main(String[]args)
    {
       NoofTimesExecute  nofte = new NoofTimesExecute();
       nofte.OpenFile(3);
    }
}

