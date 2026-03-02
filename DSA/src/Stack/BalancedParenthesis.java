package Stack;

import java.util.Stack;

public class BalancedParenthesis {
	public static boolean isBalanced(String s) {
		char[] c=s.toCharArray();
		Stack<Character> stk=new Stack<>();
		for(int i=0;i<c.length;i++) {
			if(c[i]=='('||c[i]=='{'||c[i]=='[') {
				stk.push(c[i]);
			}
			else if(c[i]==')'||c[i]=='}'||c[i]==']') {
				if(stk.empty()) {
					return false;
				}
				else {
					char top=stk.peek();
					stk.pop();
					if((c[i]==')' && top!='(')||(c[i]=='}' && top!='{')||(c[i]==']' && top!='['))
						return false;
						
				}
			}
		}
		return stk.isEmpty();
		
	}
	public static void main(String[] args) {
		System.out.println(isBalanced("{([)]}"));
		System.out.println(isBalanced("{([])}"));
		System.out.println(isBalanced("{([])"));

	}

}
