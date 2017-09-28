package core.methods;

public class Calculator {
	
	public static void main(String[] args) {
		
	int x= 10;
	int y = 20;
	int z = 10;
	float t=10;
	float l=10;
	Calculator c=new Calculator();//when static is not there in the method we should create a new object and call the particular method.
	int r = c.sum (x,z);
	float a = sumV1(t,y);
	System.out.println(a);
	System.out.println(r);
	
	
	//PrimeCheck f=new PrimeCheck();
	//when static is not there in the method we should create a object and call that method.
	int i = 5;
	System.out.println(PrimeCheck.isPrimeNumber(i));
	
	//Or static is there we can call that method by using Class and method name like below:
	//System.out.println(PrimeCheck.isPrimeNumber(i));//
	
	int d=3;
	int e=4;
	System.out.println(PrimeCheck.addition(e,d));
	               
		
	}
	
	// Signature 
	/**
	 *  void sum(int , int)
	 * int sum(int , int)
	 * int sub(int , int , float)
	 * 
	 */
	public  int sum(int a, int b){
		int c = a + b;
		return c;
	}
// Method overloading
	
	public static float sum(float a, float b){
		return a + b;
	}
	
	public static float sumV1(float a, float b){
		return a + b;
	}
	
	
	public static int sum(int a, int b, int c){
		return  a + b+c;
		
	}
	
	public static int sub(int a, int b){
		return (a - b);
	}
	
	
}
