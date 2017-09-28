package core.condition;

public class NestedIf {

	public static void main(String[] args) {

		int m1 = 100;
		int m2 = 40;
		int m3 = 35;

		if (m1 >= 35 && m2 >= 35 && m3 >= 35) {
			System.out.println("Pass");
			int per = (m1 + m2 + m3) / 3;
			if (per > 60) {
				System.out.println("First Class");

			} else if (per > 50) {

				System.out.println("Second Class");

			} else {

				System.out.println("Just Pass");
			}

		} else {
			System.out.println("Failed");
		}

	}

}
