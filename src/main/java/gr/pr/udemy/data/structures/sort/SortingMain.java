package gr.pr.udemy.data.structures.sort;

public class SortingMain {

	public static void main(String[] args) {
		int[] intArray = {5, -7, 32, 12, -80, 31};

		System.out.print("Unsorted Array: ");
		for (int i : intArray) {
			System.out.print(i + " ");
		}

//		BubbleSort.sort(intArray, intArray.length);
//		SelectionSort.sort(intArray, intArray.length);
		InsertionSort.sort(intArray, 1);

		System.out.print("\nSorted Array: ");
		for (int i : intArray) {
			System.out.print(i + " ");
		}

	}
}
