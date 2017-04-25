// Jakob Vendegna
// CIS 161
// 4/21/17 
// paint panel
// stolen from textbook, p.523

import java.awt.Point;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;


public class PaintPanel extends JPanel
{	
	// array to store points from mouse clicks
	private final ArrayList<Point> points = new ArrayList<>();
	// set the default background color to white
	private final Color backgroundColor = Color.WHITE;
	// used for radio buttons
	public String linesOrDots = "";
	
	public PaintPanel()
	{
		//set the background color
		this.setBackground(backgroundColor);
		// listen to the mouse
		addMouseMotionListener(
			new MouseMotionAdapter()
			{
				@Override
				public void mouseDragged(MouseEvent event)
				{	
					//when the mouse is clicked add that point to the array
					points.add(event.getPoint());
					// and repaint the screen with the given points
					repaint();
				}
			}
		);
		
	}

	// set the foreground color
	public void setColor(Color c) 
	{
		this.setForeground(c);
	}
	// set the String variable to its proper operation
	public void setType(String lD)
	{
		if (lD.equals("splash") || lD.equals("dots"))
		{	
			this.linesOrDots = lD;
		}
	}

	


	// do the drawing
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);


		for (Point point : points)
		{	
			// selection control
			if (linesOrDots.equals("splash"))
			{
				g.drawLine(point.x, point.y, 250, 250);
			}
			else 
			{
				g.fillOval(point.x, point.y, 4, 4);
			}
		}
	}
}