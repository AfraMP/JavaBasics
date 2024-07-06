package Loop;

import java.util.Scanner;

/**
 * 12. Print gender (Male/Female) program according to given M/F using switch
 */
public class MaleOrFemale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print(" Enter your Gender M for Male and F for Female: ");
		String num = sc.next();
		char ch = num.charAt(0);
		sc.close();
		switch(ch) {
		case 'M':
			System.out.print("Male");
			break;
		case 'F': 
			System.out.print( "Female");
			break;
		}
	}

}
