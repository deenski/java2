// Jakob Vendegna
// CIS 161
// 4/5/17 
// merge sort from ch19

import java.security.SecureRandom;
import java.util.Arrays;

public class MergeSortTest 
{
	public static void mergeSort(int[] data)
	{
		sortArray(data, 0, data.length - 1);
	}

	private static void sortArray(int[] data, int low, int high)
	{
		int middle1 = (low + high) / 2;
		int middle2 = middle1 + 1;

		System.out.printf("split:    %s%n", subarrayString(data, low, high));
	}
}