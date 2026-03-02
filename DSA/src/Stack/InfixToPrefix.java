package Stack;

import java.util.Stack;

public class InfixToPrefix {
	public static int pre(char c1) {
		switch(c1) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default:
			return 4;
		}
	}
	public static String inToPre(String s) {
		Stack<Character> st=new Stack<>();
		StringBuilder sb=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--) {
			if(Character.isLetterOrDigit(s.charAt(i))) {
				sb.insert(0, s.charAt(i));
			}
			else if(st.isEmpty()||pre(s.charAt(i))>=pre(st.peek()))
				st.push(s.charAt(i));
			else{
				while(!st.isEmpty() && pre(s.charAt(i))<pre(st.peek())) {
					sb.insert(0, st.pop());
				}
				st.push(s.charAt(i));
				
			}
		}
		while(!st.isEmpty())
			sb.insert(0, st.pop());
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(inToPre("p+q*r+s"));

	}

}
