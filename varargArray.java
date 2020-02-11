class varArray
{
    public void m1(int arr[])
    {
        for(int x:arr)
        {
            System.out.println(x);
        }

    }
    public static void main(String[]args)
    {
        varArray o = new varArray();
        int n1[] = {10};
        int n2[] = {10,20};
        int n3[] = {1,2,3,4,5};
            o.m1(n3);

}
}
