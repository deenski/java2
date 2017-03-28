/*
Jakob Vendegna
CSC 161 201
2/1/17

Description: Testing app for animal subclasses
*/
import java.util.Scanner;
public class Week3Homework {
	
	public static void main(String[] args) {
		Animal arrayOfAnimals[] = new Animal[5];
		Scanner in = new Scanner(System.in);
		boolean tester, tester2;
        
        
        for(int i = 0; i < 5; i++) {
            System.out.println("Would you like to create a Turtle or Crow? (T/C)");
            String userInput = in.next();

            if (userInput.toLowerCase().equals("t")) {
            	//System.out.println(arrayOfAnimals[i]);
                System.out.println("Enter a name for your Turtle: ");
                String name = in.next();
                System.out.println("And what does your turtle say?");
                
                String message = in.nextLine();

                System.out.println("What kind of turtle is it? Snapping, box, or other?");
                String type = in.next();
                if (type.toLowerCase().equals("box") || type.toLowerCase().equals("snapping")) {
                    tester = true;	
                }
                else {
                	tester = false;
                }
                System.out.println("And what is the speed of your turtle? (1-5): ");
                Double speed = in.nextDouble();
                if (speed >= 1.0 && speed <= 5.0) {
                	tester2 = true;
                }
                else {
                	tester2 = false;
                }

                arrayOfAnimals[i] = new Turtle(name, type, message, speed);

                //System.out.println(arrayOfAnimals[i]);
                
            }
            
            else if (userInput.toLowerCase().equals("c")) {
            	//System.out.println(arrayOfAnimals[i]);
                System.out.println("Enter a name for your Crow: ");
                String name = in.next();
                System.out.println("And what does your Crow say?");
                
                String message = in.nextLine();

                System.out.println("What color is your crow, White, Red, or Black?");
                String color = in.next();
                if (color.toLowerCase().equals("white") || color.toLowerCase().equals("red") ||
                    color.toLowerCase().equals("black")) {
                    tester = true;	
                }
                else {
                	tester = false;
                }
                System.out.println("And how long is the crow's beak? (1-5): ");
                Double beakLength = in.nextDouble();
                if (beakLength >= 1.0 && beakLength <= 5.0) {
                	tester2 = true;
                }
                else {
                	tester2 = false;
                }

                arrayOfAnimals[i] = new Crow(name, message, color, beakLength);

                //System.out.println(arrayOfAnimals[i]);
                
            }
            
           

        }
            int j = 0;
            while (j < 5){
                  System.out.println(arrayOfAnimals[j]);
                  j++;
            } 
	}

}