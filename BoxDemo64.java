class Animal
{
    double size;
    String name;
    double getsize()
    {
        return size;
    }
   void setsize(double d)
   {
       size = d;
   }
   String getname()
   {
       return name;
   }
   void setname(String n)
   {
       name = n;
   }
}
class B
{
    public static void main(String[]args)
    {
      Animal[] pets;//note:pets have Animal[] type i.e now pets can store any type of data,str,int
        pets = new Animal[6];
        pets[0] = new Animal();//make sure each index need to create object then initialize
        pets[0].setsize(4.5);
        pets[1] = new Animal();//make sure each index need to create object then initialize
        pets[1].setsize(6.9);
        pets[2] = new Animal();
        pets[2].setname("Annie");

System.out.println("pets[0]: " + pets[0].getsize());/*here also expilict define indexofarray then
                                                    ;/*method name also.*/
System.out.println("pets[1]: " + pets[1].getsize());
System.out.println("pets[2]: " + pets[2].getname());

    }
}

