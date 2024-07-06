package Arrays;
/**
 * 1. Write a function to add integer values of an array
 */
import java.util.Scanner;

public class AddIntegerValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print(" Enter the array length: ");
		int num = sc.nextInt();
		System.out.println("Enter the array elements");
		int[] arr = new int[num];
		int sum = 0;
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.print("Sum of the integer values are: " + sum);
		sc.close();
		
	}

}
