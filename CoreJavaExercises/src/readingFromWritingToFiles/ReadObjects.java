package readingFromWritingToFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

	public static void main(String[] args) {
		
		try(FileInputStream fi = new FileInputStream("people.bin")){
			
			ObjectInputStream ois = new ObjectInputStream(fi);
			
			Person person1 = (Person)ois.readObject();
			Person person2 = (Person)ois.readObject();
			System.out.println(person1);
			System.out.println(person2);
			ois.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
