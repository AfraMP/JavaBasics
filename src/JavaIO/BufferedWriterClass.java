package JavaIO;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
/**
 * 8. Write text to a .txt file using BufferedWriter 
 */
public class BufferedWriterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		BufferedWriter bw = null;
		String s = "Written using FileWriter";
		try {
			File f  = new File(System.getProperty("user.dir") + "\\src\\files\\bufferedWriter.txt");
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			bw.write(s);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.flush();
				if(fw != null) {
					fw.close();
				} 
				if(bw != null) {
					bw.close();
				} 
			} catch(IOException e) {
				System.out.println("IOException");
			}
		}
	}

}
