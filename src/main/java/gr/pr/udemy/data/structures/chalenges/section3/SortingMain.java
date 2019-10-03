package gr.pr.udemy.data.structures.chalenges.section3;

import gr.pr.udemy.data.structures.chalenges.section3.chalenge1.MergeSortDescending;
import gr.pr.udemy.data.structures.sort.util.SortInitializeMethod;

import static gr.pr.udemy.data.structures.sort.util.SortingUtils.initIntArray;
import static gr.pr.udemy.data.structures.sort.util.SortingUtils.printArray;

public class SortingMain {

	public static void main(String[] args) {

		int[] intArray = initIntArray(SortInitializeMethod.SIMPLE);
		printArray(intArray, "MergeSortDescending Unsorted");
		MergeSortDescending.sort(intArray, 0, intArray.length);
		printArray(intArray, "MergeSortDescending Sorted");
	}
}
