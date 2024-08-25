/*
   Problem Statement:

Create a Book class with the following attributes:

title (String)
author (String)
price (double)
Implement the following constructors:

No-Argument Constructor: Initializes title to "Untitled", author to "Unknown", and price to 0.0.
Parameterized Constructor: Accepts title, author, and price as parameters to initialize the attributes.

*/
public class Book
{
    String title ;
    String author;
    double price;
    //NO Argument Constructor
    Book()
    {
        title = "Untitled";
        author = "Unknown";
        price = 0.0;
    }
    // Parametrized Constructor
    public Book(String title, String author, double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    //Display information
    void displayInfo()
    {
        System.out.println("Title - " + title);
        System.out.println("Author - " + author);
        System.out.println("Price - " + price);
    }

    public static void main(String[] args)
    {
        Book s1 = new Book();
        s1.displayInfo();

        Book s2 = new Book("Atomic Habits", "James Clear", 365.00);
        s2.displayInfo();
    }
}