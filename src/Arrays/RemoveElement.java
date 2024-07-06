package Arrays;
/**
 * 5. Write a function to remove a specific element from an array
 */
import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12, 34, 45, 456, 56};
		int elementIndexToRemove = 2;
		arr = removeElement(arr, arr.length, elementIndexToRemove);
		System.out.print(Arrays.toString(arr));
		
	}
	public static int[] removeElement(int[] arr, int n, int index) {
		if(index > n || n == 0) {
			return arr;
		}
		int arr2[] = new int[n-1];
		for(int i = 0, k=0; i<n; i++) {
			if(i != index) {
				arr2[k++] = arr[i];
			}
		}
		return arr2;
	}

}
