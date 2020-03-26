public class UnionArray
{
    public static void printUnion(int A[],int B[],int l1,int l2)
    {
        int i=0,j=0;
        while(i<l1 && j<l2)
        {
            if(A[i]<B[j])//Because of we want result in sorted order using merge operation
                System.out.println(A[i++]+" ");
            else if(B[j]<A[i])
                System.out.println(B[j++]);
            else
            {
                System.out.println(B[j++]+" ");//using for Union
                i++;
            }

        }
    }
    public static void main(String[]args)
    {
        int[] A={1,3,5,7,8};
        int[] B={2,4,5,6,8,9};
       int  l1 = A.length;
       int  l2 = B.length;
        printUnion(A,B,l1,l2);
    }
}

