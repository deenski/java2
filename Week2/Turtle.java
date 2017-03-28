/*
Jakob Vendegna
CSC 161 201
1/24/17

Description: An object representing a Turtle, 
because who doesn't love turtles?
*/

public class Turtle extends Animal {
    // default constructor values
    private final String NOTIFIER = "New Turtle Constructed";
    private final String NAME_DEFAULT = "Jimmy";
    private final String TYPE_DEFAULT = "Box";
    private final String MESSAGE_DEFAULT = "Blub ... Blub ... ";
    private final double SPEED_DEFAULT = 1.01;
    // attributes
	private String name, message, type;
    private double speed;
    
        
    // default object
	public Turtle() {
		setName(NAME_DEFAULT);
        setType(TYPE_DEFAULT);
		setMessage(MESSAGE_DEFAULT);
        setSpeed(SPEED_DEFAULT);
		System.out.println(NOTIFIER);
	}
    // new Turtle given a name
    public Turtle(String n) {
		setName(n);
        setType(TYPE_DEFAULT);
		setMessage(MESSAGE_DEFAULT);
        setSpeed(SPEED_DEFAULT);
		System.out.println(NOTIFIER);
 
    }
    // name, type
    public Turtle(String n, String t) {
        setName(n);
        setType(t);
        setMessage(MESSAGE_DEFAULT);
        setSpeed(SPEED_DEFAULT);
		System.out.println(NOTIFIER);
 

    }
    // name, type, message
	public Turtle(String n, String t, String m) {
		setName(n);
        setType(t);
		setMessage(m);
        setSpeed(1.0);	
        System.out.println(NOTIFIER);
    }
    // name, type, message, speed
    public Turtle(String n, String m, String t, double s) {
		setName(n);
        setType(t);
		setMessage(m);
        setSpeed(s);
		System.out.println(NOTIFIER);
	}
    
	
    // set the name of the Turtle
	public String setName(String n) {
        String s;

		if (n == null || n == "") {
			this.name = "Jimmy";
		}
        else {
            this.name = n;
        }

        s = this.name;
        return s;
		
	}
    // set what the Turtle will say when calling the speak() method
	public String setMessage(String m) {
        String s;
		if (m == null || m == ""){
            if (this.type.equals("Box")) {
                this.message = "Blub blub";
            }
            else if (this.type.equals("Snapping")) {
                this.message = "I'm feeling a little bit bitey";
            }
            else {
                this.message = "Turtle Power!";
            }
   		}
        else {
             this.message = m;  
        }
        
        s = this.message;
        return s;
	}
    
    // set the type of the Turtle, valid entries are "box" or "snapping"
    // all other types will flood your turtle's home with ooze and create 
    // a Teenage Mutant Ninja Turtle.
    public String setType(String t) {
        String s;
        
        if (t.toLowerCase().equals("box") || t == null) {
            this.type = "Box";
        }    
        else if (t.toLowerCase().equals("snapping")) {
            this.type = "Snapping";
        }
        else {
            this.type = "Teenage Mutant Ninja";
        }
        
        s = this.type;
        return s;
    }

    // Important for underground turtle racing
    public double setSpeed(double s) {
        double d;

        if (s > 0 && s <= 5.0) {
            this.speed = s;
        }
        else {
            this.speed = 1.0;
        }
        
        d = this.speed;
        return d;
    }

    // get methods to return the attributes of your Turtle
	public String getName() {
		return this.name;
	}
    
    public String getType() {
        return this.type;
    }
    
    public String speak() {
        // use this instead of getMessage()
		return this.message;
	}

    public double getSpeed() {
    	return this.speed;
    }

    // for use with System.out.println(Turtle t)
    public String toString() {
		String str = new String("A Turtle: \nName = " + this.getName() + "\nMessage = " + 
				this.speak() + "\nType = " + this.getType() + "\nSpeed = " + 
				this.getSpeed() + "\n");
                
        return str;
    }
    
    // because there aren't enough Turtles in the world... Obviously.
    public Turtle MakeCopy() {
    	Turtle newTurtle = new Turtle();

    	newTurtle.setName(getName());
    	newTurtle.setType(getType());
    	newTurtle.setMessage(speak());
    	newTurtle.setSpeed(getSpeed());

    	return newTurtle;
    }


}