import java.util.Random;
interface SharedConstants
{
    int NO  = 0;
    int YES = 1;
    int MAYBE   = 2;
    int LATER   = 3;
    int SOON    = 4;
    int NEVER   = 5;
}
public class BoxDemo51 implements ShareConstants
{
    Random rand = new Random();
    int ask()
    {
    int result = (int) (10 * rand.nextDouble());
        if(result < 4)
            return NO;
        else if(result < 8)
            return LATER;
        else if(result < 10)
            return SOON;
        else
            return NEVER;
    }
    void  answer(int result)
    {
    switch(result)
    {
       case NO:
            System.out.println("NO");
            break;
       case MAYBE:
            System.out.println("MAYBE");
            break;
       case LATER:
            System.out.println("LATER");
            break;
       case SOON:
            System.out.println("SOON");
            break;
        case NEVER:
            System.out.println("NEVER");
      }
    }
}
class Execute
{
    public static void main(String[]args)
    {
        BoxDemo51 ob = new BoxDemo51();
        ShareConstants ob2 = new BoxDemo51();
        ob.answer(ob.ask());

        //System.out.println(ob.result);
    }
}
