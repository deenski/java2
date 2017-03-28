/*
Jakob Vendegna
CSC 161 201
Date

Description:
*/

public class TestGenericMethod {
	
	public static void main(String[] args) {
		Integer[] integerArray = {1, 2, 3, 4, 5};
		Character[] characterArray = {'J','a', 'k','e'};

		System.out.printf("Array integerArray contains: %n");
		printArray(integerArray);
		System.out.printf("Array characterArray contains: %n");
		printArray(characterArray);
	}

	public static <T> void printArray(T[] inputArray) {
		for (T element : inputArray) {
			System.out.printf("%s ", element);
		}

		System.out.println();
	}

}