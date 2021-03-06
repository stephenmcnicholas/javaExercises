package practice;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		
		
		int a[] = {4,5,5,5,4,6,6,9,4,9,3,0};
		ArrayList<Integer> al = new ArrayList<Integer>();
		
			
		// challenge: print the number of occurences of each number in the array
		// e.g. 4 occurs 3 times; 5 occurs 3 times, 6 occurs twice, 9 occurs once.
		
		//System.out.println(a.length);
		
		// create empty arraylist 
		// traverse through array, check if value exists in arraylist, if not add, giving set of distinct values 
		// iterate through array, check if value matches the arraylist value, if so add to count
		// then print the value of the current index, and the count of that value 
			
		int unique = 0;
		System.out.println(unique);
		System.out.println("Value\tOccurences\tUnique(Y/N)");
		for(int i = 0; i<a.length; i++) {
			int count = 0;
			if(!al.contains(a[i])) {
				al.add(a[i]);
				count++;
				for(int j = i+1; j<a.length; j++) {
					if(a[i]==a[j]){
						count++;
					}
				}
				System.out.print(a[i] + "\t");
				System.out.print(count);
				if(count==1) {
					unique = a[i];
					System.out.println("\t\tY");
				}
				else {
					System.out.println("\t\tN");
				}
			}
			
		}
				 
	}

}
