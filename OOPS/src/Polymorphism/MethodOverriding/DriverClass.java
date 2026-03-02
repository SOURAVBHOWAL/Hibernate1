package Polymorphism.MethodOverriding;

public class DriverClass {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.show();
		Parent c = new Child();
		c.show();
	}

}
