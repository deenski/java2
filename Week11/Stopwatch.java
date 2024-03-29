// Jakob Vendegna
// CIS 161
// 4/8/17 
// Stopwatch for timing methods
// A regurgitation of this Stopwatch class: http://algs4.cs.princeton.edu/14analysis/Stopwatch.java.html

public class Stopwatch 
{
	private final long start;

	public Stopwatch() 
	{
		start = System.currentTimeMillis();
	}

	public double endTime()
	{
		long now = System.currentTimeMillis();
		return (now - start) / 1000.0;
	}
}