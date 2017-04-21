// Jakob Vendegna
// CIS 161
// 4/11/17 
// testing my tree, using strings in the tree instead of intigers

import java.util.StringTokenizer;
import java.util.Scanner;

public class TreeTest 
{
	public static void main(String[] args) 
	{
		Tree<String> tree = new Tree<>(); // create the tree
		Scanner kb = new Scanner(System.in);

		System.out.println("Please input a sentance and I will pass it into a binary tree");
		StringTokenizer userInput = new StringTokenizer(kb.nextLine());

		while (userInput.hasMoreTokens())
		{
			tree.insertNode(userInput.nextToken());
		}

		System.out.printf("%n%nPreorder Traversal%n");
		tree.preorderTraversal();

		System.out.printf("%n%nInorder Traversal%n");
		tree.inorderTraversal();

		System.out.printf("%n%nPostorder Traversal%n");
		tree.postorderTraversal();
	}
}