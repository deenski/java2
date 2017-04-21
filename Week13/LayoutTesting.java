// Jakob Vendegna
// CIS 161
// 4/18/17 
// test layout

import javax.swing.JFrame;

public class LayoutTesting 
{
	public static void main(String[] args) 
	{
		MyLayout layout = new MyLayout();
		layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout.setSize(500, 700);
      
		layout.setVisible(true);
	}
}