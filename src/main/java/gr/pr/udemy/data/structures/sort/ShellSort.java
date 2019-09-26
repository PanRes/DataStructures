package gr.pr.udemy.data.structures.sort;

public class ShellSort {
	
	public static void sort(int[] intArray) {
		for (int gap = intArray.length / 2; gap > 0; gap /=2) {
			for (int i = gap; i < intArray.length; i++) {
				int newElement = intArray[i];

				int j;
				for (j = i; j >= gap && intArray[j-gap] > newElement; j-=gap) {
					intArray[j] = intArray[j-gap];
				}

				intArray[j] = newElement;
				for (int intElement : intArray) {
					System.out.print(intElement + " ");
				}
				System.out.println();
			}
		}
	}
}
