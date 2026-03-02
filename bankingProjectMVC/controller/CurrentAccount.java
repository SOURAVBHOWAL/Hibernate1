package bankingProjectMVC.controller;

import bankingProjectMVC.controller.exception.InsufficientBalanceException;
import bankingProjectMVC.model.BankAccount;

public class CurrentAccount extends BankAccount{
	private static final double OVERDRAFT_LIMIT = 5000;

    public CurrentAccount(long accNo, String name, double bal, int pin) {
        super(accNo, name, bal, pin);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance() + OVERDRAFT_LIMIT) {
            throw new InsufficientBalanceException("Current account: Overdraft limit exceeded");
        }
        setBalance(getBalance() - amount);
    }
}
