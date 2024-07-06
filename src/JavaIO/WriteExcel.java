package JavaIO;
import java.io.File;
/**
 * 11. Write a program to write data to excel 
 */
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 
public class WriteExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // workbook object 
		try {
			
			XSSFWorkbook workbook = new XSSFWorkbook(); 
			
			// spreadsheet object 
			XSSFSheet spreadsheet 
			= workbook.createSheet(" Student Data "); 
			
			// creating a row object 
			XSSFRow row; 
			
			// This data needs to be written (Object[]) 
			Map<String, Object[]> studentData 
			= new TreeMap<String, Object[]>(); 
			
			studentData.put( 
					"1", 
					new Object[] { "Roll No", "NAME", "Year" }); 
			
			studentData.put("2", new Object[] { "128", "Aditya", 
			"2nd year" }); 
			
			Set<String> keyid = studentData.keySet(); 
			
			int rowid = 0; 
			
			// writing the data into the sheets... 
			
			for (String key : keyid) { 
				
				row = spreadsheet.createRow(rowid++); 
				Object[] objectArr = studentData.get(key); 
				int cellid = 0; 
				
				for (Object obj : objectArr) { 
					Cell cell = row.createCell(cellid++); 
					cell.setCellValue((String)obj); 
				} 
			} 
			
			// .xlsx is the format for Excel Sheets... 
			// writing the workbook into the file... 
			FileOutputStream out = new FileOutputStream( 
					new File(System.getProperty("user.dir") + "\\src\\files\\writeExcel.xlsx")); 
			
			workbook.write(out);
			System.out.println("Excel created");
			out.close(); 
		} catch(Exception e) { 
  
            // Display the exception along with line number 
            // using printStackTrace() method 
            e.printStackTrace(); 
        } 
	}

}
