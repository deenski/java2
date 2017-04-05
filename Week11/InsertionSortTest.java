// Jakob Vendegna
// CIS 161
// 4/5/17 
// Insertion sort - copy from ch19
import java.security.SecureRandom;
import java.util.Arrays;

public class InsertionSortTest
{
	// method to sort array, using insertion sort
	public static void insertionSort(int[] data)
	{
		for (int next = 1; next < data.length; next++)
		{
			int insert = data[next]; // store the value
			int moveItem = next;	 // store the location

			// figure out where to place the current item
			while (moveItem > 0 && data[moveItem -1] > insert)
			{
				// move one slot forward
				data[moveItem] = data[moveItem - 1];
				moveItem--;
			}

			data[moveItem] = insert;
			printPass(data, next, moveItem);

		}
	}

	public static void printPass(int[] data, int pass, int index) 
	{
		System.out.printf("after pass %2d: ", pass);

		for (int i = 0; i < index; i++)
		{
			System.out.printf("%d ", data[i]);
		}

		System.out.printf("%d ", data[index]);

		for (int i = index + 1; i < data.length; i++)
		{
			System.out.printf("%d ", data[i]);
		}

		System.out.printf("%n             ");

		for (int i = 0; i <= pass; i++)
		{
			System.out.print("-- ");
		}

		System.out.println();
	}

	public static void main(String[] args)
	{
		SecureRandom generator = new SecureRandom();

		int[] data = new int [10];

		for (int i = 0; i < data.length; i++)
		{
			data[i] = 10 + generator.nextInt(90);
		}

		System.out.printf("Unsorted Array:%n%s%n%n", 
			Arrays.toString(data));

		insertionSort(data);

		System.out.printf("Sorted Array:%n%s%n%n", 
			Arrays.toString(data));
	}
}