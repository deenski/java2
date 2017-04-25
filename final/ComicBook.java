// Jakob Vendegna
// CIS 161
// 4/25/17 
// Comic Book Class
import java.util.Calendar;

public class ComicBook 
{
	private String name;
	private String  author;
	private Calendar releaseDate;
	private int issueNumber;
	private boolean bagged;
	private double grade;
	private double price_payed;
	private double current_value;

	public ComicBook(String n, String a, 
			Calendar rD, int iN, boolean bag,
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

	public ComicBook(String n, String a, 
			Calendar rD, int iN, boolean bag,
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

	public Calendar getDate()
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