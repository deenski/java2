// Jakob Vendegna
// CIS 161
// 4/20/17
// sets up functionality and GUI for ColorApp
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
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
		"Splash", "Dots"};
	private Color color = Color.BLACK;
	private PaintPanel paintPanel;

	//default constructor
	public PanelFrame()
	{
		super("Color Me App");
		// declare arrays of buttons
		buttons = new JButton[2];
		radios = new JRadioButton[2];
		// set up radio button group
		radioGroup = new ButtonGroup();
		// create the right (menu) panel
		rightJPanel = new JPanel();
		// set the layout
		rightJPanel.setLayout(new GridLayout(4,1));
		// create the panel you draw on
		paintPanel = new PaintPanel();
		


		// init and add radio buttons to the rightJPanel, and enroll them in the radioGroup
		for (int i = 0; i < radios.length; i++)
		{
			radios[i] = new JRadioButton(names[i+2]);
			rightJPanel.add(radios[i]);
			radioGroup.add(radios[i]);
		}

		// add our listeners
		radios[0].addItemListener(
			new RadioButtonHandler("splash"));

		radios[1].addItemListener(
			new RadioButtonHandler("dots"));

      // init and add the clear and color buttons
      for (int i = 0; i < buttons.length; i++)
		{
			buttons[i] = new JButton(names[i]);
			rightJPanel.add(buttons[i]);
		}

		// add both of the constructed panels
		add(rightJPanel, BorderLayout.WEST);
		add(paintPanel, BorderLayout.CENTER);




		// clear button functionality
		buttons[1].addActionListener(
			new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent event)
				{
               		PaintPanel newPaintPanel = new PaintPanel();
               		remove(paintPanel);
               		paintPanel = newPaintPanel;
               		add(paintPanel, BorderLayout.CENTER);
                    invalidate();
                    validate();
                  
				}

			}
		);

		// color picker button functionality
		buttons[0].addActionListener(
			new ActionListener()
			{
				//display JColorChooser on button click
				@Override
				public void actionPerformed(ActionEvent event)
				{

					Color chosenColor = JColorChooser.showDialog(
						PanelFrame.this, "Choose a color", color);

					// set default color to white
					if (color == null)
					{
						color = Color.WHITE;
					}
					// set drawing color
               		else
               		{
                  		color = chosenColor;
               		}
               		
               		paintPanel.setColor(color);
               		
				}
			}
        );   
	}

	// sets the user choice based on radio button selection - dots or splash?
	private class RadioButtonHandler implements ItemListener
    {
    	private String choice;

    	public RadioButtonHandler(String c)
    	{
    		choice = c;
    	}

    	@Override
    	public void itemStateChanged(ItemEvent event)
    	{
    		paintPanel.setType(choice);
    	}
    }
}
