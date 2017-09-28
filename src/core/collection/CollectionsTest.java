package core.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsTest {
	
	
	public static void main(String[] args) {
		
		Box b1 = new Box(10, 11,55);
		Box b2 = new Box(10, 31,25);
		
		List boxList = new ArrayList();
		boxList.add(b1);
		boxList.add(b2);
			
		
		Box b3 = (Box)boxList.get(1);
		
		System.out.println("b3: " + b3);
		System.out.println("b1: " + b3);
		
		
		Set boxSet = new HashSet();
		boxSet.add(b1);
		boxSet.add(b2);
		
		System.out.println(b1);
		
		/*Map map = new HashMap();
		
		map.put("1", box1);
		map.put("bkey2", box2);
		
		Box b4 = (Box)map.get("1");*/
		
		
		
		
		
	}

}
