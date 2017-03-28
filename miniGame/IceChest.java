/*
Jakob Vendegna
CSC 161 201
Date

Description:
*/

public class IceChest {
	String this.name;
	String this.message;
	ArrayList<String> contents;
	
	public IceChest() {
		this.name = "Default IceChest Name";
		this.message = "Default IceChest Message";
		this.contents = new ArrayList<String>();
	}

	public String setName(String n) {
		this.name = n;
		return this.name;
	}

	public String setMessage(String m) {
		this.message = m;
		return this.message;
	}

	public ArrayList<String> setContents(String[] c) {
		for(String item : c) {
			this.contents.add(item);
		}
		return this.contents;
	}

	public getName() {
		return this.name;
	}

	public getMessage() {
		return this.message;
	}

	public getContents() {
		return this.contents;
	}

	public String toString() {
		Iterator iterator = this.contents.iterator();

		System.out.println(this.name + "contains : ");
		while (iterator.hasNext()) {
			System.out.println(this.contents.iterator.next());
		}
	}
}