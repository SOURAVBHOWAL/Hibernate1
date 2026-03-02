package P2;

import java.util.Scanner;
import P1.C2;

import P1.C2;

public class C3 extends C2 {

	public static void main(String[] args) {
		double[] d= new double[100];
		int i=0;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextDouble()) {
			d[i]=sc.nextDouble();
			i++;
		}
		varArgs(d);

	}
	public static void varArgs(double... d) {
		double s=0;
		for (double e : d) {
			s+=e;
		}
		System.out.println(s);
		
	}

}
