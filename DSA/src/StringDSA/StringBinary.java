package StringDSA;

import java.util.Scanner;

public class StringBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean ok = true;
        for (char c : s.toCharArray())
            if (c != '0' && c != '1') 
            	ok = false;
        System.out.println(ok);
	}
}
