package gr.pr.udemy.data.structures.sort;

import static gr.pr.udemy.data.structures.sort.SortingUtils.swapIntArray;

public class BubbleSort {

	public static void sort(int[] intArray, int unsortedPartitionIndex) {
		if (--unsortedPartitionIndex == 0) {
			return;
		}
		else {
			for (int i = 0; i < unsortedPartitionIndex; i++) {
				if (intArray[i] > intArray[i+1]) {
					swapIntArray(intArray, i, i+1);
				}
			}
			sort(intArray, unsortedPartitionIndex);
		}
	}

}
