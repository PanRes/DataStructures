package gr.pr.udemy.data.structures.sort;

import static gr.pr.udemy.data.structures.sort.SortingUtils.initIntArray;
import static gr.pr.udemy.data.structures.sort.SortingUtils.printIntArray;

public class SortingMain {

	//TODO print for every step
	public static void main(String[] args) {
		int[] intArray = initIntArray();
		printIntArray(intArray, "BubbleSort Unsorted");
		BubbleSort.sort(intArray, intArray.length);
		printIntArray(intArray, "BubbleSort Sorted");

		System.out.println("\n");
		intArray = initIntArray();
		printIntArray(intArray, "SelectionSort Unsorted");
		SelectionSort.sort(intArray, intArray.length);
		printIntArray(intArray, "SelectionSort Sorted");

		System.out.println("\n");
		intArray = initIntArray();
		printIntArray(intArray, "InsertionSort Unsorted");
		InsertionSort.sort(intArray, 1);
		printIntArray(intArray, "InsertionSort Sorted");

	}
}
