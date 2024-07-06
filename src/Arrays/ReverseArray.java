package Arrays;
/**
 * 9. Write a function to reverse an array of integer values 
 */
import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5};
		System.out.println("Array before reversing: " + Arrays.toString(arr));
		arr= reverseArray(arr);
		System.out.println("Reversed array: " + Arrays.toString(arr));
	}
	
	public static int[] reverseArray(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		int temp = arr[0];
		while(low < high) {
			temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++; high--;
		}
		return arr;
	}
}
