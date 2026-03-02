package CustomException;


enum Permit{
	ONLYSOFTALC, YES
}
public class CustomCheckedExceptionDemo {
	
	public static Permit validateAge(int age) throws InvalidAgeException,NullPointerException{
		if(age<16) {
			throw new NullPointerException("not 16");
		}
		if(age<18) {
			throw new InvalidAgeException("Age must be 18 or more");
		}
		else if(age>=18 && age<21){
			return Permit.ONLYSOFTALC;
		}
		return Permit.YES;
	}
	public static void main(String[] args) {
		try {
			System.out.println(validateAge(15));
		} catch (InvalidAgeException |NullPointerException e) {
			System.out.println(e);
		}
	}
}
