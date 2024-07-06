package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 7. Write a function to insert an element at a specific position in the array 
 */
public class InsertElement {

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
		System.out.println("Enter the  elements to insert : ");
		int elem = sc.nextInt();
		System.out.println("Enter the  index where the element needs to be inserted : ");
		int index = sc.nextInt();
		sc.close();
		arr = insertElement(arr, index, elem);
		System.out.println("Array after element insertion: " + Arrays.toString(arr));
	}
	public static int[] insertElement(int[] arr, int index, int elem) {
		int arr2[] = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			
			if(i >= index) {	
				if(i == index) {
					arr2[i] = elem;
				}
				arr2[i+1] = arr[i];
			} else {
				arr2[i] = arr[i];
			}
		}
		return arr2;
	}
}
