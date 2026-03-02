package bankingProjectMVC.view;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import bankingProjectMVC.controller.AccountController;
import bankingProjectMVC.controller.CurrentAccount;
import bankingProjectMVC.controller.SavingsAccount;
import bankingProjectMVC.controller.exception.InsufficientBalanceException;
import bankingProjectMVC.controller.exception.InvalidAmountException;
import bankingProjectMVC.model.BankAccount;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        AccountController controller = new AccountController();

        // Store multiple accounts
        Map<Long, BankAccount> accounts = new HashMap<>();

        boolean appRunning = true;

        System.out.println("===== Welcome to Banking Application =====");
        
        outer:
        while (appRunning) {
            try {
                System.out.println("\n===== MAIN MENU =====");
                System.out.println("1. Create Account");
                System.out.println("2. Login to Account");
                System.out.println("3. Exit");

                System.out.print("Choose: ");
                int mainChoice = sc.nextInt();
                sc.nextLine(); // clear buffer

                switch (mainChoice) {

                    /* ================= CREATE ACCOUNT ================= */
                    case 1:
                        System.out.println("\nSelect Account Type:");
                        System.out.println("1. Savings Account");
                        System.out.println("2. Current Account");
                        System.out.print("Choice: ");
                        int type = sc.nextInt();
                        sc.nextLine();
                        
                        if(type!=1 && type!=2) {
                        	System.out.println("Inavlid option");
                        	continue;
                        }
                        	

                        System.out.print("Enter Account Number: ");
                        long accNo = sc.nextLong();
                        sc.nextLine();

                        if (accounts.containsKey(accNo)) {
                            System.out.println("Account already exists!");
                            break;
                        }

                        System.out.print("Enter Holder Name: ");
                        String name = sc.nextLine();

                        System.out.print("Set PIN: ");
                        int pin = sc.nextInt();

                        System.out.print("Enter Initial Balance: ");
                        double balance = sc.nextDouble();

                        if (balance < 0) {
                            System.out.println("Initial balance cannot be negative.");
                            break;
                        }

                        BankAccount newAccount = null;

                        if (type == 1) {
                            newAccount = new SavingsAccount(accNo, name, balance, pin);
                        } else if (type == 2) {
                            newAccount = new CurrentAccount(accNo, name, balance, pin);
                        } else {
                            System.out.println("Invalid account type.");
                            break;
                        }

                        accounts.put(accNo, newAccount);
                        System.out.println("Account created successfully!");
                        break;

                    /* ================= LOGIN ================= */
                    case 2:
                        System.out.print("Enter Account Number: ");
                        long loginAccNo = sc.nextLong();
                        sc.nextLine();

                        BankAccount account = accounts.get(loginAccNo);

                        if (account == null) {
                            System.out.println("Account not found.");
                            break;
                        }

                        boolean authenticated = false;

                        while (!authenticated) {
                            try {
                                System.out.print("Enter PIN: ");
                                int enteredPin = sc.nextInt();

                                if (!account.validatePin(enteredPin)) {
                                    System.out.println("Incorrect PIN.");
                                    continue outer;
                                }
                                authenticated = true;
                            } catch (InputMismatchException e) {
                                System.out.println("PIN must be numeric.");
                                sc.nextLine();
                                break;
                            }
                        }

                        /* ===== ACCOUNT MENU ===== */
                        boolean loggedIn = true;

                        while (loggedIn) {
                            try {
                                System.out.println("\n--- ACCOUNT MENU ---");
                                System.out.println("1. Deposit");
                                System.out.println("2. Withdraw");
                                System.out.println("3. Check Balance");
                                System.out.println("4. Logout");

                                System.out.print("Choose: ");
                                int choice = sc.nextInt();

                                switch (choice) {
                                    case 1:
                                        System.out.print("Enter deposit amount: ");
                                        double dep = sc.nextDouble();
                                        controller.deposit(account, dep, "Online");
                                        System.out.println("Deposit successful.");
                                        break;

                                    case 2:
                                        System.out.print("Enter withdrawal amount: ");
                                        double wd = sc.nextDouble();
                                        controller.withdraw(account, wd, "User withdrawal");
                                        System.out.println("Withdrawal successful.");
                                        break;

                                    case 3:
                                        System.out.println("Current Balance: "
                                                + controller.checkBalance(account));
                                        break;

                                    case 4:
                                        loggedIn = false;
                                        System.out.println("Logged out successfully.");
                                        break;

                                    default:
                                        System.out.println("Invalid choice.");
                                }

                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. Numbers only.");
                                sc.nextLine();
                            }
                            catch (InvalidAmountException e) {
                                System.out.println("Transaction Error: " + e.getMessage());
                            }
                            catch (InsufficientBalanceException e) {
                                System.out.println("Balance Error: " + e.getMessage());
                            }
                            finally {
                                System.out.println("Transaction cycle complete.\n");
                            }
                        }
                        break;

                    /* ================= EXIT ================= */
                    case 3:
                        System.out.println("Thank you for using our banking system!");
                        appRunning = false;
                        break;

                    default:
                        System.out.println("Invalid option.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input type.");
                sc.nextLine();
            }
        }

        sc.close();
	}

}
