class ElectricalGuitar
{
    String brand;
    int numOfPickups;
    boolean rockStarUser;

    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String Brand)
    {
        brand = Brand;
    }
    public int getnumOfPickups()
    {
        return numOfPickups;
        }
    public void setnumOfPickups(int p)
    {
        numOfPickups = p;
    }
    public boolean getrock()
    {
        return rockStarUser;
    }
    public void setrock(boolean b)
    {
        rockStarUser = b;
    }
    void showinfo()
    {
        System.out.println(getBrand());
        System.out.println(getnumOfPickups());
        System.out.println(getrock());
    }
}
class Execute
{
    public static void main(String[]args)
    {
        ElectricalGuitar ob = new ElectricalGuitar();
        ob.setBrand("Holex");
        ob.setnumOfPickups(3);
        ob.setrock(true);
        ob.showinfo();


    }
}

    
