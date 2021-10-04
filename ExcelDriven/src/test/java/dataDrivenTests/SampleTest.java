package dataDrivenTests;

import java.io.IOException;
import java.util.ArrayList;

public class SampleTest {

	public static void main(String[] args) throws IOException {


		ExcelDataDrivenDemo dataTest = new ExcelDataDrivenDemo();
		ArrayList<String> data = dataTest.getData("Purchase");
		
		for(int i = 0; i<data.size(); i++) {
			System.out.println(data.get(i));
		}
	}

}
