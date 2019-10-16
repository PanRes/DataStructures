package gr.pr.udemy.data.structures.lists.linked.jdks;

import gr.pr.udemy.data.structures.lists.linked.Employee;

import java.util.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		Employee panagiotisRessos = new Employee(123, "Panagiotis", "Ressos");
		Employee johnDoe = new Employee(345, "John", "Doe");
		Employee janeDoe = new Employee(678, "Jane", "Doe");
		Employee makisKotsovos = new Employee(901, "Makis", "Kotsovos");
		Employee bill = new Employee(546, "Bill", "End");

		LinkedList<Employee> employees = new LinkedList<>();
		employees.addFirst(panagiotisRessos);
		employees.addFirst(johnDoe);
		employees.addFirst(janeDoe);
		employees.addFirst(makisKotsovos);
		printEmployeeLinkedList(employees);

		employees.add(bill);
		printEmployeeLinkedList(employees);

		employees.removeFirst();
		printEmployeeLinkedList(employees);

		employees.removeLast();
		printEmployeeLinkedList(employees);

	}

	private static void printEmployeeLinkedList(LinkedList<Employee> employees) {
		System.out.print("HEAD -> ");
		for (Employee employee : employees) {
			System.out.print(employee);
			System.out.print(" <=> ");
		}
		System.out.print(" -> TAIL");

		System.out.println("");
	}
}
