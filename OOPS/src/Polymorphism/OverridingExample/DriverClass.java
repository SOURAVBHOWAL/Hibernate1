package Polymorphism.OverridingExample;

public class DriverClass {

	public static void main(String[] args) {
		Employee e=new It();
		System.out.println(e.monthlySalCal());
		e=new Supporting();
		System.out.println(e.monthlySalCal());
	}

}
