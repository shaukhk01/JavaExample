class Box
{
    private double width;
    private double height;
    private double depth;

    Box(Box ob)//object passed constructor
    {
        width   = ob.width;
        height  = ob.height;
        depth   = ob.depth;
    }
    Box(double w,double h,double d)
    {
        width   = w;
        height  = h;
        depth   = d;
    }
    void volume()
    {
            System.out.println(width);
            System.out.println(height);
            System.out.println(depth);
    }

}
class BoxWeight extends Box
{
    double weight;

    BoxWeight (BoxWeight ob)//object passing from here to parent class object constructor
    {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w,double h,double d,double m)//passing parameterized cons to the parent param.
    {
        super(w,h,d);

        weight = m;
    }
}
class Shipment extends BoxWeight
{
    double cost;
    Shipment(Shipment ob)//passing value to the BoxWeight object constructor
    {
        super(ob);
        cost = ob.cost;
    }
    Shipment(double w,double h,double d,double m,double c)//passing value to the parameterized cons
    {
        super(w,h,d,m);
        cost = c;
    }
}
class DemoShipment
{
    public static void main(String[]args)
        {
            Shipment s1 = new Shipment(10,20,15,10,3.41);
            System.out.println(s1.weight);
            s1.volume();
        }
}



