class Player
{
    static int playCount = 0;
    private String name;
    public Player(String n)
    {
        name = n;
        playCount++;
    }
}
class PlayerTest
{
    public static void main(String[]args)
    {
        System.out.println(Player.playCount);//access static through superclass
        Player one = new Player("I surrender");
        System.out.println(Player.playCount);
        System.out.println(one.playCount);//access static variable thorugh reference

    }
}


