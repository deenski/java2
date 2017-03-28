/*
Jakob Vendegna
CSC 161 201
Date: 2/12/17

Description: Numbers Exception - super class of NegativeNumbersExceptio
*/

public class NumbersException extends Exception{
	//default constructor
	public NumbersException() {}
    // custom message constructor
	public NumbersException(String message) {
		super(message);
	}

}