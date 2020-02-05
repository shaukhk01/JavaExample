class DemoArray
{
    public static void main(String[]args)
    {
        int add_month[]  = new int[12];
        int month_day [] = {31,28,31,30,31,30,31,31,30,31,30,31};
        String month_name[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

        for(int i=0;i<12;i++)
        {
            add_month[i] =month_day[i];
        }

        for(int i=0;i<12;i++)
            System.out.println(month_name[i]+"  "+add_month[i]);
    }
    }
