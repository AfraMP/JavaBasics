package Exception;

import java.util.Arrays;

/**
 * 15. Write a program to generate NullPointerException
 */
public class NullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[] = null;
			System.out.println(arr[0]);
			/*
			 * If we try to refer the variable that is null then the NullPointerException occurs
			 */
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
	}

}
