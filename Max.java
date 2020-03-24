class Maximum
{
    static int[] arr={100,200,50,450,150,50,40,78,90};
    static int max = arr[0];
    static int min = arr[0];
    public static void main(String[]args)
    {
        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
                min = arr[i];
        }


        System.out.println("Maximum Value: "+max);
        System.out.println("Minimum Value: "+min);
    }
}


