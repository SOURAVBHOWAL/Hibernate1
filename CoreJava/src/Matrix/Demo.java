package Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;





public class Demo {
	public static boolean isLong(String s) {
		try {
			Long.parseLong(s);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	public static boolean isDouble(String s) {
		try {
			Double.parseDouble(s);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	public static Object func(String s) {
		if(s.equals("true")||s.equals("false")) {
			return s.equals("true")? true:false;
		}
		else if(isLong(s)) {
			return Long.parseLong(s); 
		}
		else if(isDouble(s)) {
			return Double.parseDouble(s); 
		}
		else if(s.length()==1) {
			return s.charAt(0);
		}
		else {
			return s;
		}
	}
    public static void main(String[] args) {
    	
    	boolean[] bA= {true,false,true};
    	char[] cA= {'a','b','c'};
    	String[] sA= {"asa","sada","dsd"};
    	Object[] oA= {123,"str",'1'};
    	//m1(bA);
    	m1(bA);
    	String s1="12";
    	Byte.parseByte(s1);
    	
//    	Scanner sc=new Scanner(System.in);
//		Object[] arr= new Object[5];
//		for(int i=0;i<arr.length;i++) {
//			String s=sc.nextLine();3
//			arr[i]=func(s);
//			
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
	}
    public static void m1(Object... arr) {
    	
		System.out.println(Arrays.deepToString(arr));
//    	for (int i = 0; i < arr.length; i++) {
//			
//			
//		}
    }
}
