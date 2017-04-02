// Jakob Vendegna
// CSC 161
// 3.28.17

// palendrome checker

import java.util.Scanner;

public class PalendromeTest
{
   public static void main(String[] args)
   {
      // loop control variable
      boolean keepOn = true;
      
      // new Scanner for input
      Scanner kb = new Scanner(System.in);
      
      while (keepOn)
      {
         
         // variables for use in testing
         boolean isPalendrome = false;
         boolean truth = false;
         int count = 0;
         
         // get user input
         System.out.println("Input a word and I will test it for its palendrome-esque properties.");
         String userInput = kb.nextLine();
         
         // convert to lower case and remove spaces
         String testInput = userInput.toLowerCase();
         testInput = testInput.replaceAll("\\s","");
         
         // create a stack and a queue
         MyStack stack = new MyStack("new stack");
         MyQueue queue = new MyQueue("new queue");
         
         // add each letter to the stack and queue
         for (int i = 0; i < testInput.length(); i++)
         {
            stack.push(testInput.charAt(i));
            queue.enqueue(testInput.charAt(i)); 
         }
         
         // test each object in the stack and queue
         // to see if they match
         for (int i = 0; i < testInput.length(); i++)
         {
            Object test1 = stack.pop();
            Object test2 = queue.dequeify();
            
            if (test1.equals(test2))
            {
               truth = true;
            }
            else
            {
               //increment the count variable and exit the loop
               //if one letter is out of place, the String is not a palendrome
               count++;
               break;
            }
         }
         
         // check test variables, if true input is a palendrome
         if (count == 0 && truth == true)
         {
            isPalendrome = true;
         }
         
         // print the results of the test.
         if (isPalendrome == true)
         {
            System.out.println(userInput + " is a palendrome.");
         }
         else
         {
            System.out.println(userInput + " is not a palendrome.");
         }
         
         
         // remain in the loop?
         System.out.println("Would you like to test another? y/n");
         
         userInput = kb.nextLine().toLowerCase();
         
         if (userInput.equals("y"))
         {
            keepOn = true;
         }
         else
         {
            System.out.println("Thanks for playing!");
            keepOn = false;
         }         
      }  
   }
}