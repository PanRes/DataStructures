package gr.pr.udemy.data.structures.sort;

import static gr.pr.udemy.data.structures.sort.SortingUtils.swap;

public class BubbleSort {

	public static void sort(int[] intArray, int lastUnsortedPartitionIndex) {
		if (--lastUnsortedPartitionIndex == 0) {
			return;
		}
		else {
			for (int i = 0; i < lastUnsortedPartitionIndex; i++) {
				if (intArray[i] > intArray[i+1]) {
					swap(intArray, i, i+1);
				}
			}
			sort(intArray, lastUnsortedPartitionIndex);
		}
	}

}
