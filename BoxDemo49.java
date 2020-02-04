import java.util.Random;

interface ShareConstants
{
    int NO    = 0;
    int Yes   = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON  = 4;
    int NEVER = 5;
}
class Question implements ShareConstants
{
    Random rand = new Random();
    int ask()
    {
        int prob = (int) (100 * rand.nextDouble());
        if(prob < 30)
            return NO;
        else
            return NEVER;
    }
}
class ExecuteIface
{
    public static void main(String[]args)
    {
        ShareConstants s = new Question();
        Question o = new Question();
       System.out.println(o.ask());

    }
}
