package core.string;

public class StringTest {

	public static void main(String[] args) {
		
		String a = "Anees";
		String b = "Anees";
		if(a==b){
			System.out.println("References are equal");
		} else {
			System.out.println("References are ! equal");
		}
		
		String c = new String("Anees");
		//String d = new StringBuffer().append(a).append(b).toString();
		String d = a+b;// srting adding using "+" operator 
		System.out.println(d);
		System.out.println(c);
		System.out.println(a);
		
		String e = a.concat(b);//string adding using concat
		System.out.println(e);
		// To compare reference use == 
		if (a==c){//references are not equal because here we have assigned new memory.
			System.out.println("References are Equal");
		}else {
			System.out.println("References are ! equal");
		}
		// To compare contents of A and C use .equals
		if(a.equals (c)){
			System.out.println("Content is same");
		} else {
			System.out.println("Content is differnt");
		}
		
		
		
	}
}
