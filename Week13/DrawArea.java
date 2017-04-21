// Jakob Vendegna
// CIS 161
// date 
// description

import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;

public class DrawArea extends JPanel
{
	private final ArrayList<Point> points = new ArrayList<>();

	public DrawArea()
	{
		addMouseMotionListener(
			new MouseMotionAdapter()
			{

				@Override
				public void mouseDragged(MouseEvent event)
				{
					points.add(event.getPoint());
					repaint();
				}
			}
		);
	}
}


