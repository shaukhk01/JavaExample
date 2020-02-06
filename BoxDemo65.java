class Xcopy
{
    //int arg;
    public static void main(String[]args)
    {
        int arg = 30;//we cannot access from outside[because of local varible  can't access]
        Xcopy ob = new Xcopy();
    }
    int go(int ar)
    {
        arg = ar;//"erro":here arg is local variable but we are accessing outof mehtod
        return arg;
    }

}
