package JavaBasic;

/**
 * 5. Define the local and Global variables with the same name and print both variables and 
 * understand the scope of the variables 
 */
public class VariableScope {
	int x = 2;
	public void fun(int x) {
		System.out.println("This is the global variable outside fun:" + this.x);
		System.out.println("This is the variable inside fun:" + x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		VariableScope obj = new VariableScope();
		obj.fun(5);
		System.out.println("Global variable x : " + obj.x);
		System.out.println("x in main function : " + x);
	}

}
