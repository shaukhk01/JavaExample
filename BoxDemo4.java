class BoxDemo
{
    double width;
    double height;
    double depth;

    public double volume()
    {
        return width * height * depth;
    }
}
public class BoxDemo4
{
    public static void main(String[]args)
    {
        //reference to the object BoxDemo
        BoxDemo box1 = new BoxDemo();
        BoxDemo box2 = new BoxDemo();
        double vol;

        //assing value to the box1 instance variable.
        box1.width  = 5;
        box1.height = 3;
        box1.depth  = 3.5;

        //assing value to the box2 instance variable
        box2.width  = 5;
        box2.height = 6.7;
        box2.depth  = 7;
        
        //disp value from box1
        vol = box1.volume();
        System.out.println(vol);

        ///disp vvalue from box2
        vol = box2.volume();

        System.out.println(vol);
    }
}
