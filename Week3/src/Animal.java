/*
Jakob Vendegna
CSC 161 201
1/24/17

Description:
*/

public abstract class Animal {
    private final String MESSAGE = "New Animal";

	public Animal() {
        System.out.println(MESSAGE); 
	}

	public abstract String speak();
   
}