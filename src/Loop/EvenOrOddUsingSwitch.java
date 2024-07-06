package Loop;
/**
 * 11. Program to check whether a number is EVEN or ODD using switch
 */
import java.util.Scanner;

public class EvenOrOddUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print(" Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		switch(num % 2) {
		case 0:
			System.out.print(num + "  is even");
			break;
		case 1: 
			System.out.print(num + " is odd");
			break;
		}
	}

}
