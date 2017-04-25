// Jakob Vendegna
// CIS 161
// 4/24/17 
// GUI for my comic book collection catalog
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class MyComicCatalog extends JFrame
{
	private final GridBagLayout layout;
	private final GridBagConstraints constraints;
	private final JTextField[] textFields;
	private final JButton[] buttons;
	private final JRadioButton[] radioButtons;
	private final CharSequence edits = "edit";
	private final CharSequence results = "Result";
	private final ButtonGroup buttonGroup;
	private final String[] textFieldNames;
   private final String[] buttonLabels;
   private final String[] radioButtonLabels;

	// set up GUI
	public MyComicCatalog() 	
   {
		super("My Comic Book Catalog - By Jakob Vendegna");
		layout = new GridBagLayout();
		setLayout(layout);
		constraints = new GridBagConstraints();
      
      //comment print lines after testing
		System.out.println("created layout, set layout, and created constraints");

		textFieldNames = new String[] {"Results List",
			"Name", "Author", "Results1", "editableName", "editableAuthor",
			"Results2", "Issue Number", "Release Date", "Results3", 
			"editableIssueNumber", "editableReleaseDate", "Results4",
			"Grade", "editableGrade", "Results5", "Results6",
			"Price Payed", "Results7", "editablePricePayed", "Results8", 
			"Current Value", "Results9", "editableCurrentValue", "Results10",
			"Profit", "DisplayProfit", "editableSearchField"};

		buttonLabels = new String[] {"Search", "Add", "Edit", "Delete"};

		radioButtonLabels = new String[] {"Graphic Novel", "Comic Book"};


		// create components
		
		textFields = new JTextField[textFieldNames.length];
		buttons = new JButton[buttonLabels.length];
		radioButtons = new JRadioButton[radioButtonLabels.length];
		buttonGroup = new ButtonGroup();
		System.out.println("Created button and text field arrays");

		// initialize text fields
		for (int i = 0; i < textFieldNames.length; i++)
		{

			// textFields[i] = new JTextField(textFieldNames[i]);
			System.out.println("Creating " + textFieldNames[i]);
			// based on the name of the field, set editable;
			if (textFieldNames[i].contains(edits))
			{
				textFields[i] = new JTextField(textFieldNames[i], 24);
				textFields[i].setEditable(true);
				System.out.println("Setting editable");
			}
			else if (textFieldNames[i].contains(results))
			{
				textFields[i] = new JTextField(textFieldNames[i], 24);
				textFields[i].setEditable(false);
				System.out.println("Setting Final");
			}
		}

		// initialize buttons
		for (int i = 0; i < buttonLabels.length; i++)
		{
			buttons[i] = new JButton(buttonLabels[i]);
			System.out.println("Created " + buttons[i]);
		} 

		// initialize radio buttons
		for (int i = 0; i <  radioButtonLabels.length; i++)
		{
			radioButtons[i]  = new JRadioButton(radioButtonLabels[i]);
			buttonGroup.add(radioButtons[i]);
			System.out.println("And set editable");

		}

		
		constraints.fill = GridBagConstraints.BOTH;
		addComponent(textFields[0], 0, 0, 1, 1);
		addComponent(textFields[3], 0, 1, 2, 1);
		addComponent(textFields[4], 1, 1, 1, 1);
		addComponent(textFields[5], 1, 3, 2, 1);
		
		//1,2,

	}

	private void addComponent(Component component,
			int row, int column, int width, int height)
		{
			constraints.gridx = column;
			constraints.gridy = row;
			constraints.gridwidth = width;
			constraints.gridheight = height;
			layout.setConstraints(component, constraints);
			add(component);
		}
}