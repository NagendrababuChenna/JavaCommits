package core.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterators {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("1");
		list.add("5");
		list.add("3");
		list.add("3");
		
		
		Set set = new HashSet();

		set.add("1");
		set.add("5");
		set.add("3");
		set.add("3");

		Iterator listItr = list.iterator();//assigned the iterator method to listItr object
		/*Iterator used to get the values or details from the Collection Objects 
		 * they are ..List , Set and Map
		 * Iterator is an Interface 
		 * Iterator has 2 methods
		 * 1. "next" method ---used to get the next value in the memory location
		 * 2. "hasNext" method ---used to find out if the Iteration has more elements to return
		 */
		System.out.println("Before .." +list);
		while (listItr.hasNext()) {
			String currvalue = (String) listItr.next();
			
			if(currvalue=="5"){
				listItr.remove();
			}
		}
		System.out.println(" After .." +list);

	}

}
