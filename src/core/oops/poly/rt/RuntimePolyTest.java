package core.oops.poly.rt;

public class RuntimePolyTest {

	
	public static void main(String[] args) {
		
		
		Vehicle v = null;
		
		int i = Integer.parseInt(args[0]);
		if (i == 1){
			
			 v =new Vehicle();
		} else if (i == 2){
		
			v = new Car();
		} else {
			v = new Cycle();	
		}
		
		v.breaks();
		// OVer riding
		// Compile time or Dynamic Polymorphism
		// THe method will be picked dynamically based on user inputs and decide
		// whcih method to invoke at the run time.
	}
}
