public class FindMultiElement
{
    static int[] arr={6,7,8,9,11,12,15,16,17,18,19};
    static int diff=6;
    public static void main(String[]args)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]-i !=diff)
            {
                while(diff<arr[i]-i)//because of we wan't more then one missing element.
                {
                    System.out.println(i+diff);
                    diff++;
                }
            }
        }
    }
}

