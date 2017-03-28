
public class Author extends Person {
    private String name;
    private String email;
    private String message;
    private char gender;
    
    public Author(String name, String email, String message, char gender){
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
    
    public Author() {
        this.name = "An Author";
        this.email = "an@email.adrress";
        this.message = "my message";
        this.gender = 'f';
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