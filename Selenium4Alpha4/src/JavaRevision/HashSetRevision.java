package JavaRevision;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetRevision 
{
	
	
	public static void main(String[] args) 
	{
		// hashset, treeset and linkedhashset implement Set interface
		// set does not permit duplicate values
		// no guarantee elements will be stored in any particular order. it's an unordered set
		
		HashSet<String> h = new HashSet<String>();
		System.out.println(h.size()); // should return 0 
		System.out.println(h.isEmpty()); // should return TRUE
		h.add("Stephen");
		System.out.println(h.size()); // should return 1
		h.add("Kat");
		h.add("Finnbar");
		h.add("Clara");
		System.out.println(h.size()); // should return 4
		System.out.println(h); // prints all values comma separated, bound by square braces
		h.add("Finnbar"); // won't be added, it's duplicate
		System.out.println(h); // prints all values comma separated, bound by square braces
		System.out.println(h.isEmpty()); // should return FALSE
		h.remove("Stephen");
		System.out.println(h.size()); // should return 3
		System.out.println(h); // prints all values comma separated, bound by square braces
		h.add("Stephen");
		
		// Iterator - can traverse each object in a set
		Iterator<String> i = h.iterator();
		System.out.println(i.next()); // starts at first "index" in the set, each time called, moves to next index
		System.out.println(i.next()); 
		System.out.println(i.next()); 
		System.out.println(i.next()); 
		//System.out.println(i.next()); // will throw No Such Element Exception once it reaches final index if you ask for it to find "next" index
		
		while(i.hasNext()) {// hasnext checks whether there is a next index present before continuing loop 
			System.out.println(i.next());
		}
		
	}
}
