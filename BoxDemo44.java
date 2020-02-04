package Mypack;
class Balance
{
    String name;
    double bal;
    Balance(String n,double b)
    {
        name  = n;
        bal   = b;
    }
    void show()
    {
        if(bal<0)
            System.out.println("--->");
        System.out.println(name +" "+bal);
    }
}
class AccountBalance
{
    public static void main(String[]args)
    {
        Balance current[] = new Balance[3];
       // Balance current = new Balance("annie",4463.76);
        //current.show();
        current[0] = new Balance("Annie",123.44);
        current[1] = new Balance("hector",443.22);
        current[2] = new Balance("bridget",55.33);
        for(int i=0;i<3;i++)
            current[i].show();
    }
}
//javac -d . BoxDemo44.java
//java Mypack.AccountBalance
    
