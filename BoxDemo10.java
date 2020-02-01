//here DemoBox allowed one object to initilize anotehr.
class DemoBox
{
    double width;
    double height;
    double depth;

    //this constructor takes one object type DemoBOx
    DemoBox(DemoBox o)
    {
        width   = o.width;
        height  = o.height;
        depth   = o.depth;
    }
    //constructor used when all dimensions spacified
    DemoBox(double w,double h,double d)
    {
        //System.out.println("parameterized constructor");
         width  = w;
         height = h;
         depth  = d;
    }
    //constructor used when no dimensions spacified.

    DemoBox()
    {
       // System.out.println("no parameterized constructor");
        width  = -1;
        height = -1;
        depth  = 1;
    }

    public double volume()
    {
        return width * height * depth;
    }
}

class BoxDemo10
{
    public static void main(String[]args)
    {
        DemoBox box1 = new DemoBox(10,7,3);
        DemoBox box2 = new DemoBox();
        DemoBox box3 = new DemoBox(box1);//here object box1 passsed to constructor Demobox

        //get value from volume()
        System.out.println(box1.volume());

        System.out.println(box2.volume());
        System.out.println(box3.volume());
    }
}


