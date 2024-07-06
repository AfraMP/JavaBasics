package Arrays;
/**
 * 15. Write a method to find number of even number and odd numbers in an array 
 */
public class EvenOddNumberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 24, 5, 6, 6};
		evenOddCount(arr);
	}
	public static void evenOddCount(int[] arr) {
		int even = 0;
		int odd = 0;
		for(int i : arr) {
			if(i % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Number of odd elements: " + odd );
		System.out.print("Number of even elements: " + even );
	}
}
