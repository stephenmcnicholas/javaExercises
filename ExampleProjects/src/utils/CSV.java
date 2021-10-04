package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
	// this method reads data from csv file and return as a list
	public static List<String[]> read(String file) {
		List<String[]> data = new LinkedList<String[]>();
		String row;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((row = br.readLine()) != null ) {
				String[] records = row.split(",");
				data.add(records);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("File not readable");
			e.printStackTrace();
		}
		return data;
	}
}
