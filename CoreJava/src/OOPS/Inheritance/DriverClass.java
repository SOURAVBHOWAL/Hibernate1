package OOPS.Inheritance;

public class DriverClass {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
 		System.out.println("From Parent: "+p.a);
		System.out.println("From Child: "+c.b+" "+c.a);
		
		
	}

}
