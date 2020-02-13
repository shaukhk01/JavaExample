class UserException
{
    public static void main(String[]args)
    {
        int age = Integer.parseInt(args[0]);//parseInt is method used for string type int convert
        if(age>60)                          //into int type.
        {
            throw new TooYoungException("please you are is not eligible");
        }
        else if(age<30)
        {
            throw new TooOldException("You can play only");
        }
        else
        {
            System.out.println("You All are Valid");
        }
    }

}
class TooYoungException extends RuntimeException
{
    TooYoungException(String s)
    {
        super(s);
        System.out.println(s);//s reterived data from throw Exception
    }
}
class TooOldException extends RuntimeException
{
    TooOldException(String s)
    {
        super(s);
    }
}
