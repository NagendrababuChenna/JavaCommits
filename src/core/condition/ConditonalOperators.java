package core.condition;

public class ConditonalOperators {
	
	public static void main(String[] args) {
		
		/*int a = 10;
		int b = 30;*/
		char c = 'a';
		/**
		 *  == equal
		 *  != Not Equal
		 *  <= Less than or Equal
		 *  >= Greater than or Equal
		 *  > Greater than
		 *  < less than
		 *  ! NOT
		 */
		boolean isSame = 'a' == 'b';
		
		System.out.println(isSame);
		
		boolean gt = 11 > 10;
		System.out.println(gt);
		/**
		 * OR AND
		 * 
		 * if any one is true then OR make it true
		 * OR  ||
		 *   T OR T = T
		 *   T OR F = T
		 *   F OR F = F
		 *   
		 *   if any one is false than AND will make it false
		 *   AND &&
		 *   
		 *   T AND T = T
		 *   T AND F = F
		 *   F AND F = F
		 *   
		 *   Comparison operators || &&
		 *   
		 *   ! - Not
		 * 
		 */
		boolean comp = !(10 == 10) && (10==11) || (10 <= 12) || (10!=20);
		System.out.println(comp);
		
		
	}

}
