// Jakob Vendegna
// CIS 161
// 4/8/17 
// Week11 Homework: Sorting algorithms

/* I've commmented out many of the print statements to see
exactly how fast the algorithms are running. Feel free to
uncomment to see the process. */


import java.security.SecureRandom;
import java.util.Arrays;

public class Homework 
{
	// begin Insertion Sort methods:
	// method to sort array, using insertion sort
	public static void beginInsertion(int[] data)
	{
		// show the original array
		System.out.printf("Unsorted Array:%n%s%n%n", 
			Arrays.toString(data));

		Stopwatch insertionTimer = new Stopwatch();
      
      	// run the sorting algorithm
		insertionSort(data);

		System.out.printf("time to complete: %.2f%n", 
			insertionTimer.endTime());
      
     	// display the final sorted array
		System.out.printf("Sorted Array:%n%s%n%n", 
			Arrays.toString(data));

	}
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
			// printPass(data, next, moveItem); // show this pass

		}
	}

   // method to show each pass
	public static void printPass(int[] data, int pass, int index) 
	{
      // after 'pass' passes
		System.out.printf("after pass %d: ", pass);
      
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
	}// end Insertion Sort Methods

	// begin merge sort methods

	public static void beginMerge(int[] data)
	{
		// print the original array
		System.out.printf("Unsorted Array:%n%s%n%n", 
			Arrays.toString(data));
		
		Stopwatch mergeTimer = new Stopwatch();

		// start the merge process
		mergeSort(data);

		System.out.printf("time to complete: %.2f%n", 
			mergeTimer.endTime());

		// print out the merge sorted array
		System.out.printf("Sorted Array:%n%s%n%n", 
			Arrays.toString(data));

	}
	public static void mergeSort(int[] data)
	{
		// call sort array on data
		// low is zero
		// high is length of array - 1
		sortArray(data, 0, data.length - 1);
	}

	private static void sortArray(int[] data, int low, int high)
	{
		if ((high - low) >= 1) //  base case == 1
		{
			// set the mid points of the array, to split
			int middle1 = (low + high) / 2;
			int middle2 = middle1 + 1;

// 			// display the split
// 			System.out.printf("split:   %s%n", 
//             	subarrayString(data, low, high));
// 			// display the lower half of the split
//          	System.out.printf("         %s%n", 
//             	subarrayString(data, low, middle1));
//          	// display the upper half of the split
//          	System.out.printf("         %s%n%n",
//             	subarrayString(data, middle2, high));

			// recursion for further spliting and sorting
			sortArray(data, low, middle1);
			sortArray(data, middle2, high);

			// merge final halves of sorted array
			merge(data, low, middle1, middle2, high);
		}
	}

	private static void merge(int[] data, int left, int middle1, 
		int middle2, int right)
	{
		// leftIndex is the first item in this section of the split
		int leftIndex  = left;
		// rightIndex is where the second section of the split starts
		int rightIndex = middle2;
		// in piecing together a new array, we need to know where to start
		int combinedIndex = left;
		// initialize the new array
		int[] combined = new int[data.length];

		// show two arrays prior to merging them
// 		System.out.printf("merge:   %s%n", 
//         	subarrayString(data, left, middle1));
//       System.out.printf("         %s%n", 
//         	subarrayString(data, middle2, right));

      // merge arrays until the end of either is reached
		while (leftIndex <= middle1 && rightIndex <= right)
		{
			// decide which element is smaller and add it to the array
			// then proceed to the next element in the array
			if (data[leftIndex] <= data[rightIndex])
			{	
				
				combined[combinedIndex++] = data[leftIndex++];
			}
			else
			{	
				
				combined[combinedIndex++] = data[rightIndex++];
			}
		}

		// once the left array has been added
		if (leftIndex == middle2)
		{	
			// append the rest of the right array
			while (rightIndex <= right)
			{
				// adding each element
				combined[combinedIndex++] = data[rightIndex++];
			}
		}
		else // if the right array has been added
		{	
			// add elements in the left array
			while (leftIndex  <= middle1)
			{
				combined[combinedIndex++] = data[leftIndex++];
			}
		}

		//copy all of the elements back into the original array
		for (int i = left; i <= right; i++)
		{
			data[i] = combined[i];
		}


		// show the merged array
// 		System.out.printf("         %s%n%n", 
//         	subarrayString(data, left, right));

	}

	private static String subarrayString(int[] data, int low, int high)
	{
		StringBuilder temporary = new StringBuilder();

		for (int i = 0; i < low; i++)
		{
			// fill with empty spaces to illustrate split
			temporary.append("   ");
		}

		for (int i = low; i <= high; i++)
		{
			// add the data
			temporary.append(" " + data[i]);
		}

		return temporary.toString();

	}// end Merge Sort methods


	public static void main(String[] args) 
	{
		// new random number generator
		SecureRandom generator = new SecureRandom();

		// create the array to be sorted
		int[] data = new int[10000];
      	int[] data2 = new int[10000];
      
      // insertion sort of 100,000 elements takes 1.56 seconds to complete
      // on my machine
      // merge sort of 100,000 elements takes 5.78 seconds to complete
      // on my machine
      // I believe this is backwards, but don't know what is holding
      // up the merge sort algorithm.

		// add dummy numbers to the array
		for (int i = 0; i < data.length; i++)
		{
			data[i] = 10 + generator.nextInt(90);
         data2[i] = 10 + generator.nextInt(90);
		}
      
      	// begin the insertion sort algorithm.
		beginInsertion(data);
      	// begin the merge sort altorithm.
		beginMerge(data2);


	}
}