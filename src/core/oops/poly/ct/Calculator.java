package core.oops.poly.ct;

public class Calculator {
	
	
	private int a;
	private int b;
	
	
	public Calculator() {
		a = 10;
		b = 20;
	}

	// Parameterized Constructor
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int sum(int a, int b){
		this.a = a;
		this.b = b;
		return this.a+this.b;
	}
	
	int sum(){
		return this.a+this.b;
	}
	
	int sum(int a, int b, int c){
		
		return a+b+c;
	}
	
	float sum (float a, float b, float c){
		return a+b+c;
	}
	// Overloading
	// Compile time Poly morphism or STatic Poly Morphism;
	//Method Name is same, but parameters count, or type of Parameters will Be differce..

}
