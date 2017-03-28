public class TruckDriver extends Person {
    private final String NEW_MESSAGE = "New Truck Driver Created";
    private String name, email, message;
    private char gender;

    public TruckDriver() {
        System.out.println(NEW_MESSAGE);
        
        this.name = "A Truck Driver";
        this.email = "truckDriver@gmail.com";
        this.message = "Hi, I drive trucks.";
        this.gender = 'm';
        
    }
    
    public TruckDriver(String name, String email, String message, char gender) {
        System.out.println(NEW_MESSAGE);
        
        if (name != null)
            this.name = name;
        if (email != null)
            this.email = email;
        if (message != null)
            this.message = message;
        if (gender == 'f' || gender == 'F')
            this.gender = 'f';
        else
            this.gender = 'm';

    }
    
    public void setName(String name) {
        if (name != null)
            this.name = name;
    }
    
    public void setEmail(String email) {
        if (email != null)
            this.email = email;
    }
    
    public void setMessage(String message) {
        if (message != null) 
            this.message = message;
    }
    
    public void setGender(char gender) {
        if (gender == 'f' || gender == 'F')
            this.gender = 'f';
        else
            this.gender = 'm';
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String speak() {
        return this.message;
    }
    
    public char getGender() {
        return this.gender;
    }
    
    public String toString() {
        String returnString = "\nName: " + this.getName() + "\n" +
            "Email: " + this.getEmail() + "\n" +
            "Message: " + this.speak() + "\n" +
            "Gender: " + this.getGender() + "\n";
        return returnString;
    }    
}