/*
Jakob Vendegna
CSC 161 201
3/8/17

Description: Create a list of Entertainment items and be able to 
add, search, delete, and print that list.


Kathleen: I completely failed at this I think. I've not looked at a single internet
    resource and I have spent 16 or so hours on this. I'm just done with it.
    Not having access to the Java Documentation for this really screwed me up. I guess
    I need to work more on memorization of fucntionality of basic class methods or something.
    Really sorry to waste your time grading this heap of garbage.
    
    Maybe I am just beating myself up over this, but I've never REALLY struggled with 
    a programming assignment. This one got me.  I enjoyed the challenge and look 
    forward to learning how this could have been done the smart way.
    
    I hope your surgery goes well. Best wishes.
    Jake
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;


public abstract class Midterm implements Comparable{

    public static Movie newMovie() {
        //add a movie to the arrayList
		Movie userMovie = new Movie();
        String userInput;
		Scanner kb = new Scanner(System.in);
		System.out.println("Okay, what is the title of your Movie?");
        userInput = kb.nextLine();
		userMovie.setTitle(userInput);                        
        
		System.out.println("And who made the movie?");
        userInput = kb.nextLine();
		userMovie.setCreator(userInput);
        
		System.out.println("What is the movie rated?");
        userInput = kb.nextLine();
		userMovie.setRating(userInput);
        
		System.out.println("Give me a description of the movie please.");
        userInput = kb.nextLine();
		userMovie.setDescription(userInput);
		
		return userMovie;
	}

	public static TVShow newTVShow() {
        //add a TVShow to the arrayList
		TVShow userShow = new TVShow();
		Scanner kb = new Scanner(System.in);
        String userInput;
        
		System.out.println("Okay, what is the title of your TV Show?");
        userInput = kb.nextLine();
		userShow.setTitle(userInput);
		
		System.out.println("And what is the show's parental guidelines rating?");
		userInput = kb.nextLine();
		userShow.setRating(userInput);

		System.out.println("What day does it typically air on?");
		userInput = kb.nextLine();
		userShow.setDayOfWeek(userInput);

		System.out.println("Give me a brief description of the show please.");
		userInput = kb.nextLine();
		userShow.setDescription(userInput);
		
		return userShow;
	}

	public static Entertainment search(List<Entertainment> aL) {
        //search functionality
        Scanner kb = new Scanner(System.in);
        Iterator it = aL.iterator();
        //gotta return something...
        Entertainment noShow = new TVShow("Item Not Found", "No Entertainment items were retrieved");
        try{
    		System.out.println("Okay, let's search. Are you looking for a Movie(1) or TV Show(2)?");
    		int choice = kb.nextInt();
            boolean result;
            
            // I think I went about this incorrectly. Probably should have gotten recursive with it.
            // searching for movies works well, but not so much for tv shows... IDK it breaks
            // if you add a movie to the list before searching. I must be brain dead this week.
            if (choice == 1) {
                List<Entertainment> copy = new ArrayList<>();
                
                for (int i = 0; i < aL.size(); i++) {   
                    if (aL.get(i) instanceof Movie) {
                        copy.add(aL.get(i));
                        System.out.println(copy.get(i).getTitle());
                    }
                } 
             
             
                System.out.println("What is the title of the Movie you're looking for?");
                kb.nextLine();        
                String choice2 = kb.nextLine();
                for (int i = 0; i < aL.size()-1;i++) {
                    Entertainment testMovie = copy.get(i);
                    
                    
                    if (testMovie.getTitle().equals(choice2)) {
                        return testMovie;
                    }
                    else {
                        System.out.println("Item not found at slot " + i);
                        
                    }
        	    }
            }
            //I give up... Should work like above, I can copy and paste, change variable names to suit
            // it doesn't seem to matter. I just can't figure out why it won't work... I've tried
            // about 15 different ways... I can't even get the first for loop to add any TVShows to 
            // the copied List. Sorry to dissapoint. The movie search functionality works fine.
            else if (choice == 2) {
                List<Entertainment> otherCopy = new ArrayList<>();
                
                for (int i = 0; i < aL.size()-1; i++) {   
                    if (aL.get(i) instanceof TVShow) {
                        otherCopy.add(aL.get(i));
                        System.out.println(otherCopy.get(i).getTitle());
                    }

                } 
             
                System.out.println("What is the title of the TV Show you're looking for?");
                kb.nextLine();
                String choice2 = kb.nextLine();
                for (int i = 0; i < aL.size()-1;i++) {
                    Entertainment testShow = otherCopy.get(i);

                    if (testShow.getTitle().equals(choice2)) {
                        return testShow;
                    }
                    else {
                        System.out.println("Item not found at slot " + i);
                        
                    }
        	    }           
            }    
            else {
            InvalidEntryException invalid = new InvalidEntryException();
            throw invalid;
            
            }
        }
        catch (InvalidEntryException e) {
            System.out.println(e.message);
        }
        
        return noShow;
    }
    // again, I think my approach is off. I can't even seem to get the title 
    // from any of the objects in my list.
	public static List<Entertainment> deleteItem(List<Entertainment> aL) {
        Scanner kb = new Scanner(System.in);
		Iterator it = aL.iterator();
		System.out.println("Okay, what would you like to delete, please enter the title.");
		String choice = kb.next();
        
            for (int i = 0; i < aL.size(); i++) {
        		if (it.hasNext()) {
                    System.out.println(it.next());
                    String title = aL.get(i).getTitle();
                    if(title.compareTo(choice) == 0) {
                        aL.remove(i);
                        System.out.println(choice + "Deleted");
                    }
                }
                    else {
                    System.out.println("Item not found at slot " + i);
                    }
         		}
            
        
        
		return aL;
	}
	

	//again, I think my approach is just flat out wrong. 
    // I am not sure what I am doing wrong, just that it isn't working well, 
    // and I am out of time. Not literally, but staring at it any longer not knowing
    // why isn't going to change anything.
	public static void main  (String[] args) throws FileNotFoundException {
		List<Entertainment> areYouNotEntertained = new ArrayList<Entertainment>();
		Iterator it = areYouNotEntertained.iterator();
		Scanner kb = new Scanner(System.in);
        Scanner inFile = new Scanner(new FileReader("entertainment.txt"));
        
        while (inFile.hasNext()) {
            if (inFile.next().equals("Movie")) {
                inFile.nextLine();
                Movie newMovie = new Movie();
                String getInfo = inFile.nextLine();
                newMovie.setTitle(getInfo);
                getInfo = inFile.nextLine();
                newMovie.setCreator(getInfo);
                getInfo =  inFile.nextLine();
                newMovie.setRating(getInfo);
                getInfo = inFile.nextLine();
                newMovie.setDescription(getInfo);
                
                areYouNotEntertained.add(newMovie);
            }
            //the thing added all of my movies just fine
            //throws away the first and last TVShow in my list,
            //but finds and adds the middle one... I am sure it
            //has something to do with the .nextLine() functionality.
            //not using the internet, I can't figure it out.
            else if(inFile.next().equals("TVShow")) {
                inFile.nextLine();
                TVShow newShow = new TVShow();
                String getInfo = inFile.nextLine();
                newShow.setTitle(getInfo);
                getInfo = inFile.nextLine();
                newShow.setRating(getInfo);
                getInfo = inFile.nextLine();
                newShow.setDescription(getInfo);
                getInfo = inFile.nextLine();
                newShow.setDayOfWeek(getInfo);
                
                
                areYouNotEntertained.add(newShow);
            }
        }
		String input;
        

		System.out.println("Are you not Entertained!?");
		System.out.println("Let's catalog your Entertainment library to curb the bordem.");

		boolean exit = true;
		while(exit) {
			//display menu
			System.out.printf("Input:\n" +
                              "1 to add media to your library,\n" +
							  "2 to search for an item in your library,\n" +
							  "3 to delete an item\n" +
							  "4 to view the contents of your entire library\n" +
							  "5 to exit\n");
            //get choice
			input = kb.next();
			try {
                //add
				if (input.equals("1")) {
					System.out.println("Okay, 1 for movie, 2 for tv show.");
					int choice = kb.nextInt();

					if (choice == 1) {
						areYouNotEntertained.add(newMovie());
					}
					else if (choice == 2) {
						areYouNotEntertained.add(newTVShow());
					}
				}
                //search
				else if (input.equals("2")) {
					System.out.println(search(areYouNotEntertained));
                   
				}
                //delete
				else if (input.equals("3")) {
					areYouNotEntertained = deleteItem(areYouNotEntertained);
				}
                //print - at least this works, but I feel really 
                //squanching stupid for only achieving this much.
				else if (input.equals("4")) {
					for(int i = 0; i < areYouNotEntertained.size(); i++) {
						System.out.println(areYouNotEntertained.get(i));
                    }
					
				}
                //exit
				else if (input.equals("5")) {
					exit = false;
				}
                // catch any b.s. the user gives us.
				else {
					InvalidEntryException comeOn = new InvalidEntryException();
					throw comeOn;
				}
			}
			catch(InvalidEntryException e) {
				System.out.println(e.message);
			}       
		}
		
	}

	

}