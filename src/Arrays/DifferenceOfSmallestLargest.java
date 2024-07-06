package Arrays;
/**
 * 16. Write a function to get the difference of largest and smallest value 
 */
public class DifferenceOfSmallestLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 23, 40, 45,6, 9 };
		System.out.println("Difference of largest and smallest value :" + ( maxArray(arr) - minArray(arr)));
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
