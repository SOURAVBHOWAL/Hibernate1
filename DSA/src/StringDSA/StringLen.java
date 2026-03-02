package StringDSA;

import java.util.Scanner;

public class StringLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int len=0;
		for(char c:s.toCharArray()) {
			len++;
		}
		System.out.println(len);

	}

}
