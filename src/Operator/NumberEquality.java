package Operator;

import java.util.Scanner;

/**
 * 4. Write a program to find the two numbers equal or not.
 */
public class NumberEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		if(a == b) {
			System.out.println("The numbers are equal");
		} else {
			System.out.println("The numbers are not equal");
		}
	}

}
