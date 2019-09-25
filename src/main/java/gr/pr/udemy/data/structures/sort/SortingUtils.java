package gr.pr.udemy.data.structures.sort;

public class SortingUtils {

	public static void swapIntArray(int[] intArray, int i, int j) {
		int temp = intArray[j];
		intArray[j] = intArray[i];
		intArray[i] = temp;
	}

}
