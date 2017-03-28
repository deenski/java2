/*
Jakob Vendegna
CSC 161 201
2/22/17

Description:
*/
import java.util.Scanner;

public class Week6Homework {
	
	public static void main(String[] args) {
		        
        boolean tF = true;
               
//      testRegex("madam im adam", "[^a-zA-Z]", "");
        
        
        do {
            Scanner scanner = new Scanner(System.in);
            
            

            System.out.println("Please input a word or string and I will test to see if it is a palendrome: ");
            String userInput = scanner.nextLine();
    		String newWord = userInput.trim().replaceAll("[^a-zA-Z]","").toLowerCase();
            
//             System.out.println(newWord.length()-1);
            
    	    boolean palendrome = isPalendrome(newWord, 0, newWord.length() - 1);
            
//              for(int i=0;i<newWord.length();i++) {
//     		    	System.out.print(newWord.charAt(i));
//     			
//     		    }
            
            if (palendrome) {
                System.out.println(newWord + " is a palendrome");
            }
            else {
                System.out.println(userInput + " is not a palendrome");
            }
            
            System.out.println("Continue? y/n");
            
            char reply = scanner.next().trim().toLowerCase().charAt(0);
            
            if (reply == 'y') {
                tF = true;
            }
            else {
                tF = false;
            }
        }
        while(tF);
	}
    
    public static boolean isPalendrome(String test, int baseCase, int finalCase){  
        
        if (test.length()  <= 1) {
            
            return true;
        }
        else {
            if (test.charAt(baseCase) == test.charAt(finalCase)) {
                //System.out.println(test.substring(baseCase+1, finalCase));

                test = test.substring(baseCase+1, test.length()-1);
                
                return isPalendrome(test, baseCase, test.length()-1);            

            }
            
            else {
                return false;
            }           
        }   
    
    }
    
    public static void testRegex(String testString, String reg, String rep) {
        System.out.println(testString.trim().replaceAll(reg, rep));
    }
}