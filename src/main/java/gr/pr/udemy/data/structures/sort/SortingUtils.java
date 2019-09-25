package gr.pr.udemy.data.structures.sort;

public class SortingUtils {

	public static void swap(int[] intArray, int i, int j) {
		if (i == j) {
			return;
		}

		int temp = intArray[j];
		intArray[j] = intArray[i];
		intArray[i] = temp;
	}

	public static void printIntArray(int[] intArray, String prefix) {
		System.out.print(prefix + " Array: ");
		for (int i : intArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	//TODO fix initiation
	public static int[] initIntArray() {
		return new int[] {5, -7, 32, 12, -80, 31};
	}

}
