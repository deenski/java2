public class InvalidEntryException extends Exception {
	String message;
	public InvalidEntryException() {
		this.message = "InvalidEntryException: Please enter a valid entry. Try a 1 or 2";
	}

	public InvalidEntryException(String m) {
		this.message = "InvalidEntryException: " + m;
	}
}