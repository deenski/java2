/*
Jakob Vendegna
CSC 161 201
Date: 2/12/17

Description: Exception for user entering a negative number when only positive 
numbers will work
*/

public class NegativeNumberException extends NumbersException {

	String message;
    //default constructor
	public NegativeNumberException(){
		this.message = "NegativeNumberExeption";
	}
    // custom message constructor
	public NegativeNumberException(String m)  {
		this.message = "NegativeNumberException " + m;
	}
	

}