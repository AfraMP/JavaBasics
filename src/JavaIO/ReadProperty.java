package JavaIO;
/**
 * 9. Write a program to read data from properties file. 
 */
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		Properties p = null;
		try {
			File f  = new File(System.getProperty("user.dir") + "\\src\\files\\p.properties");
			fr = new FileReader(f);
			p = new Properties();
			p.load(fr);
			System.out.println(p.getProperty("user"));
			System.out.println(p.getProperty("age"));
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
