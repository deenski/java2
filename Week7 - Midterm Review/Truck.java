public class Truck extends Automobile {
    private final int DEFAULT_YEAR = 1996;
    private String make, model, sound;
    private int year;
    private TruckDriver driver;
    
    public Truck() {
        System.out.println("New Truck Created");
        this.make = "Toyota";
        this.model = "Tacoma";
        this.sound = "brub brub brub";
        this.year = 1996;
        this.driver = new TruckDriver("Jerry","JerrySucks@gmail.com", "Duuuhhh...JErrryyy...", 'm');
    } 
    
    public Truck(String make, String model, String sound, int year, TruckDriver driver) {
        System.out.println("New Truck Created");
        if (make != null)
            this.make = make;
        if (model != null)
            this.model = model;
        if (sound != null)
            this.sound = sound;
        try{
            if (year > 1908 && year < 2018)
                this.year = year;
            else {
                String errorMessage = "Invalid Date Entered. Adjusting this.year to " + DEFAULT_YEAR;
                invalidDateException invalid = new invalidDateException(errorMessage);
                throw invalid;
            }
         }
         catch(invalidDateException e) {
            System.out.println(e.message);
            this.year = DEFAULT_YEAR;
         }
           
            
        this.driver = driver;
        
    }
    
    public void setMake(String make) {
        if (make != null)
            this.make = make;
    }
    
    public void setModel(String model) {
        if (model != null)
            this.model = model;
    }
    
    public void setSound(String sound) {
        if (sound != null)
            this.sound = sound;
    }
    
    public void setYear(int year) {
        if (year > 1908 && year < 2018)
            this.year = year;
    }
    
    public void setDriver(TruckDriver driver) {
        this.driver = driver;
    }
    
    public String getMake() {
        return this.make;
    }
    
    public String getModel() {
        return this.model;
    }
    
    public String getSound() {
        return this.sound;
    }
    
    public String playSound() {
        return this.sound;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public TruckDriver getDriver() {
        return this.driver;
    }
    
    public String toString() {
        String returnString = "\nMake: " + this.getMake() + "\n" +
            "Model: " + this.getModel() + "\n" +
            "Sound: " + this.playSound() + "\n" +
            "Year: " + this.getYear() + "\n" +
            "Driver: " + this.getDriver() + "\n";
            
        return returnString;

    }
}