/*
Jakob Vendegna
CSC 161 201
1/24/17

Description: An object representing a digital Crow.
*/

public class Crow extends Animal {
    //final variables for default constructor values
    private final String NOTIFIER = "New Crow Constructed";
    private final String DEFAULT_NAME = "Beltran";
    private final String DEFAULT_MESSAGE = "CAW!!! CaCAW!!";
    private final String DEFALUT_COLOR = "Black";
    private final double DEFAULT_BEAK_LENGTH = 1.35;

	private String name, message, color;
    private double beakLength;


	public Crow() {
		setName(DEFAULT_NAME);
		setMessage(DEFAULT_MESSAGE);
        setColor(DEFALUT_COLOR);
        setBeakLength(DEFAULT_BEAK_LENGTH);
        System.out.println(NOTIFIER);
	}
    //name
    public Crow(String n) {
        setName(n);
        setMessage(DEFAULT_MESSAGE);
        setColor(DEFALUT_COLOR);
        setBeakLength(DEFAULT_BEAK_LENGTH);
        System.out.println(NOTIFIER);
	}
    //name, message
	public Crow(String n, String m) {
		setName(n);
		setMessage(m);
        setColor(DEFALUT_COLOR);
        setBeakLength(DEFAULT_BEAK_LENGTH);
        System.out.println(NOTIFIER);
	}
    //name, message, color
    public Crow(String n, String m, String c) {
        setName(n);
        setMessage(m);
        setColor(c);
        setBeakLength(DEFAULT_BEAK_LENGTH);
        System.out.println(NOTIFIER);
    }
    //name, message, color, beakLength
    public Crow(String n, String m, String c, double bL) {
        setName(n);
		setMessage(m);
        setColor(c);
        setBeakLength(bL);
        System.out.println(NOTIFIER);

    }
    
    //set this.name
	public String setName(String n) {
		String s;
        if (n == "") {
            this.name = "Crow";
		}
        else {
            this.name = n;
        }

        s = this.name;
        return s;
		
	}
    //set this.message
	public String setMessage(String m) {
        String s;

		if (m != null){
			this.message = m;
		}
        else {
            this.message = "Caw! CaCaw!";
        }

        s = this.message;
        return s;

	}
    //set this.color
    public String setColor(String c) {
        String s;
        if (c.toLowerCase().equals("red")) {
            this.color = "Red";
            
        }
        else if (c.toLowerCase().equals("white")) {
            this.color = "White";
                    }
        else {
            this.color = "Black";
        }

        s = this.color;
        return s;
        
    }
    // set this.beakLength
    public double setBeakLength(double bL) {
        double d;
        if (bL > 0 && bL < 10) {
            this.beakLength = bL;
        }
        
        d = 1.0;
        return d;
    }

    // get methods
	public String getName() {
		return this.name;
	}

	public String getMessage() {
		return this.message;
	}

    public String speak() {
        return this.message;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public double getBeakLength() {
        return this.beakLength;
    }   
    
    
    // for use with System.out.println(Crow c)
    public String toString() {
		String str = new String("A Crow: \nName = " + this.getName() + "\nMessage = " + 
				this.speak() + "\nColor = " + this.getColor() +  "\nBeak Length = " + 
				this.getBeakLength() + "\n");
                
        return str;
    }
    // make a copy of the current crow
    public Crow MakeCopy() {
        Crow newCrow = new Crow();
        
        //set the name of the new crow to the name of the
        //crow a copy is being made of... and so on
        newCrow.setName(getName());
        newCrow.setMessage(speak());
        newCrow.setColor(getColor());
        newCrow.setBeakLength(getBeakLength());
        
        return newCrow;
    }



}