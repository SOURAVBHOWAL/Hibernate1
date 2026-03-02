package CustomException;

public class PasswordException extends RuntimeException{
	public PasswordException(String msg) {
		super(msg);
		throw new PasswordException("Limit crossed!");
	}
}
