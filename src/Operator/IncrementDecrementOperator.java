package Operator;
/**
 * 2. Write a method for increment and decrement operators(++, --)
 */
public class IncrementDecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		System.out.println("Post Increment operator: " + a++);
		System.out.println("Pre Increment operator: "+ ++a);
		System.out.println("Pre Decrement operator: "+ --a);
		System.out.println("Post Decrement operator: " + a--);
		System.out.println("variable a holds: " + a);
	}

}
