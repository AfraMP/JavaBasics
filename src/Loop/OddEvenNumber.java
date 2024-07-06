package Loop;
/**
 * 4. Write a program to print the odd and even numbers.
 */
public class OddEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i++) {
			if((i & 1) != 0) {
				System.out.println(i + " is odd");
			} else {
				System.out.println(i + " is even");
			}
				
		}
	}

}
