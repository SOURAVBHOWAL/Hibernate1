package SecureBank.Classes;

import SecureBank.CustomExceptions.*;

public class CurrentAccount implements BankAccount{
	private double minBalance=5000;
	private double balance;
	private int pin;
	public String accHolderName;
	public CurrentAccount(String name,int pin,double bal) throws InsufficientBalanceException,InvalidAmountException{
		if(bal<minBalance) {
			throw new InsufficientBalanceException("Atleast 5000 balance required.");
		}
		else {
			this.accHolderName=name;
			this.pin=pin;
			this.balance=bal;
		}
	}
	public double getBalance(int pin) {
		if(pin==this.pin)
			return balance;
		else {
			System.out.println("Invalid Pin.");
			return -1;
		}
	}

	public void withdraw(int pin,double amt) throws InsufficientBalanceException,InvalidAmountException {
		if(amt<=0) {
			throw new InvalidAmountException("Amount must be greater than 0");
		}
		if(pin==this.pin) {
			if(balance-amt>=minBalance) {
				this.balance -= amt;
			}
			else {
				throw new InsufficientBalanceException("Balance will become less than min balance of 2000.");
			}
		}
			
		else
			System.out.println("Invalid pin");
	}
	public void withdraw(int pin,double amt,boolean receipt) throws InsufficientBalanceException, InvalidAmountException {
		if(amt<=0) {
			throw new InvalidAmountException("Amount must be greater than 0");
		}
		double a=this.balance;
		if(balance-amt<minBalance) {
			throw new InsufficientBalanceException("Balance will become less than min balance of 2000.");
			
		}
		if(pin==this.pin && !receipt) {
			this.balance -= amt;
			
		}
		else if(pin==this.pin && receipt) {
			this.balance -= amt;
			System.out.println("Previous Balance: "+a+"\nCurrent Balance: "+this.balance);
			
		}
		else
			System.out.println("Invalid pin");
	}
	//deposit
	public void deposit(int pin,double amt) throws InvalidAmountException {
		if(amt<=0) {
			throw new InvalidAmountException("Amount must be greater than 0");
		}
		if(pin==this.pin)
			this.balance += amt;
		else
			System.out.println("Invalid pin");
	}
	public void deposit(int pin,double amt,boolean receipt) throws InvalidAmountException {
		if(amt<=0) {
			throw new InvalidAmountException("Amount must be greater than 0");
		}
		double a=this.balance;
		if(pin==this.pin && !receipt) {
			this.balance += amt;
			
		}
		if(pin==this.pin && receipt) {
			this.balance += amt;
			System.out.println("Previous Balance: "+a+"\nCurrent Balance: "+this.balance);
			
		}
		else
			System.out.println("Invalid pin");
	}
	
}
