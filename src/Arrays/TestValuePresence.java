package Arrays;
/**
 * 4. Write a function to test if array contains a specific value
 */

public class TestValuePresence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {'a', 'b', 'c'};
		System.out.print(testValuePresence(arr, arr.length, 'b') ? "Element not found " : "Element found " );
	}
	public static boolean testValuePresence(int[] arr,int n, int elem) {
		int index = -1;
		for(int i = 0; i< n;  i++) {
			if(arr[i] == elem) {
				index = i;
				break;
			}
		}
		return index == -1;
	}

}
