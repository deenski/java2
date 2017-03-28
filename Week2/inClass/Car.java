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

public class Car
{
	// Private member variables, attributes of a Car.
	private String make;
	private String model;
	private double mileage;
	private String color;
	private Date year;
	
	// Static counter to keep track of how many Kelly_Car objects are created in
	// a program.
	// Initialize to 0.
	private static int counter = 0;
	
	// Default constructor, initialize members to default values.
	public Car()
	{
		// Increment static counter since a Kelly_Car was just created.
		counter++;
	}
	
	// Initializing constructor, initialize members to values passed in.
	public Car(String mk, String md, double mil, String col, Date yr)
	{
	   // Reuse set methods that already do validation.
		SetMake(mk);
		SetModel(md);
		SetMileage(mil);
		SetColor(col);
		SetYear(yr);
		
		// Increment static counter since a Kelly_Car was just created.
		counter++;
	}
	
	// Set methods, do some validation of input passed in.
	public void SetMake(String mk)
	{
		if (mk == null)
		{
			make = "";
		}
		else
		{
			make = mk;
		}
	}
	
	public void SetModel(String md)
	{
		if (md == null)
		{
			model = "";
		}
		else
		{
			model = md;
		}
	}
	
	public void SetMileage(double mil)
	{
		if (mil <= 0)
		{
			mileage = 0;
		}
		else
		{
			mileage = mil;
		}
	}
	
	public void SetColor(String col)
	{
	   if (col == null)
		{
		   color = "";
		}
		else
		{
			color = col;
		}
	}
	
	// Using the Java Date class from the Java.util package.
	public void SetYear(Date dt)
	{
		if (dt == null)
		{
			year = new Date();
		}
		else
		{
			year = dt;
		}
	}
	
	// Get methods, simple methods to return the private member variables.
	public String GetMake()
	{
		return make;
	}
	
	public String GetModel()
	{
		return model;
	}
	
	public double GetMileage()
	{
		return mileage;
	}
	
	public String GetColor()
	{
		return color;
	}
	
	public Date GetYear()
	{
		return year;
	}
	
	// toString method so objects of this class can be printed
	// using System.out.println.
	public String toString()
	{
		String str = new String("A Car: \nMake = " + make + "\nModel = " + model +
			"\nMileage = " + mileage + "\nColor = " + color + "\nYear = " + year + "\n");
			
		return str;
	}
	
	// Static method to return the number of Kelly_Car objects created.
	public static int GetCarCounter()
	{
		return counter;
	}		
	
	// Define a MakeCopy method to be used for deep copies.
	// Call this instead of using the = operator.
	// Makes a copy of the object that calls this, returning the copy.
	public Car MakeCopy()
	{
		// Create a new car object and fill it with the same information
		// as the passed in car object.
		Car newCar = new Car();
		newCar.SetMake(GetMake());
		newCar.SetModel(GetModel());
		newCar.SetMileage(GetMileage());
		newCar.SetColor(GetColor());
		newCar.SetYear(GetYear());
				
		// Now return the new car object.
		return newCar;
	}
}