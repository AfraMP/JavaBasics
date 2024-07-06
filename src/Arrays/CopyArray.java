package Arrays;
/**
 * 6. Write a function to copy an array to another array
 */
import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 4};
		copyArray(arr);

	}
	public static void copyArray(int[] arr) {
		int arrCopy[] = arr;
		System.out.println(Arrays.toString(arrCopy));
	}

}
