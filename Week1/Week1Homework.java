// Jakob Vendegna
// CSC 161 201
// Age Calculator Program - Week 1 Homework


// I really need some help with this error handling stuff. I do not understand
// how to throw errors in one file and catch them in another...
// I've spent way too much time trying to figure it out on my own to no avail.
// I don't want to bring it up in the discussion since it's extra credit.

import javax.swing.JOptionPane;


public class Week1Homework {
    public static void main(String[] args){
    
        boolean validate = true;
        
        while(validate) {
            
            try{
                //Get users birtday and split the logical parts.
                String dBox = JOptionPane.showInputDialog(
                        "Please input your birthday (mm/dd/yyyy)");
                String[] msgOutput = dBox.split("[/]");
                
                // String[] to individual int conversion
                int userMonth = Integer.parseInt(msgOutput[0]);
                int userDay = Integer.parseInt(msgOutput[1]);
                int userYear = Integer.parseInt(msgOutput[2]);
                
                //Uncomment next line for testing
                int userAge = displayAge(userMonth, userDay, userYear);
                
                // if the user enters a non-existent month, it will loop through main, if not it just prints errors... 
                if(userMonth > 0 && userMonth < 13) {
                    String message = "You are " + userAge + " years old";
                    
                    JOptionPane.showMessageDialog(null, message, "Age Calculator"  , JOptionPane.INFORMATION_MESSAGE);
                    
                    validate = false;
                
                }
                else {
                    throw new InvalidDateException();
                }
            }
            catch(InvalidDateException e) {
            
                JOptionPane.showMessageDialog(null, e.toString(), "Age Calculator", JOptionPane.WARNING_MESSAGE);
            
            }
              
        }
    
    }
    
    
    // return the users age, calculation done in AgeCalculator.java
    public static int displayAge(int m, int d, int y) {
                
        AgeCalculator cal = new AgeCalculator(m, d, y);
                
        int age = cal.getAge();
        
        return age;
        
             
    }
 
    
   
}