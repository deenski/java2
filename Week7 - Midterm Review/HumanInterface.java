import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;

public class HumanInterface {
    
    public static void main(String[] args) throws FileNotFoundException {
        TruckDriver testDriver = createNewDriver();
        System.out.println(testDriver);
        
        Author testAuthor = createNewAuthor();   
        System.out.println(testAuthor);  
        
        Book testBook = createNewBook(testAuthor);
        System.out.println(testBook);
        
        Truck testTruck = createNewTruck(testDriver);
        System.out.println(testTruck);
        
    }
    
    private static TruckDriver createNewDriver() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        
        System.out.print("From file or from scratch? f for file: ");
        char reply = input.nextLine().charAt(0);
        
        if (reply == 'f') {
            
            Scanner infile1 = new Scanner(new FileReader("drivers.txt"));
            
            String driverName = infile1.nextLine();
            String driverEmail = infile1.nextLine();
            String driverMessage = infile1.nextLine();
            char driverGender = infile1.nextLine().charAt(0);
                            
            TruckDriver testDriver = new TruckDriver(driverName, driverEmail, driverMessage, driverGender);
            
            return testDriver;
        }
        
        else {
            TruckDriver driver = new TruckDriver();
            System.out.println("From Scratch then!\nWhat is the driver's name?");
            driver.setName(input.nextLine());
            System.out.println("What is the driver's email address?");
            driver.setEmail(input.nextLine());
            System.out.println("What is the driver's Message?");
            driver.setMessage(input.nextLine());
            System.out.println("What is the driver's gender? f for female");
            driver.setGender(input.nextLine().charAt(0));
            
            return driver;
            
        }

    
    }
    private static Author createNewAuthor() {
        Scanner input = new Scanner(System.in);
        Author author = new Author();
        System.out.println("Let's create an author\nWhat is the author's name?");
        author.setName(input.nextLine());
        System.out.println("And what is their email address?");
        author.setEmail(input.nextLine());
        System.out.println("And what is their message?");
        author.setMessage(input.nextLine());
        System.out.println("And what is their gender?");
        author.setGender(input.nextLine().charAt(0));
        
        return author;
    }
    
    private static Truck createNewTruck(TruckDriver driver) {
        Scanner input = new Scanner(System.in);
        Truck truck = new Truck();
        System.out.println("Let's create a Truck!\nWhat Make of Truck?");
        truck.setMake(input.nextLine());
        System.out.println("And what Model is it?");
        truck.setModel(input.nextLine());
        System.out.println("And what Year is it?");
        truck.setYear(input.nextInt());
        System.out.println("And what Sound does it make?");
        truck.setSound(input.nextLine());
        truck.setDriver(driver);
        
        return truck;
    }
    
    private static Book createNewBook(Author author) {
        Scanner input = new Scanner(System.in);
        Book book = new Book();
        
        System.out.println("Let's make a book!\nWhat is the title of the book?");
        book.setTitle(input.nextLine());
        book.setAuthor(author);
        System.out.println("What is the price of the book?");
        book.setPrice(input.nextInt());
        
        return book;
    }
}