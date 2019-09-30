package gr.pr.udemy.data.structures.sort.sort;

public class RadixSort {

	public static void sort(int[] intArray, int radix, int width) {
		for (int i = 0; i < width; i++) {
			radixSingleSort(intArray, i, radix);
		}
	}

	private static void radixSingleSort(int[] intArray, int position, int radix) {
		int numItems = intArray.length;

		int[] countArray = new int[radix];

		for (int value : intArray) {
			countArray[getDigit(position, value, radix)]++;
		}

		for (int i = 1; i < radix; i++) {
			countArray[i] += countArray[i-1];
		}

		int[] tempArray = new int[numItems];

		for (int tempIndex = numItems - 1; tempIndex >=0; tempIndex--) {
			tempArray[--countArray[getDigit(position, intArray[tempIndex], radix)]] = intArray[tempIndex];
		}

		for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
			intArray[tempIndex] = tempArray[tempIndex];
		}
	}

	private static int getDigit(int position, int value, int radix) {
		return value / (int) Math.pow(10, position) % radix;
	}
}
