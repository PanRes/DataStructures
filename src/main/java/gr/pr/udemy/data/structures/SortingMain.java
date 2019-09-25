package gr.pr.udemy.data.structures;

import static gr.pr.udemy.data.structures.BubbleSort.bubbleSort;

public class SortingMain {

	public static void main(String[] args) {
		int[] intArray = {5, -7, 32, 12, -80, 31};

		System.out.print("Unsorted Array: ");
		for (int i : intArray) {
			System.out.print(i + " ");
		}

		bubbleSort(intArray, intArray.length);

		System.out.print("\nSorted Array: ");
		for (int i : intArray) {
			System.out.print(i + " ");
		}

	}
}
