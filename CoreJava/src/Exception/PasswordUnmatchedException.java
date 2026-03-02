package Exception;

public class PasswordUnmatchedException extends RuntimeException{
	static int tries=0, limit=3;
	PasswordUnmatchedException(String msg){
		super(msg);
		tries++;
		if(tries==limit) {
			throw new PasswordException("limit exceeded. goodbye!");
		}
	}
}
