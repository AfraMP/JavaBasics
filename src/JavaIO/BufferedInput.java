package JavaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;
/**
 * 3. Read text from a .txt file using BufferedInputStream
 */
public class BufferedInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream in = null;
		BufferedInputStream b = null;
		
		try {
			File f = new File(System.getProperty("user.dir") + "\\src\\\\files\\a.txt");
			in = new FileInputStream(f);
			b = new BufferedInputStream(in);
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
				if(b !=  null) {
					b.close();
				}
			} catch(IOException e) {
				System.out.println("IOException");
			}
		}
	}

}
