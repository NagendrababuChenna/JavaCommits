package core.methods;

public class PrimeCheck {

	public static boolean isPrimeNumber(int n) {
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int addition(int a, int b) {
		int addition = a + b;
		return addition;
	}
}
