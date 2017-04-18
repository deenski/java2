// Jakob Vendegna
// CIS 161
// 4/18/17 
// set up layout for gui paint program

import java.awt.BorderLayout;
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

		add(menu);
		add(drawArea);
      
		menu.add(clearButton, BorderLayout.CENTER);
	}

}