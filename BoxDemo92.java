//multiException handling
class MultiCatchHandlingl
{
    public static void main(String[]args)
    {
        try{

            int cmd = args.length;
            int intvalue = 20;
            int c = intvalue / cmd;
            int arr[] = {1};
            arr[10] = 44;
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException Error");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
