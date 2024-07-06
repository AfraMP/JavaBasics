package Static;
/**
 * 1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance 
 *    methods and a main method. 
 *    2. Print instance variables in static methods 
 *    3. Print static variables in Instance methods 
 *    4. Call instance methods in static methods 
 *    5. Call static methods in instance methods 
 *    6. Print all the static, instance variables in main method 
 *    7. Call static methods and instance methods in main method 
 */
public class Variables {
	// 2 static variable
    static int a = 2;
    static boolean b = true;
    // 2 instance variable
    int c =23;
    int d = 324;
    // 2 static method
    static void staticMethod1() {
    	System.out.println(" staticMethod1---------------------- 2. Print instance variables in static methods ---------------");
    	Variables obj = new Variables();
    	// Print instance variables in static methods 
    	System.out.println("instance variable in staticMethod1: " + obj.c );
    	System.out.println("instance variable in staticMethod1: " + obj.d );
    	// Call instance methods in static methods
    	System.out.println(" ----------------------- 4. Call instance methods in static methods ---------------------");
    	obj.instanceMethod1();
    	obj.instanceMethod2();
    }
    static void staticMethod2() {
    	System.out.println("static variable in staticMethod2: " + a );
    }
    // 2 instance method
    public void instanceMethod1() {
    	// Print static variables in Instance methods
    	System.out.println(" instanceMethod1----------------------------- 3. Print static variables in Instance methods -------------------");
    	System.out.println("static variable in staticMethod1: " + a);
    	System.out.println("static variable in staticMethod1: " + b);
    }
    public void instanceMethod2() {
    	System.out.println(" instanceMethod2------------------------------------");

    	System.out.println("instance variable in staticMethod2: " + c);
    	System.out.println(" ----------------------------- 5. Call static methods in instance methods  -------------------");

    	staticMethod2();
    }
    
    // main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables obj1 = new Variables();
		System.out.println("----------------------------- 7. Call static methods and instance methods in main method -------------------");
		System.out.println("Calling Static methods");
		staticMethod1();
		System.out.println("Calling Instance method");
		obj1.instanceMethod1();
    	System.out.println("Main Method ----------------------------- 6. Print all the static, instance variables in main method -------------------");
		System.out.println("static variable in main method: " + a + " , " + b);
		System.out.println("instance variable in main method: " + obj1.c + ", " + obj1.d);

	}

}
