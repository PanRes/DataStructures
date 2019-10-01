package gr.pr.udemy.data.structures.chalenges.section3.chalenge1;

import gr.pr.udemy.data.structures.sort.util.SortInitializeMethod;

import static gr.pr.udemy.data.structures.sort.util.SortingUtils.initIntArray;
import static gr.pr.udemy.data.structures.sort.util.SortingUtils.printIntArray;

public class SortingMain {

	public static void main(String[] args) {

		int[] intArray = initIntArray(SortInitializeMethod.SIMPLE);
		printIntArray(intArray, "MergeSortDescending Unsorted");
		MergeSortDescending.sort(intArray, 0, intArray.length);
		printIntArray(intArray, "MergeSortDescending Sorted");
	}
}
