public class UnionArray
{
    static int[] inter=new int[5];
    static int k=0;
    public static void printUnion(int A[],int B[],int l1,int l2)
    {
        int i=0,j=0;
        while(i<l1 && j<l2)
        {
            if(A[i]<B[j])//Because of we want result in sorted order using merge operation
                System.out.print(A[i++]+" ");
            else if(B[j]<A[i])
                System.out.print(B[j++]+" ");
            else
            {
                inter[k++] = B[j];//Intersection implementation
                System.out.print(B[j++]+" ");//using for Union
                i++;
            }
        }
        System.out.println();
        System.out.println("Intersection--");
        for(int r=0;r<inter.length;r++)
            if(inter[r]!=0)
            System.out.print(inter[r]+" ");
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

