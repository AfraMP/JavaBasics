package JavaIO;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
/**
 * 5. Write a program to read text from .txt file using FileReader
 */
public class FileReaderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		try {
			File f  = new File(System.getProperty("user.dir") + "\\src\\files\\a.txt");
			fr = new FileReader(f);
			int ch;
			while((ch = fr.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {				
				if(fr != null) {
					fr.close();
				} 
			} catch(IOException e) {
				System.out.println("IOException");
			}
		}
	}

}
