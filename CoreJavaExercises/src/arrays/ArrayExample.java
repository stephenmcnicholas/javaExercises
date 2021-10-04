package arrays;

public class ArrayExample {

	public static void main(String[] args) {

		int[] values; // empty array
		values = new int[3];
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		//System.out.println(values[3]); // throws ArrayIndexOutOfBoundsException
		
		System.out.println("now printing as a loop");
		int[] moreValues  = {3,4,5,6,7,8};
		for(int i=0; i<moreValues.length; i++) {
			System.out.println(moreValues[i]);
		}
	
		String[] words = new String[4];
		words[0] = "happy";
		words[1] = "birthday";
		words[2] = "to";
		words[3] = "you";
		
		for(String anyVariableName : words) {
			System.out.print(anyVariableName + " ");
		}
		
		
		

	}
}
