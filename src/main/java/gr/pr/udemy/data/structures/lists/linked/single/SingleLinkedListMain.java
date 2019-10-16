package gr.pr.udemy.data.structures.lists.linked.single;

import gr.pr.udemy.data.structures.lists.linked.Employee;

public class SingleLinkedListMain {

	public static void main(String[] args) {
		Employee panagiotisRessos = new Employee(123, "Panagiotis", "Ressos");
		Employee johnDoe = new Employee(345, "John", "Doe");
		Employee janeDoe = new Employee(678, "Jane", "Doe");
		Employee makisKotsovos = new Employee(901, "Makis", "Kotsovos");

		EmployeeSingleLinkedList employees = new EmployeeSingleLinkedList();

		employees.addToFront(panagiotisRessos);
		employees.addToFront(johnDoe);
		employees.addToFront(janeDoe);
		employees.addToFront(makisKotsovos);

		System.out.println(employees.size());

		employees.printList();

		Employee removedEmployee = employees.removeAndRetrieveFromFront();

		System.out.println(employees.size());
		employees.printList();
		System.out.println("Employee Removed: " + removedEmployee);
	}
}
