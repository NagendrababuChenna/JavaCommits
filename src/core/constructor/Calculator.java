package core.constructor;

public class Calculator {
	
	
	private int a;
	private int b;
	
	public int getA() {//getA --method name-no particulars,we can give any name
		return a;
	}
	public void setA(int a) {//setA --method name-no particulars
		this.a = a;//here we can assign any int value to the variable a--is with assigned "a" only
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
 // Default Constructor
	public Calculator() {
		a = 10;
		b = 20;
	}

	// Parameterized Constructor
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	

}
