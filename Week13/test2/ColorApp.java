// Jakob Vendegna
// CIS 161
// 4/20/17
// sets up and runs the color app from PaintPanel and PanelFrame

import javax.swing.JFrame;

public class ColorApp extends JFrame 
{
	public static void main(String[] args) 
	{	

		// set up and run the ColorApp
		PanelFrame frame = new PanelFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
}