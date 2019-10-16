package gr.pr.udemy.data.structures.lists.linked.single;

import gr.pr.udemy.data.structures.lists.linked.Employee;

public class EmployeeSingleLinkedList {

	private EmployeeSingleNode head;
	private int size;

	public void addToFront(Employee employee) {
		EmployeeSingleNode node = new EmployeeSingleNode(employee);
		node.setNext(head);
		head = node;
		size++;
	}

	public Employee removeAndRetrieveFromFront() {
		if (isEmpty()) {
			return null;
		}

		EmployeeSingleNode node = head;
		head = head.getNext();
		size--;
		return node.getEmployee();
	}

	public void printList() {
		System.out.print("HEAD");
		EmployeeSingleNode currentNode = head;
		while (currentNode != null) {
			System.out.print(" -> ");
			System.out.print(currentNode.getEmployee());
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
