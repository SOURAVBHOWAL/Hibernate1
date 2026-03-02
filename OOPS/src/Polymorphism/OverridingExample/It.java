package Polymorphism.OverridingExample;

public class It extends Employee{
	public double varPay=200000;
	
	
	
	@Override
	protected Double monthlySalCal() {
		 return varPay/12;
	}
}
