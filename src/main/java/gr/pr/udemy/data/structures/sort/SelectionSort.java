package gr.pr.udemy.data.structures.sort;

import static gr.pr.udemy.data.structures.sort.SortingUtils.swapIntArray;

public class SelectionSort {

	public static void sort(int[] intArray, int unsortedPartitionIndex) {
		for (int i = 0; i < unsortedPartitionIndex - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < unsortedPartitionIndex; j++) {
				if(intArray[j] < intArray[minIndex]) {
					minIndex = j;
				}
			}

			swapIntArray(intArray, minIndex, i);
		}
	}


}
