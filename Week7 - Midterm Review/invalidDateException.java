public class invalidDateException extends Exception{
    String message;
    
    public invalidDateException() {
        this.message = "invalidDateExeption Thrown";
    }
    
    public invalidDateException(String message) {
        this.message = "invalidDateException Thrown:  " + message;
    }
}