
// Generic class representing any type of library material that can be checked out.
// Stores the name of the item, the number of days it can be checked out, and whether
// or not it is checked out.
class Materials
{
	// Protected member variables so subclasses can access them.
  	protected String title;    
  	protected int borrow;       
  	protected boolean avail;    

  	// Constructor, must pass in the item name.
	// Set it as available.
  	public Materials(String ttl)
  	{
    	title = ttl; 
		avail = true;
  	}

	// Print information about this item.
	// Set it as unavailable.
  	public void info()
  	{
    	System.out.println(title + "," + " available: " + avail);
    	avail = false;
    	borrow = 0;
  	}
}

// BestSellerBook class, inherits from Materials.
// Stores the book author and category.
// Overrides the Materials info method with its own version.
class BestSellerBook extends Materials
{
  	private String author;
  	private String category;

  	// Constructor.
  	public BestSellerBook(String ttl, String auth, String cat)
  	{
		// First thing, call Materials constructor.
    	super(ttl);
		
		// Now do BestSellerBook-specific initialization.
    	author = auth;
    	category = cat;
    	borrow = 10;
  	}

	// Print information about this item.
	// Print specific book information, then also call the Materials version.
  	public void info()
  	{

    	System.out.println("\nAuthor: " + author + "\nCategory: " + category + ".\nDue in " + borrow + " days");
    	super.info();
  	}
}

// Childrens class, inherits from Materials.
// Stores the author, category, and reading level.
// Overrides the Materials info method with its own version.
class Childrens extends Materials
{
  	private String author;
  	private String category;
  	private int readingLevel;

  	// Constructor.
  	public Childrens(String ttl, String auth, int rdlev)
  	{
		// First thing, call Materials constructor.
    	super(ttl);
		
		// Now do Childrens-specific initialization.
    	category = "Childrens";
    	author = auth;
    	readingLevel = rdlev;
    	borrow = 20;
  	}
	
	// Print information about this item.
	// Print specific children information, then also call the Materials version.
  	public void info()
  	{
    	System.out.println("\nAuthor: " + author + "\nCategory: " + category + "\nReading Level " + readingLevel + ".\nDue in " + borrow + " days");
    	super.info();
  	}
}

// Video class, inherits from Materials.
// Stores the category and video length in minutes.
// Overrides the Materials info method with its own version.
class Video extends Materials
{
	private String category;
   private int length;

  	// Constructor.
  	public Video(String ttl, int lngth, String cat)
  	{
		// First thing, call Materials constructor.
    	super(ttl);
		
		// Now do Video-specific initialization.
    	category = cat;
    	length = lngth;
    	borrow = 3;
  	}

	// Print information about this item.
	// Print specific video information, then also call the Materials version.
  	public void info()
  	{
    	System.out.println("\n" + length + " min. " + "\nCategory: " + category  + ".\nDue in " + borrow + " days");
    	super.info();
  	}
}

// Reference class, inherits from Materials.
// Stores the author and category.
// Overrides the Materials info method with its own version.
class Reference extends Materials
{
	private String author;
  	private String category;

  	// Constructor.
  	public Reference(String ttl, String auth)
  	{
		// First thing, call Materials constructor.
    	super( ttl);
    
	 	// Now do Reference-specific initialization.
		category = "Reference";
    	author = auth;
    	borrow = 0;
  	}

	// Print information about this item.
	// Print specific reference information, then also call the Materials version.
  	public void info()
  	{
    	System.out.println("\nAuthor: " + author + "\nCategory: " + category );
    	System.out.println("YOU ARE NOT ALLOWED TO TAKE THIS MATERIAL OUT OF THE LIBRARY");
    	super.info();
  	}
}

// Main program to test the above classes.
// Instantiate the various Materials objects, then call info on each one.
class Library
{
  	public static void main ( String args[] )
  	{
   	BestSellerBook item1 = new BestSellerBook("Tom Sawyer", "Mark Twain", "Classic");
   	item1.info();

   	Reference item2 = new Reference("Encyclopedia Brittanica Volume 1", "Brittanica");
   	item2.info();

   	Video item3 = new Video("Sound of Music", 180, "Musical");
   	item3.info();

   	Childrens item4 = new Childrens("Cat in the Hat", "Dr. Suess", 2);
   	item4.info();
   
		System.out.println("\n\n");

		// Now call info again on all of them, since their status changes as soon as info is 
		// called the first time.
		
   	System.out.println("*******Current library status of materials above******");
   	item1.info();
   	item2.info();
   	item3.info();
   	item4.info();
  	}
}