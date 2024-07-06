package Interfaces;
/**
 * 9. Create a PRIVATE or PROTECTED interface and print the values as above scenario 
 * 10. Create an interface with private, public and protected fields. 
 * 11. Create an interface with static final variable
 */
public class PrivateInterface implements I {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		System.out.println(b);
	}

}

interface I {
	final static int a = 0;
	public int b = 8;
	
	/*
	 * -  private and protected fields throw error, fields can either be public or static and final
	 * - Only public and abstract is permitted for interface creation. Interface has 
	 * abstract methods and fields that are final and static.
	 */
}
