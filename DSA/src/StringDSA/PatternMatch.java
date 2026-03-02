package StringDSA;

public class PatternMatch {

	public static boolean isPatternFound(String str,String pat) {
		int j=0;
		for(int i=0;i<str.length();i++) {
			while(j<pat.length() && str.charAt(i)==pat.charAt(j)) {
				i++;j++;
			}if(j==pat.length()) {
				return true;
			}
			else if(str.charAt(i)!=pat.charAt(j)){
				i-=j;
				j=0;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		String str="aaabcaaae";
		String pat="aae";
		System.out.println(isPatternFound(str, pat));


	}

}
