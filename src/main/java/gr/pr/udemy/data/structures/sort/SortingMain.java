package gr.pr.udemy.data.structures.sort;

import static gr.pr.udemy.data.structures.sort.SortingUtils.initIntArray;
import static gr.pr.udemy.data.structures.sort.SortingUtils.printIntArray;

public class SortingMain {

	public static void main(String[] args) {
		int[] intArray = initIntArray();
		printIntArray(intArray, "BubbleSort Unsorted");
		BubbleSort.sort(intArray, intArray.length);
		printIntArray(intArray, "BubbleSort Sorted");

		System.out.println();
		printIntArray(intArray, "SelectionSort Unsorted");
		intArray = initIntArray();
		SelectionSort.sort(intArray, intArray.length);
		printIntArray(intArray, "SelectionSort Sorted");

		System.out.println();
		printIntArray(intArray, "InsertionSort Unsorted");
		intArray = initIntArray();
		InsertionSort.sort(intArray, 1);
		printIntArray(intArray, "InsertionSort Sorted");

	}
}
