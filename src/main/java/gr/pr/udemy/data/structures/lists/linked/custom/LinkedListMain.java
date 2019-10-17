package gr.pr.udemy.data.structures.lists.linked.custom;

import gr.pr.udemy.data.structures.lists.linked.Employee;
import gr.pr.udemy.data.structures.lists.linked.custom.single.EmployeeSingleLinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		Employee panagiotisRessos = new Employee(123, "Panagiotis", "Ressos");
		Employee johnDoe = new Employee(345, "John", "Doe");
		Employee janeDoe = new Employee(678, "Jane", "Doe");
		Employee makisKotsovos = new Employee(901, "Makis", "Kotsovos");

		EmployeeLinkedList employees = new EmployeeSingleLinkedList();

		employees.addToFront(panagiotisRessos);
		employees.addToFront(johnDoe);
		employees.addToFront(janeDoe);
		employees.addToFront(makisKotsovos);

		System.out.println(employees.size());
		employees.printList();

		System.out.println();

		Employee removedEmployee = employees.removeAndRetrieveFromFront();
		System.out.println(employees.size());
		System.out.println("Employee Removed from front: " + removedEmployee);
		employees.printList();

		System.out.println();

		employees.add(removedEmployee);
		System.out.println(employees.size());
		System.out.println("Employee Added");
		employees.printList();

		System.out.println();

		removedEmployee = employees.remove();
		System.out.println(employees.size());
		System.out.println("Employee Removed: " + removedEmployee);
		employees.printList();

		System.out.println();

		if (employees.addBeforeEmployee(removedEmployee, panagiotisRessos)) {
			System.out.println(employees.size());
			System.out.println("Removed Employee added before");
			employees.printList();
		}
		else {
			System.out.println("Employee was not added before");
		}


	}
}
