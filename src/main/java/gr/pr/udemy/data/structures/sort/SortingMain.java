package gr.pr.udemy.data.structures.sort;

import gr.pr.udemy.data.structures.sort.sort.*;
import gr.pr.udemy.data.structures.sort.util.SortInitializeMethod;

import static gr.pr.udemy.data.structures.sort.util.SortingUtils.*;

public class SortingMain {

	public static void main(String[] args) {
		int[] intArray = initIntArray(SortInitializeMethod.SIMPLE);
		printIntArray(intArray, "BubbleSort Unsorted");
		BubbleSort.sort(intArray, intArray.length);
		printIntArray(intArray, "BubbleSort Sorted");

		System.out.println("\n");
		intArray = initIntArray(SortInitializeMethod.SIMPLE);
		printIntArray(intArray, "SelectionSort Unsorted");
		SelectionSort.sort(intArray, intArray.length);
		printIntArray(intArray, "SelectionSort Sorted");

		System.out.println("\n");
		intArray = initIntArray(SortInitializeMethod.SIMPLE);
		printIntArray(intArray, "InsertionSort Unsorted");
		InsertionSort.sort(intArray, 1);
		printIntArray(intArray, "InsertionSort Sorted");

		System.out.println("\n");
		intArray = initIntArray(SortInitializeMethod.SIMPLE);
		printIntArray(intArray, "ShellSort Unsorted");
		ShellSort.sort(intArray);
		printIntArray(intArray, "ShellSort Sorted");

		System.out.println("\n");
		intArray = initIntArray(SortInitializeMethod.SIMPLE);
		printIntArray(intArray, "MergeSort Unsorted");
		MergeSort.sort(intArray, 0, intArray.length);
		printIntArray(intArray, "MergeSort Sorted");

		System.out.println("\n");
		intArray = initIntArray(SortInitializeMethod.SIMPLE);
		printIntArray(intArray, "QuickSort Unsorted");
		QuickSort.sort(intArray, 0, intArray.length);
		printIntArray(intArray, "QuickSort Sorted");

		System.out.println("\n");
		intArray = initIntArray(SortInitializeMethod.SIMILAR_LENGTH_MAX_MIN);
		printIntArray(intArray, "CountingSort Unsorted");
		CountingSort.sort(intArray, getMinFromIntArray(intArray), getMaxFromIntArray(intArray));
		printIntArray(intArray, "CountingSort Sorted");

	}
}
