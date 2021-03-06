package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListStuff {

	public static void main(String[] args) {
		
		//create an arraylist and linkedlist for comparison
		
		//if you only want to add/remove items from the end of the list, use ArrayList
		List<Integer> al = new ArrayList<Integer>();
		//if you want to add/remove from start/middle of list, use LinkedList
		List<Integer> ll = new LinkedList<Integer>();
		
		doTimings("an arrayList", al);
		doTimings("a linkedList", ll);
	}
	
	//once you have created the type of list you want, you can use common list (interface) methods to manipulate it
	private static void doTimings(String type, List<Integer> list) {
		
		long start = System.currentTimeMillis();
		
		/*for(int i = 0; i < 1E6; i++) { //1E6 = 1x10^6, 1,000,000
			list.add(i); // adds to end of the list
		}*/
		
		for(int i = 0; i < 1E5; i++) { 
			list.add(0, i); // adds to specific index of the list, e.g. 0 = beginning
		}
		
		
		long end = System.currentTimeMillis();
		
		System.out.println("time taken: " + (end-start) + " ms for " + type);
		
	}

}
