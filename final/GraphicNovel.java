// Jakob Vendegna
// CIS 161
// 4/25/17 
// Comic Book Class


public class GraphicNovel extends Book
{
	private String name;
	private String  author;
	private String releaseDate;
	private int issueNumber;
	private boolean bagged;
	private double grade;
	private double price_payed;
	private double current_value;

	public GraphicNovel(String n, String a, 
			String rD, int iN, boolean bag,
			double gR, double pP, double cV)
	{
		this.name = n;
		this.author = a;
		this.releaseDate =  rD;
		this.issueNumber = iN;
		this.bagged = bag;
		this.grade = gR;
		this.price_payed = pP;
		this.current_value = cV;
	}

	public GraphicNovel(String n, String a, 
			String rD, int iN, boolean bag,
			double gR, double pP)
	{
		this.name = n;
		this.author = a;
		this.releaseDate =  rD;
		this.issueNumber = iN;
		this.bagged = bag;
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

	public void setBagged(boolean bag)
	{
		this.bagged = bag;
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

	public void setCurrentValue(double cV)
	{
		if (cV >= 0.00)
			this.current_value = cV;
	}

	public String getName()
	{
		return this.name;
	}

	public String getAuthor()
	{
		return this.author;
	}

	public String getDate()
	{
		return this.releaseDate;
	}

	public int getIssue()
	{
		return this.issueNumber;
	}

	public boolean getBagged()
	{
		return this.bagged;
	}

	public double getGrade()
	{
		return this.grade;
	}

	public double getPricePayed()
	{
		return this.price_payed;
	}

	public double getCurrentValue()
	{
		return this.current_value;
	}
}