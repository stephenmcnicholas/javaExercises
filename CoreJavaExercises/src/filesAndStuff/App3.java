package filesAndStuff;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test1.txt");
		// this is called Try with Resources - looks prettier than App.java, which is a hot mess of nested try / catch clauses. Don't need to call "close" when using Try w Resources 
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){
			br.write("Mary had a little lamb\n");
			br.write("It's fleece was white as snow");
			br.newLine();
			br.write("blahdy blahdy blah. \nThe END");

			}
			catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to write to file " + file.toString());
		}
		System.out.println("Finished");
	}
	

}
