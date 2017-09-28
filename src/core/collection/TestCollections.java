package core.collection;

import java.util.ArrayList;
import java.util.List;
//import java.util.HashMap;
import java.util.HashSet;

public class TestCollections {

	//List, Set, Maps 
	//Collection is the parent for List and Set Interfaces
	//Map is an Interface
	// List - interface - ArrayList	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();

		list.add("1");
		list.add("5");
		list.add("3");
		list.add("3");
		
		
		System.out.println(list.get(0));
		
		HashSet set = new HashSet();
		set.add("1");
		set.add("5");
		set.add("3");
		set.add("3");
		
		System.out.println(set.size());
		//Map is not supporting here
//		HashMap map = new HashMap();
//		map.put("1","Anees");
//		map.put("2", "Nag");
//		map.put("3","Check");
		
	
//		int ar[] = new int[10];
		
	
		
	}
		
	
	
}
