// Constructor overloading

public class Book {
    private String title;
    private String author;

    // Constructor with title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Constructor with title only
    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        book1.displayInfo();

        Book book2 = new Book("The Great Gatsby");
        book2.displayInfo();
    }
}
