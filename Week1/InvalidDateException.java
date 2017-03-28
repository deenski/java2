/*
Jakob Vendegna
CSC 161 201

I tried to make my own exception class, It works fine, but I don't
know how to throw in one file and catch in another 
*/


public class InvalidDateException extends Exception {
    
    public InvalidDateException() {
        super("Date out of acceptable range, please use a valid date");
    }
    public InvalidDateException(String message) {
        super(message);
    }
}