package Exception;
/**
 * 16. Write a program to generate NumberFormatException 
 */
public class NumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "2jd";
		try {
			int b = Integer.parseInt(a);
			/*
			 * This error occurs when not able to convert the string to int  
			 */
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
