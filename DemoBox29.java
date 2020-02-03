//if value is found then terminate program
class DemoBox
{
    public static void main(String[]args)
    {
        int arr[] = {2,3,4,7,8,9,5,34,32,10,22,79};
        int val = 5;
        boolean found = false;

        for(int x : arr)
        {
            if(x == val)
            {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("value is found");
    }
}


            
            
