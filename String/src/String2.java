
public class String2 {
	
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("basacc");
		func(s);
		System.out.println(s);

	}
	
	public static void func(StringBuilder s) {
		int[] hash1=new int[26];
		boolean[] hash2=new boolean[26];
		
		
		for(int i=0;i<s.length();i++) {
			int index=s.charAt(i)-'a';
			hash1[index]++;
			if(hash1[index]>1) {
				hash2[index]=true;
			}
		}
		
		for(int j=s.length()-1;j>=0;j--) {
			int index=s.charAt(j)-'a';
			if(hash2[index]==true) {
				for(int k=1;k<=hash1[index];k++) {
					s.insert(j+1,s.charAt(j));
				}
				hash1[index]--;
				
				
				
			}
		}
		System.out.println(s);
		
		
	}

}
