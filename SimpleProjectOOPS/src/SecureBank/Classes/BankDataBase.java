package SecureBank.Classes;

import java.util.ArrayList;

public class BankDataBase {
	ArrayList<BankAccount> bankDB=new ArrayList<>();
	private BankDataBase() {
	}
	private static BankDataBase bankObj=new BankDataBase();
	public static BankDataBase getBank() {
		return bankObj;
	}
}
