package Arrays;
/**
 * 13. Write a method to find the second largest number in an array 
 */
public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {23, 12,5, 13, 2};
		int res = secondLargestElement(arr);
		System.out.println( res == -1 ? "No second largest element" : "second largest elem : " + res);
	}

	public static int secondLargestElement(int[] arr) {
		int largest = arr[0];
		int res = -1;
		for(int i : arr) {
			if(i > largest) {
				res = largest;
				largest = i;
			} else if(i < largest) {
					if(res == -1) {
						res = i;
					} else 	if(i > res) {
						res = i;
					}
			}
		}
		return res;
	}
}
