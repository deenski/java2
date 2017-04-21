// Jakob Vendegna
// CIS 161
// 4/18/17 
// set up layout for gui paint program

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;


public class MyLayout extends JFrame 
{
	private final JPanel menu = new JPanel();
	private final DrawArea drawArea = new DrawArea();
	private final JButton clearButton  = new JButton("Clear Screen");

	public MyLayout()
	{
		super("Testing Layout");
		setLayout(new BorderLayout());

		menu.setPreferredSize(new Dimension(125, 700));
		menu.setBackground(255, 0, 0);

		drawArea.setPreferredSize(new Dimension(375, 700));
		drawArea.setBackground(240,255,255);

		add(menu, BorderLayout.EAST);
		add(drawArea, BorderLayout.CENTER);
      
		menu.add(clearButton, BorderLayout.SOUTH);
	}

}