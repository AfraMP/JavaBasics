
package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 12. Write a program to generate IOException
 */
public class IOEcxetionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		File f = new File("s.txt");
		FileInputStream in = null;
	    try {
	      in = new FileInputStream(f);
	      in.read();
	      in.close();
	      /*
	       * FileNotFoundException is subclass of IOException. IOException occurs when there is some 
	       * issue when performing Input / Output Operation.
	       */
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	}

}
