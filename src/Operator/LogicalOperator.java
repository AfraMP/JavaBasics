package Operator;
/**
 * 5. Programs on Logical AND,OR operator and Logical NOT
 */
public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 10;
		if(b % 2 == 0 && a % 2 == 0) {
			System.out.println("Both a and b are even");
		}
		if(b % 3 == 0 || a % 3 == 0) {
			System.out.println("Either a or b are is multiple of 3");
		}
		if(!(b % 2 != 0 && a % 2 != 0)) {
			System.out.println("Both a and b are not odd");
		}
	}

}
