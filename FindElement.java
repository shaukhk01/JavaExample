public class FindElement
{
    static int[] arr1={3,7,4,9,12,6,1,11,2,10,14};
    static int[] arr2=new int[15];//14+1-->Maximum value of arr1 here 1 is added for index
        public static void main(String[]args)
        {
            for(int i=0;i<arr1.length;i++)
            {
                arr2[arr1[i]]=1;//puting value 1 in arr2[] index of arr1 value
            }
            for(int k=1;k<arr2.length;k++)
            {
               //System.out.println(k+"-->"+arr2[k]);
               if(arr2[k]==0)
                   System.out.print(k+" ");
            }
            
            
        }
}

