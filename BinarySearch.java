import java.util.concurrent.TimeUnit;
public class BinarySearch
{

    static long startTime = System.nanoTime();

   static int[] arr={5,7,9,10,15,21,22,25,28,33,35,38,40,42};
   static int keys = 15;
   static int mid;

   public static  void main(String[]args)
   {
       int start=0;
       int end = arr.length-1;
       while(start<=end)
       {
            mid=(start + end)/2;
               if(keys==arr[mid])
               {
                   System.out.println("Found At Index: "+arr[mid]+"  "+mid);
                   break;
               }
               else if(keys<=arr[mid])
               {
                    end = mid-1;
               }
               else
                   start = mid+1;

       }
       if(keys !=arr[mid])
           System.out.println("NotFound!");
       long endTime = System.nanoTime();
       long timeElapsed = endTime - startTime;
  System.out.println("Execution Time: "+timeElapsed); 
   }

}
