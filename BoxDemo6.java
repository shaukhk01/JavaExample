class DemoBox
{
    double width;
    double height;
    double depth;
    
    //This is constructor DemoBox
    DemoBox()//new DemoBox is responsible to call
    {
        System.out.println("Constructing DemoBox");
        width  = 10;
        height = 12;
        depth  = 5.6;
    }
    //compute and return volume
    public double volume()
    {
        return width * height * depth;
    }
}
public class BoxDemo6
{
    
    public static void main(String[]args)
    {
        //reference to object
         DemoBox box1 = new DemoBox();
         DemoBox box2 = new DemoBox();
         double vol;

         //get value from volume
         vol = box1.volume();
         System.out.println("Box1: ");
         System.out.println(vol);

         vol = box2.volume();
         System.out.println("Box2: ");
         System.out.println(vol);
    }
}

        
