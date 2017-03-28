/*
Jakob Vendegna
CSC 161 201
3/21/17

Description: add items to more than one linked 
list and concatenate the lists.

*/

public class Homework {
	
	public static void main(String[] args) 
    {
        try
        {
            // create empty lists
    		List<Integer> list1 = new List<>("List1-Intigers");
    		List<Integer> list2 = new List<>("List2-Intigers");
            
            // test a print method with an empty list
            list1.print();
            
            // add items to list1
    		list1.insertAtFront(1);
    		list1.insertAtBack(5);
    		list1.insertAtBack(2);
            
            // print the contents of list1
    		list1.print();
            
            // for loop to add 9 Nubmers to list2
            for (int i = 3; i <= 27; i+=3) 
            {
                if (i == 0)
                {
                    // add the first item in the list
                    list2.insertAtFront(i);
                }
                else
                {
                    // append the other numbers to the back of the list
                    list2.insertAtBack(i);
                }
            }
            
            // print the contents of list2
    		list2.print();
            
            // using concatenate from List<T>
            // to append the contents of list2 to the 
            // end of list1
            
            list1.concatenate(list2);
            
            // print
            list1.print();
            System.out.println();
            
            
            
            
            // Characters -- extra credit
      
            // create 2 more lists and fill with Characters
            List<Character> list3 = new List<>("List3-Characters");
            List<Character> list4 = new List<>("List4-Characters");
            
            // test empty list with print method
            list3.print();
            
            // build list3
            list3.insertAtFront('C');
            list3.insertAtBack('a');
            list3.insertAtBack('t');
            list3.insertAtBack('I');
            list3.insertAtBack('n');
            
            // print it out
            list3.print();
            
            // build list4
            list4.insertAtFront('T');
            list4.insertAtBack('h');
            list4.insertAtBack('e');
            list4.insertAtBack('H');
            list4.insertAtBack('a');
            list4.insertAtBack('t');
            
            // print it out
            list4.print();
            
            
            // concat the two lists
            list3.concatenate(list4);
            
            // print the concatenated result
            list3.print();
            
            System.out.println();
            
            
            System.out.println("Just for kicks: ");
            // test removeFromBack method
            System.out.println("Removing character '" + list3.removeFromBack() + "' from the" 
                               + " lastNode of list3");
            list3.print();
            // test removeFromFront method
            System.out.println("Removing " + list1.removeFromFront() +" from the "
                            + "firstNode of list1");
            list1.print();
        }
        catch(EmptyListException e)
        {
            System.out.println("Empty List");
        }

	}
    
}