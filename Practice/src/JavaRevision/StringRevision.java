package JavaRevision;

public class StringRevision 
{
	public static void main(String[] args) 
	{
		// demonstrate creating an object of a class in same package, no need to import the packagename.classname
		StaticVariables sv = new StaticVariables("Phil", "Manchester", 44);
		System.out.println(sv.getAge());
		
		String a = "MadaM";
		
		/*
		 * System.out.println(a.charAt(3)); //index starts at zero, so "3" selects the
		 * 4th character "p" System.out.println(a.indexOf("e")); // finds first instance
		 * of char, and returns it's position System.out.println(a.substring(5)); //
		 * returns from index 5 to end of string System.out.println(a.substring(8, 10));
		 * // returns from index 8 until index 10, but not including index 10
		 * System.out.println(a.concat(" is a legend!")); // concatenates a string to
		 * end of the object System.out.println(a.toLowerCase()); // converts all chars
		 * to lower case System.out.println(a.toUpperCase()); // converts all chars to
		 * upper case System.out.println(a.split(" ")[0]);
		 * System.out.println(a.split(" ")[1]); System.out.println(a.replace("S",
		 * "Ph"));
		 */
		//exercise: print a string in reverse, check if reversed string equals original string
		
		// try a reverse for loop - starting with last character and decrementing
		String b = "";
		for(int i=a.length()-1; i >=0; i--) 
		{
			System.out.print(a.charAt(i));
			b = b + a.charAt(i);
		}
		b.trim();
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		if(a.equals(b)) 
			System.out.println("This IS a Palindrome");
		else 
			System.out.println("This is not a Palindrome");
		
		
	}
}
