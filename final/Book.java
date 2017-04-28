// Jakob Vendegna
// CIS 161
// 4/26/17 
// Abstract Book Class

public abstract class Book 
{
	private String name;
	private String  author;
	private String releaseDate;
	private int issueNumber;
	private double grade;
	private double price_payed;
	private double current_value;

	public Book(String n, String a, 
			String rD, int iN, double gR, 
			double pP, double cV)
	{
		this.name = n;
		this.author = a;
		this.releaseDate =  rD;
		this.issueNumber = iN;
		this.grade = gR;
		this.price_payed = pP;
		this.current_value = cV;
	}

	public Book(String n, String a, 
			String rD, int iN,
			double gR, double pP)
	{
		this.name = n;
		this.author = a;
		this.releaseDate =  rD;
		this.issueNumber = iN;
		this.grade = gR;
		this.price_payed = pP;
	}

	public void setName(String n)
	{
		if (n != null)
			this.name = n;
	}

	public void setAuthor(String a)
	{
		if (a != null)
			this.author = a;
	}

	public void setReleaseDate(String rD)
	{
		this.releaseDate = rD;
	}

	public void setIssueNumber(int iN)
	{
		if (iN >= 0)
			this.issueNumber = iN;
	}

	public void setGrade(double gR)
	{
		if (gR >= 0.5 && gR <= 10.0)
			this.grade = gR;
	}
	public void setPricePayed(double pP)
	{
		if (pP >= 0)
			this.price_payed = pP;
	}

	public String getName()
	{
		return this.name;
	}

	public String getAuthor()
	{
		return this.author;
	}

	public String getReleaseDate()
	{
		return this.releaseDate;
	}

	public int getIssueNumber()
	{
		return this.issueNumber;
	}

	public double getGrade()
	{
		return this.grade;
	}

	public double getPricePayed()
	{
		return this.price_payed;
	}

	public String getType()
	{
		return "book";
	}
}