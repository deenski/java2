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
import javax.swing.JTextArea;
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
	private final JTextArea textArea;
	private final JButton[] buttons;
	private final JRadioButton[] radioButtons;
	private final ButtonGroup buttonGroup;
	private final String[] textFieldNames;
    private final String[] buttonLabels;
    private final String[] radioButtonLabels;
    private final List<Book> myBooks;
    //private final Iterator<Book> iterator;

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
			"Name", "Author", "Results", "editableName", "editableAuthor",
			"Issue Number", "Release Date", "editableIssueNumber", 
			"editableReleaseDate", "Grade", "editableGrade", 
			"Price Payed", "editablePricePayed", "Current Value",
			"editableCurrentValue", "Profit", "DisplayProfit", "editableSearchField"};

		buttonLabels = new String[] {"Search", "Add", "Edit", "Delete", "Confirm"};

		radioButtonLabels = new String[] {"Graphic Novel", "Comic Book"};


		// create components and initialize to the size of their respectve naming arrays
		
		textFields = new JTextField[textFieldNames.length];
		textArea = new JTextArea();
		textArea.setEditable(false);
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
		addComponent(textArea, 1, 0, 1, 10); //results, 3
		addComponent(textFields[4], 1, 1, 2, 1); //editName, 4
		addComponent(textFields[5], 1, 3, 2, 1); //editAuthor
		addComponent(textFields[6], 2, 1, 2, 1); //"Issue Number", 
		addComponent(textFields[7], 2, 3, 2, 1); //"Release Date", 
		addComponent(textFields[8], 3, 1, 1, 1); //"editableIssueNumber", 
		addComponent(textFields[9], 3, 3, 2, 1); //"editableReleaseDate", 
		addComponent(textFields[10], 4, 3, 1, 1); //"Grade", 
		addComponent(textFields[11], 4, 4, 1, 1); //"editableGrade", 
		addComponent(radioButtons[0], 5, 3, 1, 1); //"Graphic Novel" 
		addComponent(radioButtons[1], 5, 4, 1, 1); //"Comic Book"
		addComponent(textFields[12], 6, 1, 1, 1); //"Price Payed", 
		addComponent(textFields[13], 6, 3, 2, 1); //"editablePricePayed", 
		addComponent(textFields[14], 8, 1, 1, 1); //"Current Value", 
		addComponent(textFields[15], 8, 3, 2, 1); //"editableCurrentValue", 
		addComponent(textFields[16], 10, 1, 1, 1); //"Profit", 
		addComponent(textFields[17], 10, 3, 1, 1); //"DisplayProfit", 
		addComponent(textFields[18], 13, 0, 1, 1); //"editableSearchField"
		addComponent(buttons[0], 12, 0, 1, 1); //search
		addComponent(buttons[1], 12, 1, 1, 2); //add
		addComponent(buttons[2], 12, 3, 1, 2); //edit
		addComponent(buttons[3], 12, 4, 1, 2); //delete

		

		AddButtonHandler abHandler = new AddButtonHandler();
		buttons[1].addActionListener(abHandler);

		SearchButtonHandler sbHandler = new SearchButtonHandler();
		buttons[0].addActionListener(sbHandler);

		ConfirmButtonHandler cbHandler = new ConfirmButtonHandler();
		buttons[4].addActionListener(cbHandler);

		System.out.println("Added Event Handlers");
		
		for (Book book : myBooks)
		{
			System.out.println(book.getName());
		}
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
				textFields[i].setEditable(true);
			}
		}

		System.out.println("Set editable fields to blank in setEditsBlank");
	}

	private void setEditableTrue()
	{
		for (int i = 0; i < textFields.length; i++)
		{
			if (textFieldNames[i].contains("edit"))
			{
				if (i < 16)
				{
				textFields[i].setEditable(true);
				System.out.println("i = " + i);
				}
			}
		}
		System.out.println("Set true in setEditableTrue");
	}

	private void setEditableFalse()
	{
		for (int i = 0; i < textFields.length; i++)
		{
			if (textFieldNames[i].contains("edit"))
			{
				if (i < 16)
				{
				textFields[i].setEditable(false);
				System.out.println("i = " + i);
				}
			}
		}
		System.out.println("Set false in setEditableFalse");
	}

	private void addBooks()
	{
		ComicBook silverSurfer = new ComicBook("Silver Surfer", "Frank Lloyd",
			"2/12/67", 2, true, 9.3, 1.00, 1555.99);
		ComicBook spiderMan = new ComicBook("The Amazing Spider Man", "Stan Lee",
			"5/14/85", 55, true, 8.7, 15.50, 36.00);
		GraphicNovel habibi = new GraphicNovel("Habibi", "Chris Thompson",
			"9/14/12", 1, 3.25, 30.00);
		GraphicNovel lastMan = new GraphicNovel("Last Man", "Not Sure", 
			"7/29/08", 1, 4.65, 15.00);

		myBooks.add(silverSurfer);
		myBooks.add(spiderMan);
		myBooks.add(habibi);
		myBooks.add(lastMan);
	}

	private Book searchMe(String searchKey)
	{
		for (Book book : myBooks)
		{
			if (book.getName().equals(searchKey))
			{
            System.out.println(book.getName());
				return book;
			}
		}
      return null;   
	}

	private void showResults(ComicBook book)
	{
		String issueToText, gradeToText, payedToText,
			valueToText, profitToText;

		issueToText = Integer.toString(book.getIssueNumber());
		gradeToText = Double.toString(book.getGrade());
		payedToText = Double.toString(book.getPricePayed());
		valueToText = Double.toString(book.getCurrentValue());
		profitToText = Double.toString(book.getProfit());
    
		textFields[4].setText(book.getName());
		textFields[5].setText(book.getAuthor());
		textFields[8].setText(issueToText);
		textFields[9].setText(book.getReleaseDate());
		textFields[11].setText(gradeToText);
		textFields[13].setText(payedToText);
		textFields[15].setText(valueToText);
		textFields[18].setText(profitToText);


		revalidate();
		repaint();
	}

	private void showResults(GraphicNovel book)
	{
		String issueToText, gradeToText, payedToText;

		issueToText = Integer.toString(book.getIssueNumber());
		gradeToText = Double.toString(book.getGrade());
		payedToText = Double.toString(book.getPricePayed());
		
    
		textFields[4].setText(book.getName());
		textFields[5].setText(book.getAuthor());
		textFields[8].setText(issueToText);
		textFields[9].setText(book.getReleaseDate());
		textFields[11].setText(gradeToText);
		textFields[13].setText(payedToText);


		revalidate();
		repaint();
	}

	// private void deleteBooks(List<Book> books, String name)
// 	{
// 		iterator = books.iterator();
// 
// 		while (iterator.hasNext())
// 		{
// 			if books.contains(name)
// 			{
// 				iterator.remove();
// 			}
// 		}
// 	}

	// private class EditButtonHandler implements ActionListener
	// {
	// 	@Override
	// 	public void actionPerformed(ActionEvent event)
	// 	{
			
	// 	}
	// }

	private class SearchButtonHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent event)
		{
			setEditableFalse();


			Book book = searchMe(textFields[18].getText());

			//System.out.println("Book type is " + book.getType());

			if (book.getType().equals("comic"))
			{
				ComicBook comic = (ComicBook) book;
				showResults(comic);
				System.out.println("Created copy of ComicBook and passed to showResults()");

			}
			else if (book.getType().equals("novel"))
			{
				GraphicNovel novel = (GraphicNovel) book;
				showResults(novel);
				System.out.println("Created copy of GraphicNovel and passed to showResults()");
			}


		}
	}

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

         	setEditableTrue();
			setEditsBlank();
			System.out.println("Set blank text in editable fields in AddButtonHandler");

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
					releaseDate, issueNumber, grade, pricePayed);
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