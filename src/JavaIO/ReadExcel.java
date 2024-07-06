package JavaIO;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 10.  Write a program to read data from excel
 */
public class ReadExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Create workbook
			XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(System.getProperty("user.dir") + "\\src\\files\\a.xlsx"));
			// Get first/desired sheet from the workbook 
            XSSFSheet sheet = workbook.getSheetAt(0); 
  
            // Iterate through each rows one by one 
            Iterator<Row> rowIterator = sheet.iterator(); 

            // Till there is an element condition holds true 
            while (rowIterator.hasNext()) { 
  
                Row row = rowIterator.next(); 
  
                // For each row, iterate through all the 
                // columns 
                Iterator<Cell> cellIterator 
                    = row.cellIterator(); 
  
                while (cellIterator.hasNext()) { 
  
                    Cell cell = cellIterator.next(); 
  
                    // Checking the cell type and format 
                    // accordingly 
                    switch (cell.getCellType()) { 
                    // Case 1 
                    case CellType.NUMERIC: 
                        System.out.print( 
                            cell.getNumericCellValue() 
                            + "\t"); 
                        break; 
  
                    // Case 2 
                    case CellType.STRING: 
                        System.out.print( 
                            cell.getStringCellValue() 
                            + "\t"); 
                        break; 
                    } 
                } 
  
                System.out.println(""); 
            } 
  
            workbook.close();
        } 
  
        // Catch block to handle exceptions 
        catch (Exception e) { 
  
            // Display the exception along with line number 
            // using printStackTrace() method 
            e.printStackTrace(); 
        } 
		}

}
