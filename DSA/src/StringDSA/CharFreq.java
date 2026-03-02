package StringDSA;

import java.util.Scanner;

public class CharFreq {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq = new int[256];
        for (char c : s.toCharArray()) 
        	freq[c]++;
        for (int i = 0; i < 256; i++)
            if (freq[i] > 0)
                System.out.println((char) i + " " + freq[i]);
    
	}
}
