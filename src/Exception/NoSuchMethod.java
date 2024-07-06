package Exception;
/**
 * 13. Write a program to generate NoSuchFieldException
 */
public class NoSuchMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class c = Class.forName("Exception.ExampleB");
			c.getDeclaredMethod("a", int.class, String.class);
		/*
		 * The method with the above signature doesn't exists so it throws NoSuchMethodException
		 */
		} catch(  NoSuchMethodException | ClassNotFoundException e){
			e.printStackTrace();
		}
	}

}

	class ExampleB {
		int c = 5;
		void a() {
			System.out.println("dsj");
		}
	}