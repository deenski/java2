/*
Jakob Vendegna
CSC 161 201
3/21/17

Description:
*/

public class List<T> {
	
    // declare 2 ListNode objects of whichever type is being cast.
	private ListNode<T> firstNode;
	private ListNode<T> lastNode;
	private String name;

	// default constructor creates an empty list
	public List()
	{   
        // apparently this sets the name of the List? 
        // seems like some funky voodoo to me...
		this("new list");
	}

	//empty list constructor with a custom name
	public List(String listName)
	{
		name = listName;
		firstNode = lastNode = null;
	}

	//insert to the head of the List
	public void insertAtFront(T insertItem)
	{
		if(isEmpty())
		{
            //the first node is the last node,
            // which is the ListNode<T>, add the item specified to
            // the first slot
			firstNode = lastNode = new ListNode<T>(insertItem);
		}
		else
		{   
            // create a new node and place it in the front of the 
            // list.
			firstNode = new ListNode<T>(insertItem, firstNode);
		}
	}

	//insert to the tail of the List
	public void insertAtBack(T insertItem)
	{
		if (isEmpty())
		{
			firstNode = lastNode = new ListNode<T>(insertItem);
		}
		else
		{
			lastNode = lastNode.nextNode = new ListNode<T>(insertItem);
		}
	}

	//remove from head
	public T removeFromFront() throws EmptyListException
	{
		if (isEmpty())
		{
			throw new EmptyListException(name);
		}

		T removedItem = firstNode.data;

		if(firstNode == lastNode)
		{
			firstNode = lastNode = null;
		}
		else
		{
			firstNode = firstNode.nextNode;
		}

		return removedItem;
	}

	//remove from tail
	public T removeFromBack() throws EmptyListException
	{
		if (isEmpty())
		{
			throw new EmptyListException(name);
		}
        
        // get the data from the back end of the lsit
		T removedItem = lastNode.data;
        
        // if we made it to the first node in the list
		if(firstNode == lastNode)
		{
            // firstNode is the lastNode, which is null
			firstNode = lastNode = null;
		}
		else
		{
            // an iterator of sorts
			ListNode<T> current = firstNode;
            
            // iterate to the back of the list
			while(current.nextNode != lastNode)
			{
				current = current.nextNode;
			}
            
            // once at the back of the list
            // delete the item by changing its 
            // value to null
			lastNode = current;
			current.nextNode = null;
		}
        
		return removedItem;
	}
    
    
    // check to see if the list is empty
	public boolean isEmpty()
	{
		return firstNode == null;
	}
    
    
    // print a non-empty list
	public void print()
	{
		if (isEmpty()) 
		{
			System.out.printf("Empty %s%n", name);
			return;
		}

		System.out.printf("The %s is: ", name);
		ListNode<T> current = firstNode;

		while (current != null)
		{
			System.out.printf("%s, ", current.data);
			current = current.nextNode;
		}

		System.out.println();

	}

	//concatinate method
	public void concatenate(List<T> someList) throws EmptyListException
	{
        // verify there is data in the first list
		if (isEmpty())
		{
			throw new EmptyListException(name);
		}
        
        // no matter, proceed anyway. 
        // ListNode for the current object, starting at the 
        // firstNode of someList
		ListNode<T> current = someList.firstNode;

        // while someList has another item
		while(current != null)
		{
            // insert the data in the current Node in
            // someList to the original List
            // that called the concatenate method
		    insertAtBack(current.data);
            
            // iterate to the next item in someList
			current = current.nextNode;
		}
        
        
	}

}