package Arrays;
/**
 * 19. Write a function to find the missing number of sorted array of 1 to 100 
 */
public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 4, 21, 55, 99};
		missingNumber(arr);
	}
	
	public static void missingNumber(int[] arr) {
		int index = 0;
		for(int i = 1; i <= 100; i++) {
			if(index < arr.length && i == arr[index]) {
				index++;
				continue;
			}
			System.out.print(i + " ");
		}
	}

}
