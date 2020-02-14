//java.lang.NullPointerException when getting length of null array
class Temp
{
    public static void main(String[]args)
    {
        int[] data = null;
       // int len = data.length;
       //accessing index value of null array
       int len=data[2];
    }
}

