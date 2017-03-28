/*
Jakob Vendegna
CSC 161 201
2/18/17

Description: fun with collection iterators
*/
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListIteration {
	
	public static void main(String[] args) {
		System.out.println("Fun with collection iterators.\n");
        try {

        	System.out.println("Reading list from file 1..");
    		Scanner inFile = new Scanner(new FileReader("animals.txt"));
    		Scanner outFile = new Scanner(new FileReader("animalsToDestroy.txt"));
            
    		List<String> animals = new ArrayList<String>();
    		List<String> animalsToRemove = new ArrayList<String>();

    		while(inFile.hasNext()) {
    			String animalName = inFile.next();
    			animals.add(animalName);
    			System.out.println("added " + animalName + " to animals ArrayList.");
    		}
            System.out.printf("%n%n");
            System.out.println("Reading list from file 2..");
    		while(outFile.hasNext()) {
    			String animalName = outFile.next();
    			animalsToRemove.add(animalName);
    			System.out.println("added " + animalName + " to animalsToRemove ArrayList");
    		}
                
    	//this creates a copy of the ArrayList animals and prints it to the screen
    	//using an iterator to move through the list	
		printAnimals(copy(animals), "Printing copy of original list: ");

		//this creates a copy of both ArrayList animals and animalsToRemove
		//then creates an iterator for ArrayList animals and uses that iterator
		//to find out if any of the names in the copy of animals match the names in the copy
		//of animalsToRemove.
		//If the iterator finds a match, it removes that instance from the copy of the 
		//animals ArrayList, and then prints that copy to the screen.
		destroyAnimals(copy(animals), copy(animalsToRemove));
        
        }
        
        catch (FileNotFoundException e) {
        	//because you don't get to work with FileReader without the FileNotFoundException
            e.printStackTrace();
        }


	}

	public static ArrayList<String> copy(Collection<String> a) {
        System.out.println("\nCreating a copy of the List you passed me..");
		//create the copy of the original ArrayList
        ArrayList<String> animalsCopy = new ArrayList<String>();
        
        //using an Iterator, add each item found in the list, and inform the user what has been added.
        Iterator<String> iterator1 = a.iterator();
		while (iterator1.hasNext()) {
            String animalName = iterator1.next();
			animalsCopy.add(animalName);
			System.out.println("adding " + animalName + ", via an iterator," +
                " to a new ArrayList for modification.");
		}
		//inform the user that the copy is complete, and return that copy for further use.
		System.out.println("copy of ArrayList complete\n");
		return animalsCopy;
	}

    

    public static void printAnimals(Collection<String> a, String header) {
    	//print the header message passed
		System.out.printf("%s%n", header);


		//create an instance of an iterator from the first collection
		//in this case we are iteratng through a copy of the original
		//ArrayList<String> animals.
		Iterator<String> iterator1 = a.iterator();

		//while Collection<String> a has another word
		while (iterator1.hasNext()) {
			
			//print the word
			System.out.printf("%s%n", iterator1.next());
			
		}
	}


	public static void destroyAnimals(Collection<String> a, Collection<String> b) {
		//static header to send to printAnimals()
		String header = ("Destroying Animals in copy of ArrayList<String> animals\n\n" +
            "Printing list post iteration: ");

		//create an instance of an iterator from the first collection
		//again, in this case we are iterating through a copy of the original
		//ArrayList<String> animals.
		Iterator<String> iterator1 = a.iterator();

		//while Collection<String> a has another word
		while (iterator1.hasNext()) {
			//if that word is in the original file "animalsToDestroy.txt" which
			//has now been copied into the original ArrayList<String> animalsToRemove
			//and has since been copied and is passed into this method as Collection<String> b
			//if a word in "b" is found in "a", remove that word from "a"
			if (b.contains(iterator1.next())) {
				iterator1.remove();
			}
		}
        //now pass the header message and the modified Collection<String> a
        //into printAnimals() so we can view the modified List.
        printAnimals(a, header);
        System.out.printf("%n");
        
        String header2 = "Animals not found in list above: ";
        printAnimals(b, header2);
	}

}