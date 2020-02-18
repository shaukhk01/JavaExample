"If a class Hava an Entity Reference,It is Known as Aggregation.
"Aggregation Represents Has-A-RelationShip
"It is also a RelationShip between Two classes like Association
      /*+-------------------------------------------------------------+
       |Has-A relationship is based on usage,rather then  inheritance|
       |In Otherword class A Has-relationship with class B           |
       |If class A has a reference to an instance of Class B         |
       +-------------------------------------------------------------+
      */           Example:-
                   class Student
                     {String name;
                      Address student_class_instance_variable;
                     }"here Student has-A Address,And Student Class Instance Variable Type is Address

Example:-
========
class Author
{
    String authorName;
    int age;
    String place
    Author(String authorName,int age,String place)
    {
        this.authorName = authorName;
        this.age        = age;
        this.place      = place;
    }
    public String getName()
    {
        return authorName;
    }
    public int getAge()
    {
        return age;
    }
    public String getPlace()
    {
        return place;
    }
}
class Book
{
    String name;
    double price;
    //Author class details[this concept is called Aggregation or Has-A relationship]
    Author Books_instance;
    Book(String n,double p,Author Books_instance)
    {
        this.name  = n;
        this.price = p;
        this.Books_instance = Books_instance;
    }
    public void showDetails()
    {
        System.out.println("Books Name : "+name);
        System.out.println("Books Price: "+price);
        System.out.println("Author Name: "+Books_instance.getName());
    }
}

class Execute
{
    public static void main(String[]args)
    {
        Author au = new Author("Jhone",40,"Chicago");
        Book   b  = new Book("java",400,au);
        b.showDetails();
    }
}

//other Example see:Aggregation.java

