class MergeArray
{
    static int[] A={3,8,16,20,25};
    static int[] B={4,10,12,22,23};
    static int[] C=new int[10];
    public static void main(String[]args)
    {
        int i=0;
        int len=B.length-1;
        int j=0;
        int k=0;
        while(i<=len)
        {
            if(A[i]<B[j])
            {
                C[k++]=A[i];
                C[k++] = B[j];
                i++;
                j++;
            }
            else
            {
                C[k++] = B[j];
                C[k++] = A[i];
                    j++;
                    i++;
            }
        }
        for(int x=0;x<10;x++)
            System.out.println(C[x]);
    }
}
