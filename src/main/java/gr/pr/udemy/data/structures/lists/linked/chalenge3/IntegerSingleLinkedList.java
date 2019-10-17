package gr.pr.udemy.data.structures.lists.linked.chalenge3;

public class IntegerSingleLinkedList {

	private IntegerSingleNode head;
	private int size;

	public void add(Integer integer) {
		IntegerSingleNode nodeToAdd = new IntegerSingleNode(integer);
		if (integer == null) {
			throw new NullPointerException();
		}
		else if (isEmpty()) {
			head = nodeToAdd;
			size++;
		}
		else if (head.getInteger() >= integer) {
			nodeToAdd.setNext(head);
			head = nodeToAdd;
			size++;
		}
		else {
			IntegerSingleNode currentNode = head;
			while (currentNode.hasNext() && currentNode.getNext().getInteger() <= integer) {
				currentNode = currentNode.getNext();
			}
			nodeToAdd.setNext(currentNode.getNext());
			currentNode.setNext(nodeToAdd);
			size++;

		}
	}

	public Integer removeAndRetrieveFromFront() {
		if (isEmpty()) {
			return null;
		}

		IntegerSingleNode node = head;
		head = head.getNext();
		size--;
		return node.getInteger();
	}

	public Integer remove() {
		if (isEmpty()) {
			return null;
		}

		IntegerSingleNode currentNode = head;
		IntegerSingleNode previousNode = null;
		while (currentNode.hasNext()) {
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}
		if (previousNode != null) {
			previousNode.setNext(null);
		}
		size--;
		return currentNode.getInteger();
	}

	public void printList() {
		System.out.print("HEAD");
		IntegerSingleNode currentNode = head;
		while (currentNode != null) {
			System.out.print(" -> ");
			System.out.print(currentNode.getInteger());
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}
}
