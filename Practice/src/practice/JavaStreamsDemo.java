package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class JavaStreamsDemo {

	public static void main(String[] args) {

		// Java Streams used to optimise code. 
		// solve a challenge below using two methods. traditional method and streams method to demonstrate the purpose of streams
		
		// challenge: count number of names starting with letter A in the list
		
		//first create the arraylist and populate
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Adam");
		names.add("Stephen");
		names.add("Finnbar");
		names.add("Alex");
		names.add("Elvis");
		names.add("Aaron");
		
		// option 1: with for loop and if condition, then print count
		
		int counter = 0;
		for(int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			if(name.startsWith("A")) 
				counter++;
		}
		System.out.println("There are " + counter + " names beginning with 'A'");

		
		// option 2: 
		// 1. create stream (names.stream()) 
		// 2. then perform intermediate operation to transform into another stream (filter(s->s.startswith("A"))
		// 3. perform terminal operation on final stream to get result (count() number of streams in the intermediate operation)
		
		Long counter2 = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println("There are " + counter2 + " names beginning with 'A'");
		System.out.println("-----------");
		
		// operations on the data source do not affect the data source. The ArrayList in this example is unmodified. 
		
		// can also create a stream directly, not converting from another collection. e.g. 
		Stream.of("Adam","Stephen","Finnbar","Alex","Elvis","Aaron").filter(s->s.startsWith("S")).count();
		
		// terminal operation will ONLY execute if the intermediate op returns true. 
		Stream.of("Adam","Stephen","Finnbar","Alex","Elvis","Aaron").filter(s->s.startsWith("B")).count();
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s)); // this will pull names arraylist into a stream, filter for items longger than 4 characters, then print each one out
		System.out.println("-----------");
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s)); // this will pull names arraylist into a stream, filter for items longger than 4 characters, limit to just one result then print each one out

		System.out.println("-----------");
		// print names ending in "n",  but print in uppercase. 
		names.stream().filter(s->s.endsWith("n")).map(s->s.toUpperCase()).forEach(s->System.out.println(s)); // this will pull names arraylist into a stream, filter for items ending in n, map to upper case, then print each one out
		
		System.out.println("-----------");
		
		List<String> moreNames = Arrays.asList("Alice","Barb","Clara","Alicia","Bobbi","Candy");
		
		// use "sorted" to sort order 
		moreNames.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		System.out.println("-----------");
		
		// merge 2 different lists. convert both to streams and use Stream.concat to pass into a new stream of strings, 
		Stream<String> newStream = Stream.concat(names.stream(), moreNames.stream());
		//newStream.forEach(s->System.out.println(s)); // then for each item in the stream, print it
		
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("stephen")); // match arg returns a boolean 
		Assert.assertTrue(flag); 
		
		// collect method can take results and return into a list. 
		// e.g. use case where you need to take a list, perform some operations, and then store it as a new list, rather than print it out or validate it 
		
		List<String> newList = Stream.of("Adam","Stephen","Finnbar","Alex","Elvis","Aaron").filter(s->s.endsWith("n")).map(s->s.toUpperCase()).collect(Collectors.toList()); // can convert to list or other collection types
		System.out.println(newList.get(0));
		
		// can even use streams to get first value
		
		
		// challenge :print unique number from the array and sort the array
		List<Integer> numbers = Arrays.asList(3,2,2,7,5,1,9,7);
		//numbers.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> uniqueSortedNumbers = numbers.stream().distinct().sorted().collect(Collectors.toList()); // get distinct list, sort it, pass to list, then print third index (number "3" from list)
		System.out.println(uniqueSortedNumbers.get(2));
		
	}

}
