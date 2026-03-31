
package arrallistlibrary;


public class Book 
{
    int bookId;
    String title;
    String author;
    String status; 

   
    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.status = "Available";
    }

   
    void display() 
    {
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Status  : " + status);
        System.out.println("--------------------------");
    }

}

    

