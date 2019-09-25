package gr.pr.udemy.data.structures.sort;

import static gr.pr.udemy.data.structures.sort.SortingUtils.swap;

public class SelectionSort {

	//TODO refactor with recursion
	public static void sort(int[] intArray, int lastUnsortedPartitionIndex) {
		for (int i = 0; i < lastUnsortedPartitionIndex - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < lastUnsortedPartitionIndex; j++) {
				if(intArray[j] < intArray[minIndex]) {
					minIndex = j;
				}
			}

			swap(intArray, minIndex, i);
		}
	}


}
