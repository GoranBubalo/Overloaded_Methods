//OVERLOADED METHODS
public class Main {

	//void means that the method does not return any data type 
	//when a method is declared static it means that the method is 
	// = = = = > a part of  the Class and not a part of a individual object
	
	//When an method changes the value of the static variable 
	// = = = > than that value is changed for all object in the Class
	public static void main(String[] args) {
		
		// overloaded methods = = = > methods that share the SAME NAME but have DIFFERENT PARAMETERS
		//							  method name + parameters = method signature 
		
		//One way of output OR assigning value 
		System.out.println(add(3,5));
		System.out.println();
		int x = add(4,6,7);
		System.out.println(x);
		System.out.println();
		double y = add(4.5,6.6,2,2);
		System.out.println(y);
		
		
		
	}
	//Two ways to resolve this 
	// 1- change the method name 
	// 2- change the parameters of each method
		// = > one that accepts two values, other that accepts three values 
	
	static int add(int a, int b) {
		System.out.println("This is Overloaded method 1");
		return a + b;
	}
	static int add(int a, int b, int c ) {
		System.out.println("This is Overloaded method 2");
		return a + b + c ;
	}
	static int add(int a, int b, int c , int d) {
		System.out.println("This is Overloaded method 3");
		return a + b + c + d ;
	}
	static double add(double a, double b) {
		System.out.println("This is Overloaded method 4");
		return a + b;
	}
	static double add(double a, double b, double c ) {
		System.out.println("This is Overloaded method 5");
		return a + b + c ;
	}
	static double add(double a, double b, double c , double d) {
		System.out.println("This is Overloaded method 6");
		return a + b + c + d ;
	}
	
	
}
