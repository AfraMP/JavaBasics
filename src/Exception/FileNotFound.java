package Exception;
/**
 * 11. Write a program to generate FileNotFoundException
 */
import java.io.*;
public class FileNotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fileReader = new FileReader(new File("Test.txt"));  
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
