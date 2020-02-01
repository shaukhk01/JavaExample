class RecTest
{
    int values[];
    
    RecTest(int i)
    {
        values = new int[i];//initialize size of int values[] array
    }
    //display array recursively
    void printArray(int i)//here i value will be 1to 10
    {
        if(i==0)
            return;
        else                                      //printing values of values[i-1]0,values[1-2]=2
            printArray(i-1);                      //-------------
                System.out.println("["+(i-1)+"]" + values[i-1]);
                //System.out.println(i);printing printArray value
    }
}
public class Recursion
{
    public static void main(String[]args)
    {
        RecTest ob = new RecTest(10);

        for(int i=0;i<10;i++)
            ob.values[i]=i;//initialize value of the index[i]=i i.e values[0]=0,values[1]=1
        ob.printArray(10);
    }

}

