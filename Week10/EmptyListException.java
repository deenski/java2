/*
Jakob Vendegna
CSC 161 201
3/21/17

Description: EmptyListException is used when an empty
List<T> is handed to certain functions.
It's purpose is to handle the error that would normally 
be thrown in a more civilized manner.
*/

public class EmptyListException extends RuntimeException {
	
    // default constructor sets the name of the list to "List"
	public EmptyListException() 
	{
		this("List");
	}
    
    // pass the exception a 
	public EmptyListException(String name)
	{
		super(name + " is currently empty.");
	}

}