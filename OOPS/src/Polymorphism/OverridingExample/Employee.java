package Polymorphism.OverridingExample;

public class Employee {
	double basePay=300000;
	protected Object monthlySalCal() {
		return basePay/12;
	}
	
}
