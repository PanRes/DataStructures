package gr.pr.udemy.data.structures.sort;

import static gr.pr.udemy.data.structures.sort.SortingUtils.initIntArray;
import static gr.pr.udemy.data.structures.sort.SortingUtils.printIntArray;

public class SortingMain {

	//TODO print for every step
	public static void main(String[] args) {
		int[] intArray = initIntArray(false);
		printIntArray(intArray, "BubbleSort Unsorted");
		BubbleSort.sort(intArray, intArray.length);
		printIntArray(intArray, "BubbleSort Sorted");

		System.out.println("\n");
		intArray = initIntArray(false);
		printIntArray(intArray, "SelectionSort Unsorted");
		SelectionSort.sort(intArray, intArray.length);
		printIntArray(intArray, "SelectionSort Sorted");

		System.out.println("\n");
		intArray = initIntArray(false);
		printIntArray(intArray, "InsertionSort Unsorted");
		InsertionSort.sort(intArray, 1);
		printIntArray(intArray, "InsertionSort Sorted");

		System.out.println("\n");
		intArray = initIntArray(false);
		printIntArray(intArray, "ShellSort Unsorted");
		ShellSort.sort(intArray);
		printIntArray(intArray, "ShellSort Sorted");

		System.out.println("\n");
		intArray = initIntArray(false);
		printIntArray(intArray, "MergeSort Unsorted");
		MergeSort.sort(intArray, 0 , intArray.length);
		printIntArray(intArray, "MergeSort Sorted");

		System.out.println("\n");
		intArray = initIntArray(false);
		printIntArray(intArray, "QuickSort Unsorted");
		QuickSort.sort(intArray, 0 , intArray.length);
		printIntArray(intArray, "QuickSort Sorted");

	}
}
