"The Composition is special Case of Aggregation
"The Composition is more restrictive from aggregation
"In Which Two entities are highly dependent on each other.

"COMPOSITION IN JAVA IS THE DESIGN TECHNIQUE TO IMPLEMENT HAS-A RELATIONSHIP IN CLASS
Java Composition is acheived by using instance variable that refers to other object.

Example:-
--------
import java.io.*;
import java.util.*;

//class Book
class Book
{
    public String title;
    public String Author;
    Book(String title,String author)
    {
        this.title = title;
        this.Author = author;
    }
}

//library class contain List of Books
class Library
{
    //reference to refer list of books
    private final List<Book>books;

    Library(List<Book> books)
    {
        this.books = books;
    }
    public List<Book> getTotalNoOFBook()
    {
        return books;
    }
}

class Execute
{
    public static void main(String[]args)
    {
        Book book1 = new Book("Effective Java","annie");
        Book book2 = new Book("Think In Java","nic");
        Book book3 = new Book("The Fun...","bridget");

        //creating List which containing the NoOf Books.
        List<Book>b = new ArrayList<Book>();
        b.add(b1);
        b.add(b2);
        b.add(b3);

        Library library = new Library(b);
        List<Book>bks = library.getTotalNoOFBook();
        for(Book bk : bks)
            System.out.println("Title:"+bk.title+"  "+bk.Author);
    }
}/*In the above example Library can have no of books
  *on same or different subjects so if Library getsdestoryed
  *then all all books within Library will be destoryed
  *i.e books can exists without Library.ITS COMPOSITION
  */



