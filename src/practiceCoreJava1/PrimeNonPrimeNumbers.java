package practiceCoreJava1;

public class PrimeNonPrimeNumbers {

	public static void main(String[] args) {
		// boolean f=false;
		for (int n = 1; n <= 50; n++)
			isPrime(n);

	}

	public static void isPrime(int a) {

		boolean f = false;
		int i = a;
		int j = 2;
		if (a > j) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					f = true;
					break;
				}
			}
		}
		if (f == true|| i == 1) {
			System.out.println(i + "--NonPrime");
		} else {
			System.out.println(i + "--Prime");
		}

	}

}
