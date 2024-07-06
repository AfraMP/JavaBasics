package Arrays;
/**
 * 8. Write a function to find the minimum and maximum value of an array 
 */
public class MinMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {134, 23, 400, 45,6, 67 };
		int min = minArray(arr);
		int max = maxArray(arr);
		System.out.println("Minimum element in the array:" + min);
		System.out.println("Maximum element in the array:" + max);
	}
	public static int minArray(int[] arr) {
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
		}
		return min;
	}
	public static int maxArray(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		return max;
	}
}
