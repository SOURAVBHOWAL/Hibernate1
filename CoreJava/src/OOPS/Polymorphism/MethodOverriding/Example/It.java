package OOPS.Polymorphism.MethodOverriding.Example;

public class It extends Employee{
	public double varPay=200000;
	
	
	
	@Override
	protected double monthlySalCal() {
		 return varPay/12;
	}
}
