package gr.pr.udemy.data.structures.sort.sort;

import static gr.pr.udemy.data.structures.sort.util.SortingUtils.printArray;

public class MergeSort {

	public static void sort(int[] intArray, int startIndex, int endIndex) {
		if (endIndex - startIndex < 2) {
			return;
		}

		int midIndex = (startIndex + endIndex) / 2;
		sort(intArray, startIndex, midIndex);
		sort(intArray, midIndex, endIndex);
		merge(intArray, startIndex, midIndex, endIndex);

	}

	private static void merge(int[] intArray, int startIndex, int midIndex, int endIndex) {
		if (intArray[midIndex - 1] <= intArray[midIndex]) {
			return;
		}

		int i = startIndex;
		int j = midIndex;
		int tempIndex = 0;
		int[] tempArray = new int[endIndex - startIndex];

		while (i < midIndex && j < endIndex) {
			tempArray[tempIndex++] = intArray[i] <= intArray[j] ? intArray[i++] : intArray[j++];
		}

		System.arraycopy(intArray, i, intArray, startIndex + tempIndex, midIndex - i);
		System.arraycopy(tempArray, 0, intArray, startIndex, tempIndex);
		printArray(intArray, " ");

	}

}
