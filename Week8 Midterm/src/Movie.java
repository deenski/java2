/*
Jakob Vendegna
CSC 161 201
Date

Description:
*/


public class Movie extends Entertainment {
	private final String DEFAULT_TITLE = "defaultMovieTitle";
	private final String DEFAULT_CREATOR = "defaultMovieCreator";
	private final String DEFAULT_RATING = "defaultMovieRating";
	private final String DEFAULT_DESCRIPTION = "defaultMovieDescription";
    
	private String creator, rating, description;

	public Movie() {
        //title overrides Entertainment
		super.title = DEFAULT_TITLE;
		this.creator = DEFAULT_CREATOR;
		this.rating = DEFAULT_RATING;
		this.description = DEFAULT_DESCRIPTION;
	}

	//constructor for just title and rating
	public Movie(String t, String r) {
		if (t.length() >= 1) {
			super.title = t;
		}
		if (r.equals("G")) {
            this.rating = r;
        }
        else if (r.equals("PG")) {
            this.rating = r;
        }
        else if (r.equals("PG13")) {
            this.rating = r;
        }
        else {
            this.rating = "R";
        }
	}
	
    // title, creator, rating, description
    public Movie(String t, String c, String r, String d) {
        if (t.length() >= 1) {
			super.title = t;
		}
        
        if (c.length() >= 1) {
            this.creator = c;
        }
        
        if (r.equals("G")) {
            this.rating = r;
        }
        else if (r.equals("PG")) {
            this.rating = r;
        }
        else if (r.equals("PG13")) {
            this.rating = r;
        }
        else {
            this.rating = "R";
        }
        
        if (d.length() >= 1) {
            this.description = d;
        }
    }
    //overrides Entertainment
	public String setTitle(String t) {
		if (t.length() >= 1) {
			super.title = t;
		}
        return "";
        
	}

	public void setCreator(String c) {
		if (c.length() >= 1) {
			this.creator = c;
		}
	}

	public void setRating(String r) {
        r = r.toUpperCase();
        
		 if (r.equals("G")) {
            this.rating = r;
        }
        else if (r.equals("PG")) {
            this.rating = r;
        }
        else if (r.equals("PG13")) {
            this.rating = r;
        }
        else {
            this.rating = "R";
        }

	}

	public void setDescription(String d) {
		if (d.length() >= 1) {
			this.description = d;
		}
	}
    
    //overrides Entertainment
	public String getTitle() {
		return super.title;
	}

	public String getCreator() {
		return this.creator;
	}

	public String getRating() {
		return this.rating;
	}

	public String getDescription() {
		return this.description;
	}

	
	public String toString() {
		String returnString = "Movie Title: " + this.getTitle() + "\n" +
			"Movie Creator: " + this.getCreator() + "\n" +
			"Movie Rating: " + this.getRating() + "\n" +
			"Movie Description: " + this.getDescription() + "\n";

		return returnString;
	}
}