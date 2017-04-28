// Jakob Vendegna
// CIS 161
// 4/25/17 
// Comic Book Class

public class ComicBook extends Book
{
	private boolean bagged;
	private double currentValue;
	private double profit;

	public ComicBook(String name, String author, 
			String releaseDate, int issueNumber, boolean bagged,
			double grade, double pricePayed, double currentValue)
	{
		super(name, author, releaseDate, 
			issueNumber, grade, pricePayed, currentValue);
         
         this.bagged = bagged;
         this.currentValue = currentValue;

         if (pricePayed <= currentValue)
         {
         	this.profit = currentValue - pricePayed;
         }
         else
         {
         	this.profit = pricePayed - currentValue;
         }
         
	}

	public ComicBook(String name, String author, 
			String releaseDate, int issueNumber, boolean bagged,
			double grade, double pricePayed)
	{
		super(name, author, releaseDate, 
			issueNumber, grade, pricePayed);
         
         this.bagged = bagged;
         this.profit = 0;
	}

	public void setBagged(boolean tF)
	{
		this.bagged = tF;
	}

	public void setCurrentValue(double cV)
	{
		if (cV >= 0.00)
			this.currentValue = cV;
	}

	public boolean getBagged()
	{
		return this.bagged;
	}

	public double getCurrentValue()
	{
		return this.currentValue;
	}

	public double getProfit()
	{
		return this.profit;
	}

	@Override
	public String getType()
	{
		return "comic";
	}
	// public String toString()
// 	{
// 		
// 	}
}