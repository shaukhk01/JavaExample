class Box
{
    double width;
    double height;
    double depth;
}
//This class declare object of type Box
public class BoxDemo
{
    public static void main(String[]args)
    {
        Box mybox1 = new Box();
        Box mybox2 = mybox1;//here we are copying reference not creating object..
        mybox = null;  /*here still mybox2 is point to the orignal object.
//        mybox = null; * in this case mybox1,mybox2 is pointing to the same object*/
        double vol;
        //assing value to mybox instance variable.
        mybox.width   = 10;
        mybox.height  = 20;
        mybox.depth   = 30;

        //compute volue of box
        
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println(vol);

    }
}

