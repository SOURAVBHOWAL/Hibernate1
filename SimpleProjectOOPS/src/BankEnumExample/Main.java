package BankEnumExample;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

enum TransactionType {
	DEPOSIT, WITHDRAWAL, TRANSFER
}

enum TransactionStatus {
	SUCCESS, FAILED, PENDING
}

enum PriorityLevel {
	HIGH, MEDIUM, LOW
}

class Transaction {
	int transactionId;
	String accountHolderName;
	double amount;
	TransactionType transactionType;
	TransactionStatus transactionStatus;
	LocalDateTime transactionDate;
	PriorityLevel priorityLevel;

	public Transaction(int transactionId, String accountHolderName, double amount, TransactionType transactionType,
			TransactionStatus transactionStatus, LocalDateTime transactionDate, PriorityLevel priorityLevel) {
		super();
		this.transactionId = transactionId;
		this.accountHolderName = accountHolderName;
		this.amount = amount;
		this.transactionType = transactionType;
		this.transactionStatus = transactionStatus;
		this.transactionDate = transactionDate;
		this.priorityLevel = priorityLevel;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getAmount() {
		return amount;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public TransactionStatus getTransactionStatus() {
		return transactionStatus;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	public PriorityLevel getPriorityLevel() {
		return priorityLevel;
	}

	public String toString() {
		return transactionId + " " + accountHolderName + " " + amount + " " + transactionType + " " + transactionStatus
				+ " " + transactionDate + " " + priorityLevel;
	}

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime now = LocalDateTime.now();

		List<Transaction> transactions = Arrays.asList(
				new Transaction(1, "Aman", 50000, TransactionType.DEPOSIT, TransactionStatus.SUCCESS, now,
						PriorityLevel.HIGH),

				new Transaction(2, "Rahul", 150000, TransactionType.WITHDRAWAL, TransactionStatus.SUCCESS, now,
						PriorityLevel.HIGH),

				new Transaction(3, "Sneha", 2000, TransactionType.TRANSFER, TransactionStatus.FAILED, now,
						PriorityLevel.LOW),

				new Transaction(4, "Priya", 75000, TransactionType.WITHDRAWAL, TransactionStatus.SUCCESS, now,
						PriorityLevel.MEDIUM));

		Map<TransactionStatus, List<Transaction>> groupStatus = transactions.stream()
				.collect(Collectors.groupingBy(e -> e.transactionStatus));
		for (TransactionStatus ts : groupStatus.keySet()) {
			System.out.println(ts);
			groupStatus.get(ts).forEach(System.out::println);
		}
		Map<TransactionType, Long> groupCount = transactions.stream()
				.collect(Collectors.groupingBy(e -> e.transactionType, Collectors.counting()));
		for (TransactionType ts : groupCount.keySet()) {
			System.out.println(ts);
			System.out.println(groupCount.get(ts));
		}
		List<Transaction> l = transactions.stream().filter(e -> (e.priorityLevel == PriorityLevel.HIGH))
				.sorted(Comparator.comparing((Transaction e)->e.amount).reversed().thenComparing(e->e.transactionDate))
				.collect(Collectors.toList());
		l.forEach(System.out::println);

	}

}


