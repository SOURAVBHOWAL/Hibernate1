package Stack;

import java.util.Stack;

public class PrefixToInfix {
	
	public static String preToIn(String s) {
		Stack<String> stk=new Stack<>();
		for(int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			if(Character.isLetterOrDigit(c))
				stk.push(c+"");
			else {
				String c1=stk.pop();
				String c2=stk.pop();
				stk.push("("+c1+c+c2+")");
			}
		}
		return stk.peek();
	}
	
	
	public static void main(String[] args) {
		String prefix = "*-A/BC-/AKL";
        System.out.println("Infix Expression: " + preToIn(prefix));

	}

}
