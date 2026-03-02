package bankingProjectMVC.controller;

import bankingProjectMVC.controller.exception.InvalidAmountException;
import bankingProjectMVC.model.BankAccount;

public class AccountController {
	public void deposit(BankAccount acc, double amount) throws InvalidAmountException {
        if (amount <= 0)
            throw new InvalidAmountException("Invalid deposit amount");

        acc.setBalance(acc.getBalance() + amount);
    }

    public void deposit(BankAccount acc, double amount, String mode)
            throws InvalidAmountException {
        deposit(acc, amount);
        System.out.println("Deposit via " + mode);
    }

    public void withdraw(BankAccount acc, double amount)
            throws InvalidAmountException {

        if (amount <= 0)
            throw new InvalidAmountException("Invalid withdrawal amount");

        acc.withdraw(amount); 
    }

    public void withdraw(BankAccount acc, double amount, String remark)
            throws InvalidAmountException {

        withdraw(acc, amount);
        System.out.println("Remark: " + remark);
    }

    public double checkBalance(BankAccount acc) {
        return acc.getBalance();
    }
}
