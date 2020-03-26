class FindElement
{
    static int[] arr={6,7,8,9,10,11,12,13,15,16,17};
    public static void main(String[]args)
    {
        int c=6;//Because of each element index subtract result 6.
        int sub;
       for(int i=0;i<arr.length;i++)
       {
           sub = arr[i]-i;
           if(sub!=c)
           {
               System.out.println(i+c);
               break;
           }
       }
    }
}
