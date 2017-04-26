// Jakob Vendegna
// CIS 161
// 4/24/17 
// GUI for my comic book collection catalog
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class MyComicCatalog extends JFrame
{
	private final GridBagLayout layout;
	private final GridBagConstraints constraints;
	private final JTextField[] textFields;
	private final JButton[] buttons;
	private final JRadioButton[] radioButtons;
	private final ButtonGroup buttonGroup;
	private final String[] textFieldNames;
    private final String[] buttonLabels;
    private final String[] radioButtonLabels;
    private final List<Book> myBooks;
    private final Iterator<Book> iterator;

	// set up GUI
	public MyComicCatalog() 	
   {
   		super("My Comic Book Catalog - By Jakob Vendegna");


   		myBooks = new ArrayList<Book>(); // declare my collection of books
   		addBooks(); // add some default books into the collection

   		//set up GUI in GridBagLayout
		
		layout = new GridBagLayout();
		setLayout(layout);
		constraints = new GridBagConstraints();
		constraints.weightx = 1; //allow components to resize
		constraints.weighty = 1; 
		constraints.fill = GridBagConstraints.BOTH;
      
      	//comment print lines after testing
		System.out.println("created layout, set layout, and created constraints");


		//create labels for inserting default componenets
		textFieldNames = new String[] {"Results List",
			"Name", "Author", "Results1", "editableName", "editableAuthor",
			"Results2", "Issue Number", "Release Date", "Results3", 
			"editableIssueNumber", "editableReleaseDate", "Results4",
			"Grade", "editableGrade", "Results5", "Results6",
			"Price Payed", "Results7", "editablePricePayed", "Results8", 
			"Current Value", "Results9", "editableCurrentValue", "Results10",
			"Profit", "DisplayProfit", "editableSearchField"};

		buttonLabels = new String[] {"Search", "Add", "Edit", "Delete", "Confirm"};

		radioButtonLabels = new String[] {"Graphic Novel", "Comic Book"};


		// create components and initialize to the size of their respectve naming arrays
		
		textFields = new JTextField[textFieldNames.length];
		buttons = new JButton[buttonLabels.length];
		radioButtons = new JRadioButton[radioButtonLabels.length];
		buttonGroup = new ButtonGroup();
		System.out.println("Created button and text field arrays");

		// initialize text fields
		for (int i = 0; i < textFieldNames.length; i++)
		{

			textFields[i] = new JTextField(textFieldNames[i]);
			System.out.println("Creating " + textFieldNames[i]);
			// based on the name of the field, set editable;
			if (textFieldNames[i].contains("edit"))
			{
				
				textFields[i].setEditable(true);
				System.out.println("Setting editable");
				textFields[i].setText("");
			}
			else if (textFieldNames[i].contains("Result"))
			{
				textFields[i].setEditable(false);
				
				System.out.println("Setting Final");
				
				// display "Results List" heading text
				if (i > 0)
				{
					textFields[i].setText("");	
				}
				
				
			}
			else
			{
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

		// add the components to the JFrame
		addComponent(textFields[0], 0, 0, 1, 1); //Results List, 0
		addComponent(textFields[1], 0, 1, 1, 1); //Name, 1
		addComponent(textFields[2], 0, 3, 1, 1); //author, 2
		addComponent(textFields[3], 1, 0, 1, 1); //result1, 3
		addComponent(textFields[4], 1, 1, 2, 1); //editName, 4
		addComponent(textFields[5], 1, 3, 2, 1); //editAuthor
		addComponent(textFields[6], 2, 0, 1, 1); //"Results2", 
		addComponent(textFields[7], 2, 1, 2, 1); //"Issue Number", 
		addComponent(textFields[8], 2, 3, 2, 1); //"Release Date", 
		addComponent(textFields[9], 3, 0, 1, 1); //"Results3"
		addComponent(textFields[10], 3, 1, 1, 1); //"editableIssueNumber", 
		addComponent(textFields[11], 3, 3, 2, 1); //"editableReleaseDate", 
		addComponent(textFields[12], 4, 0, 1, 1); //"Results4",
		addComponent(textFields[13], 4, 3, 1, 1); //"Grade", 
		addComponent(textFields[14], 4, 4, 1, 1); //"editableGrade", 
		addComponent(textFields[15], 5, 0, 1, 1); //"Results5",
		addComponent(radioButtons[0], 5, 3, 1, 1); //"Graphic Novel" 
		addComponent(radioButtons[1], 5, 4, 1, 1); //"Comic Book"
		addComponent(textFields[16], 6, 0, 1, 1); //"Results6",
		addComponent(textFields[17], 6, 1, 1, 1); //"Price Payed", 
		addComponent(textFields[18], 7, 0, 1, 1); //"Results7", 
		addComponent(textFields[19], 6, 3, 2, 1); //"editablePricePayed", 
		addComponent(textFields[20], 8, 0, 1, 1); //"Results8", 
		addComponent(textFields[21], 8, 1, 1, 1); //"Current Value", 
		addComponent(textFields[22], 9, 0, 1, 1); //"Results9", 
		addComponent(textFields[23], 8, 3, 2, 1); //"editableCurrentValue", 
		addComponent(textFields[24], 10, 0, 1, 1); //"Results10",
		addComponent(textFields[25], 10, 1, 1, 1); //"Profit", 
		addComponent(textFields[26], 10, 3, 1, 1); //"DisplayProfit", 
		addComponent(textFields[27], 13, 0, 1, 1); //"editableSearchField"
		addComponent(buttons[0], 12, 0, 1, 1); //search
		addComponent(buttons[1], 12, 1, 1, 2); //add
		addComponent(buttons[2], 12, 3, 1, 2); //edit
		addComponent(buttons[3], 12, 4, 1, 2); //delete

		
		ConfirmButtonHandler cbHandler = new ConfirmButtonHandler();
		buttons[4].addActionListener(cbHandler);

		AddButtonHandler abHandler = new AddButtonHandler();
		buttons[1].addActionListener(abHandler);

		
	}


	//method to simplify adding each component
	//sets which row and column the component occupies
	//as well as how many rows/columns it should take up
	//then adds the component.
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

	private void setEditsBlank()
	{
		for (int i = 0; i < textFields.length; i++)
			{
				if (textFieldNames[i].contains("edit"))
				{
					textFields[i].setText("");
				}
			}
			System.out.println("Set blank text in editable fields");
	}

	private void addBooks()
	{
		ComicBook silverSurfer = new ComicBook("Silver Surfer", "Frank Lloyd",
			"2/12/67", 2, true, 9.3, 1.00, 1555.99);
		ComicBook spiderMan = new ComicBook("The Amazing Spider Man", "Stan Lee",
			"5/14/85", 55, true, 8.7, 15.50, 36.00);
		GraphicNovel habibi = new GraphicNovel("Habibi", "Chris Thompson",
			"9/14/12", 1, false, 3.25, 30.00, 15.00);
		GraphicNovel lastMan = new GraphicNovel("Last Man", "Not Sure", 
			"7/29/08", 1, false, 4.65, 15.00, 12.50);

		myBooks.add(silverSurfer);
		myBooks.add(spiderMain);
		myBooks.add(habibi);
		myBooks.add(lastMan);
	}

	private void deleteBooks(List<Book> books, String name)
	{
		iterator = books.iterator();

		while (iterator.hasNext())
		{
			if books.contains(name)
			{
				iterator.remove();
			}
		}
	}

	// private class EditButtonHandler implements ActionListener
	// {
	// 	@Override
	// 	public void actionPerformed(ActionEvent event)
	// 	{
			
	// 	}
	// }

	// private class SearchButtonHandler implements ActionListener
	// {
	// 	@Override
	// 	public void actionPerformed(ActionEvent event)
	// 	{

	// 	}
	// }

	// private class DeleteButtonHandler implements ActionListener
	// {
	// 	@Override
	// 	public void actionPerformed(ActionEvent event)
	// 	{

	// 	}
	// }

	private class AddButtonHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent event)
		{	


			setEditsBlank();
			System.out.println("Set blank text in editable fields");

			addComponent(buttons[4], 10, 4, 1, 1);
			buttons[4].setVisible(true);
			revalidate();
			repaint();

			System.out.println("Confirm button added to the GUI");



		}
	}

	private class ConfirmButtonHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent event)
		{	
			buttons[4].setVisible(false);

			String name, author, releaseDate;
			int issueNumber;
			boolean bagged;
			double grade, pricePayed, currentValue;

			name = textFields[4].getText();
			author = textFields[5].getText();
			issueNumber = Integer.parseInt(textFields[10].getText());
			releaseDate = textFields[11].getText();
			bagged = true;
			grade = Double.parseDouble(textFields[14].getText());
			pricePayed = Double.parseDouble(textFields[19].getText());
			currentValue = Double.parseDouble(textFields[23].getText());

			if (radioButtons[0].isSelected())
			{
				GraphicNovel gNovel = new GraphicNovel(name, author,
					releaseDate, issueNumber, bagged, grade, pricePayed, currentValue);
				myBooks.add(gNovel);
				System.out.println(myBooks);
			}
			else if (radioButtons[1].isSelected())
			{
				ComicBook comic = new ComicBook(name, author,
					releaseDate, issueNumber, bagged, grade, pricePayed, currentValue);
				System.out.println(comic);
				myBooks.add(comic);
				System.out.println(myBooks);

			}
			else
			{
				// show warning message, and ask to select a radio button
			}

			setEditsBlank();
			// JTextField confirmation = new JTextField();
			// confirmation.setEditable(false);
			// confirmation.setText(name + " has been created");
			// addComponent(confirmation, 10, 4, 1, 1);
			revalidate();
			repaint();

			
		}


	}

}