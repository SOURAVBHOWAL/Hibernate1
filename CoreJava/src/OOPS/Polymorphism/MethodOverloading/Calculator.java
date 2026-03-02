package OOPS.Polymorphism.MethodOverloading;

public class Calculator {
	public static void add() {
		
	}
	public static void add(double a1,double a2) {
			//diff number of args
		System.out.println(a1+a2);
	}
	public static void add(double a1,float a2) {
		//change in no of datatype of args
		System.out.println(a1+a2);
	}
	public static void add(float a1,float a2) {
		//change in order of args
		System.out.println(a1+a2);
	}
	public static void add(double a1, int a3,float a2) {
		// change in order datatype or number of args together
		System.out.println(a1+a2+a3);
	}
	//
	//we can also achieve method overloading with non static methods
	public void sub() {
		
	}
	public void sub(double a1,double a2) {
		
	}
	public void sub(float a1,double a2) {
		
	}
	
}
