package Arrays;
/**
 * 17. Write a method to verify if the array contains two specified elements(12,23) 
 */
import java.util.Scanner;

public class CheckContainsElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4, 5, 67,6 };
		System.out.print("Enter 2 numbers to verify: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		check(arr, a, b);
		sc.close();
	}
	public static void check(int[]  arr, int elem1 ,int elem2) {
		boolean num1 = false;
		boolean num2 = false;
		for(int i: arr) {
			if(elem1 == i) {
				num1 = true;
			}
			if(elem2 == i) {
				num2 = true;
			}
			if(num1 && num2) {
				System.out.println("The array contains both the element");
				return;
			}
		}
		if(num1 || num2 ) {
			System.out.println("The array contains only one element: " + (num1 ? elem1: elem2));
		} else {
			System.out.println("The array dont contain any element");
		}
	}
}
