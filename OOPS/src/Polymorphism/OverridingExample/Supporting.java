package Polymorphism.OverridingExample;

public class Supporting extends Employee{
		public double varPay=100000;
		
		@Override
		public double monthlySalCal() {
			return (basePay+varPay)/12;
		}
}
