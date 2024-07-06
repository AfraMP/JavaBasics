package Arrays;
/**
 * 3. Write a program to find the index of an array element
 */
import java.util.Scanner;

public class FindArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print(" Enter the array length: ");
		int num = sc.nextInt();
		System.out.println("Enter the array elements");
		int[] arr = new int[num];
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the  elements to find : ");
		int elem = sc.nextInt();
		 findIndex(arr, elem);
		
		sc.close();
	}
	public static void findIndex(int[] arr,int  elem) {
		int index = -1;
		for(int i = 0; i< arr.length;  i++) {
			if(arr[i] == elem) {
				index = i;
				break;
			}
		}
		System.out.print(index == -1 ? "Element not found " : "Element found at index : " + index);
	}

}
