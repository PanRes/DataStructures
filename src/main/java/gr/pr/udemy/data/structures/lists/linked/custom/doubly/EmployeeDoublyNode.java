package gr.pr.udemy.data.structures.lists.linked.custom.doubly;

import gr.pr.udemy.data.structures.lists.linked.Employee;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class EmployeeDoublyNode {

	private Employee employee;
	private EmployeeDoublyNode next;
	private EmployeeDoublyNode previous;

	public EmployeeDoublyNode(Employee employee) {
		this.employee = employee;
	}
}
