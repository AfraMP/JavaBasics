package JavaIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
/**
 * 4. Write text to a .txt file using BufferedOutputStream 
 */
public class BufferedOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedOutputStream bo = null;
		String s = "Hey! Copied the text successfully";
		FileOutputStream out = null;
		try {
			File f = new File(System.getProperty("user.dir") + "\\src\\\\files\\bufferedOutputStream.txt");
			out = new FileOutputStream(f);
			byte[] b = s.getBytes();
			bo = new BufferedOutputStream(out);
			bo.write(b);
			System.out.println("Written successfully");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {	
				bo.flush();
				if(out != null) {
					out.close();
				} 
				if(bo != null) {
					bo.close();
				}
			} catch(IOException e) {
				System.out.println("IOException");
			}
		}
	}

}
