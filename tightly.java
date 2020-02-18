class Box
{
    public static void main(String[]args)
    {
        Volume v = new Volume(5,5,5);
        v.understand();
      //  System.out.println(v.getvolume());
    }
}
class Volume
{
    private int volume;
    Volume(int i,int j,int k)
    {
        this.volume = i*j*k;
    }
    public void understand()
    {
        System.out.println("tightly");
        
    }
       /* public int getvolume()
        {
            return volume;
        }*/
}


