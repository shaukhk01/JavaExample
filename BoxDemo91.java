import java.util.*;

class InputTest
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name? ");
       String name = in.nextLine();

       System.out.println("How old are you? ");
       int age = in.nextInt();

       System.out.println("Hello, "+name +".Next year,you ll be"+age);
    }
}
/*Scanner is class which
 * is not suitable for
 * reading a password from
 * a console Because input
 * is plainly visible to anyone
 */
