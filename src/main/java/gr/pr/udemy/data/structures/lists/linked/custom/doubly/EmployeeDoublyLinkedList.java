package gr.pr.udemy.data.structures.lists.linked.custom.doubly;

import gr.pr.udemy.data.structures.lists.linked.Employee;
import gr.pr.udemy.data.structures.lists.linked.custom.EmployeeLinkedList;

public class EmployeeDoublyLinkedList implements EmployeeLinkedList {

	private EmployeeDoublyNode head;
	private EmployeeDoublyNode tail;
	private int size;

	public void addToFront(Employee employee) {
		EmployeeDoublyNode node = new EmployeeDoublyNode(employee);
		node.setNext(head);
		if (tail == null) {
			tail = node;
		}
		else {
			head.setPrevious(node);
		}
		head = node;
		size++;

	}

	public void add(Employee employee) {
		EmployeeDoublyNode node = new EmployeeDoublyNode(employee);
		if (head == null) {
			head = node;
		}
		else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail = node;
		size++;
	}

	public Employee removeAndRetrieveFromFront() {
		if (isEmpty()) {
			return null;
		}

		EmployeeDoublyNode node = head;

		if (head.getNext() == null) {
			tail = null;
		}
		else {
			head.getNext().setPrevious(null);
		}
		head = head.getNext();
		size--;
		return node.getEmployee();
	}

	@Override
	public Employee remove() {
		if (isEmpty()) {
			return null;
		}

		EmployeeDoublyNode node = tail;

		if (tail.getPrevious() == null) {
			head = null;
		}
		else {
			tail.getPrevious().setNext(null);
		}

		tail = tail.getPrevious();
		tail.setNext(null);
		size--;
		return node.getEmployee();
	}

	public void printList() {
		System.out.print("HEAD");
		EmployeeDoublyNode currentNode = head;
		while (currentNode != null) {
			System.out.print(" <=> ");
			System.out.print(currentNode.getEmployee());
			currentNode = currentNode.getNext();
		}
		System.out.print(" <=> TAIL");
		System.out.println();
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
}
