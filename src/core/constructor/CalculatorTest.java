package core.constructor;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator(218,32);// default Constructor
		System.out.println(cal.getA());
		
		// Constructor is used to initialize object at the time of object creation
		// this is similar to method without return type
		// it is always with the name of class.
		Calculator cal1 = new Calculator(25,30);
		System.out.println(cal1.getA());
		cal1.setA(12);
		System.out.println(cal1.getA());
		
		Calculator Calll = new Calculator ();
		System.out.println(Calll.getA());
		System.out.println(Calll.getB());
		
		
		
	}
}
