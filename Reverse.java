/*public class Reverse
{
    static int[] arr1={1,2,3,4,5,6,7,8,9,10};
    public static void main(String[]args)
    {
        int[] arr2 = new int[10];
        int k=0;

        for(int i=arr1.length-1;i>=0;i--)
        {
            arr2[k] = arr1[i];
            k++;}

    
    for(int i=0;i<arr1.length;i++)
    {
//    System.out.print(arr1[i]);
 //   System.out.println();
    System.out.print(" "+arr2[i]);
    }
}
}*/

//The second way of Reversing using swap
public class Reverse
{
    static int[] arr={1,2,3,4,5,6,7,8,9,10};
    public static void main(String[]args)
    {
        int temp;
        int i,j;
        for( i=0,j=arr.length-1;i<j;i++,j--)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        for(int k=0;k<arr.length;k++)
            System.out.print(" "+arr[k]);
    }
}
