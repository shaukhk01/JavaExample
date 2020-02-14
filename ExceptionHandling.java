package com.Exception;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling
{
    public static void main(String[]args)throws FileNotFoundException,IOException
    {
        try
        {
            testException(-5);
            testException(-10);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Rleasing resource");
        }
        testException(16);
    }
    public static void testException(int i)throws FileNotFoundException,IOException
    {
        if(i < 0)
        {
            FileNotFoundException myexception = new FileNotFoundException("Negative Integer"+i);
            throw myexception;
        }
        else if(i>10)
        {
            throw new IOException("only supported  for index 1 to 10");
        }
    }
}
