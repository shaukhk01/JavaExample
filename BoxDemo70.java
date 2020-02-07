class Student
{
    public int roll_no;
    public String name;
    Student(int roll_no,String name)
    {
        this.roll_no = roll_no;
        this.name    = name;
    }
}
class ArrayObject
{
    public static void main(String[]args)
    {
        //allocating memory for 5 object type os student
      /*  Student[] arrob = new Student[5];
        //initialize the first element of the array
        arrob[0] = new Student(1,"annie");
        arrob[1] = new Student(2,"bridget");

        System.out.println(arrob[0].roll_no);
        System.out.println(arrob[1].name);
        */
        Student ob = new Student(1,"annnie");  //here we are creating two referece variable
        Student ob1 = new Student(2,"bridget");//But above[arrayObject]only one create and assing
        System.out.println(ob.roll_no);
        System.out.println(ob1.name);
    }
        
    }
