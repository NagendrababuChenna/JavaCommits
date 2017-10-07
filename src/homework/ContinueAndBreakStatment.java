
package homework;
public class ContinueAndBreakStatment {
	
	public static void main(String[] args) {
		
		
	System.out.println("Start Break");	
		
		for(int i=0;i< 100;i++){
			// Break - it will exit from Current Loop
			if(i==3){
				break;
			}
			System.out.println(" i = " + i);
		}
		
		System.out.println("Start Continue");
		for(int i=0;i< 5;i++){
			// Break - it will exit from Current Loop
			if(i%2==0){
				continue;
			}
			System.out.println(" i = " + i);
		}
		
		
	}

}
