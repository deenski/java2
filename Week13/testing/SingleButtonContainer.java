//import java.awt.GridLayout;
//import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import javax.swing.JFrame;
import javax.swing.JButton;

public class SingleButtonContainer implements ActionListener
{
   //private final JButton[] button;
   //private static final String[] buttonNames = {"Color Picker", "Clear Screen"};
   //private final GridLayout layout; 
   private final JButton button;

   public SingleButtonContainer(String button_name)
   {
    	//super("PaintMe - By Jakob Vendegna");

    	//layout = new Gridayout(1,1,2,2);
    	//setLayout(layout);
    	button = new JButton(button_name)
		button.addActionListener(this);
    	add(button);

   }

   @Override
   public void actionPerformed(ActionEvent e) 
   {
   		for (JButton button : buttons)
   		{
   			if (e.getSource() == button)
   			{
   				button.setVisible(false);
   			}
   			else
   			{
   				button.setVisible(true);
   			}
   		}

   		layout.layoutContainer(getContentPane());
   }
   
}