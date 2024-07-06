package Loop;
/**
 * 6. Write a program to print even number between 10 and 100 using while
 */
public class EvenNumber10to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10 + 1;
		while(i < 100) {
			
			if(i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
