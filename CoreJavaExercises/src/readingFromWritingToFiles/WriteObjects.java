package readingFromWritingToFiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {
	
		System.out.println("Writing Objects...");
		Person clara = new Person(3, "Clara");
		Person finnbar = new Person(6, "Finnbar");
		
		System.out.println(clara);
		System.out.println(finnbar);
		
		try(FileOutputStream fs = new FileOutputStream("people.bin")){
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(finnbar);
			os.writeObject(clara);
			
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
