package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetStuff {

	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<String>();
		if(hashSet.isEmpty()) {
			System.out.println("Hash Set is Empty at start");
		}
		hashSet.add("mouse");
		hashSet.add("cat");
		hashSet.add("dog");
		hashSet.add("bear");
		hashSet.add("rhino");
		if(hashSet.isEmpty()) {
			System.out.println("Hash Set is Empty after adding items");
		}
		//System.out.println(hashSet); // does not preserve ANY particular ordering, just maintains a UNIQUE set of items
		
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		if(linkedHashSet.isEmpty()) {
			System.out.println("Linked Hash Set is Empty at start");
		}
		linkedHashSet.add("mouse");
		linkedHashSet.add("cat");
		linkedHashSet.add("dog");
		linkedHashSet.add("bear");
		linkedHashSet.add("rhino");
		if(linkedHashSet.isEmpty()) {
			System.out.println("Linked Hash Set is Empty after adding items");
		}
		//System.out.println(linkedHashSet); // preserves entry order
		
		Set<String> treeSet = new TreeSet<String>();
		if(treeSet.isEmpty()) {
			System.out.println("Tree Set is Empty at start");
		}
		treeSet.add("mouse");
		treeSet.add("cat");
		treeSet.add("dog");
		treeSet.add("bear");
		treeSet.add("rhino");
		if(treeSet.isEmpty()) {
			System.out.println("Tree Set is Empty after adding items");
		}
		//System.out.println(treeSet); // maintains NATURAL order
		
		System.out.println("\nHash Set: no particular order");
		for (String element: hashSet) {
			System.out.println(element);
		}
		System.out.println("\nLinked Hash Set: preserved entry order");
		for (String element: linkedHashSet) {
			System.out.println(element);
		}
		System.out.println("\nTree Set: Natural order");
		for (String element: treeSet) {
			System.out.println(element);
		}
		
		// Sets are optimised to find items quickly. 
		if(hashSet.contains("hippo")) {
			System.out.println("Contains Hippo");
		}
		if(hashSet.contains("bear")) {
			System.out.println("Contains Bear");
		}
		
		//INTERSECTION
		
		Set<String> otherTreeSet = new TreeSet<String>();
		otherTreeSet.add("monkey");
		otherTreeSet.add("cat");
		otherTreeSet.add("dog");
		otherTreeSet.add("buffalo");
		otherTreeSet.add("rooster");
		
		Set<String> intersection = new HashSet<String>(otherTreeSet); // make copy of one set to ensure we don't break original set
		System.out.println(intersection); 
		
		intersection.retainAll(treeSet); // retains only those in both intersection and treeSet (cat and dog)
		System.out.println(intersection); // now prints cat and dog
		
		Set<String> difference = new HashSet<String>(treeSet); // make a copy to store just those elements that are unique to treeSet
		difference.removeAll(otherTreeSet); // removes all items from difference (treeSet) that match with otherTreeSet, leaving only unique treeSet values
		System.out.println(difference);
		
		
		
	}

}
