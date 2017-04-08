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

			data[moveItem] = insert; // insert element
			printPass(data, next, moveItem); // show this pass

		}
	}

   // method to show each pass
	public static void printPass(int[] data, int pass, int index) 
	{
      // after 'pass' passes
		System.out.printf("after pass %2d: ", pass);
      
      // display the elements until current swap
		for (int i = 0; i < index; i++)
		{
			System.out.printf("%d ", data[i]);
		}
      
      // show the swap
		System.out.printf("%d ", data[index]);

      // show the rest of the elements
		for (int i = index + 1; i < data.length; i++)
		{
			System.out.printf("%d ", data[i]);
		}
      
		System.out.printf("%n             ");
      
      // print a "--" under each of the sorted elements
		for (int i = 0; i <= pass; i++)
		{
			System.out.print("-- ");
		}

		System.out.println();
	}

	public static void main(String[] args)
	{
      // new random number generator
		SecureRandom generator = new SecureRandom();
      
      // init the array
		int[] data = new int [10];
      
      // add random numbers to the array
		for (int i = 0; i < data.length; i++)
		{
			data[i] = 10 + generator.nextInt(90);
		}
      
      // show the original array
		System.out.printf("Unsorted Array:%n%s%n%n", 
			Arrays.toString(data));
      
      // run the sorting algorithm
		insertionSort(data);
      
      // display the final sorted array
		System.out.printf("Sorted Array:%n%s%n%n", 
			Arrays.toString(data));
	}
}