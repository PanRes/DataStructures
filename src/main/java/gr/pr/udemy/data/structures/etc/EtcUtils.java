package gr.pr.udemy.data.structures.etc;

public class EtcUtils {

	public static long factorial(int num) throws IllegalAccessException {
		if (num < 0) {
			throw new IllegalAccessException("Number must be positive");
		}
		if (num == 0 || num == 1) {
			return 1;
		}
		else {
			return num * factorial(num - 1);
		}
	}
}
