import java.io.*;
import java.util.*;

class BoxArray
{
    public static void main(String[]args)
    {
        int n=5;

        ArrayList<Integer> arrli = new ArrayList<Integer>(n);
        //appending new elements at the end of the list
        for(int i=1;i<=n;i++)
            arrli.add(i);
        //Printing Elements.
        System.out.println(arrli);

        //Remove element at index 3
        arrli.remove(3);
        //Displaying ArrayLIst after deletion
        System.out.println(arrli);

        //Printing elements one by one
        for(int i=0;i<arrli.size();i++)
            
            System.out.println(arrli.get(i)+" ");
    }
}


