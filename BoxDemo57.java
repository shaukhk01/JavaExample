class SampleSwitch
{
    final int x = 0;
    public static void main(String[]args)
    {
        for(int i=0;i<5;i++)
            switch(i)
            {
                case x://must be constant expression required
                    System.out.println("ZERO");
                case 1:
                    System.out.println("ONE");
                case 3:
                    System.out.println("THREE");
                case 2:
                    System.out.println("TWO");
                default:
                    System.out.println("NO MATCHED");
            }
    }
}
