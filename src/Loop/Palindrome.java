package Loop;
/**
 * 10. Write a program to palindrome or not.
 */
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a string to check if it is palindrome : ");
		String str  = sc.nextLine();
		sc.close();
		String str2 = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			str2 += str.charAt(i);
		}
		if(str.compareTo(str2) == 0) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

}
