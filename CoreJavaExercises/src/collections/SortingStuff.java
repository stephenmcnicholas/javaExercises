package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

class StringLengthComparator implements Comparator<String>{
	@Override public int compare(String s1, String s2)
	{
		int len1 = s1.length();
		int len2= s2.length();
		if(len1 > len2) {
			return 1;
		}
		else if (len2 > len1) {
			return -1;
		}
		return 0;
	}
}

class ReverseAlphabeticalComparator implements Comparator<String>{
	@Override 
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);
	}
}

public class SortingStuff {

	public static void main(String[] args) {
		 // SORTING Lists
		
		List<String> animals = new ArrayList<String>();
		animals.add("lion");
		animals.add("bengal tiger");
		animals.add("leopard");
		animals.add("bobcat");
		animals.add("panther");
		animals.add("cougar");
		animals.add("jaguar");

		//Collections.sort(animals); // sorts in natural order
		Collections.sort(animals, new ReverseAlphabeticalComparator()); // sorts in natural order
		for(String animal : animals) {
			System.out.println(animal);
		}
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(0);
		numbers.add(2);
		numbers.add(1);
		numbers.add(9);
		
		//Collections.sort(numbers); // sorts in natural order
		Collections.sort(numbers, new Comparator<Integer>() {
			public int compare(Integer num1, Integer num2) {
				return -num1.compareTo(num2);
			}
		}); // sorts in natural order
		for(Integer number : numbers) {
			System.out.println(number);
		}
		
	
	List<Person> people = new ArrayList<Person>();
	
	people.add(new Person(1, "stephen"));
	people.add(new Person(4, "kat"));
	people.add(new Person(3, "finn"));	
	people.add(new Person(2, "clara"));
	
	Collections.sort(people, new Comparator<Person>() {
		public int compare(Person p1, Person p2) {
			if(p1.getId() > p2.getId()) {
				return 1;
			}
			else if(p2.getId() > p1.getId()) {
				return -1;
			}
			return 0;
		}
	});
	
	for(Person person: people) {
		System.out.println(person);
	}
	
	}
	
	
	
	
}
