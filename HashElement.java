class HasDuplicate
{
    public static void printHas(int arr1[],int Has[],int len)
    {
        for(int i=0;i<len;i++)
        {
            if(Has[arr1[i]]<1)
                Has[arr1[i]]=1;
            else
                Has[arr1[i]]++;
    }
    for(int i=0;i<Has.length;i++)
        if(Has[i]>1)
        {
        System.out.println(Has[i]+"--->"+i);
    }
    }
    public static void main(String[]args)
    {
        int[] arr1={8,3,6,4,6,5,6,8,2,7,9,10,9};
        int[] Has = new int[10+1];//here [10] is maximum number of arr1 and [1] is for incr index
        int len = arr1.length;
        printHas(arr1,Has,len);
    }
}

