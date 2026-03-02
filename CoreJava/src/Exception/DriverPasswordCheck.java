package Exception;

import java.util.Scanner;

public class DriverPasswordCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=1,limit=3;
		String pass="0000";
		System.out.println("enter password:");
		boolean matched=false;
		try {
			while(!matched) {
				
				if(pass.equals(sc.nextLine())) {
					System.out.println("matched");
					matched=true;
				}
				else {
					throw new PasswordUnmatchedException("not passed");
				}
				
			}
		}
		catch(PasswordException e) {
			System.out.println(e.getMessage());
		}

	}

}
