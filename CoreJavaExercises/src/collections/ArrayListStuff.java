package collections;

import java.util.ArrayList;

public class ArrayListStuff {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// all list objects implement the list interface
		
		//add values
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		//retrieve
		System.out.println("retrieving single value by index");
		System.out.println(numbers.get(0));
		
		//indexed for loop iteration
		System.out.println("retrieving values by looping over arraylist");
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		// removing items from head of the list is slow, because all of the values need to shuffle along one. 
		// if you think you need to remove from start or middle of array use linkedlist instead
		numbers.remove(0);
		
		// use enhanced for loop as alternative 
		System.out.println("retrieving values by looping over arraylist using enhanced for loop");
		for(Integer value: numbers) {
			System.out.println(value);
		}

	}

}
