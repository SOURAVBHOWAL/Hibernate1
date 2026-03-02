package Engine_Interface;

import java.util.Scanner;

public class DriverClass {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Car c=new Car();
		System.out.print("Enter 1 for Petrol and 2 for Diesel: ");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			c.eng=new PetrolEngine();
			break;
		case 2:
			c.eng=new DieselEngine();
			break;
		default:
			c.eng=new PetrolEngine();
			break;
		}
		System.out.println(c.eng.nCyl);
	}

}
