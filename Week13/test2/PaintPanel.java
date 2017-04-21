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
	private final ArrayList<Point> points = new ArrayList<>();
	private Color backgroundColor = Color.WHITE;
	public PaintPanel()
	{
		this.setBackground(backgroundColor);

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

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		for (Point point : points)
		{
			g.fillOval(point.x, point.y, 4, 4);
		}
	}
}