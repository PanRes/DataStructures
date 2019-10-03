package gr.pr.udemy.data.structures.sort;

import gr.pr.udemy.data.structures.sort.sort.*;
import gr.pr.udemy.data.structures.sort.util.SortInitializeMethod;
import gr.pr.udemy.data.structures.sort.util.SortingUtils;

import static gr.pr.udemy.data.structures.sort.util.SortingUtils.*;

public class SortingMain {

	public static void main(String[] args) {
		int[] intArray = initIntArray(SortInitializeMethod.SIMPLE);
		SortingUtils.printArray(intArray, "BubbleSort Unsorted");
		BubbleSort.sort(intArray, intArray.length);
		SortingUtils.printArray(intArray, "BubbleSort Sorted");

		System.out.println("\n");
		intArray = initIntArray(SortInitializeMethod.SIMPLE);
		SortingUtils.printArray(intArray, "SelectionSort Unsorted");
		SelectionSort.sort(intArray, intArray.length);
		SortingUtils.printArray(intArray, "SelectionSort Sorted");

		System.out.println("\n");
		intArray = initIntArray(SortInitializeMethod.SIMPLE);
		SortingUtils.printArray(intArray, "InsertionSort Unsorted");
		InsertionSort.sort(intArray, 1);
		SortingUtils.printArray(intArray, "InsertionSort Sorted");

		System.out.println("\n");
		intArray = initIntArray(SortInitializeMethod.SIMPLE);
		SortingUtils.printArray(intArray, "ShellSort Unsorted");
		ShellSort.sort(intArray);
		SortingUtils.printArray(intArray, "ShellSort Sorted");

		System.out.println("\n");
		intArray = initIntArray(SortInitializeMethod.SIMPLE);
		SortingUtils.printArray(intArray, "MergeSort Unsorted");
		MergeSort.sort(intArray, 0, intArray.length);
		SortingUtils.printArray(intArray, "MergeSort Sorted");

		System.out.println("\n");
		intArray = initIntArray(SortInitializeMethod.SIMPLE);
		SortingUtils.printArray(intArray, "QuickSort Unsorted");
		QuickSort.sort(intArray, 0, intArray.length);
		SortingUtils.printArray(intArray, "QuickSort Sorted");

		System.out.println("\n");
		intArray = initIntArray(SortInitializeMethod.SIMILAR_LENGTH_MAX_MIN);
		SortingUtils.printArray(intArray, "CountingSort Unsorted");
		CountingSort.sort(intArray, getMinFromIntArray(intArray), getMaxFromIntArray(intArray));
		SortingUtils.printArray(intArray, "CountingSort Sorted");

		System.out.println("\n");
		intArray = initIntArray(SortInitializeMethod.MULTI_DIGIT);
		SortingUtils.printArray(intArray, "RadixSort Unsorted");
		RadixSort.sort(intArray, getMinFromIntArray(intArray), getMaxFromIntArray(intArray));
		SortingUtils.printArray(intArray, "RadixSort Sorted");

	}
}
