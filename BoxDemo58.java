class NestSample
{
    public static void main(String[]args)
    {
        for(int i=0;i<10;i++)
            switch(i)
            {
                case 1:
                    System.out.println("ONE");
                    
                case 2:
                    System.out.println("TWO");
                    
                case 3:
                    System.out.println("END of Execution");
                    switch(i)
                    {
                        case 3:
                             for(int j =0;j<=3;j++)
                            switch(j)
                            {
                                case 0:
                                    System.out.println("J switch ONE");
                                case 2:
                                    System.out.println("J switch TWO");
                                case 3:
                                    for(i=0;i<4;i++)
                                        System.out.println("End");
                            }
                    }
            }
    }
}
                    
