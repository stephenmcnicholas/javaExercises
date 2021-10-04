package filesAndStuff;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		// this is called Try with Resources - looks prettier than App.java, which is a hot mess of nested try / catch clauses. 
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println("Cannot find file " + file.toString());
		}catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read file " + file.toString());
		}

	}

}
