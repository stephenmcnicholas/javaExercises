package JavaRevision;

import java.util.ArrayList;

public class ArrayListRevision 
{
	
	
	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>(); // can accept duplicate values. 
		// Arrays have fixed size (at instantiation) but arraylist can grow dynamically
		// array lists allow access and insertion / deletion of any value at any index
		System.out.println(a.isEmpty()); // returns true because the arraylist is empty 
		a.add("Stephen"); // adds string object to next available index
		a.add("Kat"); // adds string object to next available index
		System.out.println(a.isEmpty()); // returns false because the arraylist is NOT empty
		
		System.out.println(a.get(0)); // print specific index
		System.out.println(a); // print whole array (comma delimited, with square braces)
		
		a.add(0, "Finnbar");
		System.out.println(a.indexOf("Kat")); // finds index where this string is stored (2)
		System.out.println(a); // print whole array (comma delimited, with square braces)
		a.remove(2); // removes object at index 2 ("Kat")
		System.out.println(a); // print whole array (comma delimited, with square braces)
		a.remove("Ste"); // won't remove, because this doesn't match a string obj in the arraylist
		System.out.println(a); // print whole array (comma delimited, with square braces)
		System.out.println(a.size()); // prints size of array (2)
		
		a.remove("Stephen"); // removes item that matches the string object "Stephen"
		System.out.println(a); // print whole array (comma delimited, with square braces)
		System.out.println(a.contains("Stephen")); // returns true if the string object exists in the arraylist
		System.out.println(a.contains("Finnbar")); // returns true if the string object exists in the arraylist
		System.out.println(a.size()); // prints size of array (1)
	}
}
