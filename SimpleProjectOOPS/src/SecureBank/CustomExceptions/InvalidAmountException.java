package SecureBank.CustomExceptions;

public class InvalidAmountException extends Exception{
	public InvalidAmountException(String msg) {
		super(msg);
	}
}
