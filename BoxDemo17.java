class Open_Terminal
{
    int copy_value = 200;

    void Open_File()
    {
        Open_Tab Tab1 = new Open_Tab();/*here Open_Tab is inner class define in outer class
                                        *so that aall members can access by inner class also.
                                        *inner class variable is called local variable can't
                                        *access outer side class or method
                                        */
        Tab1.Close_Tab();
    }

    class Open_Tab
    {
        int y = 100;
        void Close_Tab()
        {
            System.out.println("OPen_Terminal: " + copy_value);
            System.out.println("Open_Tab Number: " + y);
        }
}
}

class BoxDemo17 
{
    public static void main(String[]args)
    {
        Open_Terminal T = new Open_Terminal();
        T.Open_File();
        system.out.println(T.y);//error because ur accessing inner class local variable from outer
    }
}

        
