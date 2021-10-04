package stringExamples;

public class StringsAndThings {

	public static void main(String[] args) {


		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		System.out.println(sb);
		sb.append(", my name is ");
		System.out.println(sb);
		sb.append("Stephen");
		System.out.println(sb);
		
		for(int i =0; i<20; i++) {
			System.out.printf("%-2d: %s\n", i, "Here is some text");
		}
		
		System.out.printf("Total value: %f\n", 5.6789);
		System.out.printf("Total value: %.2f\n", 5.6789);
		System.out.printf("Total value: %10.2f\n", 5.6789);
	}

}
