/*
Jakob Vendegna
CSC 161 201
2/17/17

Description: Week 5 Homework: Fun with ArrayList
*/

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Week5Homework {
	
	public static void main(String[] args) {
		final String FILENAME = "textfile.txt";
		String animalName;

		try {
			Scanner inFile = new Scanner(new FileReader(FILENAME));
		    
            //original list
			ArrayList<String> animals = new ArrayList<String>();

			while(inFile.hasNext()) {
				animalName = inFile.next();
				animals.add(animalName);
			}
            
            //print calls
			display(animals,"Animals in order: ");
           
			displayInReverse(animals, "Animals in reverse order: ");
            
            printList(displayPluralAllCaps(animals, "Animals in plural transformed to ALL CAPS: "));
            
            displayNoPlurals(animals, "Animals with plural forms removed: ");
            
            //close the text file
			inFile.close();

		}

		catch(FileNotFoundException e) {
            //just in case
			System.out.println("File Not Found.");
			System.out.println(FILENAME + " is not where I am looking.");
		}

	}
    
    public static void display(ArrayList<String> animals, String h) {
        //this method simply iterates through the ArrayList and prints each
        //item in it.
        System.out.println(h);

        Iterator<String> iterator1 = animals.
        
        for(String animal : animals) {
            System.out.printf("%s%n", animal);         
        }
        
        System.out.printf("%n%n");
    }
    

    //overloaded
    public static void display(List<String> list, String h) {
        //same as above, but with a List instead of an ArrayList
        System.out.println(h);
        
        for (String element: list) {
            System.out.printf("%s%n", element);
        }
        System.out.printf("%n%n");
            
    }

    
    public static void displayInReverse(ArrayList<String> animals, String h) {
        //this one makes a copy of the original ArrayList in an Array
        //then prints out items in the array from the last item to the
        //first.
        System.out.println(h);
        String[] copy =  animals.toArray(new String[0]);

        for(int i = (copy.length - 1); i >= 0; i--) {

        	System.out.printf("%s%n", copy[i]);
   
        }
        
        System.out.printf("%n%n");

    }
    
    public static ArrayList<String> displayPluralAllCaps(ArrayList<String> animals, String h) {
        
        //Here's where the fun starts, this method makes a copy of the array,
        //then iterates through that list the old fashioned way to find items
        //which end in the letter s or i (plurals in this case)
        //and transforms that word into upper case.
        //this method will not print anything but the header 
        //unless you pass it as an argument into printList(ArrayList<String> s)
        
        System.out.println(h);
        
        String[] copy = animals.toArray(new String[0]);
        
        for(int i = 0; i < copy.length; i++) {
           if (copy[i].endsWith("s") || copy[i].endsWith("i")) {
               copy[i] = copy[i].toUpperCase();
           }
           
           
       }
       //copy the array back into an ArrayList<String>
       ArrayList<String> output = new ArrayList<String>(Arrays.asList(copy));
       
       return output;
    }
    
    public static void displayNoPlurals(ArrayList<String> animals, String header) {
        //copies the ArrayList created in displayPluralAllCaps(...)
        ArrayList<String> input = displayPluralAllCaps(animals, header);
        //removes plural forms of words
        for(int i = 0; i < input.size(); i++) {
            String s = input.get(i);
            if(input.get(i).endsWith("S") || input.get(i).endsWith("I")) {
                input.remove(i);
            }
        }
        //prints the items in the ArrayList
        printList(input);
        
    }
    
    
    public static void printList(ArrayList<String> a, String h) {
        //Okay, so this is my attempt to not re-use code to print each item
        //found in an ArrayList
        int counter = 0;
        System.out.println(h);
        for(String c : a) {
            System.out.printf("%s ", c);
            counter ++;
            
            //print 3 items, then a new line, then 3 items, etc...
            if(counter == 3) {
                System.out.println();
                counter = 0;
            }
        }
        System.out.printf("%n%n");
            
            
    }
    
    //overloaded
    public static void printList(ArrayList<String> a) {
        //I overloaded the method so that
        //you could pass this method one of the display
        //methods which already has a header attached
        //and will print that header message from
        //within the display method you pass as an argument
        //here.
        int counter = 0;
        for(String c : a) {
            System.out.printf("%s ", c);
            counter ++;
            if(counter == 3) {
                System.out.println();
                counter = 0;
            }
        }
        System.out.printf("%n%n");
    }
    
    
}