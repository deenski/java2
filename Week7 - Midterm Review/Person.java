public abstract class Person {
    private final String MESSAGE = "New Person Created";
    
    public Person() {
        System.out.println(MESSAGE);
    }
    
    public abstract String speak();
}