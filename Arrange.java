class ArrangeArray
{
    static int[] arr={-6,3,-8,10,5,-7,-9,12,-4,2};
    public static void main(String[]args)
    {
        int i=0;
        int j=arr.length-1;
        int temp;
    for(int a=0;a<arr.length;a++)
        System.out.print(" "+arr[a]);
        while(i<j)
        {
            while(arr[i]<0)
            {
                i++;
            }
            while(arr[j]>=0)
            {
                j--;
            }
            if(i<j)
            {

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println();
        for(int x=0;x<arr.length;x++)
   System.out.print(" "+arr[x]); 
}
}


