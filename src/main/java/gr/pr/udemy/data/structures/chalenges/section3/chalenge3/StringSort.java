package gr.pr.udemy.data.structures.chalenges.section3.chalenge3;

import static gr.pr.udemy.data.structures.sort.util.SortingUtils.printArray;

//TODO to sort strings with Different lengths and UpperCase
public class StringSort {

	public static void main(String[] args) {
		String[] stringArray = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
		printArray(stringArray, "Unsorted String");
		//radix is number of letters in alphabet and width the length of Strings
		sort(stringArray, 26, 5);
		printArray(stringArray, "Sorted String");
	}

	public static void sort(String[] stringArray, int radix, int width) {
		for (int i = width - 1; i >= 0; i--) {
			radixSingleSort(stringArray, i, radix);
		}
	}

	private static void radixSingleSort(String[] stringArray, int position, int radix) {
		int numItems = stringArray.length;

		int[] countArray = new int[radix];

		for (String value : stringArray) {
			countArray[getIndex(position, value)]++;
		}

		for (int i = 1; i < radix; i++) {
			countArray[i] += countArray[i-1];
		}

		String[] tempArray = new String[numItems];

		for (int tempIndex = numItems - 1; tempIndex >=0; tempIndex--) {
			tempArray[--countArray[getIndex(position, stringArray[tempIndex])]] = stringArray[tempIndex];
		}

		for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
			stringArray[tempIndex] = tempArray[tempIndex];
		}

		printArray(stringArray, " ");
	}

	public static int getIndex(int position, String value) {
		return value.charAt(position) - 'a';
	}
}
