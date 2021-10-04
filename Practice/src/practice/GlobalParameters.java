package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalParameters {

	public static void main(String[] args) throws IOException {

		
		Properties prop = new Properties(); // create a properties file
		//create fileinput and pass the path of the actual .properties file
		FileInputStream fis = new FileInputStream("C:\\Users\\stephen.mcnicholas\\eclipse-workspace\\Practice\\src\\practice\\data.properties"); 
		
		prop.load(fis); // load the properties object with the fileinput
		// use get methods to pull data from the .properties file
		System.out.println(prop.getProperty("browser")); // prints chrome
		System.out.println(prop.getProperty("url"));
		
		// use set methods to update the property object but NOT the actual file
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser")); // prints firefox
		
		// to write data back to the FILE, you need another IO object FileOutputStream
		FileOutputStream fos = new FileOutputStream("C:\\Users\\stephen.mcnicholas\\eclipse-workspace\\Practice\\src\\practice\\data.properties");
		prop.store(fos, null); // store method of fileoutputstream object writes back to the file
		
	}

}
