/*
Jakob Vendegna
CSC 161 201
3/21/17

Description: ListNode<T>
*/

class ListNode<T> 
{
   	T data;
	ListNode<T> nextNode;

	//constructor creates ListNode that refers to the object it's passed.
	ListNode(T object)
	{
		this(object, null);
	}

	//constructor creates ListNode that refers to the specified object
	//and to the next ListNode
	ListNode(T object, ListNode<T> node)
	{
		data = object;
		nextNode = node;
	}

	//get the reference of the data in the particular node
	T getData()
	{
		return data;
	}

	//return the reference to the next node in the list
	ListNode<T> getNext()
	{
		return nextNode;
	}
}