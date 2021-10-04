package JavaRevision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapRevision 
{
	
	
	public static void main(String[] args) 
	{
		// Map is a key value pair collection. doesnt need to be sequential. 
		
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		
		System.out.println(h.isEmpty()); // shoudl print TRUE
		h.put(3, "Clara");
		System.out.println(h); // should print {3=Clara}
		System.out.println(h.isEmpty()); // shoudl print FALSE
		h.put(6, "Finnbar");
		h.put(47, "Katherine");
		h.put(42, "Stephen");
		System.out.println(h); // should print {3=Clara,6=Finnbar,42=Stephen,47=Katherine} - will order by key
		System.out.println(h.isEmpty()); // shoudl print FALSE
		h.put(43, "Stephen");
		System.out.println(h); // should print {3=Clara,6=Finnbar,42=Stephen,43=Stephen,47=Katherine} - will order by key
		h.put(1, "nobody");
		System.out.println(h); // should print {-1=nobody,3=Clara,6=Finnbar,42=Stephen,43=Stephen,47=Katherine} - will order by key
		h.put(3, "Archie"); // if key already exists, will replace value with new one
		System.out.println(h); // should print {-1=nobody,3=Archie,6=Finnbar,42=Stephen,43=Stephen,47=Katherine} - will order by key
		h.remove(43); // removes entry with the specified key 43=Stephen
		System.out.println(h); // should print {-1=nobody,3=Clara,6=Finnbar,42=Stephen,47=Katherine} - will order by key
		System.out.println(h.get(42)); // should print Stephen - value with key of 42
		System.out.println(h.get(43)); // should return null - value with key of 43 no longer exists
		
		Set s = h.entrySet(); // converts hashmap object into set object
		System.out.println(s); // should print [-1=nobody,3=Clara,6=Finnbar,42=Stephen,47=Katherine] - will order by key. allows now to iterate over set 
		Iterator i = s.iterator(); 
		while(i.hasNext()) { // iterate through set 
			Map.Entry m = (Map.Entry)i.next(); // cast results returned from the next iterator to a Map entry so you can interrogate the key value pairs. 
			System.out.print(m.getKey() + "\t"); // print key from hashmap entry
			System.out.println(m.getValue()); // print value from hashmap entry
		}
		
		
		// Hashtable similar to HashMap. Hashmap not synchronised or thread safe, HashTable is. 
		// if multiple progammes / threads are accessing hashmap separately, can cause issues
		// if multiple progammes / threads are accessing hashtable separately, onyl 1 will access at a time, rest will wait 
		// Hashmap will allow null keys and values, but HashTable will not. e.g. you might enter placeholders in the HashMap where some values are not yet known
		// Hashmap uses iterator interface. Hashtable is iterated by Enumerator interface 
		
		
	}
}
