package gr.pr.udemy.data.structures.lists.linked.doubly;

import gr.pr.udemy.data.structures.lists.linked.Employee;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmployeeDoublyNode {

	private Employee employee;
	private EmployeeDoublyNode next;
	private EmployeeDoublyNode previous;

	public EmployeeDoublyNode(Employee employee) {
		this.employee = employee;
	}
}
