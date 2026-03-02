package Typecasting.NonPrimitiveTypecastingCarExample;

import java.util.Scanner;

public class DriverClass {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Car c=new Car();
		Engine e;
		System.out.print("Enter 1 for Petrol and 2 for Diesel: ");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			e=new PetrolEngine();//upcasting
			PetrolEngine pe=(PetrolEngine)e;//downcasting
			pe.fuelType();
			break;
		case 2:
			e=new DieselEngine();
			DieselEngine de=(DieselEngine) e;
			de.fuelType();
			break;
		default:
			e=new PetrolEngine();
			PetrolEngine pe2=(PetrolEngine)e;
			pe2.fuelType();
			break;
		}
		c.eng=e;
		c.eng.fuelType();
	}

}
