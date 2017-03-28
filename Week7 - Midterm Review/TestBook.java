public class TestBook {
    public static void main(String[] args) {
        Author jake = new Author("Jake Vendegna", "Jake@gmail.com", "Hi I'm Jake", 'm');
        Book myBook = new Book("My Book", jake, 10.99);
        
        //System.out.println(myBook);
        System.out.println(myBook.getTitle());
        System.out.println(myBook.getAuthor());
        System.out.println(myBook.getPrice());
    }
}