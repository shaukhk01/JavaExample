class Box 
{
    double width;
    double height;
    double depth;

    public void volume()
    {
        System.out.println("volume is: ");
        System.out.println(width * height * depth);
    }
}
public class BoxDemo3
{
    public static void main(String[]args)
    {
        //creating object reference and allocate obejecting
        Box box1 = new Box();
        Box box2 = new Box();

       //assing value to boxi instance variable.
        box1.width  = 7;
        box1.height = 4;
        box1.depth  = 2;
        //assing value to the box2 instance variable

        box2.width  = 3.5;
        box2.height = 6.4;
        box2.depth  = 2;
        //calling volume  method using box1 reference
        box1.volume();

        //calling volume method uisng box2 reference 
        box2.volume();
    }
}
