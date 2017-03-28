/*
Jakob Vendegna
CSC 161 201


Description:
*/

public class TurtleTesting {
	
	public static void main(String[] args) {
        //create a new Turtle
	Turtle tim = new Turtle();
        System.out.println(tim);
        
        //Test modifier methods
        tim.setName("Tim");
        tim.setType("Snapping");
        tim.setMessage("Bloop Bloop");
        tim.setSpeed(3.26);
        System.out.println(tim);
        System.out.println();
        
        //Make a copy and modify it
        Turtle mikey = tim.MakeCopy();
        mikey.setName("Michaelangelo");
        mikey.setType("Other");
        mikey.setMessage("");
        mikey.setSpeed(2.3);
        System.out.println(mikey);
        System.out.println(); 
                      
	}
    
   

}