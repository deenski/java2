// Jakob Vendegna
// CIS 161
// date 
// description
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JColorChooser;

public class PanelFrame extends JFrame 
{
	private final JPanel rightJPanel;
	private final JButton[] buttons;
	private final JRadioButton[] radios;
	private final ButtonGroup radioGroup;
	private final String[] names = {"Colors", "Clear", 
		"Lines", "Shapes"};
	private Color color;
	private final PaintPanel paintPanel;


	public PanelFrame()
	{
		super("maybe");
		buttons = new JButton[2];
		radios = new JRadioButton[2];
		radioGroup = new ButtonGroup();
		rightJPanel = new JPanel();
		rightJPanel.setLayout(new GridLayout(4,1));
		paintPanel = new PaintPanel();
		

		for (int i = 0; i < radios.length; i++)
		{
			radios[i] = new JRadioButton(names[i+2]);
			rightJPanel.add(radios[i]);
			radioGroup.add(radios[i]);
		}

      
      for (int i = 0; i < buttons.length; i++)
		{
			buttons[i] = new JButton(names[i]);
			rightJPanel.add(buttons[i]);
		}

		
		add(rightJPanel, BorderLayout.WEST);
		add(paintPanel, BorderLayout.CENTER);


		// color picker button functionality
		buttons[0].addActionListener(
			new ActionListener()
			{
				//display JColorChooser on button click
				@Override
				public void actionPerformed(ActionEvent event)
				{

					color = JColorChooser.showDialog(
						PanelFrame.this, "Choose a color", color);

					// set default color to white
					if (color == null)
					{
						color = Color.WHITE;
					}
					// add set drawing color functionality

				}
			}
        );

		// clear button functionality
		buttons[1].addActionListener(
			new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent event)
				{
					getContentPane().remove(paintPanel);
					add(new PaintPanel(), BorderLayout.CENTER);
					getContentPane().invalidate();
					getContentPane().validate();
               
                  
				}
			}
		);
	}
}
