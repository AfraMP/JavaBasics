package Loop;

import java.util.Scanner;

/**
 * 9. Write a program to find the prime or not.
 */
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter a number to check if it is prime number: ");
		int num = sc.nextInt();
		sc.close();
		boolean isPrime = true;
		if(num % 2 == 0 || num % 3 == 0) {
			isPrime = false;
		}
		for(int  i = 5; i*i < num; i += 6) {
			if(num % i == 0 || num % (i+2) == 0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.print(num + " is Prime");
		} else {
			System.out.print(num + " is not a Prime Number");
		}
	}

}
