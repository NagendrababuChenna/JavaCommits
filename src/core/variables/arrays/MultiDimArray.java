package core.variables.arrays;

public class MultiDimArray {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 2, 3, 4 } };
		System.out.println(a[1][1]);

		int b[][] = new int[2][2];

		b[0][0] = 10;
		b[0][1] = 11;
		b[1][0] = 20;
		b[1][1] = 21;
		System.out.println(b[0][0]+ "  " +b[0][1]);
		System.out.println(b[1][0]+ "  " +b[1][1]);

	}
}
