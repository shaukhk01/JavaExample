public class Insert
{
    static int value = 40;

    public static void main(String[]args)
    {
        int[] arr;
        arr = new int[6];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 50;
        arr[4] = 10;//array is not sorted
        int k=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(value<arr[i])
            {
                arr[i+1] = arr[i];
                k++;
            }
        }
        arr[k+1] = value;
        int Sorted = arr.length-1;
        int comp=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=1+i;j>i;j--)
            {
            if(arr[i]<arr[j])
            {
                comp++;
            }
        }
        }
        System.out.println("comp:"+comp);
        if(Sorted == comp)
            System.out.println("Array is Sorted");
        else
            System.out.println("Array is NotSorted!");
    }
}

