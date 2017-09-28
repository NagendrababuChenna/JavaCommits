package core.condition.hw;

public class SimpleArrayAddition {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3 };
		int b[] = { 1, 1, 1 };
		int c[] = new int[3];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}

}
