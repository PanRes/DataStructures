package gr.pr.udemy.data.structures.lists.linked.chalenge3;

public class IntegerLinkedListMain {

	public static void main(String[] args) {
		
		IntegerSingleLinkedList integers = new IntegerSingleLinkedList();

		integers.add(4);
		integers.add(2);
		integers.add(1);
		integers.add(5);

		System.out.println(integers.size());
		integers.printList();

		System.out.println();

		Integer removedInteger = integers.removeAndRetrieveFromFront();
		System.out.println(integers.size());
		System.out.println("Employee Removed from front: " + removedInteger);
		integers.printList();

		System.out.println();

		integers.add(removedInteger);
		System.out.println(integers.size());
		System.out.println("Employee Added");
		integers.printList();

		System.out.println();

		removedInteger = integers.remove();
		System.out.println(integers.size());
		System.out.println("Employee Removed: " + removedInteger);
		integers.printList();

		System.out.println();
	}
}
