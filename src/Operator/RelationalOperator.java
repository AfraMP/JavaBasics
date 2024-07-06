package Operator;
import java.util.Scanner;
/**
 * 6. Program for relational operators (<,<==, >, >==)
 */
public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter you mark : ");
		Scanner sc = new Scanner(System.in);
		int mark = sc.nextInt();
		sc.close();
		if(mark > 90) {
			System.out.println("A grade");
		} else if(mark >= 70) {
			System.out.println("B grade");
		} else if(mark <= 50 && mark  > 35) {
			System.out.println("E grade");
		}else if(mark < 60) {
			System.out.println("D grade");
		} else {
			System.out.println("FAIL");
		}
	}

}
