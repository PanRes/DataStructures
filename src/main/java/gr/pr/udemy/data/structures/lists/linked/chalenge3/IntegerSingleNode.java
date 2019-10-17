package gr.pr.udemy.data.structures.lists.linked.chalenge3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class IntegerSingleNode {

	private Integer integer;
	private IntegerSingleNode next;

	public IntegerSingleNode(Integer integer) {
		this.integer = integer;
	}

	public boolean hasNext() {
		return next != null;
	}
}
