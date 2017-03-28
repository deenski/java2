/*
Jakob Vendegna
CSC 161 201
Date

Description:
*/

public class InvalidNameException extends Exception {
	
	public InvalidNameException(String nameOfAnimal) {
        
        String n = nameOfAnimal;
		char[] validChars = {'l', 'd', 'm', 'r'};
		String[] validNames = {"Leonardo", "Donatello", "Michaelangelo", "Raphaiel"};
		for(int i = 0; i < n.length(); i++)
		{
			int j = 0;
			
			if (n[i].toLowerCase == validChars[j]) 
			{
				this.name = validNames[j];

			}

			else
			{
				j++;
			}


		}
	}

}								