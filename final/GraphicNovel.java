// Jakob Vendegna
// CIS 161
// 4/25/17 
// Comic Book Class


public class GraphicNovel extends Book
{

	public GraphicNovel(String name, String author, 
			String releaseDate, int issueNumber, 
			double grade, double pricePayed)
	{
		super(name, author, releaseDate, 
			issueNumber, grade, pricePayed);
	}

	public String getType()
	{
		return "novel";
	}
}