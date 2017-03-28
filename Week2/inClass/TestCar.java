// In this assignment you need to develop a class named yourlastname_Car with the following attributes: 
// model, year, color, mileage.  It should also have the following methods: a default constructor, 
// set and get methods for each of the attributes, and a toString method that prints out the Car information in any format you choose.  
// This code should go into a yourlastname_Car.java file.
//
// Then you need to develop a class with a main method to test your Car class, name it yourlastname_TestCar.java.  
// It will create one or more objects of the class Car and test all the methods.  Please refer to the 
// Student class example given in this week's module to do this assignment.  
// Note: You may add other attributes and methods if you would like, just be sure you test everything in your Car class in your main. 
//
// Extra Credit: For 5 points of extra credit, add a static member variable to your class and a static method to access it.  
// Test this method from your test program.


import java.util.Date;

public class TestCar
{
	public static void main(String [] args)
	{
		// Create a default Car and test get methods.
		Car c1 = new Car();
		
		System.out.println("Car 1 (Default): \n");
		System.out.println("Make = " + c1.GetMake());
		System.out.println("Model = " + c1.GetModel());
		System.out.println("Mileage = " + c1.GetMileage());
		System.out.println("Color = " + c1.GetColor());
		System.out.println("Year = " + c1.GetYear());
		
		// Test static counter method.
		System.out.println("Number of Car objects: " + Car.GetCarCounter());
		System.out.println();
		
		// Test print method.  Just print the object, it will call Car toString().
		System.out.println(c1);
		
		// Now create a second car using initializing constructor.
		Date year = new Date(101, 8, 1);
		Car c2 = new Car("Ford", "Escape", 200000, "blue", year);
		
		System.out.println("Car 2 (Initialized): \n");
		System.out.println("Make = " + c2.GetMake());
		System.out.println("Model = " + c2.GetModel());
		System.out.println("Mileage = " + c2.GetMileage());
		System.out.println("Color = " + c2.GetColor());
		System.out.println("Year = " + c2.GetYear());

		// Test static counter method.
		System.out.println("Number of Car objects: " + Car.GetCarCounter());
		System.out.println();

		// Test print method.  Just print the object, it will call Car toString().
		System.out.println(c2);

		// Now create a bad car with invalid values, make sure they are not set that way.
		Car c3 = new Car(null, null, -10, null, null);
		
		System.out.println("Car 3 (Invalid values): \n");
		System.out.println("Make = " + c3.GetMake());
		System.out.println("Model = " + c3.GetModel());
		System.out.println("Mileage = " + c3.GetMileage());
		System.out.println("Color = " + c3.GetColor());
		System.out.println("Year = " + c3.GetYear());

		// Test static counter method.
		System.out.println("Number of Car objects: " + Car.GetCarCounter());
		System.out.println();

		// Test print method.  Just print the object, it will call Car toString().
		System.out.println(c3);

		// Test MakeCopy, a deep copy.
		System.out.println("Car 4 (A deep copy of Car 2): \n");
		Car c4 = c2.MakeCopy();
		System.out.println(c4);
	}
	
}