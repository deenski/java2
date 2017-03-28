/*
Jakob Vendegna
CSC 161 201
1/24/17

Description:
*/

public class Animal {
	public Animal() {
        System.out.println("New Animal");
	}

	public String speak() {
	    String message = "I am an animal";
        return message;
	}
    
    public String toString() {
        String msg = "Animal";
        return msg;
    }
}