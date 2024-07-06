package Arrays;
/**
 * 12. Write a method to remove duplicate elements from an array 
 * 18. Write a program to remove the duplicate elements and return the new array 
 */
import java.util.LinkedHashSet;

public class RemoveDuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 23, 46, 22, 23, 1};
		LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
		for(int i: arr) {
			s.add(i);
		}
		int arr2[] = new int[s.size()];
		int j = 0;
		for(int i : s) {
			arr2[j++] = i;
		}
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
