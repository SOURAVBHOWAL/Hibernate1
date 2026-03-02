package Wrapping1;

public class PrimitiveToNonPrimitive {
	
	public static void userParseByte(String s) {
		try {
			System.out.println(Byte.parseByte(s));
			return;
		}
		catch(Exception e) {
			int ans=0;
			int left=0,right=0;
			boolean sign=false;
			while(left<s.length() && (s.charAt(left)<'0' || s.charAt(left)>'9')) {
				if(s.charAt(right)=='+') {
					sign=false;
				}
				else if(s.charAt(right)=='-') {
					sign=true;
				}
				left++;right++;
			}
			if(left==s.length()) {
				System.out.println("No digit present");
			}
			else {
				while(right<s.length()&& s.charAt(right)>='0' && s.charAt(right)<='9') {
					int d=s.charAt(right)-'0';
					ans=ans*10+d;
					right++;
				}
			}
			ans=sign? ans*-1:ans;
			System.out.println(ans);
			
		}
		
		
		
	}
	public static void main(String[] args) {
		byte b=-9;
		//wrapping/autoboxing
		Byte b1=b;
		//unwrapping/unboxing
		byte a=b1;
		
		int i=1111;
		byte j=(byte)i;
		System.out.println(j);
		String s=" -+1++1";
		
//		Byte b3=new Byte(s);
//		System.out.println(b3);
//		Byte b2=Byte.parseByte(s);
//		System.out.println(b2++);
		userParseByte(s);
		
	}

}
