class NestException
{
    public static void main(String[]args)
    {
        int cmd = args.length;
        int value1 = 10;
        try
        {
            if(cmd==1)
            {
                int div = value1 / cmd;
            System.out.println("your operation is success");
            }
            try
            {
                if(cmd == 2)
                {
                    int arr[] = {cmd};
                    arr[cmd+5] = 99;
                }
            }//notice here try block closed then after nested try block exception will be write
            catch(ArrayIndexOutOfBoundsException a)
            {
                System.out.println("ArrayIndexOutOfBoundsException Error");
            }
        }//notice here outer try block close then below catch block will be write
            catch(ArithmeticException e)
            {
                System.out.println("ArithmeticException Error");
            }
        }
    }
