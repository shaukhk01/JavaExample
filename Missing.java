public class Missing
{
    static int[] arr={1,2,3,4,5,6,8,9,10};
    static int sub;
    public static void main(String[]args)
    {
        int sum=0;
        int n = arr.length;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum+arr[i];
        }
            sub = arr[n-1]*(arr[n-1]+1)/2;//this way is only for Natural Number only.
            sub = sub - sum;
    System.out.println("missing Element: "+sub);
}
}

