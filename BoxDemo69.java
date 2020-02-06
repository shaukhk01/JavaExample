import java.io.*;
import java.util.*;//ArrayList present in this package
class BoxDemo
{
    public static void main(String[]args)
                            throws IOException
    {
    int n=5;
        //ArrayList<BoxDemo> myList = new ArrayList<BoxDemo>(n);
        ArrayList<Integer>myList = new ArrayList<Integer>(n);
        /*ArrayList:
         * it provides us dynamic array in java
         */
        //adding element to the ArrayList
        for(int i=0;i<6;i++)
            myList.add(i);//here storing int value must be ArrayList<Integer>otherwise error
        //printArraList
        System.out.println(myList);
        //removing element from ArrayList
        myList.remove(3);
        System.out.println(myList);
        //showing element from myList

        for(int i=0;i<myList.size();i++)//based on arraylistsize loop Executed.
         // for(int i=0;i<5;i++)
            System.out.println(myList.get(i));
        //size()provide sizie of ArrayList
        System.out.println(myList.size());
    }
}
