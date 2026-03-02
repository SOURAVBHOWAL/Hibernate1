package OOPS.Polymorphism.MethodOverloading;

public class DriverClass {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.printNum(9.0);
		Child c=new Child();
		c.printNum(8.0);//inherited
		c.printNum(1.0, 10);//overloaded

	}

}
