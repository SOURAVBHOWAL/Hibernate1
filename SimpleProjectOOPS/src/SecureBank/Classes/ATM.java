package SecureBank.Classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {
	static BankDataBase bObj;
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		bObj=BankDataBase.getBank();
		
		SavingsAccount s;
		CurrentAccount c;
		boolean flag=false;
		boolean t=true;
		
		while(t) {
			try {
			System.out.println("\nWelcome!\n Please select option.\n 1.Create Savings Bank Account.\n 2. Create Current Bank Account.\n 3. Withdraw Money.\n 4.Deposit Money.\n 5.Check Balance.\n 6.End.");
			int n=sc.nextInt();
		
		switch(n) {
		case 1:
			System.out.print("Enter name: ");
			String name=sc.nextLine();
			sc.nextLine();
			System.out.print("Enter pin: ");
			int pin=sc.nextInt();
			System.out.println("Enter Initial balance: ");
			double bal=sc.nextDouble();
			
			bObj.bankDB.add(new SavingsAccount(name,pin,bal));
			flag=true;
			break;
		case 2:
			System.out.print("Enter name: ");
			String name1=sc.nextLine();
			sc.nextLine();
			System.out.print("Enter pin: ");
			int pin1=sc.nextInt();
			System.out.println("Enter Initial balance: ");
			double bal1=sc.nextDouble();
			bObj.bankDB.add(new CurrentAccount(name1,pin1,bal1));
			flag=true;
			break;
		case 3:
			System.out.print("Enter name: ");
			String name2=sc.nextLine();
			sc.nextLine();
			System.out.print("Enter pin: ");
			int pin2=sc.nextInt();
			System.out.println("Enter Amount to withdraw: ");
			double amt2=sc.nextDouble();
			for(int i=0;i<bObj.bankDB.size();i++) {
				BankAccount b=bObj.bankDB.get(i);
				
				if(b.getClass().toString().contains("SavingsAccount")) {
					s=(SavingsAccount)b;
					if(s.accHolderName==name2) {
						s.withdraw(pin2, amt2,true);
						flag=true;
					}
				}
				else {
					c=(CurrentAccount)b;
					if(c.accHolderName==name2) {
						c.withdraw(pin2, amt2,true);
						flag=true;
					}
				}
			}
			
			break;
		case 4:
			System.out.print("Enter name: ");
			String name3=sc.nextLine();
			sc.nextLine();
			System.out.print("Enter pin: ");
			int pin3=sc.nextInt();
			System.out.println("Enter Amount to deposit: ");
			double amt3=sc.nextDouble();
			for(int i=0;i<bObj.bankDB.size();i++) {
				BankAccount b=bObj.bankDB.get(i);
				
				if(b.getClass().toString().contains("SavingsAccount")) {
					s=(SavingsAccount)b;
					if(s.accHolderName==name3) {
						s.deposit(pin3, amt3,true);
						flag=true;
					}
				}
				else {
					c=(CurrentAccount)b;
					if(c.accHolderName==name3) {
						c.deposit(pin3, amt3,true);
						flag=true;
					}
				}
			}
			break;
		case 5:
			System.out.print("Enter name: ");
			String name4=sc.nextLine();
			sc.nextLine();
			System.out.print("Enter pin: ");
			int pin4=sc.nextInt();
			
			for(int i=0;i<bObj.bankDB.size();i++) {
				BankAccount b=bObj.bankDB.get(i);
				
				if(b.getClass().toString().contains("SavingsAccount")) {
					s=(SavingsAccount)b;
					if(s.accHolderName==name4) {
						s.getBalance(pin4);
						flag=true;
					}
				}
				else {
					c=(CurrentAccount)b;
					if(c.accHolderName==name4) {
						c.getBalance(pin4);
						flag=true;
					}
				}
			}
			break;
		case 6:
			t=false;
		
		}
		
		
		if(!flag) {
			System.out.println("NOT FOUND!");
		}
	
	}catch(InputMismatchException e1) {
		System.out.println("Type Mismatch");
		sc.nextLine();
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
		}
		
		
	
	}

}
