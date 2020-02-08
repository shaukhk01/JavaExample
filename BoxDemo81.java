import java.util.Random;
class HandleError
{
    public static void main(String[]args)
    {
        int a=0,b=0,c=0;
        Random r = new Random();

        for(int i=0;i<32;i++)
        {
            try{
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b/c);
            }
            catch(ArithmeticException e){
                System.out.println("Division by zero");//if try block generate eror come to catch
            }
            System.out.println("a: " + a);//and after catch then finally and go to again loop
                                          //because we are using for loop
        }
    }
}
