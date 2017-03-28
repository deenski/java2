/*
Jakob Vendegna
CSC 161 201
2/22/17

Description: test to see if a string is a palindrome
*/
import java.util.Scanner;

public class Week6Homeworkv2 {
	
	public static void main(String[] args) {
		// bool for loop control        
        boolean tF = true;        
        
        do {
            // use Scanner to get input
            Scanner scanner = new Scanner(System.in);
            boolean palindrome;
            
            //promt user for direct or iterative recursion
            System.out.println("Would you like to experience direct or iterative recursion?");
            char choice = scanner.nextLine().toLowerCase().charAt(0);
            
            // get the string they want to convert
            System.out.println("Please input a word or string and I will test to see if it is a palindrome: ");
            String userInput = scanner.nextLine();
            // and remove all special characters leaving only a-z and A-Z, 
            //then drop it to lower case for ease of matching
    		String newWord = userInput.trim().replaceAll("[^a-zA-Z]","").toLowerCase();
            
            // determine if they want to use direct or iterative recursion
            if(choice == 'i') {
                // inform them I recognize their choice
                System.out.println("Proceeding with iterative recursion");
                // test the string
                palindrome = determineLength(newWord);
                // print the results of the test
                finalString(newWord, palindrome);
            
            }
            else{
                // inform
                System.out.println("Proceeding with direct recursion");
                // test
                palindrome = isPalendromeDirect(newWord, 0, newWord.length() - 1);
                // print results
                finalString(newWord, palindrome);       
            }
           
            // test complete
            
            
            // prompt the user to test another word/phrase
            System.out.println("Continue? y/n");
            char reply = scanner.next().trim().toLowerCase().charAt(0);
            if (reply == 'y') {
                tF = true;
            }
            else {
                tF = false;
            }
            // end prompt
        }
        while(tF);
	}
    
    public static boolean isPalendromeDirect(String test, int baseCase, int finalCase){  
        // direct recursion method
        
        // if the length of the string is 0 or 1 then the string has passed all of the 
        // prior tests, and we now know it is a palindrome
        // Base Case
        if (test.length()  <= 1) {
            
            return true;
        }
        
        else {
            // test the characters at the beginning and end of the string
            if (test.charAt(baseCase) == test.charAt(finalCase)) {
                // if they match, cut those letters off
                test = test.substring(baseCase+1, test.length()-1);
                // and run the method again with the new string
                return isPalendromeDirect(test, baseCase, test.length()-1);            

            }
            
            else {
                // if at any point the first and last letters don't match
                return false;
            }           
        }   
    
    }
    
    public static boolean determineLength(String test) {
        // base case
        if (test.length() <= 1) {
            // has passed all tests
            return true;
        }
        
        else {
            // until the string is down to 1 or 0 charachters
            // pass it into the testChars method
            return testChars(test);
        }
    }
    
    public static boolean testChars(String test) {
        // test the first and last characthers
        if (test.charAt(0) == test.charAt(test.length()-1)) {
            // if they match, chop them off
            test = test.substring(1, test.length()-1);
            // then pass the new string back to determineLength
            return determineLength(test);
        }
        else {
            // if they dont pass the test, the string is not a palindrome
            return false;
        }
                
    }
    
    public static void finalString(String s, boolean b) {
        // method to reduce re-used code
        // it prints the results of the test
        if (b) {
            System.out.println(s + " is a palindrome");
        }
        else {
            System.out.println(s + " is not a palindrome");
        }
    }
    
}