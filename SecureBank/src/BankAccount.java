import CustomExceptions.InsufficientBalanceException;
import CustomExceptions.InvalidAmountException;

public interface BankAccount {
	
	public double getBalance(int pin);
	
	public void withdraw(int pin,double amt) throws InsufficientBalanceException, InvalidAmountException;
	public void withdraw(int pin,double amt,boolean receipt)throws InsufficientBalanceException, InvalidAmountException;
	//
	public void deposit(int pin,double amt) throws InvalidAmountException;
	public void deposit(int pin,double amt,boolean receipt) throws InvalidAmountException;
	
	
	
}
