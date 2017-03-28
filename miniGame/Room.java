/*
Jakob Vendegna
CSC 161 201
Date

Description:
*/

public class Room {

	String this.name;
	String this.message;
	ArrayList<String> this.doors;
	ArrayList<String> this.iceChest;

	public Room() {
		this.name = "Room";
		this.message = "Default Message";
		this.doors = new ArrayList<String>();
		this.iceChest = new IceChest();

	}
	
	public Room(String n, String m, ArrayList d, ArrayList i) {
		this.name = n;
		this.message = m;
		this.doors = d;
		this.iceChest = i;
	}

	public String setName(String n) {
		this.name = n;
		return this.name;
	}

	public String setMessage(String m) {
		this.message = m;
		return this.message;
	}

	public ArrayList<String> setDoors(ArrayList<String> d) {
		this.doors = new ArrayList<String>();
		Iterator iterator = d.iterator();
		while (iterator.hasNext()) {
			this.doors.add(iterator.next());
		}

		return this.doors;
	}

	public IceChest setIceChest(ArrayList<String> iC) {
		this.iceChest = new ArrayList<String>();
		Iterator iterator = iC.iterator();
		while (iterator.hasNext()) {
			this.iceChest.add(iterator.next());
		}

		return this.iceChest;
	}

	public String getName() {
		return this.name;
	}

	public String getMessage() {
		return this.message;
	}

	public ArrayList<String> getDoors() {
		return this.doors;
	}

	public ArrayList<String> getIceChest() {
		return this.iceChest;
	}

	public String toString() {
		String message = "Room: " + this.name + "\n" +
			"Message: " + this.message + "\n" +
			"Doors" + this.doors.
	}
}