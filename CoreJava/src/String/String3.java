package String;
import java.util.Arrays;

public class String3 {

	public static void main(String[] args) {
		System.out.println(isAnagram("listen","silent"));
		toUpperCase(new StringBuilder("b@asb"));
		StringBuilder s=new StringBuilder("   abc");
		trimBeginning(s);
		System.out.println(s);
		isPalindrome("aba");
		StringBuilder s1=new StringBuilder("hello");
		StringBuilder s2=new StringBuilder("world");
		swap(s1,s2);
		//System.out.println(s1);
	}
	
	public static boolean isAnagram(String s1, String s2) {
		if(s1.length()!=s2.length())
			return false;
		char[] c1=s1.toCharArray();
		Arrays.sort(c1);
		char[] c2=s2.toCharArray();
		Arrays.sort(c2);
		
		for(int i=0;i<c1.length;i++) {
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
	}
	public static void toUpperCase(StringBuilder s1) {
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z') {
				char ch=(char) (s1.charAt(i)-32);
				 s1.setCharAt(i,ch);
			}
		}
		System.out.println(s1);
	}
	
	public static void trimBeginning(StringBuilder s) {
		int i=0;
		while(i<s.length() && s.charAt(i)==' ') {
			s.deleteCharAt(i);
			i++;
		}
	}
	
	public static void isPalindrome(String s) {
		if(s.length()==0) {
			System.out.println("empty");
			return;
		}
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				System.out.println("Not Palindrome");
				return;
			}
			i++;j--;
		}
		System.out.println("Palindrome");
	}
	
	public static void swap(StringBuilder s1,StringBuilder s2) {
		s1.append(s2);
		s2= new StringBuilder(s1.subSequence(0, s1.length()-s2.length()));
		s1=new StringBuilder(s1.subSequence(s2.length(),s1.length()));
		System.out.println(s1+" "+s2);
		
		
	}
	

}
