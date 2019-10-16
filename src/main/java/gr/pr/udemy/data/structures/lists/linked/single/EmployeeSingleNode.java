package gr.pr.udemy.data.structures.lists.linked.single;

import gr.pr.udemy.data.structures.lists.linked.Employee;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmployeeSingleNode {

	private Employee employee;
	private EmployeeSingleNode next;

	public EmployeeSingleNode(Employee employee) {
		this.employee = employee;
	}

	public boolean hasNext() {
		return next != null;
	}
}
