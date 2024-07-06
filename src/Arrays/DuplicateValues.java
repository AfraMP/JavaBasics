package Arrays;
/**
 * 10. Write a function to find the duplicate values of an array 
 */
public class DuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 34, 1, 3, 4, 34};
		findDuplicateValues(arr);
	}
	
	public static void findDuplicateValues(int[] arr) {
		for(int i = 0 ; i < arr.length - 1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
					break;
				}
			}
		}
	}
}
