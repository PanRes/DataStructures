package gr.pr.udemy.data.structures.sort;

public class BubbleSort {

	public static void sort(int[] intArray, int unsortedPartitionIndex) {
		if (--unsortedPartitionIndex == 0) {
			return;
		}
		else {
			for (int i = 0; i < unsortedPartitionIndex; i++) {
				if (intArray[i] > intArray[i+1]) {
					swap(intArray, i);
				}
			}
			sort(intArray, unsortedPartitionIndex);
		}
	}

	private static void swap(int[] intArray, int i) {
		int temp = intArray[i+1];
		intArray[i+1] = intArray[i];
		intArray[i] = temp;
	}
}
