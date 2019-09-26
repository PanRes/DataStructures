package gr.pr.udemy.data.structures.sort;

import static gr.pr.udemy.data.structures.sort.SortingUtils.printIntArray;

//TODO create QuickSort with two fors instead of whiles and ifs
public class QuickSort {

	public static void sort(int[] intArray, int startIndex, int endIndex) {
		if (endIndex - startIndex < 2) {
			return;
		}

		int pivotIndex = partition(intArray, startIndex, endIndex);
		sort(intArray, startIndex, pivotIndex);
		sort(intArray, pivotIndex + 1, endIndex);
	}

	private static int partition(int[] intArray, int startIndex, int endIndex) {
		int pivot = intArray[startIndex];
		int i = startIndex;
		int j = endIndex;

		while (i < j) {
			while (i < j && intArray[--j] >= pivot);
			if (i < j) {
				intArray[i] = intArray[j];
				System.out.print("  pivot: " + pivot + " |");
				printIntArray(intArray, "");
			}

			while (i < j && intArray[++i] <= pivot);
			if (i < j) {
				intArray[j] = intArray[i];
				System.out.print("  pivot: " + pivot + " |");
				printIntArray(intArray, "");
			}

		}

		intArray[j] = pivot;
		printIntArray(intArray, " ");

		return j;
	}
}
