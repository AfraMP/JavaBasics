package JavaIO;
/**
 * 2. Write a program to write text to .txt file using OutputStream
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class OutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hey! Copied the text successfully";
		FileOutputStream out = null;
		try {
			File f = new File(System.getProperty("user.dir") + "\\src\\\\files\\outputStream.txt");
			out = new FileOutputStream(f);
			byte[] b = s.getBytes();
			out.write(b);
			System.out.println("Written successfully");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {				
				if(out != null) {
					out.close();
				} 
			} catch(IOException e) {
				System.out.println("IOException");
			}
		}
	}

}
