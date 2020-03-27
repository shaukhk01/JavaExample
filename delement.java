class DuplicatElement
{
    public static void duplicate(int arr1[],int arr2[],int len1,int len2)
    {
        for(int i=0;i<len1;i++)
        {
            arr2[arr1[i]]++;//here if arr2[value]insert based on arr1[value]
        }
        for(int j=0;j<len2;j++)
        {
            if(arr2[j]>1)
                System.out.println(j+"--->"+arr2[j]);
        }

    }
    public static void main(String[]args)
    {
        int[] arr1={3,6,8,8,10,12,15,15,20};
        int[] arr2=new int[20+1];//[20]because it is the largest value of arr1[]
        int len1 = arr1.length;
        int len2 =arr2.length;
        duplicate(arr1,arr2,len1,len2);
    }
}
