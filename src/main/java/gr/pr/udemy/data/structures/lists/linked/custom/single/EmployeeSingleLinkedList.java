package gr.pr.udemy.data.structures.lists.linked.custom.single;

import gr.pr.udemy.data.structures.lists.linked.Employee;
import gr.pr.udemy.data.structures.lists.linked.custom.EmployeeLinkedList;

public class EmployeeSingleLinkedList implements EmployeeLinkedList {

	private EmployeeSingleNode head;
	private int size;

	@Override
	public void addToFront(Employee employee) {
		EmployeeSingleNode node = new EmployeeSingleNode(employee);
		node.setNext(head);
		head = node;
		size++;
	}

	@Override
	public void add(Employee employee) {
		EmployeeSingleNode currentNode = head;
		while (currentNode.hasNext()) {
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(new EmployeeSingleNode(employee));
		size++;
	}

	public boolean addBeforeEmployee(Employee employeeToAdd, Employee employeeAfter) {
		if (employeeAfter == null || employeeToAdd == null) {
			throw new NullPointerException();
		}
		else if (isEmpty()) {
			return false;
		}
		//head will not be null since list is not empty
		else if (head.getEmployee().equals(employeeAfter)) {
			addToFront(employeeToAdd);
			return true;
		}
		else {
			EmployeeSingleNode currentNode = head;
			while (currentNode != null) {
				if (currentNode.getNext() != null && currentNode.getNext().getEmployee().equals(employeeAfter)) {
					break;
				}
				else {
					currentNode = currentNode.getNext();
				}
			}
			if (currentNode != null) {
				addAfter(employeeToAdd, currentNode);
				return true;
			}
		}
		return false;
	}

	private void addAfter(Employee employeeToAdd, EmployeeSingleNode nodeBefore) {
		EmployeeSingleNode nodeToAdd = new EmployeeSingleNode(employeeToAdd);

		nodeToAdd.setNext(nodeBefore.getNext());
		nodeBefore.setNext(nodeToAdd);
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

	@Override
	public Employee remove() {
		if (isEmpty()) {
			return null;
		}

		EmployeeSingleNode currentNode = head;
		EmployeeSingleNode previousNode = null;
		while (currentNode.hasNext()) {
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}
		if (previousNode != null) {
			previousNode.setNext(null);
		}
		size--;
		return currentNode.getEmployee();
	}

	@Override
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

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}
}
