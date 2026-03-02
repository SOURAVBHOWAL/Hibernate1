package StringDSA;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) 
        	a[i] = sc.nextInt();
        int max = Integer.MIN_VALUE, smax = Integer.MIN_VALUE;
        for (int x : a) {
        	
            if (x > max) {
                smax = max;
                max = x;
            } else if (x > smax && x != max) {
                smax = x;
            }
        }
        System.out.println(smax);

	}

}
