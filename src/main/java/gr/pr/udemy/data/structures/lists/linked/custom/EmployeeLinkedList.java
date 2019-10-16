package gr.pr.udemy.data.structures.lists.linked.custom;

import gr.pr.udemy.data.structures.lists.linked.Employee;

public interface EmployeeLinkedList {

	void addToFront(Employee employee);
	void add(Employee employee);
	Employee removeAndRetrieveFromFront();
	Employee remove();
	void printList();
	int size();
	boolean isEmpty();
}
