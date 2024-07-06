package Loop;

/**
 * 5. Write a program to print largest number among three numbers.
 */

import java.util.Scanner;
public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //User Input stored in num
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number a: ");
        int a = sc.nextInt();
    	System.out.print("Enter a number b: ");
        int b = sc.nextInt();
    	System.out.print("Enter a number c: ");
        int c = sc.nextInt();
		System.out.println(a < b ? (b > c ? (b + " is largest number") : (c + " is largest number")) : (a > c ? (a + " is largest number") : (c + " is largest number")));
		sc.close();
	}

}
