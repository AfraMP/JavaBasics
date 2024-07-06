package Arrays;
/**
 * 11. Write a program to find the common values between two arrays 
 */
public class CommonValueIn2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 34, 5, 67, 8, 9};
		int arr2[] = {2, 45, 7, 67, 1, 3};
		getCommonValues(arr1, arr2);
	}
	public static void getCommonValues(int[] arr1, int[] arr2) {
		for(int i = 0; i < arr1.length; i++) {
			for(int  j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + " ");
					break;
				}
			}
		}
	}

}
