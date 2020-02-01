class Box
{
    double width;
    double height;
    double depth;

}
public class BoxDemo2
{
    public static void main(String[]args)
    {  //creating object for BOx class
        double volume1;
        double volume2;

        Box box1 = new Box();
        Box box2 = new Box();
    
      //assing value to box1 instance variable.

        box1.width  = 5;
        box1.height = 8;
        box1.depth  = 9;


     //assing different value to box2 instance variable

        box2.width  = 4;
        box2.height = 3;
        box2.depth  = 6;
    //compute value of box1
        
        volume1 = box1.width * box1.height + box1.depth;
        System.out.println("Box1 Value: " +volume1);
   //compute 2nd value of box2;
    
        volume1 = box2.width * box2.height  + box2.depth;

        System.out.println("Box2 value: " +volume1);
    }
}


