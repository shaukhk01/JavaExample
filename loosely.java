class Volume
{
    public static void main(String[]args)
    {
        Box b = new Box(5,5,5);
        System.out.println(b.getVolume());
    }
}
final class Box
{
    private int volume;
    Box(int length,int width,int height)
    {
        this.volume = length * width * height;
    }
    public int  getVolume()
    {
        return volume;
    }
}
