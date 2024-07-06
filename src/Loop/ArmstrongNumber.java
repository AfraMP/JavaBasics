package Loop;

import java.util.Scanner;

/**
 * 8. Write a program to find Armstrong number or not
 */
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the number : " );
		int a = sc.nextInt();
		sc.close();
		int numberLength = (int)Math.floor(Math.log10(a)) + 1;
		int sum = 0;
		int temp = a;
		for(int i = 0;  i < numberLength; i++)  {
			sum += Math.pow((temp % 10), numberLength);
			temp /= 10;
		}
		if(sum  == a) {
			System.out.println(sum + " is an  Armstrong Number");
		} else {
			System.out.println(sum + " is not an Armstrong Number");
		}
	}

}
