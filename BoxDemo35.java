class BoxDemo
{
    private double weight;
    private double height;
    private double depth;

    BoxDemo(double w,double h,double d)
    {
        weight  =   w;
        height  =   h;
        depth   =   d;
    }
    double showBoxDemo()
    {
        return weight * height * depth;
    }

}
class DemoBox extends BoxDemo
{
    DemoBox(double w,double h,double d)
    {
        super(w,h,d);
    }

}

class Execute
{
    public static void main(String[]args)
    {
        DemoBox ob = new DemoBox(2,6,4);
       System.out.println(ob.showBoxDemo());
    }
}

