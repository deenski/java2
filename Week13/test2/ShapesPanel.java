// Jakob Vendegna
// CIS 161
// 4/22/17 
// description
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ShapesPanel extends JPanel
{
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
	}
}