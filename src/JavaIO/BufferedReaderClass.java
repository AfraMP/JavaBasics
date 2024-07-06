package JavaIO;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;
/**
 * 7. Read text from a .txt file using BufferedReader 
 */
public class BufferedReaderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		BufferedReader b = null;
		try {
			File f  = new File(System.getProperty("user.dir") + "\\src\\files\\a.txt");
			fr = new FileReader(f);
			b = new BufferedReader(fr);
			int ch;
			while((ch = b.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {				
				if(fr != null) {
					fr.close();
				} 
				if(b != null) {
					b.close();
				} 
			} catch(IOException e) {
				System.out.println("IOException");
			}
		}
	}

}

