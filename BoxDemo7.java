//Box uses a parameterized constructo to  intialize the dimension of DenmoBOx

class DemoBox
{
    //this is instance variable
    double width;
    double height;
    double depth;

    /*This is constructor for DemoBox
     *And it is parameterized constructor*/
    DemoBox(double w,double h,double d)
    {
        width   = w;
        height  = h;
        depth   = d;
    }
    //compute and return volume
    public double volume()
    {
        return width * height * depth;
    }
}

public class BoxDemo7
{
    public static void main(String[]args)
    {
        //reference for object
        DemoBox box1 = new DemoBox(10,3.5,2);
        DemoBox box2 = new DemoBox(4.3,5,8);
        double vol;

        //get volume()
        vol = box1.volume();
        System.out.println(vol);

        vol = box2.volume();
        System.out.println(vol);
    }
}
        

