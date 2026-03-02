package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackSort {
	public static String func(int[] A, int[] B, Stack<Integer> stk) {
		int j=0;
		for(int i=0;i<A.length;i++) {
			if(stk.isEmpty()||stk.peek()>=A[i]) {
				stk.push(A[i]);
			}
			else {
				while(!stk.isEmpty()) {
					if(j>0 && B[j-1]>stk.peek())
						return "NO";
					B[j++]=stk.pop();
				}
				stk.push(A[i]);
			}
			
		}
		while(!stk.isEmpty()) {
			if(j>0 && B[j-1]>stk.peek())
				return "NO";
			B[j++]=stk.pop();
		}
		System.out.println(Arrays.toString(B));
		return "YES";
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			int[] A=new int[n];
			int[] B=new int[n];
			Stack<Integer> stk=new Stack<>();
			for(int j=0;j<n;j++) {
				A[j]=sc.nextInt();
			}
			System.out.println(func(A,B,stk));
		}

	}

}
