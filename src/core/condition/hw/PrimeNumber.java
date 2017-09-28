package core.condition.hw;

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 3;
		boolean isPrime = true;
		
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				isPrime = false;				
				System.out.println(n +" is divisble by " + i);
				break;
			}
		}
		System.out.println("is " +  n +" Prime Number? " + isPrime);
	}

}
