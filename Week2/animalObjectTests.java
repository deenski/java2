/*
Jakob Vendegna
CSC 161 201
1/24/17

Description: You should be able to see
that all of the methods from the subclasses 
of animals are being tested, and that
each one is in fact an Animal object.
*/

public class animalObjectTests {
	
	public static void main(String[] args) {
        Animal test = new Animal();

        turtleTest();
        
        crowTest();

	}
    
    private static void turtleTest() {
        //create a new Turtle
		Turtle tim = new Turtle();
        System.out.println(tim);
        
        //Test modifier methods
        tim.setName("Tim");
        tim.setType("Snapping");
        tim.setMessage("Bloop Bloop");
        tim.setSpeed(1.23);
        System.out.println(tim);
        System.out.println();
        
        //Make a copy and modify it
        Turtle mikey = tim.MakeCopy();
        mikey.setName("Michaelangelo");
        mikey.setType("Other");
        mikey.setMessage("");
        mikey.setSpeed(4.56);
        System.out.println(mikey);
        System.out.println(); 
    }
    
    private static void crowTest() {
        Crow silence = new Crow("Silence", "Nevermore!", "Black", 2.3);
        silence.setColor("WHITE");
        silence.setBeakLength(3.0);
        System.out.println(silence);
        System.out.println();
        
        Crow mcCaw = silence.MakeCopy();
        mcCaw.setName("Cawrl McCaw");
        mcCaw.setColor("RED");
        mcCaw.setMessage("Caw!");
        mcCaw.setBeakLength(2.34);
        System.out.println(mcCaw);
        System.out.println();

    }

}