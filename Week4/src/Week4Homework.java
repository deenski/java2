/*
Jakob Vendegna
CSC 161 201
2/9/17

Description: Week 4 Homework - Exception Handling

*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class Week4Homework 
{
	

	public static void main(String[] args) 
        
	{
        // Declare constants
        final double CMPERIN = 2.54;
        final double INPERFT = 12;
        
        // for loop control
        boolean conditional = true;
        
        do 
        {

            try 
            {
                //create a Scanner object for user input
                Scanner userInput = new Scanner(System.in);
        		double feet, inches, centimeters;
        
                    //prompt for feet to convert
        			System.out.println("Enter feet and inches and I will convert the length to centimeters");
        			System.out.println("How many Feet?");
        			feet = userInput.nextDouble();
                       
        		
                    //prompt for inches
        			System.out.println("How many Inches?");
        			inches = userInput.nextDouble();
                    
                    // if either are negative, throw an exception
                    if(feet < 0 || inches < 0)
                    {
                        NegativeNumberException negative = new NegativeNumberException("Please Use Positive Intigers or Decimals");
                        
                        throw negative;
                    }
                    
                    // if inches is greater than or equal to 12, throw an exception
                    if(inches >= 12) 
                    {
                      NumbersException numbers = new NumbersException("Please limit inches to 12");
                      
                      throw numbers;
                    }
        		
        			// do the conversion to centimeters
        			centimeters = ((feet * INPERFT) + inches) * CMPERIN;
        		   
                    //print the message
                    String message = "The length in centimeters is: ";
        		    System.out.print(message + centimeters + "\n");
                    
                    //kill the loop if successful
                    System.out.println("Thanks for playing!");
                    conditional = false;
                                                                             
    
            
          
            }
            catch (InputMismatchException inputMismatchException)
		    {       
                //Uncomment to show where exception is caught
    			//System.out.println("caught in main().");
    			System.out.println("Please use only digit based numbers. Try again.");
               
			
		    }
                        
            catch (NegativeNumberException negativeNumberExceptioin)
            {
                //System.out.println("Caught in main().");
                System.out.println("Please use positive intigers or decimals only." +
                                    " Try Again .");
            }
            
            catch (NumbersException numbersException)
            {
                //System.out.println("Caught in main().");
                System.out.println(numbersException.getMessage());
            }

        }
        
        while(conditional);
    }
       
}