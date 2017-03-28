public class Book {

    private String title;
    private Author author;
    private double price;
    
    public Book(String title, Author author, double price) {
        System.out.println("New Book Created");
        
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public Book() {
        System.out.println("New Book Created");

        this.title = "title of the book";
        this.author = new Author("Jerry", "Jerry@gmail.com", "Duhhh Jerry!", 'm');
        this.price = 10.99;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(Author author) {
        this.author = author;
    }
    
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public Author getAuthor() {
        return this.author;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public String toString() {
        String returnString = "Title: " + this.title + "\n\n" +
            "Author: " + this.author.toString() + "\n" +
            "Price: " + this.price;
            
        return returnString;
    }
}