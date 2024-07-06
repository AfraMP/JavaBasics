package AccessModifiersPackage2;
import AccessModifiers.ProtectedFieldMethod;
/**
 * Also, Access the PROTECTED fields and methods from child class located in a different package 
 * Access the PROTECTED fields and methods from any class in different package
 */
public class Protected extends ProtectedFieldMethod{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Protected p = new Protected();
		System.out.println(p.a);
		p.message();
		/*
		 * Protected members can be accessed from any class in same package and from all the subclasses.
		 * So it is not possible to access the members any class outside the package except the subclasses.
		 */
	}

}
