// Jakob Vendegna
// CIS 161
// 4/11/17 
// Tree class

public class Tree<T extends Comparable<T>>
{
	public TreeNode<T> root;

	public Tree()
	{
		root = null;
	}

	// insert a new node in binary search tree
	public void insertNode(T insertValue)
	{
		if (root == null)
		{
			root = new TreeNode<T>(insertValue); // create root node
		}
		else 
		{
			root.insert(insertValue);
		}
	}

	// begin preorder
	public void preorderTraversal()
	{
		preorderHelper(root);
	}

	// recursive method to perform preorder traversal
	private void preorderHelper(TreeNode<T> node)
	{
		if (node == null)
		{
			return;
		}

		System.out.printf("%s ", node.data); //show node data
		preorderHelper(node.leftNode); // then traverse left
		preorderHelper(node.rightNode); // then traverse right
	}


	// begin inorder
	public void inorderTraversal()
	{
		inorderHelper(root);
	}

	private void inorderHelper(TreeNode<T> node)
	{
		if (node ==null)
		{
			return;
		}

		inorderHelper(node.leftNode); // traverse left
		System.out.printf("%s ", node.data); // then print node data
		inorderHelper(node.rightNode); // then traverse right
	}

	// begin postorder
	public void postorderTraversal()
	{
		postorderHelper(root);
	}

	private void postorderHelper(TreeNode<T> node)
	{
		if (node == null)
		{
			return;
		}

		postorderHelper(node.leftNode); // traverse left
		postorderHelper(node.rightNode); // then traverse right
		System.out.printf("%s ", node.data); // then print node data
	}
} // end Tree class