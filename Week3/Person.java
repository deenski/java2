public abstract class Person {
    private final String MESSAGE = "New Person";
    
    public Person() {
        System.out.println(MESSAGE);
    }
    
    public abstract String speak();
}