package core.condition.loops;

public class NestedFor {

	public static void main(String[] args) {
		//int clazz=5;
		//int student=10;
		for(int clazz= 0;clazz<5;clazz++){
			System.out.println("clazz ="+ clazz );
			for(int student=0;student<10;student++){
			System.out.println(" Student =" + student);	
			}
		}
		
	}
}
