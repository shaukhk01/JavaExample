//unsorted array find duplicate value count
class duplicateElement
{
    public static void printDuplicate(int arr[],int len,int count)
    {
        for(int i=0;i<len;i++)
        {
            count = 1;
            if(arr[i]!=-1)
            {
                for(int j=i+1;j<len;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                        arr[j]=-1;
                    }
                }
            }
            if(count>1)
                System.out.println(arr[i]+"-->"+count);
         }
    }
    public static void main(String[]args)
    {
        int[] arr={8,3,6,4,6,5,6,8,2,7};
        int len = arr.length;
        int count=0;
        printDuplicate(arr,len,count);
    }
}
