/*
Jakob Vendegna
CSC 161 201
1/24/17

Description: An object representing an absurd Crow.
*/

public class Television extends Animal {
    private final String NOTIFIER = "New Crow Constructed";

	private String name, message, color;
    private double beakLength;


	public Television() {
		setName("");
		setMessage("");
        setColor("");
        setBeakLength(1.0);
        System.out.println(NOTIFIER);
	}
    //set a custom name and message
	public Television(String n, String m) {
		setName(n);
		setMessage(m);
        setColor("");
        setBeakLength(1.0);
        System.out.println(NOTIFIER);
	}
    //set all instance variables
    public Television(String n, String m, String c, double bL) {
        setName(n);
		setMessage(m);
        setColor(c);
        setBeakLength(bL);
        System.out.println(NOTIFIER);

    }

	public String setName(String n) {
		String s;
        if (n != null) {
			this.name = n;
		}
        else {
            this.name = "Crow";
        }

        s = this.name;
        return s;
		
	}

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
    
    public double setBeakLength(double bL) {
        double d;
        if (bL > 0 && bL < 10) {
            this.beakLength = bL;
        }
        
        d = 1.0;
        return d;
    }

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

    public String toString() {
		String str = new String("A Crow: \nName = " + this.name + "\nMessage = " + 
				this.message + "\nColor = " + this.color +  "\nBeak Length = " + 
				this.beakLength + "\n");
                
        return str;
    }
    
    public Television MakeCopy() {
        Television newCrow = new Television();
        
        newCrow.setName(getName());
        newCrow.setMessage(speak());
        newCrow.setColor(getColor());
        newCrow.setBeakLength(getBeakLength());
        
        return newCrow;
    }



}