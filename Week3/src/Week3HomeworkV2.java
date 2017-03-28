/*
Jakob Vendegna
CSC 161 201
2/1/17

Description: Testing app for animal subclasses
*/
import java.util.Scanner;
public class Week3HomeworkV2 {
	
	public static void main(String[] args) {
    
        //set to determine the amount of animals in the array
        final int OBJECTS_CREATED = 2;
        //create an array of animals
		Animal arrayOfAnimals[] = new Animal[OBJECTS_CREATED];
        
        //declare variables
        Scanner in = new Scanner(System.in);
        boolean tester = true;
        boolean tester2 = true;
        String userInput, name, message, type, color;
        Double speed = 0.1;
        Double beakLength = 1.0;
        
        //start looping through the user interface to create turtles and crows
        for(int i = 0; i < OBJECTS_CREATED; i++) {

            System.out.println("Would you like to create a Turtle or Crow? (T/C)");
            userInput = in.next();
            
            //create a turtle
            if (userInput.toLowerCase().equals("t")) {
            	
                System.out.println("Enter a name for your Turtle: ");
                name = in.next();

                System.out.println("And what does your turtle say?");
                in.nextLine();
                message = in.nextLine();
                
                // types other than box or snapping will result in the 
                // creation of a Teenage Mutant Ninja Turtle
                System.out.print("What kind of turtle is " + 
                                    name + "?\nSnapping, box, or other?\n");
                type = in.next();

                // a turtle must have an acceptable speed. This could be
                // moved to the Turtle setSpeed() method
                while (tester) {
                    System.out.println("How fast is " + name + "? (1-5): ");
                    speed = in.nextDouble();
                    if (speed >= 1.0 && speed <= 5.0) {
                    	tester = false;
                    }
                    else {
                        if (speed < 0)
                            System.out.println("Turtle's aren't that slow!");
                        else
                            System.out.println("Turtles aren't that fast!");
                    }
                }
                // Create a Turtle in the array of Animals
                arrayOfAnimals[i] = new Turtle(name, message, type, speed);
                
                
                //uncomment next line for testing
                //System.out.println(arrayOfAnimals[i]);
                
            }
            
            // Create a Crow
            else {
            
                
                System.out.println("Enter a name for your Crow: ");
                name = in.next();

                System.out.println("And what should we teach " + name + " to say?");
                in.nextLine();
                message = in.nextLine();

                System.out.println("What color is " + name + " White, Red, or Black?");
                color = in.next();
                
                // again, this test could be moved to the setBeakLength() method
                // inside the Crow class
                while(tester2) {
                    System.out.println("And how long is " + name + "'s beak? (1-5): ");
                    beakLength = in.nextDouble();
                
                    if (beakLength >= 1.0 && beakLength <= 5.0) {
                        tester2 = false;
                    }
                    
                    else {
                    
                        if(beakLength < 0) {
                            System.out.println("You can't have a negative length of a beak");
                        }
                        
                        else if(beakLength < 1) {
                            System.out.println("A beak that small would hardly be fitting on a crow...");
                        }
                        
                        else {
                            System.out.println("A beak that large would hardly be fitting on a crow...");
                        }
                    }
                }
                
                // create the Crow in the array
                arrayOfAnimals[i] = new Crow(name, message, color, beakLength);
                
                //uncomment next line for testing
                //System.out.println(arrayOfAnimals[i]);
                
            }
        }
        
        // call the speak() method for each of the Animals in the array.
        for (Animal currentAnimal : arrayOfAnimals) {
            if (currentAnimal instanceof Turtle) {
                // downcast
                Turtle currentTurtle = (Turtle) currentAnimal;
                
                System.out.println(currentAnimal.getName() + " says: ");
            }
            System.out.println(currentAnimal.speak());
        } 
    }
}

