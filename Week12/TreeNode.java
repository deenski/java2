// Jakob Vendegna
// CIS 161
// 4/11/17 
// Tree node class

public class TreeNode<T extends Comparable<T>> 
{
	//package access members
	TreeNode<T> leftNode;
	T data; // node value
	TreeNode<T> rightNode;

	// constructor initializes data and makes this a leaf node
	public TreeNode(T nodeData)
	{
		data = nodeData;
		leftNode = rightNode = null; // leaves have no children

	}

	// locate insertion point and insert new node; allows duplicates
   // remove the equals sign from the conditional tests to remove
   // duplicate funcitonality.
	public void insert(T insertValue)
	{
		// insert left subtree
		if (insertValue.compareTo(data) <= 0) // <= allows duplicates
                                            // remove '=' to disallow duplicates
		{
			// insert new TreeNode
			if (leftNode == null)
			{
				leftNode = new TreeNode<T>(insertValue);
			}
			else // continue traversing left, recursively
			{
				leftNode.insert(insertValue);
			}
		}
		else if (insertValue.compareTo(data) >= 0) //insert right subtree, >= allows duplicates
                                                 // remove the '=' to disallow duplicates
		{
			if (rightNode == null)
			{
				rightNode = new TreeNode<T>(insertValue);
			}
			else // traverse right
			{
				rightNode.insert(insertValue);
			}
		}
	}
} // end TreeNode class

