/*
Jakob Vendegna
CSC 161 201
1/28/17

Description:
*/

public class CrowTesting {
	
	public static void main(String[] args) {
	Crow silence = new Crow("Silence", "Nevermore!", "Black", 2.3);
        silence.setColor("WHITE");
        silence.setBeakLength(3.0);
        System.out.println(silence);
        
        Crow mcCaw = silence.MakeCopy();
        mcCaw.setName("Cawrl McCaw");
        mcCaw.setColor("RED");
        mcCaw.setMessage("Caw!");
        mcCaw.setBeakLength(2.34);
        System.out.println(mcCaw);
        
        
	}

}