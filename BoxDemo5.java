class BoxDemo
{
    double width;
    double height;
    double depth;

    //compute and return volume
    public double volume()
    {
        return width * height * depth;
    }
    public void SetDim(double w,double h,double d)
    {
        width  = w;
        height = h;
        depth  = d;
    }
}

public class BoxDemo5
{
    public static void main(String[]args)
    {
        //reference to object
        BoxDemo box1 = new BoxDemo();
        BoxDemo box2 = new BoxDemo();
        double vol;

        //assing value to the box1 instance variable
       /* box1.width  = 3.5;
        box1.height = 4.6;
        box1.depth  = 6;

        //assing value to the box2 instance variable

        box2.width  = 7.3;
        box2.height = 6.5;
        box2.depth  = 2.5;*/
        //initialize each box
        box1.SetDim(5.5,5.5,3);

        box2.SetDim(4.4,7,5);

        //get value from volume
        vol = box1.volume();
        System.out.println(vol);

        vol = box2.volume();
        System.out.println(vol);

    }
}

