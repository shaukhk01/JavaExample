class A
{
    public String m1()
    {
        return null;
    }
    public String m1(String pid)
    {
        return "4323";
    }
    public int m1(int gid,int uid)
    {
        return 5542;
    }
    public static void main(String[]args)
    {
        A o  =  new A();
        System.out.println(o.m1());
        System.out.println(o.m1("process_id"));
        System.out.println(o.m1(43,33));


}
}



