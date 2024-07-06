package JavaIO;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
/**
 * 6. Write a program to write text to .txt file using FileWriter 
 */
public class FileWriterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		String s = "Written using FileWriter";
		try {
			File f  = new File(System.getProperty("user.dir") + "\\src\\files\\fileWriter.txt");
			fw = new FileWriter(f);
			fw.write(s);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {				
				if(fw != null) {
					fw.close();
				} 
			} catch(IOException e) {
				System.out.println("IOException");
			}
		}
	}

}
