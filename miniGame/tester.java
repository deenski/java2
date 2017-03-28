/*
Jakob Vendegna
CSC 161 201
Date

Description:
*/

public class tester {
	
	public static void main(String[] args) {
		ArrayList<String> doors = new ArrayList<String>();
		doors.add("second_room");

		ArrayList<String> items = new ArrayList<String>();
		items.add("Charcoal");
		items.add("Lighter Fluid");
		items.add("Match");

		IceChest mainRoomIceChest1 = new IceChest("mainRoomIceChest1", "You found me!", items);

		Room main = new Room("Main", "In the main Room", doors, mainRoomIceChest1);

		System.out.println(main);
		
	}

}