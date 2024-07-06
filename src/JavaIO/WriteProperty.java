package JavaIO;
/**
 *  Write a program to write data to properties file. 
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		Properties p = null;
		try {
			File f  = new File(System.getProperty("user.dir") + "\\src\\files\\propertiesWritten.properties");
			fw = new FileWriter(f);
			p = new Properties();
			p.setProperty("username", "sanafer");
			p.store(fw, "these are properties");
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
