package Loop;
/**
 * 13. Program for multiple if else statement(Largest number in 10,20 and 30)
 */
public class IfElseLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = 30;
		if(a > b) {
			if(a > c) {
				System.out.print(a + " is Largest");
			} else {
				System.out.print(c + " is Largest");
			}
		} else  {
			if(b > c) {
				System.out.print(b + " is Largest");
			} else {
				System.out.print(c + " is Largest");
			}
		}
	}

}
