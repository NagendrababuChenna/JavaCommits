package core.exceptions;

public class DevideByZero {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		int a[]={1,2,3};
		System.out.println("I am before deviding");
		try{
		
			///i = i /j;
			
			i =a[10];
		
		}
		
		catch(ArrayIndexOutOfBoundsException aiebe){//ending or "aiebe" can be anything .

			System.out.println("You did wrong by increasing index:::");
		}catch(ArithmeticException are){//are can be anything
			System.out.println("You did error by deviding zero");
		}
		catch(Exception e){//Exception is the Parent Class for all Exceptions
			System.out.println("s");
			e.printStackTrace();
		}
		finally{
			System.out.println(" I am finally and i should execute at any cost");
		}
		System.out.println("I am after deviding");
		
	}
	

}
