package Operator;

import java.util.Scanner;

/**
 * 7. Print the smaller and larger number
 */
public class SmallerLargerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter a number a: ");
		int a = sc.nextInt();
		System.out.print("Enter a number b: ");
		int b = sc.nextInt();
		sc.close();
		System.out.println(a > b ? "a is larger number ; b is smaller number" : "b is larger number ; a is smaller number");
	}

}
