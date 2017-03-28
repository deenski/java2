public class TVShow extends Entertainment {
	private final String DEFAULT_TITLE = "defaultTVShowTitle";
	private final String DEFAULT_RATING = "defaultTVShowRating";
	private final String DEFAULT_DESCRIPTION = "defaultTVShowDescription";
	private final String DEFAULT_DAYOFWEEK = "defaultDayOfWeek";

	private String rating, description, dayOfWeek;

	public TVShow() {
		super.title = DEFAULT_TITLE;
		this.rating = DEFAULT_RATING;
		this.description = DEFAULT_DESCRIPTION;
		this.dayOfWeek = DEFAULT_DAYOFWEEK;
	}

	// title, rating, description, day of week the show airs
	public TVShow(String t, String r, String d, String w) {
		//set title
		if (t.length() >= 1) {
			super.title = t;
		}

		r = r.toUpperCase();
		//set rating
        if (r.equals("G") || r.equals("TV-G")) {
            this.rating = r;
        }
        else if (r.equals("PG") || r.equals("TV-PG")) {
            this.rating = r;
        }
        else if (r.equals("14") || r.equals("TV-14")) {
            this.rating = r;
        }
        else {
            this.rating = "MA";
        }
        //set description
        if (d.length() >= 1) {
            this.description = d;
        }

        String day = w.toLowerCase();
        //set dayOfWeek
        if (day.equals("monday") ||
        	day.equals("tuesday") ||
        	day.equals("wednesday") ||
        	day.equals("thursday") ||
        	day.equals("friday") ||
        	day.equals("saturday") ||
        	day.equals("sunday")) {

        		this.dayOfWeek = w;
        }

        
	}
	//only set title and rating
	public TVShow(String t, String r) {
		//set title
		if (t.length() >= 1) {
			super.title = t;
		}

		r = r.toUpperCase();
		//set rating
        if (r.equals("G") || r.equals("TV-G")) {
            this.rating = r;
        }
        else if (r.equals("PG") || r.equals("TV-PG")) {
            this.rating = r;
        }
        else if (r.equals("14") || r.equals("TV-14")) {
            this.rating = r;
        }
        else {
            this.rating = "MA";
        }

	}

	//overrides Entertainment
	public String setTitle(String t) {
		if (t.length() >= 1) {
			super.title = t;
		}
        return "";
        
	}

	public void setRating(String r) {
		r = r.toUpperCase();
		
        if (r.equals("G") || r.equals("TV-G")) {
            this.rating = r;
        }
        else if (r.equals("PG") || r.equals("TV-PG")) {
            this.rating = r;
        }
        else if (r.equals("14") || r.equals("TV-14")) {
            this.rating = r;
        }
        else {
            this.rating = "MA";
        }
	}

	public void setDescription(String d) {
		if (d.length() >= 1) {
			this.description = d;
		}
	}

	public void setDayOfWeek(String w) {
		String day = w.toLowerCase();

		if (day.equals("monday") ||
        	day.equals("tuesday") ||
        	day.equals("wednesday") ||
        	day.equals("thursday") ||
        	day.equals("friday") ||
        	day.equals("saturday") ||
        	day.equals("sunday")) 
		{
        		this.dayOfWeek = w;
        }

	}
    //overrides Entertainment
	public String getTitle() {
		return super.title;
	}

	public String getRating() {
		return this.rating;
	}

	public String getDescription() {
		return this.description;
	}
	public String getDayOfWeek() {
		return this.dayOfWeek;
	}

	
	public String toString() {
		String returnString = "TV Show Title: " + this.getTitle() + "\n" +
			"Plays on: " + this.getDayOfWeek() + "\n" +
			"TV Show Rating: " + this.getRating() + "\n" +
			"TV Show Description: " + this.getDescription() + "\n";

		return returnString;
	}

}