package dataDrivenTests;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDrivenDemo {

	//identify "TestCases" column from the header row
	// once column identified, scan to identify purchase test case
	// then pull all values from each cell from that row
	
	public ArrayList<String> getData(String testcase) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\work\\TestScenarios\\DemoData.xlsx"); // create fis object which will have permission to access file in path
		XSSFWorkbook workbook = new XSSFWorkbook(fis); // then create workbook obj and pass the fis obj to it
		
		ArrayList<String> list = new ArrayList<String>(); 
		int sheetnum = workbook.getNumberOfSheets(); // get number of sheets in workbook
		for(int i=0; i<sheetnum; i++) // loop through all sheets
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("sheet1")) // once you find the sheet that matches
			{
				XSSFSheet sheet = workbook.getSheetAt(i); // then get the sheet object and pass into variable. 
				Iterator<Row> rows = sheet.iterator(); // create iterator to traverse rows
				Row header = rows.next(); // move specifically to first row
				Iterator<Cell> cells = header.cellIterator(); // create iterator to traverse cells in header
				int k = 0;
				int column = 0;
				while(cells.hasNext()) 
				{
					Cell value = cells.next(); // move to first cell 
					if(value.getStringCellValue().equalsIgnoreCase("testcases")) // if current cell value is "testcases"
					{
						column = k; // save index of column containing "testcases" to column variable. 
						
					}
					k++;					
				}
				
				while(rows.hasNext()) 
				{
					Row r = rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcase)) // match the row 
					{
						Iterator<Cell> cell = r.cellIterator();
						while(cell.hasNext()) 
						{
							Cell c = cell.next();
							//store data for each cell in an array
							
							if(c.getCellType()==CellType.STRING) {
							
								list.add(c.getStringCellValue());
							}else {
								list.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
							
						}
					}
					
				}
			}			
		}
		workbook.close();
		return list;
	}
}
