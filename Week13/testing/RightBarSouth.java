// Jakob Vendegna
// CIS 161
// date 
// description

import java.awt.GridLayout;
import javax.swing.JPanel;


public class RightBarSouth extends JPanel
{
	private final SingleButtonContainer clearPane;
	private final SingleButtonContainer colorPane;
	private final String[] labels = {"Clear", "Choose Color"}

	public RightBarSouth()
	{
		setLayout(new GridLayout(1,2,2,2));

		clearPane = new SingleButtonContainer(labels[0]);
		colorPane = new SingleButtonContainer(labels[1]);

		add(clearPane);
		add(colorPane);

	}


}