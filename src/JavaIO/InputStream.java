package JavaIO;
/**
 * 1. Write a program to read text from .txt file using InputStream
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

public class InputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream in = null;
		try {
			File f = new File(System.getProperty("user.dir") + "\\src\\\\files\\a.txt");
			in = new FileInputStream(f);
			int  c;
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {				
				if(in != null) {
					in.close();
				} 
			} catch(IOException e) {
				System.out.println("IOException");
			}
		}
	}

}
