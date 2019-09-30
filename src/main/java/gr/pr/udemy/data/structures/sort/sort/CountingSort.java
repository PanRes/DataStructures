package gr.pr.udemy.data.structures.sort.sort;

import static gr.pr.udemy.data.structures.sort.util.SortingUtils.printIntArray;

public class CountingSort {

	public static void sort(int[] intArray, int min, int max) {
		int[] countArray = new int[max - min + 1];

		for (int i = 0; i < intArray.length; i++) {
			countArray[intArray[i] - min]++;
		}

		int j = 0;
		for (int i = min; i <= max; i++) {
			while (countArray[i - min] > 0) {
				intArray[j++] = i;
				countArray[i - min]--;
				printIntArray(intArray, " ");
				printIntArray(countArray, "  Counting");
			}
		}
	}
}
