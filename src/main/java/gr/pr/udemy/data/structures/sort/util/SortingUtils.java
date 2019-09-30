package gr.pr.udemy.data.structures.sort.util;

public class SortingUtils {

	public static void swap(int[] intArray, int i, int j) {
		if (i == j) {
			return;
		}

		int temp = intArray[j];
		intArray[j] = intArray[i];
		intArray[i] = temp;

		System.out.println("  Swapped elements " + i + " and " + j + " with respective values: " + intArray[i] + " and " + intArray[j]);
		printIntArray(intArray, " ");
		System.out.println();
	}

	public static void printIntArray(int[] intArray, String prefix) {
		System.out.print(prefix + " Array: ");
		for (int i : intArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static int[] initIntArray(boolean hasDuplicates) {
		if (hasDuplicates) {
			return new int[] {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
		}
		else {
			return new int[] {5, -7, 32, 12, -80, 31};
		}
	}

	public static int getMaxFromIntArray(int[] intArray) {
		int max = intArray[0];
		for (int i = 1; i < intArray.length; i++) {
			if (max < intArray[i]) {
				max = intArray[i];
			}
		}

		return max;
	}

	public static int getMinFromIntArray(int[] intArray) {
		int min = intArray[0];
		for (int i = 1; i < intArray.length; i++) {
			if (min > intArray[i]) {
				min = intArray[i];
			}
		}

		return min;
	}

}
