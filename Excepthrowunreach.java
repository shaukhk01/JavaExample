class ExceUnreachable
{
    public static void main(String[]args)
    {
        throw new ArithmeticException("\by zero");
        System.out.println("Hello");
    }
}
