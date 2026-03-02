package StringDSA;
//q21
public class Ascii1 {
	
	public static int func(String s,int k) {
		for(int i=0;i<s.length();i++) {
			int ans=0;
			for(int j=i;j<s.length();j++) {
				ans+=s.charAt(j);
				if(ans==k) {
					return i;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(func("abcde",199));
		

	}

}
