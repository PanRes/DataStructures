package gr.pr.udemy.data.structures.lists.linked;

public interface EmployeeLinkedList {

	void addToFront(Employee employee);
	Employee removeAndRetrieveFromFront();
	void printList();
	int size();
	boolean isEmpty();
}
