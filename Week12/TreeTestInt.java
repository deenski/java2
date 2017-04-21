// Jakob Vendegna
// CIS 161
// 4/11/17 
// Test my tree with ints so I know it actually is working correctly.
import java.security.SecureRandom;
public class TreeTestInt 
{
	public static void main(String[] args) 
	{
		Tree<Integer> tree = new Tree<>();
		SecureRandom randomNum = new SecureRandom();
		System.out.println("Inserting the following values into the tree, in the order below:");

		for (int i = 1; i <= 10; i++)
		{
			int value = randomNum.nextInt(100);
			System.out.printf("%d ", value);
			tree.insertNode(value);
         

		}

		System.out.printf("%n%nPreorder Traversal%n");
		tree.preorderTraversal();

		System.out.printf("%n%nInorder Traversal%n");
		tree.inorderTraversal();

		System.out.printf("%n%nPostorder Traversal%n");
		tree.postorderTraversal();
      
      
	}
}