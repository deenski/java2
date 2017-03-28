/*
Jakob Vendegna
CSC 161 201
Date

Description:
*/

public abstract class Entertainment {
	
	private final String DEFAULT_TITLE = "defaultTitle";
	private final String DEFAULT_CREATOR = "defaultCreator";
	private String title, creator;

	public Entertainment() {
		this.title = DEFAULT_TITLE;
		this.creator = DEFAULT_CREATOR;
	}

	public Entertainment(String t, Strin c) {
		if (t.length >= 1) {
			this.title = t;
		}
		else {
			this.title = DEFAULT_TITLE;
		}

		if (c.length >= 1) {
			this.creator = c;
		}
		else {
			this.creator = DEFAULT_CREATOR;
		}

	}

	public void setTitle(String t) {
		if (t.length >=1) {
			this.title = t;
		}
	}

	public void setCreator(String c) {
		if (c.length >= 1) {
			this.creator = c;
		}
	}

	public String getTitle() {
		return this.title;
	}

	public String getCreator() {
		return this.creator;
	}

}