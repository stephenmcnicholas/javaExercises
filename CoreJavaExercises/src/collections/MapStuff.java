package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapStuff {

	public static void main(String[] args) {
		//hashmap is made up of key value pairs
		// hashmap is NOT sorted and keys must be unique

		/*
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(99, "ninety nine");
		hashMap.put(5, "five");
		hashMap.put(0, "zero");
		hashMap.put(77, "seventy seven");
		hashMap.put(1, "one");
		hashMap.put(3, "three");
		
		System.out.println(hashMap.get(4)); // returns null, as there is no entry with key 4
		System.out.println(hashMap.get(1)); // returns "one" - the value of the corresponding key 1
		
		// you can use this loop syntax to iterate through all key/value pairs in hashmap
		for(Map.Entry<Integer, String> entry: hashMap.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}*/
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		//linked hashmap has doubly linked list (i.e. retains order of the map)
		LinkedHashMap<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();
		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		testMap(hashMap, "Hash Map: Maintains NO particular order");
		testMap(linkedhashmap, "Linked Hash Map: preserves order of key:value entry");
		testMap(treeMap, "Tree Map: maintains NATURAL order of KEYS");
		
	}

	public static void testMap(Map<Integer, String> map, String type) {
		map.put(9, "bacteria");
		map.put(15, "ant");
		map.put(5, "worm");
		map.put(3, "mouse");
		map.put(1, "owl");
		map.put(92, "bear");
		map.put(12, "whale");
		
		System.out.println("\nThis is a " + type);
		
		for(Integer key: map.keySet()) { // you can iterate over a set using this kind of loop
			System.out.println(key + " : " + map.get(key));
		}
		
	}
}
