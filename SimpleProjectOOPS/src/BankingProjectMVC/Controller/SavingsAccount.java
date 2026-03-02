package BankingProjectMVC.Controller;

import BankingProjectMVC.Controller.Exception.InsufficientBalanceException;

public class SavingsAccount extends BankingProjectMVC.Model.BankAccount{
	public SavingsAccount(long accNo, String name, double bal, int pin) {
        super(accNo, name, bal, pin);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            throw new InsufficientBalanceException("Savings account: Insufficient balance");
        }
        setBalance(getBalance() - amount);
    }
}
