package Arrays;
/**
 * 2. Write a function to calculate the average value of an array of integers
 */
import java.util.Scanner;

public class CalculateAverage {

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
		System.out.print("Average of the integer values are: " + sum / arr.length);
		sc.close();
	}

}
