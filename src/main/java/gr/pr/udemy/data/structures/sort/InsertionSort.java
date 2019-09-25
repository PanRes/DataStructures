package gr.pr.udemy.data.structures.sort;

import static gr.pr.udemy.data.structures.sort.SortingUtils.swap;

public class InsertionSort {
	
	public static void sort(int[] intArray, int firstUnsortedIndex) {
		if (intArray.length == 0 || ++firstUnsortedIndex == intArray.length) {
			return;
		}
		else {
			for (int i = 0; i < firstUnsortedIndex; i++) {
				if (intArray[i] > intArray[firstUnsortedIndex]) {
					swap(intArray, i, firstUnsortedIndex);
				}

				if (firstUnsortedIndex < intArray.length) {
					sort(intArray, firstUnsortedIndex);
				}
			}
		}
	}
}
